package concrete;

import entities.Campaign;
import entities.Game;
import entities.User;

public class SaleManager {
	public void saleManager(User user, Game game, Campaign campaign) {
		String sale= user.getFirstName() +" "+ user.getLastName()+ " "+ game.getGameName()+" oyununu "+ " % " +campaign.getDiscount()+" "
	+campaign.getCampaignName() + " �ndirimiyle "+ (game.getPrice()- (game.getPrice()*campaign.getDiscount()/100))+ " TL Fiyat�na sat�n ald�.";
		System.out.println(sale);
		
	}

}
