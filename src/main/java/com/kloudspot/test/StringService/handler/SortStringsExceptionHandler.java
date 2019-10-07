package com.kloudspot.test.StringService.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Exception handling class that handles bad requests.
 * 
 * This will be built upon to have more specific error-handling.
 * 
 * 
 * @author conorcook
 */
@RestControllerAdvice
public class SortStringsExceptionHandler extends ResponseEntityExceptionHandler {

		@Override
        protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
			StringBuilder message = new StringBuilder(); 
			message.append("BAD REQUEST: 404\n");
			message.append("Please make sure you have the following guidelines met for this request:\n");
			message.append("* Request Type = GET or POST only!\n");
			message.append("* Header Key = Content-Type\n");
			message.append("* Header Value = Application/JSON\n");
			message.append("* Body of the request is a JSON Array only. Use [] separated by commas, if there are curly brackets {} in the body, odds are it is incorrect. \n");
			message.append("* Body cannot be empty. If you want an empty list please use []. (Even though that is already sorted...)\n");
			message.append("Please try your call again...\n");
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
        }
}
