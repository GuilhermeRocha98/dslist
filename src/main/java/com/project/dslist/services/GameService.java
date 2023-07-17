package com.project.dslist.services;

import com.project.dslist.dto.GameDTO;
import com.project.dslist.dto.GameMinDTO;
import com.project.dslist.entities.Game;
import com.project.dslist.projections.GameMinProjection;
import com.project.dslist.repositories.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public GameDTO findById(Long id){
        Game result= gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);

        return dto;
    }

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    public List<GameMinDTO> findByGameList(Long listId) {
        List<GameMinProjection> games = gameRepository.searchByList(listId);
        return games.stream().map(GameMinDTO::new).toList();
    }
}
