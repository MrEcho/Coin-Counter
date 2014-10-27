package net.mrecho.coin.coins.types;

import net.mrecho.coin.coins.CoinTypes;

public class Quarter extends CoinTypes {

	public Quarter(){
		this.type = Coins.Quarter;
	}
	
	@Override
	public String getName() {
		return "Quarter";
	}

	@Override
	public float getValue() {
		return 0.25f;
	}

	@Override
	public float getVolume() {
		return 42.46f;
	}

	@Override
	public Coins getType() {
		return type;
	}

}
