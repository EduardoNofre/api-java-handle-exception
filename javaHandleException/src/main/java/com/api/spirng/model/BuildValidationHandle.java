package com.api.spirng.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class BuildValidationHandle extends ErroDetalheModel {

	private String campo;
	private String campoMessage;

}
