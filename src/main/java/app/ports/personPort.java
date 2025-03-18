package app.ports;

import app.domain.models.Person;

public interface PersonPort {
	public boolean existsByDocument(Person person) throws Exception;
	public void createPerson(Person person) throws Exception;
	public void deletePerson(Person person) throws Exception;
	public Person findByDocument(long document) throws Exception;

}
