package com.api.spirng.erro;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExceptionNotFoundExcepion extends RuntimeException  {

	private static final long serialVersionUID = 1L;

	public ExceptionNotFoundExcepion(String message) {
		super(message);
	}
}
