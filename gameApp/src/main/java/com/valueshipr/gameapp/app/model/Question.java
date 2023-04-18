package com.valueshipr.gameapp.app.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String prompt;

    @Enumerated(EnumType.STRING)
    private AnswerType answerType;

    @ElementCollection
    private List<String> choices;

    private String correctAnswer;

    private String optimizableAnswer;

    private String wrongAnswer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public AnswerType getAnswerType() {
		return answerType;
	}

	public void setAnswerType(AnswerType answerType) {
		this.answerType = answerType;
	}

	public List<String> getChoices() {
		return choices;
	}

	public void setChoices(List<String> choices) {
		this.choices = choices;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getOptimizableAnswer() {
		return optimizableAnswer;
	}

	public void setOptimizableAnswer(String optimizableAnswer) {
		this.optimizableAnswer = optimizableAnswer;
	}

	public String getWrongAnswer() {
		return wrongAnswer;
	}

	public void setWrongAnswer(String wrongAnswer) {
		this.wrongAnswer = wrongAnswer;
	}

   
}

















//@Entity
//@Table(name = "groups")
//public class Group {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
////
////    @Column(nullable = false)
//    private String name;
//
//    @OneToMany(mappedBy = "group")
//    private List<Game> games;
//
//    public Group() {}
//
//    public Group(String name) {
//        this.name = name;
//    }
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
//    public List<Game> getGames() {
//        return games;
//    }
//
//    public void setGames(List<Game> games) {
//        this.games = games;
//    }
//}
