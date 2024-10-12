package com.example.home_work3;
public class Contact {
    private String name;
    private String phoneNumber;
    private String message;
    private int imageResId;

    public Contact(String name, String phoneNumber, String message, int imageResId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.message = message;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public int getImageResId() {
        return imageResId;
    }
}
