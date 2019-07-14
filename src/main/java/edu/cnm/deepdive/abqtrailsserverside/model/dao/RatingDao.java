package edu.cnm.deepdive.abqtrailsserverside.model.dao;


import edu.cnm.deepdive.abqtrailsserverside.model.entity.Rating;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingDao {

 @Insert
  long insert(Rating rating);

 @Query("SELECT * FROM rating")
  LiveData<List<Rating>> getAll();

}
