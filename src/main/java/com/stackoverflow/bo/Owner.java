package com.stackoverflow.bo;

import java.util.Objects;

public class Owner {
  private int reputation;
  private int user_id;
  private String user_type;
  private int accept_rate;
  private String profile_image;
  private String display_name;
  private String link;

  public Owner() {}

  public int getReputation() {
    return reputation;
  }

  public void setReputation(int reputation) {
    this.reputation = reputation;
  }

  public int getUser_id() {
    return user_id;
  }

  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

  public String getUser_type() {
    return user_type;
  }

  public void setUser_type(String user_type) {
    this.user_type = user_type;
  }

  public int getAccept_rate() {
    return accept_rate;
  }

  public void setAccept_rate(int accept_rate) {
    this.accept_rate = accept_rate;
  }

  public String getProfile_image() {
    return profile_image;
  }

  public void setProfile_image(String profile_image) {
    this.profile_image = profile_image;
  }

  public String getDisplay_name() {
    return display_name;
  }

  public void setDisplay_name(String display_name) {
    this.display_name = display_name;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Owner owner = (Owner) o;
    return reputation == owner.reputation && user_id == owner.user_id
        && accept_rate == owner.accept_rate && user_type.equals(owner.user_type)
        && profile_image.equals(owner.profile_image) && display_name.equals(owner.display_name)
        && link.equals(owner.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reputation, user_id, user_type, accept_rate, profile_image, display_name,
        link);
  }

  @Override
  public String toString() {
    return "Owner{" +
        "reputation=" + reputation +
        ", user_id=" + user_id +
        ", user_type='" + user_type + '\'' +
        ", accept_rate=" + accept_rate +
        ", profile_image='" + profile_image + '\'' +
        ", display_name='" + display_name + '\'' +
        ", link='" + link + '\'' +
        '}';
  }
}
