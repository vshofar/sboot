package br.com.alura.forum.model.dto;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import br.com.alura.forum.model.StatusTopico;
import br.com.alura.forum.model.Topico;

public class TopicoDto {
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	private StatusTopico status = StatusTopico.NAO_RESPONDIDO;
	
	public TopicoDto(Topico topico) {
		id = topico.getId();
		titulo = topico.getTitulo();
		mensagem = topico.getMensagem();
		dataCriacao = topico.getDataCriacao();
		status = topico.getStatus();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public StatusTopico getStatus() {
		return status;
	}
	
	public static Page<TopicoDto> convert(Page<Topico> lTopicos){
		return lTopicos.map(TopicoDto::new); 
	}

}
