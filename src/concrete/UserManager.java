package concrete;

import abstracts.CheckRealPersonServices;
import abstracts.UserServices;
import entities.User;

public class UserManager implements UserServices {
	CheckRealPersonServices checkRealPersonServices;
	
	public UserManager(CheckRealPersonServices checkRealPersonServices) {
		this.checkRealPersonServices=checkRealPersonServices;
	}

	@Override
	public void add(User user) {
		if(checkRealPersonServices.checkIfRealPerson(user)) {
			System.out.println(user.getFirstName() +" "+ user.getLastName() +" "+"Kullan�c� ba�ar�yla kay�t oldu.");
			
		}else {
			System.out.println("Kullan�c� bilgileri yanl��");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + user.getLastName() +"Kullan�c� silindi.");
		
	}

	@Override
	public void uptade(User user) {
		
		System.out.println(user.getFirstName() + user.getLastName() +"Kullan�c� bilgileri g�ncelledi.");
	}

}
