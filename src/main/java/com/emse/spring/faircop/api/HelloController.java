package com.emse.spring.faircop.api;

import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api/hello")
@Transactional
public class HelloController {


    @GetMapping("/{name}")
    public MessageDto welcome(@PathVariable String name) {
        return new MessageDto("Hello " + name);
    }


    class MessageDto {
        String message;

        public MessageDto(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}