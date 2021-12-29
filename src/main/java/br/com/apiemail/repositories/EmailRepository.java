package br.com.apiemail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apiemail.model.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
	
	

}
