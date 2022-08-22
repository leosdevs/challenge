package com.challenge.challengebackend.controller;

import com.challenge.challengebackend.model.Person;
import com.challenge.challengebackend.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
  @Autowired
  PersonService personService;

  @GetMapping()
  public List<Person> getAllPersons(){
    return this.personService.getAllPersons();
  }

  @PostMapping()
  public Person savePerson(@RequestBody Person person){
    return this.personService.savePerson(person);
  }

  @GetMapping(path= "/{id}")
  public Optional<Person>getPersonById(@PathVariable ("id") Long id){
    return this.personService.getPersonById(id);
  }

  @DeleteMapping(path = "/{id}")
  public String deletePersonById(@PathVariable("id") Long id){
    boolean ok = this.personService.deletePersonById(id);
    if(ok){
      return "Person deleted";
    }else{
      return "Person cannot be deleted";
    }
  }


}
