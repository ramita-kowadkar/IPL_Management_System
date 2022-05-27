package oep;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PointsTable extends JFrame {

	private JPanel contentPane;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JTextField txtEnterNameOf;
	private JTextField team1;
	private JTextField txtEnterNumberOf;
	private JTextField won1;
	private JTextField txtEnterNumberOf_1;
	private JTextField lost1;
	private JTextField txtEnterNumberOf_2;
	private JTextField tie1;
	private JTextField txtEnterNameOf_1;
	private JTextField txtEnterNumberOf_3;
	private JTextField txtEnterNumberOf_4;
	private JTextField txtEnterNumberOf_5;
	private JTextField team2;
	private JTextField won2;
	private JTextField lost2;
	private JTextField tie2;
	private JTextField txtEnterNameOf_2;
	private JTextField txtEnterNumberOf_6;
	private JTextField txtEnterNumberOf_7;
	private JTextField txtEnterNumberOf_8;
	private JTextField team3;
	private JTextField won3;
	private JTextField lost3;
	private JTextField tie3;
	private JTextField txtEnterNameOf_3;
	private JTextField txtEnterNumberOf_9;
	private JTextField txtEnterNumberOf_10;
	private JTextField txtEnterNumberOf_11;
	private JTextField team4;
	private JTextField won4;
	private JTextField lost4;
	private JTextField tie4;
	private JTextField txtEnterNameOf_4;
	private JTextField txtEnterNumberOf_12;
	private JTextField txtEnterNumberOf_13;
	private JTextField txtEnterNumberOf_14;
	private JTextField team5;
	private JTextField won5;
	private JTextField lost5;
	private JTextField tie5;
	private JTextField txtEnterNameOf_5;
	private JTextField txtEnterNumberOf_15;
	private JTextField txtEnterNumberOf_16;
	private JTextField txtEnterNumberOf_17;
	private JTextField team6;
	private JTextField won6;
	private JTextField lost6;
	private JTextField tie6;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField team7;
	private JTextField won7;
	private JTextField lost7;
	private JTextField tie7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField team8;
	private JTextField won8;
	private JTextField lost8;
	private JTextField tie8;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PointsTable frame = new PointsTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PointsTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1500, 1500, 1500, 1500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Points_Table p = new Points_Table();
		String teamname[] = new String[8];
		int score[] = new int[9];
		
		
		// First team
			txtEnterNameOf = new JTextField();
			txtEnterNameOf.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNameOf.setText("Enter name of the team : ");
			txtEnterNameOf.setBounds(28, 44, 174, 20);
			contentPane.add(txtEnterNameOf);
			txtEnterNameOf.setColumns(10);
			
			team1 = new JTextField();
			team1.setBounds(253, 44, 86, 20);
			contentPane.add(team1);
			team1.setColumns(10);
			
			txtEnterNumberOf = new JTextField();
			txtEnterNumberOf.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf.setText("Enter number of matches won : ");
			txtEnterNumberOf.setBounds(28, 75, 174, 20);
			contentPane.add(txtEnterNumberOf);
			txtEnterNumberOf.setColumns(10);
			
			won1 = new JTextField();
			won1.setBounds(253, 75, 86, 20);
			contentPane.add(won1);
			won1.setColumns(10);
			
			txtEnterNumberOf_1 = new JTextField();
			txtEnterNumberOf_1.setText("Enter number of matches lost : ");
			txtEnterNumberOf_1.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_1.setBounds(28, 106, 173, 20);
			contentPane.add(txtEnterNumberOf_1);
			txtEnterNumberOf_1.setColumns(10);
			
			lost1 = new JTextField();
			lost1.setBounds(253, 106, 86, 20);
			contentPane.add(lost1);
			lost1.setColumns(10);
			
			txtEnterNumberOf_2 = new JTextField();
			txtEnterNumberOf_2.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_2.setText("Enter number of matches tie : ");
			txtEnterNumberOf_2.setBounds(28, 137, 174, 20);
			contentPane.add(txtEnterNumberOf_2);
			txtEnterNumberOf_2.setColumns(10);
			
			tie1 = new JTextField();
			tie1.setBounds(253, 137, 86, 20);
			contentPane.add(tie1);
			tie1.setColumns(10);
			
			
			button_4 = new JButton("Store");
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					teamname[0] = team1.getText();
					int won = Integer.parseInt(won1.getText());
					int lost = Integer.parseInt(lost1.getText());
					int tie = Integer.parseInt(tie1.getText());
					score[0] = p.computeScore(won , lost , tie);
				}
			});
			
			
	// Second team	
			txtEnterNameOf_1 = new JTextField();
			txtEnterNameOf_1.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNameOf_1.setText("Enter name of the team : ");
			txtEnterNameOf_1.setBounds(28, 202, 174, 20);
			contentPane.add(txtEnterNameOf_1);
			txtEnterNameOf_1.setColumns(10);
			
			team2 = new JTextField();
			team2.setBounds(253, 202, 86, 20);
			contentPane.add(team2);
			team2.setColumns(10);
			
			txtEnterNumberOf_3 = new JTextField();
			txtEnterNumberOf_3.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_3.setText("Enter number of matches won : ");
			txtEnterNumberOf_3.setBounds(28, 233, 174, 20);
			contentPane.add(txtEnterNumberOf_3);
			txtEnterNumberOf_3.setColumns(10);
			
			won2 = new JTextField();
			won2.setBounds(253, 233, 86, 20);
			contentPane.add(won2);
			won2.setColumns(10);
			
			txtEnterNumberOf_4 = new JTextField();
			txtEnterNumberOf_4.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_4.setText("Enter number of matches lost : ");
			txtEnterNumberOf_4.setBounds(26, 264, 176, 20);
			contentPane.add(txtEnterNumberOf_4);
			txtEnterNumberOf_4.setColumns(10);
			
			lost2 = new JTextField();
			lost2.setBounds(253, 264, 86, 20);
			contentPane.add(lost2);
			lost2.setColumns(10);
			
			txtEnterNumberOf_5 = new JTextField();
			txtEnterNumberOf_5.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_5.setText("Enter number of matches tie : ");
			txtEnterNumberOf_5.setBounds(28, 295, 174, 20);
			contentPane.add(txtEnterNumberOf_5);
			txtEnterNumberOf_5.setColumns(10);
			
			tie2 = new JTextField();
			tie2.setBounds(253, 295, 86, 20);
			contentPane.add(tie2);
			tie2.setColumns(10);
			
			button_3 = new JButton("Store");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					teamname[1] = team2.getText();
					int won = Integer.parseInt(won2.getText());
					int lost = Integer.parseInt(lost2.getText());
					int tie = Integer.parseInt(tie2.getText());
					score[1] = p.computeScore(won , lost , tie);
				}
			});
			
			
	// Third team
			txtEnterNameOf_2 = new JTextField();
			txtEnterNameOf_2.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNameOf_2.setText("Enter name of the team : ");
			txtEnterNameOf_2.setBounds(28, 358, 174, 20);
			contentPane.add(txtEnterNameOf_2);
			txtEnterNameOf_2.setColumns(10);
			
			txtEnterNumberOf_6 = new JTextField();
			txtEnterNumberOf_6.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_6.setText("Enter number of matches won : ");
			txtEnterNumberOf_6.setBounds(28, 389, 174, 20);
			contentPane.add(txtEnterNumberOf_6);
			txtEnterNumberOf_6.setColumns(10);
			
			txtEnterNumberOf_7 = new JTextField();
			txtEnterNumberOf_7.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_7.setText("Enter number of matches lost : ");
			txtEnterNumberOf_7.setBounds(28, 420, 174, 20);
			contentPane.add(txtEnterNumberOf_7);
			txtEnterNumberOf_7.setColumns(10);
			
			txtEnterNumberOf_8 = new JTextField();
			txtEnterNumberOf_8.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_8.setText("Enter number of matches tie : ");
			txtEnterNumberOf_8.setBounds(28, 451, 174, 20);
			contentPane.add(txtEnterNumberOf_8);
			txtEnterNumberOf_8.setColumns(10);
			
			team3 = new JTextField();
			team3.setBounds(253, 358, 86, 20);
			contentPane.add(team3);
			team3.setColumns(10);
			
			won3 = new JTextField();
			won3.setBounds(253, 389, 86, 20);
			contentPane.add(won3);
			won3.setColumns(10);
			
			lost3 = new JTextField();
			lost3.setBounds(253, 420, 86, 20);
			contentPane.add(lost3);
			lost3.setColumns(10);
			
			tie3 = new JTextField();
			tie3.setBounds(253, 451, 86, 20);
			contentPane.add(tie3);
			tie3.setColumns(10);
			
			button_1 = new JButton("Store");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					teamname[2] = team3.getText();
					int won = Integer.parseInt(won3.getText());
					int lost = Integer.parseInt(lost3.getText());
					int tie = Integer.parseInt(tie3.getText());
					score[2] = p.computeScore(won , lost , tie);
				}
			});
			
			
	// Fourth team
			txtEnterNameOf_3 = new JTextField();
			txtEnterNameOf_3.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNameOf_3.setText("Enter name of the team : ");
			txtEnterNameOf_3.setBounds(28, 512, 174, 20);
			contentPane.add(txtEnterNameOf_3);
			txtEnterNameOf_3.setColumns(10);
			
			txtEnterNumberOf_9 = new JTextField();
			txtEnterNumberOf_9.setText("Enter number of matches won : ");
			txtEnterNumberOf_9.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_9.setBounds(28, 543, 174, 20);
			contentPane.add(txtEnterNumberOf_9);
			txtEnterNumberOf_9.setColumns(10);
			
			txtEnterNumberOf_10 = new JTextField();
			txtEnterNumberOf_10.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_10.setText("Enter number of matches lost : ");
			txtEnterNumberOf_10.setBounds(28, 574, 174, 20);
			contentPane.add(txtEnterNumberOf_10);
			txtEnterNumberOf_10.setColumns(10);
			
			txtEnterNumberOf_11 = new JTextField();
			txtEnterNumberOf_11.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_11.setText("Enter number of matches tie : ");
			txtEnterNumberOf_11.setBounds(28, 605, 174, 20);
			contentPane.add(txtEnterNumberOf_11);
			txtEnterNumberOf_11.setColumns(10);
			
			team4 = new JTextField();
			team4.setBounds(253, 512, 86, 20);
			contentPane.add(team4);
			team4.setColumns(10);
			teamname[3] = team4.getText();
			
			won4 = new JTextField();
			won4.setBounds(253, 543, 86, 20);
			contentPane.add(won4);
			won4.setColumns(10);
			
			lost4 = new JTextField();
			lost4.setBounds(253, 574, 86, 20);
			contentPane.add(lost4);
			lost4.setColumns(10);
			
			tie4 = new JTextField();
			tie4.setBounds(253, 605, 86, 20);
			contentPane.add(tie4);
			tie4.setColumns(10);
			
			button_2 = new JButton("Store");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					teamname[3] = team4.getText();
					int won = Integer.parseInt(won4.getText());
					int lost = Integer.parseInt(lost4.getText());
					int tie = Integer.parseInt(tie4.getText());
					score[3] = p.computeScore(won , lost , tie);
				}
			});
			
	// Fifth team
			txtEnterNameOf_4 = new JTextField();
			txtEnterNameOf_4.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNameOf_4.setText("Enter name of the team : ");
			txtEnterNameOf_4.setBounds(530, 44, 176, 20);
			contentPane.add(txtEnterNameOf_4);
			txtEnterNameOf_4.setColumns(10);
			
			txtEnterNumberOf_12 = new JTextField();
			txtEnterNumberOf_12.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_12.setText("Enter number of matches won : ");
			txtEnterNumberOf_12.setBounds(530, 75, 176, 20);
			contentPane.add(txtEnterNumberOf_12);
			txtEnterNumberOf_12.setColumns(10);
			
			txtEnterNumberOf_13 = new JTextField();
			txtEnterNumberOf_13.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_13.setText("Enter number of matches lost : ");
			txtEnterNumberOf_13.setColumns(10);
			txtEnterNumberOf_13.setBounds(530, 106, 176, 20);
			contentPane.add(txtEnterNumberOf_13);
			
			txtEnterNumberOf_14 = new JTextField();
			txtEnterNumberOf_14.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_14.setText("Enter number of matches tie : ");
			txtEnterNumberOf_14.setColumns(10);
			txtEnterNumberOf_14.setBounds(530, 137, 176, 20);
			contentPane.add(txtEnterNumberOf_14);
			
			team5 = new JTextField();
			team5.setBounds(754, 44, 86, 20);
			contentPane.add(team5);
			team5.setColumns(10);
			
			won5 = new JTextField();
			won5.setColumns(10);
			won5.setBounds(754, 75, 86, 20);
			contentPane.add(won5);
			
			lost5 = new JTextField();
			lost5.setColumns(10);
			lost5.setBounds(754, 106, 86, 20);
			contentPane.add(lost5);
			
			tie5 = new JTextField();
			tie5.setColumns(10);
			tie5.setBounds(754, 137, 86, 20);
			contentPane.add(tie5);
			
			btnNewButton = new JButton("Store");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					teamname[4] = team5.getText();
					int won = Integer.parseInt(won5.getText());
					int lost = Integer.parseInt(lost5.getText());
					int tie = Integer.parseInt(tie5.getText());
					score[4] = p.computeScore(won , lost , tie);
				}
			});			
			
			
	// Sixth team
			txtEnterNameOf_5 = new JTextField();
			txtEnterNameOf_5.setText("Enter name of the team : ");
			txtEnterNameOf_5.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNameOf_5.setBounds(530, 202, 176, 20);
			contentPane.add(txtEnterNameOf_5);
			txtEnterNameOf_5.setColumns(10);
			
			txtEnterNumberOf_15 = new JTextField();
			txtEnterNumberOf_15.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_15.setText("Enter number of matches won : ");
			txtEnterNumberOf_15.setColumns(10);
			txtEnterNumberOf_15.setBounds(530, 233, 176, 20);
			contentPane.add(txtEnterNumberOf_15);
			
			txtEnterNumberOf_16 = new JTextField();
			txtEnterNumberOf_16.setText("Enter number of matches lost : ");
			txtEnterNumberOf_16.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_16.setColumns(10);
			txtEnterNumberOf_16.setBounds(530, 264, 176, 20);
			contentPane.add(txtEnterNumberOf_16);
			
			txtEnterNumberOf_17 = new JTextField();
			txtEnterNumberOf_17.setHorizontalAlignment(SwingConstants.CENTER);
			txtEnterNumberOf_17.setText("Enter number of matches tie : ");
			txtEnterNumberOf_17.setColumns(10);
			txtEnterNumberOf_17.setBounds(530, 295, 176, 20);
			contentPane.add(txtEnterNumberOf_17);
			
			team6 = new JTextField();
			team6.setColumns(10);
			team6.setBounds(754, 202, 86, 20);
			contentPane.add(team6);
			
			won6 = new JTextField();
			won6.setColumns(10);
			won6.setBounds(754, 233, 86, 20);
			contentPane.add(won6);
			
			lost6 = new JTextField();
			lost6.setColumns(10);
			lost6.setBounds(754, 264, 86, 20);
			contentPane.add(lost6);
			
			tie6 = new JTextField();
			tie6.setColumns(10);
			tie6.setBounds(754, 295, 86, 20);
			contentPane.add(tie6);
			
			button = new JButton("Store");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					teamname[5] = team6.getText();
					int won = Integer.parseInt(won6.getText());
					int lost = Integer.parseInt(lost6.getText());
					int tie = Integer.parseInt(tie6.getText());
					score[5] = p.computeScore(won , lost , tie);
				}
			});
			
			
	// Seventh team
			textField = new JTextField();
			textField.setText("Enter name of the team : ");
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setColumns(10);
			textField.setBounds(530, 358, 176, 20);
			contentPane.add(textField);
			
			textField_1 = new JTextField();
			textField_1.setText("Enter number of matches won : ");
			textField_1.setHorizontalAlignment(SwingConstants.CENTER);
			textField_1.setColumns(10);
			textField_1.setBounds(530, 389, 176, 20);
			contentPane.add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setText("Enter number of matches lost : ");
			textField_2.setHorizontalAlignment(SwingConstants.CENTER);
			textField_2.setColumns(10);
			textField_2.setBounds(530, 420, 176, 20);
			contentPane.add(textField_2);
			
			textField_3 = new JTextField();
			textField_3.setText("Enter number of matches tie : ");
			textField_3.setHorizontalAlignment(SwingConstants.CENTER);
			textField_3.setColumns(10);
			textField_3.setBounds(530, 451, 176, 20);
			contentPane.add(textField_3);
			
			team7 = new JTextField();
			team7.setColumns(10);
			team7.setBounds(754, 358, 86, 20);
			contentPane.add(team7);
			
			won7 = new JTextField();
			won7.setColumns(10);
			won7.setBounds(754, 389, 86, 20);
			contentPane.add(won7);
			
			lost7 = new JTextField();
			lost7.setColumns(10);
			lost7.setBounds(754, 420, 86, 20);
			contentPane.add(lost7);
			
			tie7 = new JTextField();
			tie7.setColumns(10);
			tie7.setBounds(754, 451, 86, 20);
			contentPane.add(tie7);
			
			button_5 = new JButton("Store");
			button_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					teamname[6] = team7.getText();
					int won = Integer.parseInt(won7.getText());
					int lost = Integer.parseInt(lost7.getText());
					int tie = Integer.parseInt(tie7.getText());
					score[6] = p.computeScore(won , lost , tie);
				}
			});
			
			
	// Eighth team		
			textField_8 = new JTextField();
			textField_8.setText("Enter name of the team : ");
			textField_8.setHorizontalAlignment(SwingConstants.CENTER);
			textField_8.setColumns(10);
			textField_8.setBounds(530, 512, 176, 20);
			contentPane.add(textField_8);
			
			textField_9 = new JTextField();
			textField_9.setText("Enter number of matches won : ");
			textField_9.setHorizontalAlignment(SwingConstants.CENTER);
			textField_9.setColumns(10);
			textField_9.setBounds(530, 543, 176, 20);
			contentPane.add(textField_9);
			
			textField_10 = new JTextField();
			textField_10.setText("Enter number of matches lost : ");
			textField_10.setHorizontalAlignment(SwingConstants.CENTER);
			textField_10.setColumns(10);
			textField_10.setBounds(530, 574, 176, 20);
			contentPane.add(textField_10);
			
			textField_11 = new JTextField();
			textField_11.setText("Enter number of matches tie : ");
			textField_11.setHorizontalAlignment(SwingConstants.CENTER);
			textField_11.setColumns(10);
			textField_11.setBounds(530, 605, 176, 20);
			contentPane.add(textField_11);
			
			team8 = new JTextField();
			team8.setColumns(10);
			team8.setBounds(754, 512, 86, 20);
			contentPane.add(team8);
			
			won8 = new JTextField();
			won8.setColumns(10);
			won8.setBounds(754, 543, 86, 20);
			contentPane.add(won8);
			
			lost8 = new JTextField();
			lost8.setColumns(10);
			lost8.setBounds(754, 574, 86, 20);
			contentPane.add(lost8);
			
			tie8 = new JTextField();
			tie8.setColumns(10);
			tie8.setBounds(754, 605, 86, 20);
			contentPane.add(tie8);
			
			button_6 = new JButton("Store");
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					teamname[7] = team8.getText();
					int won = Integer.parseInt(won8.getText());
					int lost = Integer.parseInt(lost8.getText());
					int tie = Integer.parseInt(tie8.getText());
					score[7] = p.computeScore(won , lost , tie);
				}
			});
			
			
			btnNewButton.setBounds(871, 74, 89, 23);
			contentPane.add(btnNewButton);
			
			
			button.setBounds(871, 232, 89, 23);
			contentPane.add(button);
			
			
			button_1.setBounds(373, 388, 89, 23);
			contentPane.add(button_1);
			
			
			button_2.setBounds(373, 542, 89, 23);
			contentPane.add(button_2);
			
			
			button_3.setBounds(373, 232, 89, 23);
			contentPane.add(button_3);
			
			
			button_4.setBounds(373, 80, 89, 23);
			contentPane.add(button_4);
			
			
			button_5.setBounds(871, 388, 89, 23);
			contentPane.add(button_5);
			
			
			button_6.setBounds(871, 542, 89, 23);
			contentPane.add(button_6);
			
			btnNewButton_1 = new JButton("Compute");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					p.sortScore(score , teamname);
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton_1.setBackground(new Color(144, 238, 144));
			btnNewButton_1.setBounds(407, 683, 126, 23);
			contentPane.add(btnNewButton_1);
						
	}

}
