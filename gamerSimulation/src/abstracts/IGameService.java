package abstracts;

import entities.Game;

public interface IGameService {
	
	void save(Game game);

	void delete(Game game);

	void update(Game game);
}
