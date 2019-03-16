package com.timing.cloud.dubbo.service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Application {


    void methodOne() {
        Type mySupperClass =
                new ArrayList<String>(){}
                .getClass()
                .getGenericSuperclass();



    }

    public static void main(String[] args) {
        Type mySupperClass =
                new ArrayList<String>(){}
                .getClass()
                .getGenericSuperclass();

        Type type =
                ((ParameterizedType) mySupperClass).getActualTypeArguments()[0];

        System.out.println(mySupperClass);
        System.out.println(type);
    }
}
