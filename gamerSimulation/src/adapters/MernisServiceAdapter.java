package adapters;

import java.rmi.RemoteException;

import abstracts.IValidationService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		//mernisValidation.TCKimlikNoDogrula(Long TC, Ad, Soyad, Dogum Yili );
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalIdentityNumber()),
					  gamer.getFirstName(), 
					  gamer.getLastName(), 
					  gamer.getYearOfBirth());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
		
		
	}

}
