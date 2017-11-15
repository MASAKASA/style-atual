package br.com.styleAtual.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.styleAtual.exceptions.ErrorCode;
import br.com.styleAtual.exceptions.WebServiceException;
import br.com.styleAtual.model.domain.ErrorMessage;

@ControllerAdvice
public class ControlerCustomer {

	@ExceptionHandler(WebServiceException.class)
	public ResponseEntity<ErrorMessage> toResponse(WebServiceException exception) throws Exception{

		ErrorMessage errorMessage = new ErrorMessage();
		
		if (exception.getCode() == ErrorCode.BAD_REQUEST.getCode()) {
			errorMessage.setMessage(exception.getMessage());
			errorMessage.setCode(ErrorCode.BAD_REQUEST.getCode());
			
			ResponseEntity<ErrorMessage> responseEntity = new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.BAD_REQUEST);

			return responseEntity;
		} 
		else if (exception.getCode() == ErrorCode.NOT_FOUND.getCode()) {
			errorMessage.setMessage(exception.getMessage());
			errorMessage.setCode(ErrorCode.NOT_FOUND.getCode());
			
			ResponseEntity<ErrorMessage>responseEntity = new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);

			return responseEntity;
		} else {
			
			errorMessage.setMessage(exception.getMessage());
			errorMessage.setCode(ErrorCode.SERVER_ERROR.getCode());
			
			ResponseEntity<ErrorMessage> responseEntity = new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);

			return responseEntity;
		}
	}
}
