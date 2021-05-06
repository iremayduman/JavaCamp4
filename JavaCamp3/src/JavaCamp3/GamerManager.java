package JavaCamp3;

public class GamerManager implements GamerService{

	@Override
	public void update(Gamer gamer) {
		System.out.println("Yeni oyuncu güncellendi: "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void add(Gamer gamer) {
		System.out.println("Yeni oyuncu eklnedi: "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Yeni oyuncu silindi: "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void login(Gamer gamer) {
		System.out.println("Yeni oyuncu giriþ yaptý: "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}


}
