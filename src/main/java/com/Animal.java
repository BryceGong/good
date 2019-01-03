package com;

import com.google.gson.Gson;

public class Animal {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        System.err.println(gson.excluder()+"=========================");
    }
}
