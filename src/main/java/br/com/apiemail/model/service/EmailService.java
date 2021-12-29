package br.com.apiemail.model.service;

import java.time.LocalDateTime;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import br.com.apiemail.model.Email;
import br.com.apiemail.model.enums.StatusEmail;
import br.com.apiemail.repositories.EmailRepository;

@Service
public class EmailService {

	@Autowired
	EmailRepository emailRepository;

	@Autowired
	private JavaMailSender emailSender;

	public Email enviarEmail(Email email) {
		
		email.setDataHoraEnvio(LocalDateTime.now());
		
		try{
			
			MimeMessage mimeMessage = emailSender.createMimeMessage();
			
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "UTF-8");
			helper.setTo(email.getEmailsDestinatario().split(","));
			helper.setFrom(email.getEmailRemetente(), email.getNomeRemetente());
			helper.setSubject(email.getAssuntoEmail());
			mimeMessage.setContent(email.getTextoEmail(), "text/html");
			emailSender.send(mimeMessage);

			email.setStatusEmail(StatusEmail.ENVIADO);
		} catch (MailException e){
			email.setStatusEmail(StatusEmail.ERRO);
			email.setDescricaoStatus(e.getMessage());
		} finally {
			return emailRepository.save(email);
		}
	}
}