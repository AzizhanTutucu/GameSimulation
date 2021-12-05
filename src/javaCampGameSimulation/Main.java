package javaCampGameSimulation;

import adapters.MernisCheckServices;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.SaleManager;
import concrete.UserManager;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Azizhan","Tutucu",1998,"11111111111");
		
		UserManager userManager= new UserManager(new MernisCheckServices());
		userManager.add(user);
		
		Game game = new Game(2,"CSGO",20);
		GameManager gameManager= new GameManager();
		gameManager.delete(game);
		
		Campaign campaign= new Campaign(3,"Yýlbaþý Özel",15);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.uptade(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.saleManager(user, game, campaign);

	}

}
