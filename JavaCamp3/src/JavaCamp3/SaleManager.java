package JavaCamp3;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" isimli oyuncu "+ game.getName()+
				" oyununu "+ campaign.getDiscount()+" indirimle " +(game.getPrice()-(game.getPrice()*campaign.getDiscount())/100)+" fiyata satýn aldý. " );
		
	}

}
