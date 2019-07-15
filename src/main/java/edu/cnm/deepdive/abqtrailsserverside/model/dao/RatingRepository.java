package edu.cnm.deepdive.abqtrailsserverside.model.dao;


import edu.cnm.deepdive.abqtrailsserverside.model.entity.Rating;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


public interface RatingRepository extends CrudRepository<Rating, UUID> {

 //List<Rating> getAllByOrderByName();
 //
 //List<Rating> getAllByNameContainsOrderByNameAsc(String nameFragment);


}
