package net.mrecho.coin.coins;

public abstract class CoinTypes extends CoinList{

	protected Coins type;
	
	public abstract String getName();
	
	public abstract float getValue();
	
	public abstract float getVolume();
	
	public abstract Coins getType();
}