package be.thomasmore.screeninfo.repositories.taal;


import be.thomasmore.screeninfo.model.taal.FestivalEnglish;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FestivalEnglishRepository extends CrudRepository<FestivalEnglish,Integer> {

    //Optional<FestivalEnglish> SearchByFestivalId(Integer festivalId);

}
