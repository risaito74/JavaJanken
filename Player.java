import java.util.Random;

class Player {
	String handType;	//G,C,P
	int winNum;
	int loseNum;
	
	//コンストラクタ
	Player() {
		handType = "G";
		winNum = 0;
		loseNum = 0;
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
	
	//勝利
	public void win() {
		System.out.println("プレイヤーの勝ち！");
	}
	
	//敗北
	public void lose() {
		System.out.println("プレイヤーの負け！");
	}
}
