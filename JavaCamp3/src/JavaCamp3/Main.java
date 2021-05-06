package JavaCamp3;

public class Main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer("İrem","Ayduman",03,"0123");
		GamerManager gamerManager=new GamerManager();
		gamerManager.add(gamer);
		gamerManager.login(gamer);
		gamerManager.delete(gamer);
		gamerManager.update(gamer);
		
		Campaign campaign=new Campaign(1,"Yaz indirimi",10);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		
		Game game=new Game(1,"okey",100);
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		gameManager.discount(game, campaign);
		gameManager.delete(game);
		gameManager.update(game);
		
		SaleManager saleManager=new SaleManager();
		saleManager.sale(gamer, game, campaign);
		
		ValidationManager validationManager=new ValidationManager();
		validationManager.validate(gamer);

	}

}
