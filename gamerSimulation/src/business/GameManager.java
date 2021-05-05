package business;

import abstracts.IGameService;
import abstracts.ISaleService;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class GameManager implements IGameService{
    
	private ISaleService saleService;

	public GameManager(ISaleService saleService) {
		
		this.saleService = saleService;
	}

	@Override
	public void save(Game game) {
		
		System.out.println(game.getGameName() + "adli oyun sisteme eklendi");
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println(game.getGameName() + "adli oyun sistemden silindi");
	}

	@Override
	public void update(Game game) {
		
		System.out.println(game.getGameName() + "adli oyun güncellendi");
	}
	
	public void sale(Game game,Player player) {
		
		saleService.sale(game,player);
		
	}
	



}
