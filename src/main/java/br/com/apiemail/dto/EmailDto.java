package br.com.apiemail.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EmailDto {
	
	@NotBlank(message = "Blank - O campo nomeRemetente é obrigatório")
	@NotEmpty(message = "Empty - O campo nomeRemetente é obrigatório")
	@NotNull(message = "Null - O campo nomeRemetente é obrigatório")
	private String nomeRemetente;

	@NotBlank(message = "Blank - O campo emailRemetente é obrigatório")
	@NotEmpty(message = "Empty - O campo emailRemetente é obrigatório")
	@NotNull(message = "Null - O campo emailRemetente é obrigatório")
	private String emailRemetente;
	
	@NotBlank(message = "Blank - O campo nomeDestinatario é obrigatório")
	@NotEmpty(message = "Empty - O campo nomeDestinatario é obrigatório")
	@NotNull(message = "Null - O campo nomeDestinatario é obrigatório")
	private String nomeDestinatario;
	
	@NotBlank(message = "Blank - O campo emailsDestinatario é obrigatório")
	@NotEmpty(message = "Empty - O campo emailsDestinatario é obrigatório")
	@NotNull(message = "Null - O campo emailsDestinatario é obrigatório")
	private String emailsDestinatario;
	
	@NotBlank(message = "Blank - O campo assuntoEmail é obrigatório")
	@NotEmpty(message = "Empty - O campo assuntoEmail é obrigatório")
	@NotNull(message = "Null - O campo assuntoEmail é obrigatório")
	private String assuntoEmail;
	
	@NotBlank(message = "Blank - O campo textoEmail é obrigatório")
	@NotEmpty(message = "Empty - O campo textoEmail é obrigatório")
	@NotNull(message = "Null - O campo textoEmail é obrigatório")
	private String textoEmail;
	

	public EmailDto() {
	}

	public EmailDto(String nomeRemetente, String emailRemetente, String nomeDestinatario, String emailsDestinatario,
			String assuntoEmail, String textoEmail) {
		super();
		this.nomeRemetente = nomeRemetente;
		this.emailRemetente = emailRemetente;
		this.nomeDestinatario = nomeDestinatario;
		this.emailsDestinatario = emailsDestinatario;
		this.assuntoEmail = assuntoEmail;
		this.textoEmail = textoEmail;
	}


	public String getNomeRemetente() {
		return nomeRemetente;
	}

	public void setNomeRemetente(String nomeRemetente) {
		this.nomeRemetente = nomeRemetente;
	}

	public String getEmailRemetente() {
		return emailRemetente;
	}

	public void setEmailRemetente(String emailRemetente) {
		this.emailRemetente = emailRemetente;
	}

	public String getNomeDestinatario() {
		return nomeDestinatario;
	}

	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}

	public String getEmailsDestinatario() {
		return emailsDestinatario;
	}

	public void setEmailsDestinatario(String emailsDestinatario) {
		this.emailsDestinatario = emailsDestinatario;
	}

	public String getAssuntoEmail() {
		return assuntoEmail;
	}

	public void setAssuntoEmail(String assuntoEmail) {
		this.assuntoEmail = assuntoEmail;
	}

	public String getTextoEmail() {
		return textoEmail;
	}

	public void setTextoEmail(String textoEmail) {
		this.textoEmail = textoEmail;
	}
}
