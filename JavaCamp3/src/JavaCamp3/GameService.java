package JavaCamp3;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	void discount(Game game,Campaign campaign);
}
