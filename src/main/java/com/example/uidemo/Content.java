package com.example.uidemo;


import org.hibernate.annotations.NotFound;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Content {

    @NotBlank
    private String value;

    @NotBlank
    private String key;

    @NotNull
    @DateTimeFormat(pattern = "dd.mm.yyyy")
    private Date date;


    public Content() {
    }

    public Content(@NotBlank String value, @NotBlank String key, Date date) {
        this.value = value;
        this.key = key;
        this.date = date;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Content{" +
                "value='" + value + '\'' +
                ", key='" + key + '\'' +
                ", date=" + date +
                '}';
    }
}
