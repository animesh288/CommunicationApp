package com.example.communicationapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.communicationapp.Model.Faculty;
import com.example.communicationapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends ArrayAdapter<Faculty> {


    public ListAdapter(@NonNull Context context, @NonNull ArrayList<Faculty> facultyArrayList) {

        super(context, R.layout.list_item, facultyArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Faculty faculty=getItem(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }


        ImageView imageView=convertView.findViewById(R.id.dp);
        TextView name=convertView.findViewById(R.id.name);
        TextView contact=convertView.findViewById(R.id.contact);
        TextView domain=convertView.findViewById(R.id.domain);
        TextView designation=convertView.findViewById(R.id.designation);
        TextView qualifications=convertView.findViewById(R.id.qualifications);

        Picasso.get().load(faculty.imageId).into(imageView);
        name.setText(faculty.name);
        contact.setText("CONTACT : "+faculty.contact);
        domain.setText("DOMAIN : "+faculty.domain);
        qualifications.setText("QUALIFICATIONS : "+faculty.qualification);
        designation.setText(faculty.designation);



        return convertView;

    }
}
