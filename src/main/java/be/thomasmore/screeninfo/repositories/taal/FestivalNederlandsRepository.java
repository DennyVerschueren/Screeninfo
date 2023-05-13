package be.thomasmore.screeninfo.repositories.taal;

import be.thomasmore.screeninfo.model.taal.FestivalNederlands;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FestivalNederlandsRepository extends CrudRepository<FestivalNederlands,Integer> {

    Optional<FestivalNederlands> SearchByFestivalId(Integer festivalId);

}
