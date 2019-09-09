package Com.StateCapital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateAndCaptialPrject {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
		System.out.println("perform state and capital operation for press 1");
	System.out.println("System Exit for press 2");
	 System.out.println("choose ur choices");
	 choice = sc.nextInt();
		
  switch(choice)
  {
  case 1:
		System.out.println("Enter the state name:");

		Map<String, String> stateMap = new HashMap<String,String>();
		stateMap.put("Uttar Pradesh".toLowerCase(), "Lucknow");
		stateMap.put("Andhra Pradesh".toLowerCase(), "hyderabad");
		stateMap.put("Bihar".toLowerCase(), "Patna");
		stateMap.put("Goa".toLowerCase(), "Panaji");
		stateMap.put("Maharashtra".toLowerCase(), "Mumbai");
		Scanner st = new Scanner(System.in);

				String stateName = st.nextLine();

		String capitalName = stateMap.get(stateName);
		
		System.out.println("Capital of "+stateName + " is " + capitalName);
		System.out.println("  ");
		break;
  case 2:
	  System.exit(0);
	
       default:
			System.out.println("wrong choice..");

  }

			}while(true);
          }
}
