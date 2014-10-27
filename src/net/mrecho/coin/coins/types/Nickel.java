package net.mrecho.coin.coins.types;

import net.mrecho.coin.coins.CoinTypes;

public class Nickel extends CoinTypes {

	public Nickel(){
		this.type = Coins.Nickel;
	}
	
	@Override
	public String getName() {
		return "Nickel";
	}

	@Override
	public float getValue() {
		return 0.05f;
	}

	@Override
	public float getVolume() {
		return 41.36f;
	}

	@Override
	public Coins getType() {
		return type;
	}

}
