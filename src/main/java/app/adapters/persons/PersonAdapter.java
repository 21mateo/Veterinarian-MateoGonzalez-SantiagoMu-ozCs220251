package app.adapters.persons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapters.person.entity.PersonEntity;
import app.adapters.persons.repository.PersonRepository;
import app.domain.models.Person;
import app.ports.PersonPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Service
public class PersonAdapter implements PersonPort {
	@Autowired
	private PersonRepository personRepository;

	@Override
	public boolean existsByDocument(Person person) throws Exception {
		return personRepository.existsByDocument(person);
	}

	@Override
	public void createPerson(Person Person) throws Exception {
		PersonEntity personEntity = personAdapter(Person);
		personRepository.createPerson(personEntity);
		Person.setId(personEntity.getId());
		
	}


	@Override
	public void deletePerson(Person Person) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person findByDocument(long document) throws Exception {
		PersonEntity personEntity = personRepository.findByDocument(document);
		return personAdapter(personEntity);
	}

	private Person personAdapter(PersonEntity personEntity) {
		Person person= new Person();
		person.setId(personEntity.getId());
		person.setDocument(personEntity.getDocument());
		person.setName(personEntity.getName());
		person.setId(personEntity.getAge());
                return person;
	}
	
	private PersonEntity personAdapter(Person person) {
		PersonEntity personEntity = new PersonEntity();
		personEntity.setId(person.getId());
		personEntity.setDocument(person.getDocument());
		personEntity.setName(person.getName());
		personEntity.setAge(person.getAge());
		return personEntity;
	}
	
}
