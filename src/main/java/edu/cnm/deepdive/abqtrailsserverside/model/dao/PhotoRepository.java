package edu.cnm.deepdive.abqtrailsserverside.model.dao;

import edu.cnm.deepdive.abqtrailsserverside.model.entity.Photo;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


public interface PhotoRepository extends CrudRepository<Photo, UUID> {

  //List<Photo> getAllByOrderByName();
  //
  //List<Photo> getAllByNameContainsOrderByNameAsc(String nameFragment);

}
