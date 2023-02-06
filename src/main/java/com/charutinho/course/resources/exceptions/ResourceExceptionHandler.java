package com.charutinho.course.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.charutinho.course.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

// notation necessária para captar as possíveis exceções que venham a acontecer
@ControllerAdvice
public class ResourceExceptionHandler {

	// notation para captar todas exceções do tipo ResourceNotFoundException (a exceção que criamos) e fazer o tratamento
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
}
