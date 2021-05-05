package abstracts;

import entities.Player;

public interface IPlayerService {
	
		void save(Player player);
		
		void delete(Player player);
		
		void update(Player player);
}
