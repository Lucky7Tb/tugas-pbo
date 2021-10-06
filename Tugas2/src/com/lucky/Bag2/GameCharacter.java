package com.lucky.Bag2;

public class GameCharacter {
	private String name;
	private int lifePoint;
	private int attackHitPoint;
	private int attackKickPoint;

	public GameCharacter(String name, int attackHitPoint, int attackKickPoint) {
		this.name = name;
		this.lifePoint = 100;
		this.attackHitPoint = attackHitPoint;
		this.attackKickPoint = attackKickPoint;
	}

	public int getLifePoint() {
		return this.lifePoint;
	}

	public String getName() {
		return this.name;
	}

	public void hit(GameCharacter character) {
		character.lifePoint -= this.attackHitPoint;
	}

	public void kick(GameCharacter character) {
		character.lifePoint -= this.attackKickPoint;
	}
}
