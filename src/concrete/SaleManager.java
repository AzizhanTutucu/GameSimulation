package concrete;

import entities.Campaign;
import entities.Game;
import entities.User;

public class SaleManager {
	public void saleManager(User user, Game game, Campaign campaign) {
		String sale= user.getFirstName() +" "+ user.getLastName()+ " "+ game.getGameName()+" oyununu "+ " % " +campaign.getDiscount()+" "
	+campaign.getCampaignName() + " Ýndirimiyle "+ (game.getPrice()- (game.getPrice()*campaign.getDiscount()/100))+ " TL Fiyatýna satýn aldý.";
		System.out.println(sale);
		
	}

}
