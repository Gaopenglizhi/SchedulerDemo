package com.example.demo.controller;

import com.example.demo.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping(value = "/test",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public String test(@RequestParam String a){
        System.out.println(a);
        User user = new User().setId(11).setName("jack");
        ObjectMapper objectMapper = new ObjectMapper();
        String string = null;
        try {
            string = objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return string ;
    }
    @RequestMapping(value = "/testone",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String testone(){
        User user = new User().setId(11).setName("jack");
        ObjectMapper objectMapper = new ObjectMapper();
        String string = null;
        try {
            string = objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return string ;
    }
}
