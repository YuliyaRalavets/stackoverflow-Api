package com.stackoverflow.bo;

import java.util.Objects;

public class Answer {
  private Owner owner;
  private boolean is_accepted;
  private int score;
  private int last_activity_date;
  private int last_edit_date;
  private int creation_date;
  private int answer_id;
  private int question_id;
  private String content_license;

  public Answer(){}

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public boolean isIs_accepted() {
    return is_accepted;
  }

  public void setIs_accepted(boolean is_accepted) {
    this.is_accepted = is_accepted;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public int getLast_activity_date() {
    return last_activity_date;
  }

  public void setLast_activity_date(int last_activity_date) {
    this.last_activity_date = last_activity_date;
  }

  public int getLast_edit_date() {
    return last_edit_date;
  }

  public void setLast_edit_date(int last_edit_date) {
    this.last_edit_date = last_edit_date;
  }

  public int getCreation_date() {
    return creation_date;
  }

  public void setCreation_date(int creation_date) {
    this.creation_date = creation_date;
  }

  public int getAnswer_id() {
    return answer_id;
  }

  public void setAnswer_id(int answer_id) {
    this.answer_id = answer_id;
  }

  public int getQuestion_id() {
    return question_id;
  }

  public void setQuestion_id(int question_id) {
    this.question_id = question_id;
  }

  public String getContent_license() {
    return content_license;
  }

  public void setContent_license(String content_license) {
    this.content_license = content_license;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Answer answer = (Answer) o;
    return is_accepted == answer.is_accepted && score == answer.score
        && last_activity_date == answer.last_activity_date
        && last_edit_date == answer.last_edit_date
        && creation_date == answer.creation_date && answer_id == answer.answer_id
        && question_id == answer.question_id && owner.equals(answer.owner)
        && content_license.equals(
        answer.content_license);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, is_accepted, score, last_activity_date, last_edit_date,
        creation_date,
        answer_id, question_id, content_license);
  }

  @Override
  public String toString() {
    return "Answer{" +
        "owner=" + owner +
        ", is_accepted=" + is_accepted +
        ", score=" + score +
        ", last_activity_date=" + last_activity_date +
        ", last_edit_date=" + last_edit_date +
        ", creation_date=" + creation_date +
        ", answer_id=" + answer_id +
        ", question_id=" + question_id +
        ", content_license='" + content_license + '\'' +
        '}';
  }
}
