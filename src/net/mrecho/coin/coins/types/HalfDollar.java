package net.mrecho.coin.coins.types;

import net.mrecho.coin.coins.CoinTypes;

public class HalfDollar extends CoinTypes {

	public HalfDollar(){
		this.type = Coins.HalfDollar;
	}
	
	@Override
	public String getName() {
		return "HalfDollar";
	}

	@Override
	public float getValue() {
		return 0.5f;
	}

	@Override
	public float getVolume() {
		return 65.81f;
	}

	@Override
	public Coins getType() {
		return type;
	}

}
