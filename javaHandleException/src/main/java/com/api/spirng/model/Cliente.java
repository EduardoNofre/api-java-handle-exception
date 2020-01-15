package com.api.spirng.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.internal.NotNull;

import io.swagger.annotations.ApiModelProperty;
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
	@ApiModelProperty(value = "Nome", required = true, example = "abcd123")
	private String nome;

	@NotNull
	@NotBlank(message = "O campo telefone não pode esta em  branco")
	@NotEmpty(message = "O campo telefone não pode esta vazio")
	@ApiModelProperty(value = "telefone", required = true, example = "11999999999")
	private String telefone;

	@Email(message = "O e-mail esta fora do padrão de e-mail")
	@NotEmpty(message = "O campo e-mail não pode esta vazio")
	@NotBlank(message = "O campo e-mail não pode esta em  branco")
	@ApiModelProperty(value = "email", required = true, example = "email@dominio.com ou email@dominio.com.br")
	private String email;
}
