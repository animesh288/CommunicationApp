package com.example.communicationapp.Model;

public class Faculty {

    public int imageId;
    public String name,qualification,designation,contact,email,domain;


    public Faculty(int imageId,String name, String qualification, String contact, String domain) {
        this.name = name;
        this.qualification = qualification;
//        this.designation = designation;
        this.contact = contact;
//        this.email = email;
        this.domain = domain;
        this.imageId=imageId;
    }

}
