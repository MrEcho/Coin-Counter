package net.mrecho.coin.coins;

public enum CoinTypes {
	Penny("Penny"), 
	Nickel("Nickel"), 
	Dime("Dime"), 
	Quarter("Quarter"), 
	HalfDollar("HalfDollar"), 
	Dollar("Dollar");
	
	private String name;
	
	private CoinTypes(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
