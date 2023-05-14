package be.thomasmore.screeninfo.repositories.taal;


import be.thomasmore.screeninfo.model.taal.FestivalEnglish;
import be.thomasmore.screeninfo.model.taal.FestivalNederlands;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FestivalEnglishRepository extends CrudRepository<FestivalNederlands,Integer> {

    //Optional<FestivalEnglish> SearchByFestivalId(Integer festivalId);

}
