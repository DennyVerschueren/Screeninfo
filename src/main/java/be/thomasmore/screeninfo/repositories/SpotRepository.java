package be.thomasmore.screeninfo.repositories;

import be.thomasmore.screeninfo.model.Spot;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SpotRepository extends CrudRepository<Spot, Integer> {

    @Override
    public List<Spot> findAll();

}
