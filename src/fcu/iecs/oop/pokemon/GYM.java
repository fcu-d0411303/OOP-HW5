package fcu.iecs.oop.pokemon;

public class GYM {
	public static void fight(Pokemon p1, Pokemon p2){
		int i=(int) (Math.random() * 2+1);
		if(i==1){
			System.out.println("Winner is "+p1.getName());
			p1.setCp(p1.getCp()+500);
		}
		else{
			System.out.println("Winner is "+p2.getName());
			p2.setCp(p2.getCp()+500);
		}
	}


}
