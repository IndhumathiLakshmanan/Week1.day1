package week1.day1;

public class Isprime {

	public static void main(String[] args) {
	
	int number = 24;
	boolean condition = false;
	for (int i = 2; i <=number-1; i++) {
		if(number % i == 0) {
			condition =true;
			break;
		}
	}
	if (!condition)
			System.out.println("it is prime number");
		else { System.out.println("Not a prime number");}
	}		
	}