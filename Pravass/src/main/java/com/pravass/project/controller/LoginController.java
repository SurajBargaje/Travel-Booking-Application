package com.pravass.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pravass.project.model.Login;
import com.pravass.project.model.Registration;
import com.pravass.project.repository.LoginRepository;
import com.pravass.project.repository.RegistrationReopsitory;

@RestController
@CrossOrigin("*")

@RequestMapping("/Login")

public class LoginController {
	
	@Autowired
	LoginRepository loginRepo;

	@GetMapping("/showLogin")
	public String getLogin() {
		return "Login";
	}
	


	@PostMapping("/homepage")
//	Use @RequestBody when you're sending data in the request body, typically for RESTful APIs.
//	Use @ModelAttribute when you're submitting form data from an HTML form.
	public String registerDetails(@RequestBody Login login) {

		loginRepo.save(login);
		return "home";
	}
	
	
	
	
	@PutMapping("/setValue/{email}/{password}")
	public String modifyName(@PathVariable String email, @PathVariable String password) {
		Login login = loginRepo.findByEmail(email);

		if (login != null) {
			login.setPassword(password);
			loginRepo.save(login);

			return "Password Changed successfully";

		} else {
			return "error";

		}
	}

	@DeleteMapping("/delValue/{email}")
	public String deleteUser(@PathVariable String email) {
		loginRepo.deleteById(email);
		return "home";
	}

}
