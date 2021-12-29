package br.com.apiemail.controllers;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.apiemail.dto.EmailDto;
import br.com.apiemail.model.Email;
import br.com.apiemail.model.service.EmailService;

@Controller
@RequestMapping
public class EmailController {

	
	@Autowired
	EmailService emailService;
	
	
	@PostMapping(value = "/enviarEmail")
	public ResponseEntity<Email> enviarEmail(@RequestBody @Valid EmailDto emailDto){
		
		Email email = new Email();
		
		BeanUtils.copyProperties(emailDto, email);
		
		emailService.enviarEmail(email);
		
		return new ResponseEntity<>(email, HttpStatus.CREATED);
	}
	
	
 
	
	
	
}
