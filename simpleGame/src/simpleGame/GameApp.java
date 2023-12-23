package simpleGame;

public class GameApp {
public static void main(String[] args) {
	Player1 player1=new Player1("mishal", "AK47", 500);
//	player1.damageByGun1();
//	player1.damageByGun2();
//	player1.damageByGun2();
	
	Player2 player2=new Player2("msl", "Sword", 200, true);
	player2.damageByGun1();
	player2.damageByGun2();
	player2.heal();
}
}
