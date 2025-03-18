package app.ports;

import app.domain.models.Pet;

public interface PetPort {
	public void createPet(Pet pet) throws Exception;
	public Pet findById(Pet pet) throws Exception;
	public boolean existsById(Pet pet) throws Exception;

}
