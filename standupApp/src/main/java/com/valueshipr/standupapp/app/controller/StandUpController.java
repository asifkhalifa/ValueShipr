package com.valueshipr.standupapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.valueshipr.standupapp.app.exception.StandUpValidationException;
import com.valueshipr.standupapp.app.model.StandUp;
import com.valueshipr.standupapp.app.serviceI.StandUpService;
import com.valueshipr.standupapp.app.serviceI.UserServiceI;


@RestController
public class StandUpController {

  @Autowired
  StandUpService standUpService;
  
  @Autowired
  UserServiceI userService;
  
  @PostMapping("/saved")
  public ResponseEntity<?> saveStandUp(@RequestBody StandUp standUp, @RequestParam String username, @RequestParam String password) {
	  
    if(userService.validateCredentials(username, password)) {
      try {
        standUpService.saveStandUp(standUp);
        return ResponseEntity.ok().build();
      } catch(StandUpValidationException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
      }
    } else {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
  }
  
  @GetMapping("/get")
  public ResponseEntity<List<StandUp>> getStandUps(@RequestParam String username, @RequestParam String password) {
    if(userService.validateCredentials(username, password)) {
      List<StandUp> standUps = standUpService.getStandUps(username);
      return ResponseEntity.ok().body(standUps);
    } else {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
  }
}
