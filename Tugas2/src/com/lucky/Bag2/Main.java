package com.lucky.Bag2;

public class Main {
	public static void main(String[] args) {
		GameCharacter raiden = new GameCharacter("Raiden", 10, 20);
		GameCharacter subZero = new GameCharacter("Sub-Zero", 5, 25);

		System.out.println("Game start");

		System.out.println("Raiden kick subZero");
		raiden.kick(subZero);

		System.out.println("Sub Zero did counter kick");
		subZero.kick(raiden);

		System.out.println("Sub zero hit raiden 3 times");
		for (int i = 0; i < 3; i++) {
			subZero.hit(raiden);
		}

		System.out.println("Raiden end fight with 4 times kick");
		for (int i = 0; i < 4; i++) {
			raiden.kick(subZero);
		}

		System.out.println("Raiden life point: " + raiden.getLifePoint());
		System.out.println("SubZero life point: " + subZero.getLifePoint());

		System.out.println("The winner is: ");
		if (raiden.getLifePoint() > subZero.getLifePoint()) {
			System.out.println("Raiden wins");
		} else {
			System.out.println("Sub zero wins");
		}
	}
}
