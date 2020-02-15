package org.example.repo;

import org.example.entity.Meteo;
import org.springframework.data.repository.CrudRepository;

public interface MeteoRepo extends CrudRepository<Meteo, Integer>{
}
