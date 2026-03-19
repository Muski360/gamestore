package com.muski360.gamestore.Repository;

import org.springframework.data.repository.CrudRepository;

import com.muski360.gamestore.Model.Game;

public interface GameRepository extends CrudRepository<Game,Integer>{
    
}
