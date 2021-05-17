/*
 * @author : S.Mahadevan
 * 
 * 
 */

package com.microservice.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.objects.Helloobjects;
import com.microservice.objects.UserObject;
import com.microservice.repository.UserDao;




@RestController
@EnableAutoConfiguration
public class Users {
	
	
@Autowired
private UserDao userdao;


@CrossOrigin(origins = "*")
@RequestMapping(method = RequestMethod.GET, value = "/api/users/{name}/chat", produces = "application/json")
public String getuserdetails(@PathVariable(value = "name") String username) throws IOException {

	
	return this.userdao.getuserdetails(username);
}

	

}
