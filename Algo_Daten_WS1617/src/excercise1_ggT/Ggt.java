package excercise1_ggT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ggt {
	
	public int euclidIt(int a, int b){
		if (a==0){
			return b;
		}
		while(b>0){
			if(a>b){
				a -=b;
			}else{
				b-=a;
			}
		}
		return a;
	}

	public int euclidRec(int a, int b){
		if(b==0){
			return a;
		}
		if(a==0){
			return b;
		}
		if(a>b){
			return euclidRec(a-b, b);
		}else{
			return euclidRec(a, b-a);
		}
	}

	public int euclidRestRec(int a, int b){
		if(b==0){
			return a;
		}
		return euclidRestRec(b, a%b);
	}


	public int euclidRestIt(int a, int b){
		int h;
		while(b >0){
			h = a%b; 
			a = b;
			b = h;
		}
		return a;
	}

	public void greeting(){
		System.out.println("Welcome to the calculation of the GCD! \n\n");
	}

	public void help(){
		System.out.println("Please type one of following numbers, to choose an action: ");
		System.out.println(""
				+ "1 - GCD Euclid iterativ\n"
				+ "2 - GCD Euclid recursive \n"
				+ "3 - GCD Euclid rest iterativ \n"
				+ "4 - GCD Euclid rest recursive \n"
				+ "5 - help \n"
				+ "6 - exit \n");
	}

	public int getNum(){

		return getValidatedUserInput();
	}

	public void goodbye(){
		System.out.println("Thanks for calculating GCD... Have a good day!");
	}

	public void printResult(int result){
		System.out.println("The Greatest Common Divisor ist: \n \n"
				+ result + "			\n\n"	);
	}

	public int getValidatedUserInput(){
		Scanner in = new Scanner(System.in);
		boolean validInput = false;
		int number = 0;
		System.out.println("Enter number: ");
		while(!validInput){
			try{
				number = in.nextInt();
				validInput=true;
			}catch(InputMismatchException e){
				System.out.println("This is not a number, please try again: ");
			}
		}
		return number;
	}




	public static void main( String[] args ){
		boolean progRunning = true;
		Scanner in = new Scanner(System.in);
		Ggt ggT = new Ggt();
		ggT.greeting();
		ggT.help();
		while(progRunning){	
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				int a = ggT.getNum();
				int b = ggT.getNum();
				ggT.printResult(ggT.euclidIt(a, b));
				ggT.help();
				break;
			case 2:
				a = ggT.getNum();
				b = ggT.getNum();
				ggT.printResult(ggT.euclidRec(a, b));
				ggT.help();
				break;
			case 3:
				a = ggT.getNum();
				b = ggT.getNum();
				ggT.printResult(ggT.euclidRestIt(a, b));
				ggT.help();
				break;
			case 4:
				a = ggT.getNum();
				b = ggT.getNum();
				ggT.printResult(ggT.euclidRestRec(a, b));
				ggT.help();
				break;
			case 5:
				ggT.help();
				break;
			case 6:
				progRunning=false;
				break;
			default: 
				System.out.println("This is not a valid entry, please try again or type '5' for help. ");
				break;
			}
		}
		in.close();
		ggT.goodbye();

	}

}
