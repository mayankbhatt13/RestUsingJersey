package com.restdemo.jaxrs.service;

import com.restdemo.jaxrs.model.Person;
import com.restdemo.jaxrs.model.Response;

public interface PersonService {
	public Response addPerson(Person p);
	public Response deletePerson(int id);
	public Person getPerson(int id);
	public Person[] getAllPersons();
}
