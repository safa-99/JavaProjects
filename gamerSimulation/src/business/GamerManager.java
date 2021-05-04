package business;

import abstracts.IGamerService;
import abstracts.IValidationService;
import entities.Gamer;

public class GamerManager implements IGamerService{
	
	private IValidationService validationService;

	public GamerManager(IValidationService validationService) {
		
		this.validationService = validationService;
		
	}

	@Override
	public void save(Gamer gamer) {
		
		if(validationService.validate(gamer)) {
			
			
			System.out.println(gamer.getFirstName() + " sisteme kaydedildi");
		}
		
		else {
			
			System.out.println("Ge�ersiz kimlik!");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {

		System.out.println(gamer.getFirstName() + " adl� oyuncu sistemden silindi");
		
	}

	@Override
	public void update(Gamer gamer) {

		System.out.println(gamer.getFirstName() + " g�ncellendi");
	}

			
		

}
