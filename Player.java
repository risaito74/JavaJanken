import java.util.Random;

class Player {
	String handType;	//G,C,P
	int winNum;
	int loseNum;
	
	//�R���X�g���N�^
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
	
	//����
	public void win() {
		System.out.println("�v���C���[�̏����I");
	}
	
	//�s�k
	public void lose() {
		System.out.println("�v���C���[�̕����I");
	}
}
