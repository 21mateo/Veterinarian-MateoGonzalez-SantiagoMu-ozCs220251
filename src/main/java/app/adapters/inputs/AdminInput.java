package app.adapters.inputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.adapters.inputs.utils.PersonValidator;
import app.adapters.inputs.utils.UserValidator;
import app.adapters.inputs.utils.Utils;
import app.domain.services.AdminService;
import app.ports.InputPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Component
public class AdminInput implements InputPort{
	@Autowired
	private PersonValidator personValidator;
	@Autowired
	private UserValidator userValidator;
	@Autowired
	private AdminService adminService;
	
	private final String MENU = "Ingrese la opción:" 
			+ "\n 1. Registrar vendedor."
			+ "\n 2. Registrar veterinario."
			+ "\n 3. Consultar facturas por persona."
			+ "\n 4. Consultar mascotas por dueño."
			+ "\n 5. Cerrar sesión.";

	public void menu() {
		boolean sesion = true;
		while (sesion) {
			sesion = options();
		}
	}
	
	private boolean options() {
		try {
			System.out.println(MENU);
			String option = Utils.getReader().nextLine();
			switch (option) {
				case "1":
					this.registerSeller();
					return true;
				case "2":
					this.registerVeterinarian();
					return true;
				case "5":
					System.out.println("Se ha cerrado sesión.");
					return false;
				default:
					System.out.println("Opción no válida.");
					return true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return true;
		}
	}

	private void registerSeller() {
		System.out.println("Ingrese el nombre del vendedor:");
		String name = personValidator.nameValidator(Utils.getReader().nextLine());
		System.out.println("Ingrese el documento del vendedor:");
		long document = personValidator.documentValidator(Utils.getReader().nextLine());
		System.out.println("Ingrese la edad del vendedor:");
		int age = Integer.parseInt(Utils.getReader().nextLine());
		System.out.println("Ingrese el nombre de usuario del vendedor:");
		String userName = userValidator.userNameValidator(Utils.getReader().nextLine());
		System.out.println("Ingrese la contraseña del vendedor:");
		String password = userValidator.passwordValidator(Utils.getReader().nextLine());
		Seller seller = new Seller(document, name, age, userName, password);
		adminService.registerSeller(seller);
		
	}

	private void registerVeterinarian() {
		System.out.println("Ingrese el nombre del veterinario:");
		String name = personValidator.nameValidator(Utils.getReader().nextLine());
		System.out.println("Ingrese el documento del veterinario:");
		long document = personValidator.documentValidator(Utils.getReader().nextLine());
		System.out.println("Ingrese la edad del veterinario:");
		int age = Integer.parseInt(Utils.getReader().nextLine());
		System.out.println("Ingrese el nombre de usuario del veterinario:");
		String userName = userValidator.userNameValidator(Utils.getReader().nextLine());
		System.out.println("Ingrese la contraseña del veterinario:");
		String password = userValidator.passwordValidator(Utils.getReader().nextLine());
		Veterinarian veterinarian = new Veterinarian(document, name, age, userName, password);
		adminService.registerVeterinarian(veterinarian);
		
	}


}
