package com.valueshipr.standupapp.app.serviceImpl;

import java.util.HashMap;


import java.util.Map;

import org.springframework.stereotype.Service;
import com.valueshipr.standupapp.app.serviceI.UserServiceI;

@Service
public class UserServiceImpl implements UserServiceI{

	private Map<String, String> credentials;
	  
	  public UserServiceImpl() {
	    credentials = new HashMap<>();
	    credentials.put("asif", "password123");
	    credentials.put("pratik", "password456");
	  
	  }
	
	
	@Override
	  public boolean validateCredentials(String username, String password) {
	    String storedPassword = credentials.get(username);
	    if(storedPassword != null && storedPassword.equals(password)) {
	      return true;
	    } else {
	      return false;
	    }
	  }

}
