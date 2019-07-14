package edu.cnm.deepdive.abqtrailsserverside.model.dao;

import edu.cnm.deepdive.abqtrailsserverside.model.entity.Photo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoDao {

  @Insert
  long insert(Photo photo);

  @Query("SELECT * FROM photo")
  LiveData<List<Photo>> getAll();

}
