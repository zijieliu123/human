

public class human {

	
	private int age, gender;
	
	public void Setage(int age) {
		 this.age = age;
		
	}
	public void Setgender(int gender) {
		this.gender = gender;
		
		
	}
	public void tetanusshot() {
		if (age % 4 == 0   ) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	
		
	}
	public void canhevote() {
		if (age >= 18 ) {
			System.out.println("yes he can vote");
		}
		else {
			System.out.println("no he is underaged");
		}
	}
	
	public void toddlerornot() {
		if (age < 4) {
			if (gender == 1) {
				System.out.println("toddler boy");
				
			}
			else if (gender == 2) {
				System.out.println("toddler girl");
			}
			
		}
		else {
			System.out.println("not a toddler");
		}
		
	}
	public void doeshegetdiscount() {
		if (age > 65) {
			System.out.print("yes discount for you");
		}
		else if (age < 12) {
			System.out.print("yes discount for you");
			
		}
		else {
			System.out.println("no discount for you");
		}
	}
	public void areyouateenager() {
		if (age > 12) {
			if (age < 18) {
				System.out.println("teenager!");
			}
		}
		else {
			System.out.println("no teen");
		}
	}
	
	public static void main(String[] args) {
		human tester = new human();
		tester.Setage(6);
		tester.Setgender(1);
		tester.tetanusshot();
		tester.canhevote();
		tester.toddlerornot();
		tester.doeshegetdiscount();
		tester.areyouateenager();
		
	}
	
	
}