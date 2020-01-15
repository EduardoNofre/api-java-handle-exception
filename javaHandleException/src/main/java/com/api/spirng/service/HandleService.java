package com.api.spirng.service;

import org.springframework.stereotype.Service;

import com.api.spirng.erro.ExceptionNotFoundExcepion;
import com.api.spirng.erro.ExceptionNotFoundValidation;

@Service
public class HandleService {

	public void testeHandle(Integer opcao) {

		switch (opcao) {
		case 1:
			throw new ExceptionNotFoundExcepion("Não encontrado.");
		case 2:
			throw new ExceptionNotFoundValidation("Essa é a opção dois.");
		default:
		}

	}
}
