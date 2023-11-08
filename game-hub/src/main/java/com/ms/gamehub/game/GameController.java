package com.ms.gamehub.game;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GameController {
    private final GameRepository gameRepository;

    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @PostMapping("/games")
    public void createGame(@Valid @RequestBody GameRequest gameRequest) {
        gameRepository.save(Game.fromRequest(gameRequest));
    }

    @GetMapping("/games")
    public List<GameResponse> getGames(){
        List<Game> games = gameRepository.findAll();
        List<GameResponse> gameResponses = new ArrayList<>();

        for (Game game : games) {
            gameResponses.add(GameResponse.fromEntity(game));
        }

        return gameResponses;
    }
}
