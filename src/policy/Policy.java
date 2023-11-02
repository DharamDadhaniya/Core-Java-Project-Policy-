package policy;

import java.util.*;

public class Policy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ch;
		Policy_Data PD = null;
		List<Policy_Data> str = new ArrayList<Policy_Data>();

		System.out.println("Enter th User ID...");
		String UserId = sc.next();
		System.out.println("Enter the User Password...");
		String PassWd = sc.next();
		System.out.println("Valid Password...");
		System.out.println("=================================");

		do {
			System.out.println(
					"1. New Add Policy... \n2. Delete The Policy... \n3. View All Policy...");
			System.out.println("Select Any Options...");

			int number = sc.nextInt();

			switch (number) {
			case 1: {
				System.out.println("How many Enter the Policy...");
				int n = sc.nextInt();
				for (int i = 1; i <= n; i++) {

					PD = new Policy_Data();
					System.out.println("Enter the Client Name...");
					PD.setName(sc.next());
					System.out.println("Enter the Policy ID...");
					PD.setPolicyID(sc.next());
					System.out.println("Enter the Policy Name...");
					PD.setPolicyName(sc.next());
					str.add(PD);
				}
				System.out.println("All Policy Add...");
				System.out.println("=========================");
			
				
				break;

			}
			case 2: {

				System.out.println("Enter the Policy ID...");
				String ID = sc.next();
				boolean b = false;
				for (Policy_Data p : str) {
					if (p.getPolicyID() == ID) {
						System.out.println(p);
						str.remove(p);
						b = true;
						System.out.println("Policy Deleted...");
						break;
					}
				}
				if (b == true) {
					System.out.println("Policy Not Found...");
				}
				break;

			}
	
			case 3:{
				for(Policy_Data pd : str) {
					System.out.println(pd);
				}
			}

			}

			System.out.println("Do you have anything... (yes / No)");
			ch = sc.next();

		} while (ch.equalsIgnoreCase("yes"));

	}

}
