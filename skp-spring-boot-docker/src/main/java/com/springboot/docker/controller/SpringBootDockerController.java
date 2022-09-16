/**
 * 
 */
package com.springboot.docker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sumith.puri
 *
 */
@RestController
public class SpringBootDockerController {

	@RequestMapping(value = "/quote", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getQuote() {

		StringBuffer quote = new StringBuffer();
		quote.append("Success is often achieved by those who don't know that failure is inevitable.");
		return new ResponseEntity<>(quote.toString(), HttpStatus.OK);
	}
}
