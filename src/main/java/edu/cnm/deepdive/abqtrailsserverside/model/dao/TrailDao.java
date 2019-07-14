package edu.cnm.deepdive.abqtrailsserverside.model.dao;

import edu.cnm.deepdive.abqtrailsserverside.model.entity.Trail;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TrailDao {

  @Insert
  long insert(Trail trail);

  @Query("SELECT * FROM trail")
  LiveData<List<Trail>> getAll();

}
