class Main {
	public static void main(String[] args) {
		Player player = new Player();
		Enemy enemy = new Enemy();
		
		String pHand = player.chooseHand();
		String eHand = enemy.chooseHand();

		System.out.println("じゃん、けん、ぽんっ！");
		
		//勝敗チェック
		checkResult(player, enemy, pHand, eHand);
		
	}
	
	//勝敗チェック
	public static void checkResult(Player player,Enemy enemy, String pHand, String eHand) {
		if (pHand.equals("G")) {
			//プレイヤーはグー
			System.out.println("プレイヤーは「グー」！");
			switch (eHand) {
				case "G":		//あいこ
					System.out.println("エネミーは「グー」！");
					draw(player, enemy);
					break;
				case "C":		//プレイヤーの勝ち
					System.out.println("エネミーは「チョキ」！");
					player.win();
					break;
				case "P":		//プレイヤーの負け
					System.out.println("エネミーは「パー」！");
					player.lose();
					break;
				default:
				System.out.println("error : default!");
			}
		} else if (pHand.equals("C")) {
			//プレイヤーはチョキ
			System.out.println("プレイヤーは「チョキ」！");
			switch (eHand) {
				case "G":		//プレイヤーの負け
					System.out.println("エネミーは「グー」！");
					player.lose();
					break;
				case "C":		//あいこ
					System.out.println("エネミーは「チョキ」！");
					draw(player, enemy);
					break;
				case "P":		//プレイヤーの勝ち
					System.out.println("エネミーは「パー」！");
					player.win();
					break;
				default:
				System.out.println("error : default!");
			}
		} else {
			//プレイヤーはパー
			System.out.println("プレイヤーは「パー」！");
			switch (eHand) {
				case "G":		//プレイヤーの勝ち
					System.out.println("エネミーは「グー」！");
					player.win();
					break;
				case "C":		//プレイヤーの負け
					System.out.println("エネミーは「チョキ」！");
					player.lose();
					break;
				case "P":		//あいこ
					System.out.println("エネミーは「パー」！");
					draw(player, enemy);
					break;
				default:
				System.out.println("error : default!");
			}
		}
	}
	
	//あいこ→あいこでしょ！
	public static void draw(Player player, Enemy enemy) {
		System.out.println("あい、こで、しょ！");

		String pHand = player.chooseHand();
		String eHand = enemy.chooseHand();

		//勝敗チェック
		checkResult(player, enemy, pHand, eHand);
	}
	
}
