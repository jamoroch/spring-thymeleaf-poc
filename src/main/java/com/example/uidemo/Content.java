package com.example.uidemo;


import org.hibernate.annotations.NotFound;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Content {

    @NotBlank
    private String value;

    @NotBlank
    private String key;

    public Content() {
    }

    public Content(String value, String key) {
        this.value = value;
        this.key = key;
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

    @Override
    public String toString() {
        return "Content{" +
                "value='" + value + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
