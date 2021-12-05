package adapters;

import java.rmi.RemoteException;

import abstracts.CheckRealPersonServices;
import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckServices implements CheckRealPersonServices {
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();

	@Override
	public boolean checkIfRealPerson(User user)  {
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalId()), user.getFirstName(), user.getLastName(), user.getDateOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	
		}
	
	}


