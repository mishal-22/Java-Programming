package simpleGame;

public class Player2 extends Player1 {
	private int health;
	private boolean armor;

	public Player2(String name, String weapon, int health, boolean armor) {
		super(name, weapon, health);
		this.health = health;
		if (this.health < 0 || this.health > 100) {
			this.health = 100;
		}

		this.armor = armor;
	}

	@Override
	public void damageByGun1() {
		if (armor) {
			this.health -= 20;
			if (this.health < 0) {
				this.health = 0;
			}
			System.out.println("Shot by gun 1 and health is reduced by 20 , new health is " + this.health);
			if (this.health == 0) {
				System.out.println(getName() + " is dead");
			}
		}
		if (!armor) {
			this.health -= 30;
			if (this.health < 0) {
				this.health = 0;
			}
			System.out.println("Shot by gun 1 and health is reduced by 30 , new health is " + this.health);
			if (this.health == 0) {
				System.out.println(getName() + " is dead");
			}
		}
	}

	@Override
	public void damageByGun2() {
		if (armor) {
			this.health -= 40;
			if (this.health < 0) {
				this.health = 0;
			}
			System.out.println("Shot by gun 2 and health is reduced by 40 , new health is " + this.health);
			if (this.health == 0) {
				System.out.println(getName() + " is dead");
			}
		}
		if (!armor) {
			this.health -= 50;
			if (this.health < 0) {
				this.health = 0;
			}
			System.out.println("Shot by gun 2 and health is reduced by 50 , new health is " + this.health);
			if (this.health == 0) {
				System.out.println(getName() + " is dead");
			}
		}
	}
     @Override
	public void heal() {
		if (this.health == 0) {
			System.out.println("Health is zero cant heal!");
		} else {
			this.health = 100;
			System.out.println("health is healed ,new health is " + this.health);
		}
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isArmor() {
		return armor;
	}

	public void setArmor(boolean armor) {
		this.armor = armor;
	}

}
