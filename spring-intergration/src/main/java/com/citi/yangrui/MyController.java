package com.citi.yangrui;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/my")
public class MyController {

    @GetMapping("/demo")
    public ResponseEntity<?> getUser() {
        try {
            User user = new User().setName("ssssss").setDescription("descccccc");
            int i = 1 / 0;
            return new ResponseEntity<User>(user, HttpStatus.OK);

        } catch (Exception e) {
            throw new UserNotFountException("13232sssssssssssssssss3");
        }


    }

    @RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
    public Order showOrder(@PathVariable("id") long id, Model model) {
        Order order = null;
        if (order == null) throw new OrderNotFoundException("1232313");
        return order;
    }


    @GetMapping("/demo1")
    public String sss() {

        return "1231231313131313";
    }

    public static class Order {

        private String id;
        private String description;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }


    public static class User {

        private String name;
        private String description;

        public String getName() {
            return name;
        }

        public User setName(String name) {
            this.name = name;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public User setDescription(String description) {
            this.description = description;
            return this;
        }
    }

    public static class Error {
        private int code;
        private String message;

        public int getCode() {
            return code;
        }

        public Error setCode(int code) {
            this.code = code;
            return this;
        }

        public String getMessage() {
            return message;
        }

        public Error setMessage(String message) {
            this.message = message;
            return this;
        }
    }

}
