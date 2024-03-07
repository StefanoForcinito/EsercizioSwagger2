package com.example.Swaggerweb2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/v1")
public class NameController {
        @GetMapping("/get-name")
        public String getName(@RequestParam String name) {
            return name;
        }
        @PostMapping("/reverse-name")
        public ResponseEntity<String> reverseName(@RequestParam String name) {
            StringBuilder reversedName = new StringBuilder(name).reverse();
            return ResponseEntity.ok(reversedName.toString());
        }
    }
