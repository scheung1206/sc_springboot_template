package com.stephencheung.project.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class MainController {

    @RequestMapping(
            value = "/template/",
            method = RequestMethod.GET
    )
    public String template(){
       return "Hello World";
    }
}
