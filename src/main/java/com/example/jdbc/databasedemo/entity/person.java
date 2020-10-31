package com.example.jdbc.databasedemo.entity;

import java.util.Date;

public class person {
    private int id;
    private String Name;
    private String Description;
    private Date joinDate;

    private person(){

    }

    public person(int id, String name, String description, Date joinDate) {
        this.id = id;
        Name = name;
        Description = description;
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "\nperson{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
