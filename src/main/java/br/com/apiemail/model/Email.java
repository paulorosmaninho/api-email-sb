package br.com.apiemail.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.apiemail.model.enums.StatusEmail;

@Entity
@Table(name = "tb_email")
public class Email {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_email")
	private Long id;
	@Column(name = "nm_remetente")
	private String nomeRemetente;
	@Column(name = "nm_email_remetente")
	private String emailRemetente;
	@Column(name = "nm_destinatario")
	private String nomeDestinatario;
	@Column(name = "ds_lista_email_destino", columnDefinition = "TEXT")
	private String emailsDestinatario;
	@Column(name = "ds_assunto")
	private String assuntoEmail;
	@Column(name = "ds_texto_email", columnDefinition = "TEXT")
	private String textoEmail;
	@Column(name = "dt_data_envio")
	private LocalDateTime dataHoraEnvio;
	@Column(name = "nm_status")
	@Enumerated(EnumType.STRING)
	private StatusEmail statusEmail;
	@Column(name = "ds_status", columnDefinition = "TEXT")
	private String descricaoStatus;
	
	public Email() {
	}

	public Email(Long id, String nomeRemetente, String emailRemetente, String nomeDestinatario,
			String emailsDestinatario, String assuntoEmail, String textoEmail, LocalDateTime dataHoraEnvio,
			StatusEmail statusEmail, String descricaoStatus) {
		super();
		this.id = id;
		this.nomeRemetente = nomeRemetente;
		this.emailRemetente = emailRemetente;
		this.nomeDestinatario = nomeDestinatario;
		this.emailsDestinatario = emailsDestinatario;
		this.assuntoEmail = assuntoEmail;
		this.textoEmail = textoEmail;
		this.dataHoraEnvio = dataHoraEnvio;
		this.statusEmail = statusEmail;
		this.descricaoStatus = descricaoStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocalDateTime getDataHoraEnvio() {
		return dataHoraEnvio;
	}

	public void setDataHoraEnvio(LocalDateTime dataHoraEnvio) {
		this.dataHoraEnvio = dataHoraEnvio;
	}

	public StatusEmail getStatusEmail() {
		return statusEmail;
	}

	public void setStatusEmail(StatusEmail statusEmail) {
		this.statusEmail = statusEmail;
	}

	public String getDescricaoStatus() {
		return descricaoStatus;
	}
	
	public void setDescricaoStatus(String descricaoStatus) {
		this.descricaoStatus = descricaoStatus;
	}
}
