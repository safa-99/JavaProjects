package adapters;

import java.rmi.RemoteException;

import abstracts.IValidationService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;



public class MernisServisAdapter implements IValidationService {

	@Override
	public boolean validate(Customer customer) {

		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		//mernisValidation.TCKimlikNoDogrula(Long TC, Ad, Soyad, Dogum Yili );
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()),
					  customer.getFirstName(), 
					  customer.getLastName(), 
					  customer.getDateofBirth());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
		
		
		
	}
}