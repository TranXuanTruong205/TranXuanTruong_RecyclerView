package com.xuantruong.recyclerview;

public class User {
    private String name;
    private String email;
    private int imageResource;

    public User(String name, String email, int imageResource) {
        this.name = name;
        this.email = email;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getImageResource() {
        return imageResource;
    }
}
