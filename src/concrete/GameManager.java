package concrete;

import abstracts.GameServices;
import entities.Game;

public class GameManager implements GameServices {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + game.getPrice() +" Fiyat�yla kaydedildi.");
		
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() +" Sistemden Silindi ");
		
	}

	@Override
	public void uptade(Game game) {
		System.out.println(game.getGameName() + " Bilgileri G�ncellendi");
		
	}

}
