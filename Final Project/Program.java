import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int user = 0;

		while (user != 1 && user != 2) {
			System.out.println("High School or College Student");
			System.out.println("\t1) High School Student");
			System.out.println("\t2) College Student");
			System.out.print("Choose a menu item: ");

			user = input.nextInt();
		}
		if (user == 1) {
			highSchool();
		}
		else {
			collegeName();
		}
	}	


	public static void highSchool() {
		Scanner input = new Scanner(System.in);

		Highschool Highschool = new Highschool();
		Object[] array = new Object [100];

		System.out.println("Enter number of members:");
		int number = input.nextInt();
		input.nextLine();
		System.out.println("Enter the name of the High School:");
		Highschool.setSchool(input.next());

		for (int i = 0; i < number; i++) {
			System.out.println("Enter in First Name, Last Name, and Grade");
			array[i] = new Highschool(input.next(), input.next(), input.nextInt());

		}

		System.out.println("Name of school:" + Highschool.getSchool());
	
		
		System.out.println("Members:");
		for (int i = 0; i < number; i++) {
			System.out.println(array[i].toString());
	
		}
			}
		


	

	public static void collegeName() {
		Scanner input = new Scanner(System.in);

		College Collegestudent = new College();
		Object[] array = new Object [100];

		System.out.println("Enter number of members:");
		int number = input.nextInt();
		input.nextLine();
		System.out.println("Enter the name of the College or University:");
		Collegestudent.setSchool(input.next());

		for (int i = 0; i < number; i++) {
			System.out.println("Enter in First Name, Last Name, and Grade");
			array[i] = new College(input.next(), input.next(), input.nextInt());
			}
		

		System.out.print("Name of College or University" + Collegestudent.getSchool());

		System.out.println("Members:");
		for (int i = 0; i < number; i++) {
			 System.out.print(array[i].toString());
	
				}

			}
		
	}
