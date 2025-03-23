package app.adapters.pet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapters.pet.repository.PetRepository;
import app.domain.models.Person;
import app.domain.models.Pet;
import app.ports.PetPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Service
public class PetAdapter implements PetPort {
	
	@Autowired
	private PetRepository petRepository;

	@Override
	public void createPet(Pet pet) throws Exception {
		petRepository.savePet(pet);
		
	}

	@Override
	public Pet findById(Pet pet) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Pet pet) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Pet> getPetsByOwner(Person owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pet findById(long petId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
