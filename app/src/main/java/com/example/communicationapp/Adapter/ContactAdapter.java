package com.example.communicationapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.communicationapp.Model.CollegeContacts;
import com.example.communicationapp.R;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<CollegeContacts> {


    public ContactAdapter(@NonNull Context context, ArrayList<CollegeContacts> list) {
        super(context, R.layout.connect_list_item ,list);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        CollegeContacts collegeContacts=getItem(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.connect_list_item,parent,false);
        }

        TextView name=convertView.findViewById(R.id.name);
        TextView designation=convertView.findViewById(R.id.designation);
        TextView contact=convertView.findViewById(R.id.contact);

        name.setText(collegeContacts.name);
        designation.setText(collegeContacts.designation);
        contact.setText(collegeContacts.contact);


        return convertView;
    }
}
