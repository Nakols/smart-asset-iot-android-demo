package com.demo.bankexdh.model.rest;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class RegisterBody {

    @SerializedName("id")
    String id;
    @SerializedName("key")
    String key;
    @SerializedName("name")
    String name;
}
