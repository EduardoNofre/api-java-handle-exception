package com.api.spirng.erro;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExceptionNotFoundValidation extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExceptionNotFoundValidation(String message) {
		super(message);
	}
}
