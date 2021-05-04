package business;

import abstracts.ISaleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SaleManager implements ISaleService{

	@Override
	public void sale(Game game,Gamer gamer) {
		
		
		System.out.println(gamer.getFirstName() + " " + game.getPriceAfterDiscount() + " tutar�ndaki "
				+ game.getGameName() + " oyunu sat�n ald�.");
	}

}
