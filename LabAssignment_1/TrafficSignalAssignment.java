// Desc: Traffic light Simulation
// @author: Aswitha

import java.util.Scanner;

public class TrafficSignalAssignment {
	public static void main(String[] args) {
     System.out.println("Enter your choice:");
     Scanner input=new Scanner(System.in);
	  String button=input.nextLine();
		switch (button) {
		case "Red": System.out.println("Stop");
		            break;
		case "Yellow":System.out.println("Ready");
		              break;
		case "Green":System.out.println("Go");
		             break;
     

	}
  }
}
