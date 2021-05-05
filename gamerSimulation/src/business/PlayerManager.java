package business;

import abstracts.IPlayerService;
import abstracts.IValidationService;
import entities.Player;

public class PlayerManager implements IPlayerService{
	
	private IValidationService validationService;

	public PlayerManager(IValidationService validationService) {
		
		this.validationService = validationService;
		
	}

	@Override
	public void save(Player player) {
		
		if(validationService.validate(player)) {
			
			
			System.out.println(player.getFirstName() + " sisteme kaydedildi");
		}
		
		else {
			
			System.out.println("Geçersiz kimlik!");
		}
		
	}

	@Override
	public void delete(Player player) {

		System.out.println(player.getFirstName() + " adli oyuncu sistemden silindi");
		
	}

	@Override
	public void update(Player player) {

		System.out.println(player.getFirstName() + " güncellendi");
	}

			
		

}
