
public class SnakeAndLadderUC2 {

	public static void main(String[] args) {
		int position = 0;
		System.out.println("Current Position is: " + position);
		int dice = (int)Math.floor((Math.random() * 10) % 6 ) + 1;
		System.out.println("Number on dice is: " + dice);
	}

}
