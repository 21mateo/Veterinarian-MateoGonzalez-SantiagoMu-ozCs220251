package app.adapters.invoice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapters.invoice.entity.InvoiceEntity;
import app.adapters.invoice.repository.InvoiceRepository;
import app.adapters.order.entity.OrderEntity;
import app.adapters.person.entity.PersonEntity;
import app.adapters.pet.entity.PetEntity;
import app.domain.models.Invoice;
import app.domain.models.Order;
import app.domain.models.Person;
import app.domain.models.Pet;
import app.ports.InvoicePort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Service
public class InvoiceAdapter implements InvoicePort{
	
	@Autowired
    private InvoiceRepository invoiceRepository;

	@Override
	public void saveInvoice(Invoice invoice) throws Exception {
		InvoiceEntity entity = invoiceAdapter(invoice);
	    invoiceRepository.save(entity);
	    invoice.setId(entity.getId());
		
	}

	private InvoiceEntity invoiceAdapter(Invoice invoice) {
		InvoiceEntity invoiceEntity = new InvoiceEntity();
		invoiceEntity.setId(invoice.getId());
		invoiceEntity.setPetId(adapter(invoice.getPetId()));         
		invoiceEntity.setOwnerId(adapter(invoice.getOwnerId()));      
		invoiceEntity.setOrderId(adapter(invoice.getOrderId()));     
		invoiceEntity.setItems(invoice.getItems());
		invoiceEntity.setAmount(invoice.getAmount());
		invoiceEntity.setDate(invoice.getDate());
	    return invoiceEntity;
	}

	private PetEntity adapter(Pet petId) {
		// TODO Auto-generated method stub
		return null;
	}

	private PersonEntity adapter(Person ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	private OrderEntity adapter(Order orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getAllInvoices() {
		List<InvoiceEntity> entities = invoiceRepository.findAll();
	    List<Invoice> invoices = new ArrayList<>();

	    for (InvoiceEntity invoiceEntity : entities) {
	        Invoice invoice = new Invoice();
	        invoice.setId(invoiceEntity.getId());
	        invoice.setPetId(adapter(invoiceEntity.getPetId()));
	        invoice.setOwnerId(adapter(invoiceEntity.getOwnerId()));
	        invoice.setOrderId(adapter(invoiceEntity.getOrderId()));
	        invoice.setItems(invoiceEntity.getItems());
	        invoice.setAmount(invoiceEntity.getAmount());
	        invoice.setDate(invoiceEntity.getDate());
	        invoices.add(invoice);
	    }
	    return invoices;
	}

	private Order adapter(OrderEntity orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	private Person adapter(PersonEntity ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	private Pet adapter(PetEntity petId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getInvoicesByPerson(Person person) {
		List<InvoiceEntity> entities = invoiceRepository.findByOwnerId(person);
	    List<Invoice> invoices = new ArrayList<>();

	    for (InvoiceEntity invoiceEntity : entities) {
	        Invoice invoice = new Invoice();
	        invoice.setId(invoiceEntity.getId());
	        invoice.setPetId(adapter(invoiceEntity.getPetId()));
	        invoice.setOwnerId(adapter(invoiceEntity.getOwnerId()));
	        invoice.setOrderId(adapter(invoiceEntity.getOrderId()));
	        invoice.setItems(invoiceEntity.getItems());
	        invoice.setAmount(invoiceEntity.getAmount());
	        invoice.setDate(invoiceEntity.getDate());
	        invoices.add(invoice);
	    }
	    return invoices;
	}

}
