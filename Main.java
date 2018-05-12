class Main {
	public static void main(String[] args) {
		Player player = new Player();
		Enemy enemy = new Enemy();
		
		String pHand = player.chooseHand();
		String eHand = enemy.chooseHand();

		System.out.println("�����A����A�ۂ���I");
		
		//���s�`�F�b�N
		checkResult(player, enemy, pHand, eHand);
		
	}
	
	//���s�`�F�b�N
	public static void checkResult(Player player,Enemy enemy, String pHand, String eHand) {
		if (pHand.equals("G")) {
			//�v���C���[�̓O�[
			System.out.println("�v���C���[�́u�O�[�v�I");
			switch (eHand) {
				case "G":		//������
					System.out.println("�G�l�~�[�́u�O�[�v�I");
					draw(player, enemy);
					break;
				case "C":		//�v���C���[�̏���
					System.out.println("�G�l�~�[�́u�`���L�v�I");
					player.win();
					break;
				case "P":		//�v���C���[�̕���
					System.out.println("�G�l�~�[�́u�p�[�v�I");
					player.lose();
					break;
				default:
				System.out.println("error : default!");
			}
		} else if (pHand.equals("C")) {
			//�v���C���[�̓`���L
			System.out.println("�v���C���[�́u�`���L�v�I");
			switch (eHand) {
				case "G":		//�v���C���[�̕���
					System.out.println("�G�l�~�[�́u�O�[�v�I");
					player.lose();
					break;
				case "C":		//������
					System.out.println("�G�l�~�[�́u�`���L�v�I");
					draw(player, enemy);
					break;
				case "P":		//�v���C���[�̏���
					System.out.println("�G�l�~�[�́u�p�[�v�I");
					player.win();
					break;
				default:
				System.out.println("error : default!");
			}
		} else {
			//�v���C���[�̓p�[
			System.out.println("�v���C���[�́u�p�[�v�I");
			switch (eHand) {
				case "G":		//�v���C���[�̏���
					System.out.println("�G�l�~�[�́u�O�[�v�I");
					player.win();
					break;
				case "C":		//�v���C���[�̕���
					System.out.println("�G�l�~�[�́u�`���L�v�I");
					player.lose();
					break;
				case "P":		//������
					System.out.println("�G�l�~�[�́u�p�[�v�I");
					draw(player, enemy);
					break;
				default:
				System.out.println("error : default!");
			}
		}
	}
	
	//���������������ł���I
	public static void draw(Player player, Enemy enemy) {
		System.out.println("�����A���ŁA����I");

		String pHand = player.chooseHand();
		String eHand = enemy.chooseHand();

		//���s�`�F�b�N
		checkResult(player, enemy, pHand, eHand);
	}
	
}
