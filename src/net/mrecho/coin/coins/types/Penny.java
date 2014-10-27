package net.mrecho.coin.coins.types;

import net.mrecho.coin.coins.CoinTypes;

public class Penny extends CoinTypes {

	public Penny(){
		this.type = Coins.Penny;
	}

	@Override
	public String getName() {
		return "Penny";
	}

	@Override
	public float getValue() {
		return 0.01f;
	}

	@Override
	public float getVolume() {
		return 28.96f;
	}

	@Override
	public Coins getType() {
		return type;
	}

}
