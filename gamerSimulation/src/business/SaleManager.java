package business;

import abstracts.ISaleService;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class SaleManager implements ISaleService{

	@Override
	public void sale(Game game,Player player) {
		
		
		System.out.println(player.getFirstName() + " " + game.getPriceAfterDiscount() + " tutarindaki "
				+ game.getGameName() + " oyunu satin aldi.");
	}

}
