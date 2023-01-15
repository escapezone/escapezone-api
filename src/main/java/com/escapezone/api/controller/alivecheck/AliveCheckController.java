package com.escapezone.api.controller.alivecheck;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AliveCheckController {

    @GetMapping("/alive")
    public ResponseEntity<String> AliveCheck(){
        return ResponseEntity.ok("hello");
    }



}
