package com.valueshipr.standupapp.app.serviceI;


import java.util.List;

import com.valueshipr.standupapp.app.exception.StandUpValidationException;
import com.valueshipr.standupapp.app.model.StandUp;

public interface StandUpService {
	  void saveStandUp(StandUp standUp) throws StandUpValidationException;
	  List<StandUp> getStandUps(String username);
}