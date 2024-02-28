package com.pravass.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.pravass.project.model.Registration;
import com.pravass.project.repository.RegistrationReopsitory;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistrationReopsitory registerRepo;
	
	
	@GetMapping("/register")
	public String showRegister() {
		return "Registration";
	}
	
	
	@PostMapping("/save")
	public String saveInfo(@ModelAttribute Registration register ) {
		registerRepo.save(register);
		return "home";
	}
	
	
	@PutMapping("/update/{email}/{password}")
	public String updateInfo(@PathVariable String email,@PathVariable String password) {
		Registration register = registerRepo.findByEmail(email);
		if(register != null) {
			registerRepo.save(register);
			return "home";
		
		
	}
		else {
			return "error";
		}

}
}
