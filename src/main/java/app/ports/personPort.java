package app.ports;

import app.domain.models.person;

public interface personPort {
	public boolean existsByDocument(person Person) throws Exception;
	public void createPerson(person Person) throws Exception;
	public void deletePerson(person Person) throws Exception;
	public person findByDocument(person personDto) throws Exception;

}
