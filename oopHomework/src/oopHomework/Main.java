package oopHomework;

public class Main {

	public static void main(String[] args) {
		
		Card card1 = new Card(1,"C# + Angular","Yaz�l�m Geli�tirici Yeti�tirme Kamp�",81);
		
		Card card2 = new Card(2,"JAVA + React","Yaz�l�m Geli�tirici Yeti�tirme Kamp�",29);
		
		Card card3 = new Card(3,"Phyton","Yaz�l�m Geli�tirici Yeti�tirme Kamp�",0);
		
		
		Card[] cards = {card1,card2,card3};
		
		for(Card card : cards) {
			
			System.out.println(
					
					"id : " + card.id + " course header : " + card.header + " description : "
					+ card.description + " rate : " + card.rate		
					
					);
		}
		
		cardManager cardManager = new cardManager();
		
		cardManager.addImage(card1);
		cardManager.selectLesson(card1);
		cardManager.addImage(card2);
		cardManager.selectLesson(card2);
		cardManager.addImage(card3);
		cardManager.selectLesson(card3);
		
	}

}
