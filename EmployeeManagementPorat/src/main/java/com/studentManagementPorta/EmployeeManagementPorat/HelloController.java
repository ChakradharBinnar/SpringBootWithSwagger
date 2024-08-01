package com.studentManagementPorta.EmployeeManagementPorat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//http://localhost:8081/api/swagger-ui/index.html --swagger ui

@RestController
public class HelloController {
	
	   @PostMapping("/hello")
	    public ResponseEntity<String> hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	        return ResponseEntity.notFound().build();
	    }
	   
	   @PostMapping("/goodMorning")
	    public ResponseEntity<String> string(@RequestParam(value = "name", defaultValue = "World") String name) {
	        return ResponseEntity.status(HttpStatus.CREATED).body("Good Morning Chikku");
	    }

}
