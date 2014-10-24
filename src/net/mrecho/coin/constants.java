package net.mrecho.coin;

public class constants {

	// http://www.wolframalpha.com/input/?i=32+fluid+oz+to+cubic+mm
	private static int JarVolume = 946353;
	
	// http://www.usmint.gov/about_the_mint/?action=coin_specifications
	private static float Penny = 28.96f;
	private static float Nickel = 41.36f;
	private static float Dime = 24.18f;
	private static float Quarter = 42.46f;
	private static float HalfDollar = 65.81f;
	private static float Dollar = 52.98f;
	
	public enum Coins {
		Penny, Nickel, Dime, Quarter, HalfDollar, Dollar
	}
	
	public static float getCoinVolume(Coins coin){
		
		switch(coin){
			case Penny: 	 return Penny;
			case Nickel: 	 return Nickel;
			case Dime: 		 return Dime;
			case Quarter: 	 return Quarter;
			case HalfDollar: return HalfDollar;
			case Dollar: 	 return Dollar;
			default: 		 return 0;
		}
		
	}//getCoinVolume
	
	public static float getCoinValue(Coins coin){
		
		switch(coin){
			case Penny: 	 return (float) 0.01;
			case Nickel: 	 return (float) 0.05;
			case Dime: 		 return (float) 0.1;
			case Quarter: 	 return (float) 0.25;
			case HalfDollar: return (float) 0.5;
			case Dollar: 	 return (float) 1.0;
			default: 		 return 0;
		}
		
	}//getCoinVolume
	
	public static int getVolume(){
		return JarVolume;
	}
}
