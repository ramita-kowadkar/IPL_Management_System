// PERSON CHECKING CLASS
package oep;

import javax.swing.JOptionPane;

public class Person {
	protected String team ;
	protected static String name;
	
	
	void personName(String name) {
		Person.name = name;
		for(int i=0 ; i<8 ; i++) {
			if(Player.players[0][i].equals(name)) {
				Player.dispDetails();
				return;
			}
			else if(Owner.owners[0][i].equals(name)) {
				Owner.dispDetails();
				return;
			}
			else if(Umpire.umpires[0][i].equals(name)) {
				Umpire.dispDetails();
				return;
			}
			else if(MedicalStaff.medicals[0][i].equals(name)) {
				MedicalStaff.dispDetails();
				return;
			}
			else {
				JOptionPane.showMessageDialog(null , name + " is not a member of IPL team ");
				break;
			}

	   } // end of for loop
	} // end of method

}



class Player extends Person{
	protected String highest_paid = "Virat";
	protected String highest_runs = "Virat";
	protected String highest_wickets = "Chahal";
	protected static String [][]players = {
										{"Virat","Shreyas","Dhoni","Steve","Rohit","Rahul","Morgan","Warner"},
										{"RCB","DC","CSK","RR","MI","KXIP","KKR","SRH"},
										{"10000000","5000000","9700000","5000000","9500000","8000000","7000000","6000000"}
									};
	
	static void dispDetails() {
		for(int i=0 ; i<8 ; i++) {
			if(players[0][i].equals(name)) {
				JOptionPane.showMessageDialog(null , players[0][i] + " is a player of " + players[1][i] + " team and he is bought at Rs " + players[2][i]);
			}
		}
		return;
	}
	
	void displayHighest() {
		/*System.out.println("Player Details : ");
		System.out.println();
		for(int i=0 ; i<8; i++) {
			System.out.println(players[0][i] + "\t" + players[1][i] + "\t" + players[2][i]);
		}*/
		JOptionPane.showMessageDialog(null ,"\n The highest paid person is " + highest_paid + "\n The person who has made highest runs is " + highest_runs + "\n The person who has taken highest wickets is " + highest_wickets);
	}
	
}


class Owner extends Person{
	protected static String [][]owners = {
										{"United Spirit Limited" , "N.Srinivasan" , "Sajjan Jindal" , "Priety Zinta" , "Shah Rukh Khan" , "Nita Ambani" , "Manoj Badale" , "Kalanithi Maran"} ,
										{"RCB" , "CSK" , "DC" , "KXIP", "KKR" , "MI" , "RR" , "SRH"} ,
										{"800000000" , "700000000" ,"600000000" , "700000000" , "500000000" , "800000000" , "600000000" , "500000000"}
			};
	
	static void dispDetails() {
		for(int i=0 ; i<8 ; i++) {
			if(owners[0][i].equals(name)) {
				JOptionPane.showMessageDialog(null , owners[0][i] + " is the owner of " + owners[1][i] + " team and has invested Rs " + owners[2][i]);
			}
		}
	}
}



class MedicalStaff extends Person{
	protected static String [][] medicals = {
										{"Ramita" , "Mansi" , "Rehan" , "Ram" , "Rohan" , "Reshma" , "Pranav" , "Suraj"} ,
										{"BMBS" , "BDS" , "MBBS" , "PHD" , "MBBS" , "BDS" , "BMBS" , "MBBS"}
									};
	static void dispDetails() {
		for(int i=0 ; i<8 ; i++) {
			if(medicals[0][i].equals(name)) {
				JOptionPane.showMessageDialog(null , medicals[0][i] + " is a member of medical staff and his/her qualification is " + medicals[1][i] );
			}
		}
	}
}



class Umpire extends Person{
	protected static String [][] umpires = {
										{"Sundaram Ravi" , "Kumar Dharmasena" , "Anil Chaudhary" , "Rod Tucker" , "Nitin Menon" ,"C. K. Nandan" , "Vineet Kulkarni" , "Krishna Hariharan"} ,
										{"1000000" , "1000000" , "1000000" , "1000000" , "1000000" , "1000000" , "1000000" , "1000000"} ,
									};
	static void dispDetails() {
		for(int i=0 ; i<8 ; i++) {
			if(umpires[0][i].equals(name)) {
				JOptionPane.showMessageDialog(null , umpires[0][i] + " is an umpire and he is paid Rs " + umpires[1][i] );
			}
		}
	  }
}
