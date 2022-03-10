package com.accenture.lkm.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {


	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public ResponseEntity<String> getHello() {
			return new ResponseEntity<String>("Hello World , My Name is Ankit !!", HttpStatus.OK);
	}
}
