package app.ports;

import app.domain.models.pet;

public interface petPort {
	public void createPet(pet Pet) throws Exception;
	public pet findById(pet Pet) throws Exception;
	public boolean existsById(pet Pet) throws Exception;

}
