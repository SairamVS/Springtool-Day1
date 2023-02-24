package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Input {
@GetMapping("/llo")
public String Name(String str )
{
	return "Hello "+str+" !";
}
}