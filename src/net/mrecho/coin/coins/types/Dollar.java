package net.mrecho.coin.coins.types;

import net.mrecho.coin.coins.CoinTypes;

public class Dollar extends CoinTypes {

	public Dollar(){
		this.type = Coins.Dollar;
	}
	
	@Override
	public String getName() {
		return "Dollar";
	}

	@Override
	public float getValue() {
		return 1;
	}

	@Override
	public float getVolume() {
		return 52.98f;
	}

	@Override
	public Coins getType() {
		return type;
	}

}
