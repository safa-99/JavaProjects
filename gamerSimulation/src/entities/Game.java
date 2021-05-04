package entities;

public class Game{

	private int id;
	private String gameName;
	private double unitPrice;
	private double priceAfterCampaign;
	private Campaign campaign;
	
	public Game() {
		
	}

	public Game(int id, String gameName, double unitPrice, Campaign campaign) {
		this.id = id;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
		this.campaign = campaign;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	public double getPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * (this.campaign.getDiscount() / 100));
	}

}
