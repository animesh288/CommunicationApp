package com.example.communicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.communicationapp.Adapter.ListAdapter;
import com.example.communicationapp.Model.Faculty;
import com.example.communicationapp.databinding.ActivityFacultyDetailsBinding;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class FacultyDetails extends AppCompatActivity {


    String []dept={"cse","civil","architecture","biomed","biotech","chemical","physics",
    "electrical","mca","math","english","mechanical","mining"};

//    ArrayList<String> hod=new ArrayList<>();

    ActivityFacultyDetailsBinding activityFacultyDetailsBinding;


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityFacultyDetailsBinding=ActivityFacultyDetailsBinding.inflate(getLayoutInflater());
        setContentView(activityFacultyDetailsBinding.getRoot());
        Bundle extras=getIntent().getExtras();
        String tag=extras.getString("tag");
        webScrap(tag);



    }

    private void webScrap(String tag){

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
//                Log.i("animesh","webscrap");

                HttpsTrustManager.allowAllSSL();
                setHod(tag);
            }
        });

        thread.start();


    }



    private void setHod(String tag) {

            String url = "http://nitrr.ac.in/about"+dept[Integer.parseInt(tag)]+".php";
            try {

                Document document = (Document) Jsoup.connect(url).timeout(6000).get();
                Elements elements = document.getElementById("menu3").getElementsByClass("table table-bordered");
                Elements element=elements.get(0).getElementsByTag("tr").get(2).getElementsByTag("td");
                Elements images=elements.get(0).getElementsByTag("tr").get(2).select("img");

                Faculty hod=new Faculty();
                hod.name=element.get(0).text();
                hod.qualification=element.get(1).text();
                hod.designation=element.get(2).text();
                hod.contact=element.get(3).text();
                hod.domain=element.get(4).text();
                hod.imageId="http://www.nitrr.ac.in/"+images.attr("src");


                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        activityFacultyDetailsBinding.headName.setText(hod.name);
                        activityFacultyDetailsBinding.headDesignation.setText(hod.designation);
                        activityFacultyDetailsBinding.headContact.setText("CONTACT : "+hod.contact);
                        activityFacultyDetailsBinding.headDomain.setText("DOMAIN : "+hod.domain);
                        activityFacultyDetailsBinding.headQualifications.setText("QUALIFICATIONS : "+hod.qualification);
                        Picasso.get().load(hod.imageId).into(activityFacultyDetailsBinding.headDp);

                    }
                });

                ArrayList<Faculty> facultyArrayList=new ArrayList<>();
                Elements ele=elements.get(1).getElementsByTag("tr");

                for(int i=2;i<ele.size();i++){
                    Elements e=ele.get(i).getElementsByTag("td");
                    Elements ima=ele.get(i).select("img");
                    Log.i("animesh",ele.text());
                    Faculty fac=new Faculty("http://www.nitrr.ac.in/"+ima.attr("src"),
                            e.get(0).text(),
                            e.get(2).text(),
                            e.get(1).text(),
                            e.get(4).text(),
                            e.get(3).text());

                    facultyArrayList.add(fac);

                }
                Log.i("animesh", String.valueOf(facultyArrayList.size()));

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        ListAdapter listAdapter=new ListAdapter(FacultyDetails.this,facultyArrayList);
                        activityFacultyDetailsBinding.listFaculty.setAdapter(listAdapter);
                    }
                });






            } catch (Exception e) {
                e.printStackTrace();
            }



    }

    public static class HttpsTrustManager implements X509TrustManager {

        private static TrustManager[] trustManagers;
        private static final X509Certificate[] _AcceptedIssuers = new X509Certificate[]{};

        @Override
        public void checkClientTrusted(
                java.security.cert.X509Certificate[] x509Certificates, String s)
                throws java.security.cert.CertificateException {

        }

        @Override
        public void checkServerTrusted(
                java.security.cert.X509Certificate[] x509Certificates, String s)
                throws java.security.cert.CertificateException {

        }

        public boolean isClientTrusted(X509Certificate[] chain) {
            return true;
        }

        public boolean isServerTrusted(X509Certificate[] chain) {
            return true;
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return _AcceptedIssuers;
        }

        public static void allowAllSSL() {
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {

                @Override
                public boolean verify(String arg0, SSLSession arg1) {
                    return true;
                }

            });

            SSLContext context = null;
            if (trustManagers == null) {
                trustManagers = new TrustManager[]{new HttpsTrustManager()};
            }

            try {
                context = SSLContext.getInstance("TLS");
                context.init(null, trustManagers, new SecureRandom());
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (KeyManagementException e) {
                e.printStackTrace();
            }

            HttpsURLConnection.setDefaultSSLSocketFactory(context
                    .getSocketFactory());
        }
    }

}