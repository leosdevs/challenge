package com.challenge.challengebackend.services;

import com.challenge.challengebackend.model.Person;
import com.challenge.challengebackend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
  @Autowired
  PersonRepository personRepository;

  public List<Person> getAllPersons(){
    return personRepository.findAll();
  }

  public Person savePerson(Person person){
    return personRepository.save(person);
  }

  public Optional <Person> getPersonById(Long id){
    return personRepository.findById(id);
  }

  public boolean deletePersonById(Long id){
    try {
      personRepository.deleteById(id);
      return true;
    }catch ( Exception err){
      return false;
    }
  }




}
