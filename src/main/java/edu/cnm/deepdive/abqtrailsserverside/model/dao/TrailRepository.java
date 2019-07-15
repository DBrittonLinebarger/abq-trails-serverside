package edu.cnm.deepdive.abqtrailsserverside.model.dao;

import edu.cnm.deepdive.abqtrailsserverside.model.entity.Trail;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


public interface TrailRepository extends CrudRepository<Trail, UUID> {

  //List<Trail> getAllByOrderByName();
  //
  //List<Trail> getAllByNameContainsOrderByNameAsc(String nameFragment);


}