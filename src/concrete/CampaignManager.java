package concrete;

import abstracts.CampaignServices;
import entities.Campaign;

public class CampaignManager implements CampaignServices{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ campaign.getDiscount()+ "�ndirim oran�yla eklendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+  " Silindi ");
		
	}

	@Override
	public void uptade(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " G�ncellendi ");
		
	}

}
