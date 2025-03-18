package app.ports;

import app.domain.models.VeterinarianHistory;

public interface VeterinarianHistoryPort {
	public void createVeterinarian(VeterinarianHistory veterinarianHistory) throws Exception;

}
