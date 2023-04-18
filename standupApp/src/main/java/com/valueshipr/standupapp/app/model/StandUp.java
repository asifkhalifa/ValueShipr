package com.valueshipr.standupapp.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "stand_ups")
public class StandUp {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(nullable = false)
  private String username;
  
  @Column(nullable = false)
  private String toDo;
  
  @Column(nullable = false)
  private String yesterdayAchievement;
  
  @Column(nullable = false)
  private String blockers;
  
  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private BlockerStatus blockerStatus;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getToDo() {
	return toDo;
}

public void setToDo(String toDo) {
	this.toDo = toDo;
}

public String getYesterdayAchievement() {
	return yesterdayAchievement;
}

public void setYesterdayAchievement(String yesterdayAchievement) {
	this.yesterdayAchievement = yesterdayAchievement;
}

public String getBlockers() {
	return blockers;
}

public void setBlockers(String blockers) {
	this.blockers = blockers;
}

public BlockerStatus getBlockerStatus() {
	return blockerStatus;
}

public void setBlockerStatus(BlockerStatus blockerStatus) {
	this.blockerStatus = blockerStatus;
}
  
  
  
}


