package com.escapezone.api.controller.alivecheck;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://local.escapezone.com:3000")
@Slf4j
public class AliveCheckController {
    @GetMapping("/alive")
    public TestDto aliveCheck(){
        log.debug("aliveCheck");
   return TestDto.builder().test("test").build(); }

}
