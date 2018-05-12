import java.util.Random;

class Enemy {
	String handType;	//G,C,P

	//コンストラクタ
	Enemy() {
		handType = "G";
	}
	
	public String chooseHand() {

		Random rnd = new Random();
        int hand = rnd.nextInt(3);
        
        if (hand == 0) {
			this.handType = "G";
		} else if (hand == 1) {
			this.handType = "C";
		} else {
			this.handType = "P";
		}

		return this.handType;
	}
}
