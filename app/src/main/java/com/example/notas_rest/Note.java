package com.example.notas_rest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Note {
    @Expose
    @SerializedName("id") private int id;
    @Expose
    @SerializedName("title") private int title;
    @Expose
    @SerializedName("note") private int note;
    @Expose
    @SerializedName("color") private int color;
    @Expose
    @SerializedName("date") private int date;
    @Expose
    @SerializedName("success") private Boolean success;
    @Expose
    @SerializedName("message") private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
