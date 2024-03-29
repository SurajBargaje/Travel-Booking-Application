package com.pravass.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pravass.project.model.Login;

public interface LoginRepository extends JpaRepository<Login, String> {

	

	Login findByEmail(String email);

}
