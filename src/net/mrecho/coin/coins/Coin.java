package net.mrecho.coin.coins;

public class Coin {

	private CoinTypes type;
	private String name;

	public Coin(CoinTypes type){
		this.type = type;
		this.name = type.getName();
	}
	
	/**
	 * This is used to store the values of the <code>Coins</code>
	 *
	 */
	public enum CoinValues {
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
		
		public abstract float volume();
		public abstract float value();

	}
	
	/**
	 * This returns the volume of space of Coins
	 * @param coin {@link Coins} 
	 * @return <code>true</code> or <code>false</code>
	 */
	public float getCoinVolume(){
		float out = 0;

		out = CoinValues.valueOf(name).volume();
		
		return out;
	}//getCoinVolume
	
	/**
	 * This returns the coin money value
	 * @param coin {@link Coins} 
	 * @return <code>true</code> or <code>false</code>
	 */
	public float getCoinValue(){
		float out = 0f;
		
		out = CoinValues.valueOf(name).value();
		
		return out;
	}//getCoinVolume
	
	public String getName(){
		return this.name;
	}
}
