// SCHEDULE CHECKING CLASS
package oep;

import javax.swing.JOptionPane;

public class Date {
	String team1 , team2 ;
	
	protected void scheduleCheck(String t1 , String t2) {
		this.team1 = t1.toUpperCase();
		this.team2 = t2.toUpperCase();
	    String[][] dates = new String[5][4];
	    dates[0] = new String[]{"CSK","MI","5th April 2020"};
	    dates[1] = new String[]{"KXIP","RR","17th April 2020"};
	    dates[2] = new String[]{"RCB","CSK","21st April 2020"};
	    dates[3] = new String[]{"SRH","KKR","26th April 2020"};
	    dates[4] = new String[]{"RCB","DC","13th April 2020"};
	
	    String date ="";
	
	    boolean found = false;
	    for(int i=0;i<5;i++)
	     {
	            if ((dates[i][0].equals(team1)) && (dates[i][1].equalsIgnoreCase(team2)))
	            {   
	                     date = dates[i][2];
	                     found = true;
	            }
	            if((dates[i][0].equals(team2)) && (dates[i][1].equalsIgnoreCase(team1)))
	            {   
	                     date = dates[i][2];
	                     found = true;
	            }
	     }
	
	    if (found == true)
	    {
	    JOptionPane.showMessageDialog(null , "DATES FOUND! \n" + team1 + " and " + team2 + " will play with each other on "+ date + "\n Enjoy the game ");
	    }
	
	    else
	    JOptionPane.showMessageDialog(null , " NO DATES FOUND!");


	}
}
