package edu.fisa.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping("getdata")
	public String get() {
		System.out.println("********");
		return "240220_2 미션 수행";
	}
}
