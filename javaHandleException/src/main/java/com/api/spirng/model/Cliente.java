package com.api.spirng.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.internal.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Cliente{

	@NotNull
	@NotBlank(message = "O campo nome não pode esta em  branco")
	@NotEmpty(message = "O campo nome não pode esta vazio")
	private String nome;

	@NotNull
	@NotBlank(message = "O campo telefone não pode esta em  branco")
	private String telefone;

	@Email(message = "O e-mail esta fora do padrão de e-mail")
	@NotBlank(message = "O campo e-mail não pode esta em  branco")
	private String email;
}
