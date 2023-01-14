package com.escapezone.api.controller.alivecheck;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@ResponseBody
@RestController
public class AliveCheckController {

    @GetMapping("/alive")
    public ResponseEntity<String> AliveCheck(){
        return ResponseEntity.ok("hello");
    }



}
