package com.valueshipr.gameapp.app.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valueshipr.gameapp.app.model.Game;
import com.valueshipr.gameapp.app.model.Question;
import com.valueshipr.gameapp.app.repository.GameRepository;
import com.valueshipr.gameapp.app.service.GameService;


@Service
public class GameServiceImpl implements GameService{

    @Autowired
    private GameRepository gameRepository;

    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    
    public List<Game> getAllGames() {
        return (List<Game>) gameRepository.findAll();
    }

    public Game getGameById(Long id) {
        return gameRepository.findById(id).orElseThrow();
    }


    public Game updateGame(Long id, Game game) {
        Game existingGame = getGameById(id);
        existingGame.setName(game.getName());
        existingGame.setQuestions(game.getQuestions());
        return gameRepository.save(existingGame);
    }


//    private void forEach(List<Question> questions) {
//		// TODO Auto-generated method stub
//		
//	}


	public void deleteGame(Long id) {
        Game game = getGameById(id);
        gameRepository.delete(game);
    }

}






















//@Service
//public class GameServiceImpl implements GameService {
//
//    @Autowired
//    private GameRepository gameRepository;
//
//    @Override
//    public List<Game> getAllGames() {
//        return (List<Game>) gameRepository.findAll();
//    }
//
//    @Override
//    public Optional<Game> getGameById(Long id) {
//        return gameRepository.findById(id);
//    }
//
//    @Override
//    public Game createGame(Game game) {
//        return gameRepository.save(game);
//    }
//
////    @Override
////    public Game updateGame(Long id, Game game) {
//////        Optional<Game> optionalGame = gameRepository.findById(id);
//////        if (optionalGame.isPresent()) {
////            Game existingGame = optionalGame.get();
//////            existingGame.setName(game.getName());
//////            existingGame.setDescription(game.getDescription());
//////            existingGame.setType(game.getType());
//////            existingGame.setCorrectAnswer(game.getCorrectAnswer());
//////            existingGame.setOptimalAnswer(game.getOptimalAnswer());
//////            existingGame.setWrongAnswer(game.getWrongAnswer());
//////            existingGame.setGroup(game.getGroup());
////            
////           
////            existingGame.setName(game.getName());
////            existingGame.setQuestions(game.getQuestions());
////            return gameRepository.save(existingGame);
////        } else {
////            return null;
////        }
////    }
//    
//    
//
//    @Override
//    public void deleteGame(Long id) {
//        gameRepository.deleteById(id);
//    }
//}
