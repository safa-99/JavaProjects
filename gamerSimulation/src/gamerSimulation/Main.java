package gamerSimulation;

import adapters.MernisServiceAdapter;
import business.CampaignManager;
import business.GameManager;
import business.GamerManager;
import business.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.save(new Gamer(1,"Mehmet","Gün",2002,"11122233344"));
		
	    GameManager  gameManager = new GameManager(new SaleManager());
	    gameManager.sale(new Game(1,"FÝFA 2021",400, new Campaign(1,"Efsane Cuma",10) )
	    		,new Gamer(1,"Safa","Gün",1999,"11122233344"));
		
		CampaignManager campaignManager = new  CampaignManager();
		campaignManager.add(new Campaign(2,"Ýndirim Günleri",20));
		
		Gamer gamer = new Gamer(1,"AbdulCelal","Acar",1999,"22244499966");
		Campaign campaign = new Campaign(3,"Fýrsat Günleri",40);
		Game game = new Game(1,"CallofDuty",350,campaign);
		
		gameManager.sale(game,gamer);
		
		
	
		
		
		
		
		

	}

}
