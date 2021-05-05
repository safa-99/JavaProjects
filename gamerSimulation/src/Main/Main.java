package Main;

import adapters.MernisServiceAdapter;
import business.CampaignManager;
import business.GameManager;
import business.PlayerManager;
import business.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class Main {

	public static void main(String[] args) {
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.save(new Player(1,"Mehmet","Gün",2002,"11122233344"));
		
	    GameManager  gameManager = new GameManager(new SaleManager());
	    gameManager.sale(new Game(1,"FIFA 2021",400, new Campaign(1,"Efsane Cuma",10))
	    		,new Player(1,"Safa","Gün",1999,"11122233344"));
		
		CampaignManager campaignManager = new  CampaignManager();
		campaignManager.add(new Campaign(2,"Indirim Günleri",20));
		
		Player player = new Player(1,"AbdulCelal","Acar",1999,"22244499966");
		Campaign campaign = new Campaign(3,"Firsat Günleri",40);
		Game game = new Game(1,"CallofDuty",350,campaign);
		
		gameManager.sale(game,player);
		
		
	
		
		
		
		
		

	}

}
