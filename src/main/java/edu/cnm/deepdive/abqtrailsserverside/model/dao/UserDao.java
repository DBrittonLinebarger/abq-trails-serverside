package edu.cnm.deepdive.abqtrailsserverside.model.dao;

import edu.cnm.deepdive.abqtrailsserverside.model.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {


  @Insert
  long insert(User user);

  @Query("SELECT * FROM user")
  LiveData<List<User>> getAll();

}
