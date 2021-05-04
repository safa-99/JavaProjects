package business;

import abstracts.ICampaignService;
import entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " kampanyası sisteme eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " kampanyası sistemden silindi");
	
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " kampanyası güncellendi");
		
	}

}
