package com.ualr.widgets.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by irconde on 2019-09-17.
 */
public class Contact implements Parcelable {

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };
    private String name;
    private String phone;
    private String email;
    private String pet;
    private String notes;

    public Contact(Parcel parcel) {
        name = parcel.readString();
        phone = parcel.readString();
        email = parcel.readString();
        pet = parcel.readString();
        notes = parcel.readString();
    }

    public Contact(){}

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(phone);
        parcel.writeString(email);
        parcel.writeString(pet);
        parcel.writeString(notes);
    }
}
