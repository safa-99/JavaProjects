package abstracts;

import entities.Gamer;

public interface IGamerService {
	
		void save(Gamer gamer);
		
		void delete(Gamer gamer);
		
		void update(Gamer gamer);
}
