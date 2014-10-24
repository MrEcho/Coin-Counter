package net.mrecho.coin;

public class constants {

	// http://www.wolframalpha.com/input/?i=32+fluid+oz+to+cubic+mm
	private static int JarVolume = 946353;
	
	// http://www.usmint.gov/about_the_mint/?action=coin_specifications
	private static float Cent = 28.96f;
	private static float Nickel = 41.36f;
	private static float Dime = 24.18f;
	private static float Quarter = 42.46f;
	private static float HalfDollar = 65.81f;
	private static float Dollar = 52.98f;
	
	public enum Coins {
		Cent, Nickel, Dime, Quarter, HalfDollar, Dollar
	}
	
	public static float getCoinVolume(Coins coin){
		
		switch(coin){
			case Cent: 		 return Cent;
			case Nickel: 	 return Nickel;
			case Dime: 		 return Dime;
			case Quarter: 	 return Quarter;
			case HalfDollar: return HalfDollar;
			case Dollar: 	 return Dollar;
			default: 		 return 0;
		}
		
	}//getCoinVolume
	
	public static int getVolume(){
		return JarVolume;
	}
}
