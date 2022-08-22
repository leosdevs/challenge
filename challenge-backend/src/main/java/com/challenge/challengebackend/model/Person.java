package com.challenge.challengebackend.model;

import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true,nullable = false)
  private Long id;

  private String name;
  private String surname;
  private Long cardId ;
  private boolean employee;


  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Long getCardId() {
    return cardId;
  }

  public void setCardId(Long cardId) {
    this.cardId = cardId;
  }

  public boolean isEmployee() {
    return employee;
  }

  public void setEmployee(boolean employee) {
    this.employee = employee;
  }
}
