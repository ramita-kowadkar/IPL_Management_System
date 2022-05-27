// WINNERS LIST CLASS
package oep;

import javax.swing.JOptionPane;

public class WinnerList {
	String [][]winners = {{"SRH" , "MI" , "CSK" , "MI" , "MI"},
							{"2016" , "2017" , "2018" , "2019" , "2020"}
						 };
	void dispWinners(String year) {
		for(int i=0 ; i<5 ; i++) {
			if(winners[1][i].equals(year)) {
				JOptionPane.showMessageDialog(null , winners[0][i] + " were the winners in " + winners[1][i]);
			}
		}
	}

}
