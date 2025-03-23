package app.adapters.invoice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapters.invoice.entity.InvoiceEntity;
import app.adapters.invoice.repository.InvoiceRepository;
import app.domain.models.Invoice;
import app.domain.models.Person;
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
		InvoiceEntity entity = new InvoiceEntity();
	    entity.setId(invoice.getId());
	    entity.setPetId(invoice.getPetId());         
	    entity.setOwnerId(invoice.getOwnerId());      
	    entity.setOrderId(invoice.getOrderId());     
	    entity.setItems(invoice.getItems());
	    entity.setAmount(invoice.getAmount());
	    entity.setDate(invoice.getDate());
	    return entity;
	}

	@Override
	public List<Invoice> getAllInvoices() {
		List<InvoiceEntity> entities = invoiceRepository.findAll();
	    List<Invoice> invoices = new ArrayList<>();

	    for (InvoiceEntity entity : entities) {
	        Invoice invoice = new Invoice();
	        invoice.setId(entity.getId());
	        invoice.setPetId(entity.getPetId());
	        invoice.setOwnerId(entity.getOwnerId());
	        invoice.setOrderId(entity.getOrderId());
	        invoice.setItems(entity.getItems());
	        invoice.setAmount(entity.getAmount());
	        invoice.setDate(entity.getDate());
	        invoices.add(invoice);
	    }
	    return invoices;
	}

	@Override
	public List<Invoice> getInvoicesByPerson(Person person) {
		List<InvoiceEntity> entities = invoiceRepository.findByOwnerId(person); // Asegúrate de tener este método en tu repositorio
	    List<Invoice> invoices = new ArrayList<>();

	    for (InvoiceEntity entity : entities) {
	        Invoice invoice = new Invoice();
	        invoice.setId(entity.getId());
	        invoice.setPetId(entity.getPetId());
	        invoice.setOwnerId(entity.getOwnerId());
	        invoice.setOrderId(entity.getOrderId());
	        invoice.setItems(entity.getItems());
	        invoice.setAmount(entity.getAmount());
	        invoice.setDate(entity.getDate());
	        invoices.add(invoice);
	    }
	    return invoices;
	}

}
