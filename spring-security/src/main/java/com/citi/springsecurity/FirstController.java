package com.citi.springsecurity;


import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {


    @GetMapping(value="/config")
    @Secured("supportsssss")
    public Response getResponse(){
        return new Response().setCode(200).setDescription("ssssssss");
    }


    public static class Response{
        private int code;
        private String description;

        public int getCode() {
            return code;
        }

        public Response setCode(int code) {
            this.code = code;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Response setDescription(String description) {
            this.description = description;
            return this;
        }
    }
}
