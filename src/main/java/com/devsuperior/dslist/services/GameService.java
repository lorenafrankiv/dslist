package com.devsuperior.dslist.services;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.dto.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        List<Game> result = repository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    public GameMinDTO findById(Long id){
        return repository.findById(id).map(GameMinDTO::new).orElseThrow();
    }
}
