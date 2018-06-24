package com.springboot.example;

import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;

import java.io.InputStream;

public class APp1 {

    public static void main(String[] args) {
        Swagger read = new SwaggerParser().read("swagger.yml");

    }
}
