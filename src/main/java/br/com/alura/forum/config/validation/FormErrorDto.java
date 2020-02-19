package br.com.alura.forum.config.validation;

public class FormErrorDto {
	private String campo;
	private String erro;
	
	public FormErrorDto(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}

	public String getCampo() {
		return campo;
	}

	public String getErro() {
		return erro;
	}
	
	
	
	
	
}
