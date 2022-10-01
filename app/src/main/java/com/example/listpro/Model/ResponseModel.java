package com.example.listpro.Model;

import android.provider.ContactsContract;

import com.google.gson.annotations.SerializedName;

public class ResponseModel
{
  @SerializedName("data")
    public Data data;
  @SerializedName("support")
  public Support support;
public static class  Data{
   @SerializedName("id")
      private int id;
   @SerializedName("email")
   private String email;
   @SerializedName("first_name")
   private String first_name;
   @SerializedName("last_name")
   private String last_name;
   @SerializedName("avatar")
   private String avatar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
public static class Support{
    @SerializedName("url")
    private String url;
    @SerializedName("text")
    private String text;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
}
