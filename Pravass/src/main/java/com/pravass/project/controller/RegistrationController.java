package com.pravass.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pravass.project.model.Registration;
import com.pravass.project.repository.RegistrationReopsitory;

@RestController
@CrossOrigin("*")
@RequestMapping("/Register")
public class RegistrationController {

	@Autowired
	RegistrationReopsitory registerRepo;

//	@GetMapping("/show")
//	public String showRegister() {
//		return "Registration";
//	}
	@GetMapping("showAll")
	public List<Registration> getAllRecords(){
		List<Registration> register = registerRepo.findAll();
		return register;
		
	}
		

	@PostMapping("/save")
	public String saveInfo(@RequestBody Registration register) {
		registerRepo.save(register);
		return "home";
	}

	@RequestMapping("/delete/{email}")
	public String deleteValue(@PathVariable String email) {
		registerRepo.deleteById(email);
		return email +" Deleted Sucessfully";
	}

//	@PutMapping("/update/{email}/{password}")
//	public String updateInfo(@PathVariable String email, @PathVariable String password) {
//		Registration register = registerRepo.findByEmail(email);
//		if (register != null) {
//			registerRepo.save(register);
//			return "home";
//
//		} else {
//			return "error";
//		}
//
//	}
	
	@PutMapping("/update/{email}")
	public  ResponseEntity<?>  updateRegistration(@PathVariable String email,@RequestBody Registration register) {
		Registration existingRegistration =registerRepo.findByEmail(email);
		
		 if (existingRegistration == null) {
		        return ResponseEntity.notFound().build();
		    }
		 if (existingRegistration.getName() != null) {
	            existingRegistration.setName(existingRegistration.getName());
	        }
	        if (existingRegistration.getPassword() != null) {
	            existingRegistration.setPassword(existingRegistration.getPassword());
	        }
	        if (existingRegistration.getDOB() != null) {
	            existingRegistration.setDOB(existingRegistration.getDOB());
	        }
	        if (existingRegistration.getContact() != null) {
	            existingRegistration.setContact(existingRegistration.getContact());
	        }
	        if (existingRegistration.getCountry() != null) {
	            existingRegistration.setCountry(existingRegistration.getCountry());
	        }
	        if (existingRegistration.getState() != null) {
	            existingRegistration.setState(existingRegistration.getState());
	        }
		 
		existingRegistration.setContact(register.getContact());
		existingRegistration.setCountry(register.getCountry());
		existingRegistration.setDOB(register.getDOB());
//		existingRegistration.setEmail(register.getEmail());
		existingRegistration.setName(register.getName());
		existingRegistration.setPassword(register.getPassword());
		existingRegistration.setState(register.getState());
		
	Registration updated = registerRepo.save(existingRegistration);
		
	return ResponseEntity.ok(updated);
		
	}
	
	
	
	
	
}
