package net.mrecho.coin.coins.types;

import net.mrecho.coin.coins.CoinTypes;

public class Dime extends CoinTypes {

	public Dime(){
		this.type = Coins.Dime;
	}
	
	@Override
	public String getName() {
		return "Dime";
	}

	@Override
	public float getValue() {
		return 0.1f;
	}

	@Override
	public float getVolume() {
		return 0.1f;
	}

	@Override
	public Coins getType() {
		return type;
	}

}
