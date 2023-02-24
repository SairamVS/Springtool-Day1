package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorGame {
	@GetMapping("/Color")
	public String getMyFav() {
		String yourFavColor="Red";
		return "My favorite color is "+  yourFavColor;
	}
}
