package com.pravass.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pravass.project.model.Registration;

public interface RegistrationReopsitory extends JpaRepository <Registration,String> {

}
