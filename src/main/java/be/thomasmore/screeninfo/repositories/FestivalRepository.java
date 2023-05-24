package be.thomasmore.screeninfo.repositories;

import be.thomasmore.screeninfo.model.Festival;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface FestivalRepository extends CrudRepository<Festival,Integer> {
    Optional<Festival> findFirstByOrderByIdAsc();
    Optional<Festival> findFirstByOrderByIdDesc();
    Optional<Festival> findFirstByIdLessThanOrderByIdDesc(int id);
    Optional<Festival> findFirstByIdGreaterThanOrderById(int id);
    Iterable<Festival> findAllByOrderByOnGoingDesc();


    @Query("SELECT a FROM Festival a WHERE :word IS NULL OR LOWER(a.festivalName) LIKE LOWER(CONCAT('%',:word,'%'))")
    List<Festival> findByKeyword(@Param("word") String word);
}
