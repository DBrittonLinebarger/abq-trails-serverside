package edu.cnm.deepdive.abqtrailsserverside.model.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Trail {

  private static EntityLinks entityLinks;

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(name = "trail_id", columnDefinition = "CHAR(16) FOR BIT DATA", nullable = false,
      updatable = false)
  private UUID id;

  @NonNull
  @Column(name = "trail_name", nullable = false, unique = true)
  private String name;

  @NonNull
  @Column(nullable = false)
  private double length;

  @Column
  private String horse;

  @Column
  private String dog;

  @Column
  private String bike;

  @NonNull
  @Column(nullable = false, name = "trail_head")
  private String trailHead;

  @Column(name = "trail_rating")
  private double rating;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "photo",
      cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  @OrderBy("photo_id ASC ")
  private List<Photo> photos = new LinkedList<>();

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "rating",
      cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  @OrderBy("rating_id ASC")
  private List<Rating> ratings = new LinkedList<>();

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public String getHorse() {
    return horse;
  }

  public void setHorse(String horse) {
    this.horse = horse;
  }

  public String getDog() {
    return dog;
  }

  public void setDog(String dog) {
    this.dog = dog;
  }

  public String getBike() {
    return bike;
  }

  public void setBike(String bike) {
    this.bike = bike;
  }

  public String getTrailHead() {
    return trailHead;
  }

  public void setTrailHead(String trailHead) {
    this.trailHead = trailHead;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public List<Photo> getPhotos() {
    return photos;
  }

  public List<Rating> getRatings() {
    return ratings;
  }
  
  public URI getHref() {
    return entityLinks.linkForSingleResource(Trail.class, id).toUri();
  }

  @PostConstruct
  private void init() {
    String ignore = entityLinks.toString();
  }

  @Autowired
  private void setEntityLinks(EntityLinks entityLinks) {
    Trail.entityLinks = entityLinks;
  }

}
