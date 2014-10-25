package net.mrecho.coin;

public class constants {

	// http://www.wolframalpha.com/input/?i=32+fluid+oz+to+cubic+mm
	private static int JarVolume = 946353;
	
	/**
	 * The valid types of coins
	 */
	public enum Coins {
		Penny, Nickel, Dime, Quarter, HalfDollar, Dollar
	}
	
	/**
	 * This is used to store the values of the <code>Coins</code>
	 *
	 */
	private enum CoinValues {
		Penny {
			public float volume() { return 28.96f; }
			public float value()  { return 0.01f; }
		},
		Nickel {
			public float volume() { return 41.36f; }
			public float value()  { return 0.05f; }
		},
		Dime {
			public float volume() { return 24.18f; }
			public float value()  { return 0.1f; }
		},
		Quarter {
			public float volume() { return 42.46f; }
			public float value()  { return 0.25f; }
		},
		HalfDollar {
			public float volume() { return 65.81f; }
			public float value()  { return 0.5f; }
		},
		Dollar {
			public float volume() { return 52.98f; }
			public float value()  { return 1.0f; }
		};
		
		abstract float volume();
		abstract float value();

	}
	
	/**
	 * This returns the volume of space of Coins
	 * @param coin {@link Coins} 
	 * @return <code>true</code> or <code>false</code>
	 */
	public static float getCoinVolume(Coins coin){
		float out = 0;

		out = CoinValues.valueOf(coin.toString()).volume();
		
		return out;
	}//getCoinVolume
	
	/**
	 * This returns the coin money value
	 * @param coin {@link Coins} 
	 * @return <code>true</code> or <code>false</code>
	 */
	public static float getCoinValue(Coins coin){
		float out = 0f;
		
		out = CoinValues.valueOf(coin.toString()).value();
		
		return out;
	}//getCoinVolume
	
	/**
	 * Returns the static max value of the Jar
	 * @return
	 */
	public static int getVolume(){
		return JarVolume;
	}
}
