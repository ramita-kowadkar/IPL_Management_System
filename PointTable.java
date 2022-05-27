// POINTS TABLE CLASS
package oep;
import javax.swing.JOptionPane;

public class PointTable {
	int sc[] = new int[9];
	String teamname[] = new String[8];
	
	void sortScore(int []sc,String []name) {
		for(int j=0;j<8;j++) 
		{
			for(int i=0; i<8; i++)
			{
				if(sc[i]<sc[j])
				{
					int temp = sc[i];
					sc[i] = sc[j];
					sc[j] = temp;
					
					String s = name[i];
					name[i] = name[j];
					name[j] = s;
				}
			}
	   }
		JOptionPane.showMessageDialog(null , "Position of teams on points table : \n 1. Score of " + name[0] + " is " + sc[0] + "\n 2. Score of " + name[1] + " is " + sc[1] + "\n 3. Score of " + name[2] + " is " + sc[2] + "\n 4. Score of " + name[3] + " is " + sc[3] + "\n 5. Score of " + name[4] + " is " + sc[4] + "\n 6. Score of " + name[5] + " is " + sc[5] + "\n 7. Score of " + name[6] + " is " + sc[6] + "\n 8. Score of " + name[7] + " is " + sc[7]);
		
	}
}
