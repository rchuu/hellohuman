package com.codingdojo.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController

public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}
	@RequestMapping("/")
	public String nameInput(Model model, @RequestParam(value="name", required=false) String name, @RequestParam(value="last_name", required=false) String last_name) {
		if (name == null) { // if no name date was inputted, just greet human;
			model.addAttribute("name","Human");
			return "main.jsp";
		}
		else // else, print name and last name;
			model.addAttribute("name", name);
			model.addAttribute("last_name", last_name);
				return "main.jsp";
	}
}