package com.example.communicationapp.Model;

public class Faculty {

    public String imageId;
    public String name,designation,qualification,domain,contact;

    public Faculty(String imageId, String name, String designation, String qualification, String domain, String contact) {
        this.imageId = imageId;
        this.name = name;
        this.designation = designation;
        this.qualification = qualification;
        this.domain = domain;
        this.contact = contact;
    }

    public Faculty() {
    }
}
