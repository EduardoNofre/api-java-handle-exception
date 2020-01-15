package com.api.spirng.handle;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.api.spirng.erro.ExceptionNotFoundExcepion;
import com.api.spirng.model.BuildExceptionHandle;
import com.api.spirng.model.BuildValidationHandle;

@ControllerAdvice
public class RestExceptionHandle {

	@ExceptionHandler(ExceptionNotFoundExcepion.class)
	public ResponseEntity<?> handleNotFoundExcepion(ExceptionNotFoundExcepion exceptionNotFoundExcepion) {

		BuildExceptionHandle buildExceptionHandle = BuildExceptionHandle.builder()
				.timestamp(new Date().getTime())
				.status(HttpStatus.NOT_FOUND.value())
				.titulo("Recurso não encontrado")
				.detalheErro(exceptionNotFoundExcepion.getMessage())
				.classeErro(exceptionNotFoundExcepion.getClass().getName()).build();
		return new ResponseEntity<>(buildExceptionHandle, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleValidationException(MethodArgumentNotValidException methodArgumentNotValidException) {

		List<FieldError>  fieldErrors = methodArgumentNotValidException.getBindingResult().getFieldErrors();
		String campo = fieldErrors.stream().map(FieldError::getField).collect(Collectors.joining(","));
		String campoMsg = fieldErrors.stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(","));

		BuildValidationHandle buildValidationHandle = BuildValidationHandle.builder()
				.timestamp(new Date().getTime())
				.status(HttpStatus.NOT_FOUND.value())
				.titulo("Valor do campo invalido")
				.detalheErro("Valor do campo invalido")
				.classeErro(methodArgumentNotValidException.getClass().getName())
				.campo(campo)
				.campoMessage(campoMsg) .build();
		return new ResponseEntity<>(buildValidationHandle, HttpStatus.NOT_FOUND);
	}
}
