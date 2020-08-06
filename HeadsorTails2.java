import java.util.Random;

public class HeadsorTails2{

	public static void main(String[] args) {
		Random rnd = new Random();
		int head=0;
		int tail=0;
		System.out.println("Tossing a coin...");
		for(int i=1;i<=3;i++) {
			int x=rnd.nextInt(2);
			if(x==0) {
				System.out.println("Round "+i+": Heads");
				head++;
			}
			else {
				System.out.println("Round "+i+": Tails");
				tail++;
			}
		}
		System.out.println("Heads:"+head+","+"Tails:"+tail);
	}

}
