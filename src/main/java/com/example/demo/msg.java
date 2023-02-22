package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class msg {
@GetMapping("/hello")
public String msgw() {
	return "Hello World!";
}
}
