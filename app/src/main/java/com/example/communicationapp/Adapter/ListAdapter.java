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
        TextView gib=convertView.findViewById(R.id.gibberish);

        imageView.setImageResource(faculty.imageId);
        name.setText(faculty.name);
        contact.setText(faculty.contact);
        domain.setText(faculty.domain);
        gib.setText(faculty.qualification);



        return convertView;

    }
}
