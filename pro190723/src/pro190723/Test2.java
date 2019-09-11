package pro190723;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Test2 {
	public static void main(String[] args) {
		LinkedList<Team> list = new LinkedList<Team>();
		LinkedList<LinkedList<Team>> list_log = new LinkedList<LinkedList<Team>>();

		list.add(new Team("lotte	"));
		list.add(new Team("samsong	"));
		list.add(new Team("hanhwa	"));
		list.add(new Team("lg	"));

		for (int i = 0; i < list.size() - 1; i++) { // 전적돌리기

			for (int j = 1; j < list.size() - i; j++) {

				for (int j2 = 0; j2 < 10; j2++) {
					int round_result = (int) (Math.random() * 3) + 0; // 0~2
					list.get(i).setFormer(list.get(i).getFormer() + 1);
					list.get(i + j).setFormer(list.get(i + j).getFormer() + 1);
					if (round_result == 1) { // 승
						list.get(i).setWin(list.get(i).getWin() + 2);
						list.get(i + j).setLose(list.get(i + j).getLose() + 1);
					} else if (round_result == 2) { // 패
						list.get(i).setLose(list.get(i).getLose() + 1);
						list.get(i + j).setWin(list.get(i + j).getWin() + 2);
					} else {
						list.get(i).setDrow(0);
						list.get(i + j).setDrow(list.get(i + j).getDrow() + 0);
					}

				}
			}

		} // 전적돌리기
			// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		Collections.sort(list, new Comparator<Team>() {

			@Override
			public int compare(Team o1, Team o2) {
				float r1 = o1.getWin() - o1.getLose();
				float r2 = o2.getWin() - o2.getLose();
				if (r1 > r2) {
					return +1; // 양수
				} else {
					return -1; // 음수
				}
			}
		});

		//
//			for (Team item : list) {
//				System.out.printf(item.toString() + "\n");
//			}
//			System.out.println("--------------------------------승차를 보여듐");
		//
		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		int top = list.get(1).getTotal();
		for (int i = 0; i < list.size() ; i++) { // 전적돌리기

			for (int j = 0; j < list.size() - i; j++) {
				int temp = top - list.get(i).getTotal();
				list.get(i+j).setWinning_difference(Math.abs(temp));
			}

		}
		Collections.sort(list, new Comparator<Team>() {

			@Override
			public int compare(Team o1, Team o2) {
				if (o1.getWinning_difference() < o2.getWinning_difference()) {
					return -1; // 양수
				} else if(o1.getWinning_difference()>o2.getWinning_difference()){
					return +1; // 음수
				}else {
					return 0;
				}
				
			}
		});

//			for (Team item : list) {
//				System.out.printf(item.toString() + "\n");
//			}

		list_log.add(list);

		System.out.println("---------------");

		for (LinkedList<Team> item1 : list_log) {
			System.out.println("ㅇㅂㅇ");
			for (Team item2 : item1) {
				System.out.println(item2.toString());//리스트 안에있는 리스트의 안에있는 객체를 꺼집어냄
			}
		}

	}
}

class Team {
	String teamName;
	float former = 0; // 전적
	float win = 0;
	float drow = 0;
	float lose = 0;
	int total = 0;
	float winning_rate = 0.0f; // 승률
	float winning_difference = 0.0f; // 승차

	public Team(String teamName) {
		super();
		this.teamName = teamName;
	}

	public String getTeamName() {
		return teamName;
	}

	public float getFormer() {
		return former;
	}

	public void setFormer(float former) {
		this.former = former;
	}

	public float getWin() {
		return win;
	}

	public void setWin(float win) {
		this.win = win;
	}

	public float getDrow() {
		return drow;
	}

	public void setDrow(float drow) {
		this.drow = drow;
	}

	public float getLose() {
		return lose;
	}

	public void setLose(float lose) {
		this.lose = lose;
	}

	public float getWinning_rate() {// 승수 / (승수+패수)
		// return winning_rate;
		return this.win / (this.win + this.lose);
	}

	public float getWinning_difference() {
		return winning_difference;
	}

	public void setWinning_difference(float winning_difference) {
		this.winning_difference = winning_difference;
	}

	public int getTotal() {
		return (int) (this.win - this.lose);
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", former=" + former + ", win=" + win + ", drow=" + drow + ", lose="
				+ lose + ", total=" + getTotal() + ", winning_rate=" + getWinning_rate() + ", winning_difference="
				+ winning_difference + "]";
	}

}