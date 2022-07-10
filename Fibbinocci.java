package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int n =12,firstnumber = 0, secondnumber = 1;
		System.out.println("Fibbinocci as below");
		for (int i = 1; i < n; i++) {
			System.out.println(firstnumber);
			int sum = firstnumber + secondnumber;
			firstnumber =secondnumber;
			secondnumber =sum;
			
			
		}

	}

}
