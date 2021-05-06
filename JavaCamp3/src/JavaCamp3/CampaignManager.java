package JavaCamp3;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getDiscount() +" indirimli, "+campaign.getCampaignName()+" isimli kampanya eklendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getDiscount() +" indirimli, "+campaign.getCampaignName()+" isimli kampanya silindi.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getDiscount() +" indirimli, "+campaign.getCampaignName()+" isimli kampanya güncellendi.");		
	}

}
