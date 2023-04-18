package com.valueshipr.standupapp.app.serviceImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valueshipr.standupapp.app.exception.StandUpValidationException;
import com.valueshipr.standupapp.app.model.BlockerStatus;

import com.valueshipr.standupapp.app.model.StandUp;

import com.valueshipr.standupapp.app.repository.StandUpRepository;

import com.valueshipr.standupapp.app.serviceI.StandUpService;
@Service
public class StandUpServiceImpl implements StandUpService {
	  
	  @Autowired
	  private StandUpRepository standUpRepository;
	  
	  @Override
	  public void saveStandUp(StandUp standUp) throws StandUpValidationException {
	    // Check if user has not solved a blocker for 3 days
	    if(standUp.getBlockerStatus() == BlockerStatus.BLOCKED_3_DAYS) {
	      throw new StandUpValidationException("You cannot save your stand-up for today as you have not solved your blocker for 3 days.");
	    }
	    standUpRepository.save(standUp);
	  }
	  
	  @Override
	  public List<StandUp> getStandUps(String username) {
	    return standUpRepository.findByUsername(username);
	 }
}
