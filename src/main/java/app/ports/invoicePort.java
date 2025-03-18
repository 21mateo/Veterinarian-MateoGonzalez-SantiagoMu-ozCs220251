package app.ports;

import app.domain.models.Invoice;

public interface InvoicePort {
	public void save(Invoice invoice) throws Exception;

}
