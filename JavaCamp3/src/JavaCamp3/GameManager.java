package JavaCamp3;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" isimli oyun eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" isimli oyun güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" isimli oyun silindi.");		
	}

	@Override
	public void discount(Game game, Campaign campaign) {
		double discount=game.getPrice()-(game.getPrice()*campaign.getDiscount())/100;
		System.out.println("Oyunun indirimli fiyatý: "+discount);
	}

}
