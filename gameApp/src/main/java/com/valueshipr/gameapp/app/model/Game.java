package com.valueshipr.gameapp.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "game_id")
    private List<Question> questions;
    
    
    //getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
    
    
    
}



































//@Entity
//@Table(name = "games")
//public class Game {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    private String name;
//
//    @Column(nullable = false)
//    private String description;
//
//    @Column(nullable = false)
//    @Enumerated(EnumType.STRING)
//    private GameType gameType;
//
//    @Column(nullable = false)
//    private String correctAnswer;
//
//    @Column(nullable = false)
//    private String optimalAnswer;
//
//    @Column(nullable = false)
//    private String wrongAnswer;
//
//    @ManyToOne
//    @JoinColumn(name = "group_id")
//    private Group group;
//
//    // Constructors, getters, and setters
//
//    public Game() {}
//
//    public Game(String name, String description, GameType type, String correctAnswer, String optimalAnswer,
//                String wrongAnswer, Group group) {
//        this.name = name;
//        this.description = description;
//        this.gameType = type;
//        this.correctAnswer = correctAnswer;
//        this.optimalAnswer = optimalAnswer;
//        this.wrongAnswer = wrongAnswer;
//        this.group = group;
//    }
//
//    // Getters and setters
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public GameType getType() {
//        return gameType;
//    }
//
//    public void setType(GameType type) {
//        this.gameType = type;
//    }
//
//    public String getCorrectAnswer() {
//        return correctAnswer;
//    }
//
//    public void setCorrectAnswer(String correctAnswer) {
//        this.correctAnswer = correctAnswer;
//    }
//
//    public String getOptimalAnswer() {
//        return optimalAnswer;
//    }
//
//    public void setOptimalAnswer(String optimalAnswer) {
//        this.optimalAnswer = optimalAnswer;
//    }
//
//    public String getWrongAnswer() {
//        return wrongAnswer;
//    }
//
//    public void setWrongAnswer(String wrongAnswer) {
//        this.wrongAnswer = wrongAnswer;
//    }
//
//    public Group getGroup() {
//        return group;
//    }
//
//    public void setGroup(Group group) {
//        this.group = group;
//    }
//
//}
