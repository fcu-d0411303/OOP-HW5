package fcu.iecs.oop.pokemon;

public class Pokemon {
	private final String name;
	private int cp;
	//以上為變數
	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getName() {
		return name;
	}
	
	//以下為建構子
	public Pokemon(String name,int cp){
		this.name=name;
		this.cp=cp;
	}

}
