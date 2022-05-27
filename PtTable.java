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
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PtTable extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField team1;
	private JTextField textField_2;
	private JTextField w1;
	private JTextField textField_4;
	private JTextField l1;
	private JTextField textField_6;
	private JTextField t1;
	private JTextField textField_1;
	private JTextField team2;
	private JTextField textField_5;
	private JTextField w2;
	private JTextField textField_8;
	private JTextField l2;
	private JTextField textField_10;
	private JTextField t2;
	private JTextField textField_12;
	private JTextField team3;
	private JTextField textField_14;
	private JTextField w3;
	private JTextField textField_16;
	private JTextField l3;
	private JTextField textField_18;
	private JTextField t3;
	private JTextField textField_20;
	private JTextField team4;
	private JTextField textField_22;
	private JTextField w4;
	private JTextField textField_24;
	private JTextField l4;
	private JTextField textField_26;
	private JTextField t4;
	private JTextField textField_28;
	private JTextField team5;
	private JTextField textField_30;
	private JTextField w5;
	private JTextField textField_32;
	private JTextField l5;
	private JTextField textField_34;
	private JTextField t5;
	private JTextField textField_36;
	private JTextField team6;
	private JTextField textField_38;
	private JTextField w6;
	private JTextField textField_40;
	private JTextField l6;
	private JTextField textField_42;
	private JTextField t6;
	private JTextField textField_3;
	private JTextField team7;
	private JTextField textField_9;
	private JTextField w7;
	private JTextField textField_13;
	private JTextField l7;
	private JTextField textField_17;
	private JTextField t7;
	private JTextField textField_7;
	private JTextField team8;
	private JTextField textField_15;
	private JTextField w8;
	private JTextField textField_21;
	private JTextField l8;
	private JTextField textField_25;
	private JTextField t8;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PtTable frame = new PtTable();
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
	public PtTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 1000, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Points_Table p = new Points_Table();
		String teamname[] = new String[8];
		int score[] = new int[9];
		
		textField = new JTextField();
		textField.setText("Enter name of the team : ");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(10, 29, 174, 20);
		contentPane.add(textField);
		
		team1 = new JTextField();
		team1.setColumns(10);
		team1.setBounds(220, 29, 86, 20);
		contentPane.add(team1);
		
		textField_2 = new JTextField();
		textField_2.setText("Enter number of matches won : ");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(10, 60, 174, 20);
		contentPane.add(textField_2);
		
		w1 = new JTextField();
		w1.setColumns(10);
		w1.setBounds(220, 60, 86, 20);
		contentPane.add(w1);
		
		textField_4 = new JTextField();
		textField_4.setText("Enter number of matches lost : ");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(10, 91, 176, 20);
		contentPane.add(textField_4);
		
		l1 = new JTextField();
		l1.setColumns(10);
		l1.setBounds(220, 91, 86, 20);
		contentPane.add(l1);
		
		textField_6 = new JTextField();
		textField_6.setText("Enter number of matches tie : ");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(10, 122, 174, 20);
		contentPane.add(textField_6);
		
		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(220, 122, 86, 20);
		contentPane.add(t1);
		
		JButton btnNewButton = new JButton("Compute");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamname[0] = team1.getText();
				int won = Integer.parseInt(w1.getText());
				int lost = Integer.parseInt(l1.getText());
				int tie = Integer.parseInt(t1.getText());
				score[0] = p.computeScore(won , lost , tie);
			}
		});
		btnNewButton.setBounds(335, 60, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setText("Enter name of the team : ");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(10, 182, 174, 20);
		contentPane.add(textField_1);
		
		team2 = new JTextField();
		team2.setColumns(10);
		team2.setBounds(220, 182, 86, 20);
		contentPane.add(team2);
		
		textField_5 = new JTextField();
		textField_5.setText("Enter number of matches won : ");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(10, 213, 174, 20);
		contentPane.add(textField_5);
		
		w2 = new JTextField();
		w2.setColumns(10);
		w2.setBounds(220, 213, 86, 20);
		contentPane.add(w2);
		
		textField_8 = new JTextField();
		textField_8.setText("Enter number of matches lost : ");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		textField_8.setBounds(10, 242, 176, 20);
		contentPane.add(textField_8);
		
		l2 = new JTextField();
		l2.setColumns(10);
		l2.setBounds(220, 242, 86, 20);
		contentPane.add(l2);
		
		textField_10 = new JTextField();
		textField_10.setText("Enter number of matches tie : ");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		textField_10.setBounds(10, 273, 174, 20);
		contentPane.add(textField_10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(220, 273, 86, 20);
		contentPane.add(t2);
		
		JButton button = new JButton("Compute");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamname[1] = team2.getText();
				int won = Integer.parseInt(w2.getText());
				int lost = Integer.parseInt(l2.getText());
				int tie = Integer.parseInt(t2.getText());
				score[1] = p.computeScore(won , lost , tie);
			}
		});
		button.setBounds(335, 212, 89, 23);
		contentPane.add(button);
		
		textField_12 = new JTextField();
		textField_12.setText("Enter name of the team : ");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		textField_12.setBounds(10, 330, 174, 20);
		contentPane.add(textField_12);
		
		team3 = new JTextField();
		team3.setColumns(10);
		team3.setBounds(220, 330, 86, 20);
		contentPane.add(team3);
		
		textField_14 = new JTextField();
		textField_14.setText("Enter number of matches won : ");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setColumns(10);
		textField_14.setBounds(10, 364, 174, 20);
		contentPane.add(textField_14);
		
		w3 = new JTextField();
		w3.setColumns(10);
		w3.setBounds(220, 361, 86, 20);
		contentPane.add(w3);
		
		textField_16 = new JTextField();
		textField_16.setText("Enter number of matches lost : ");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setColumns(10);
		textField_16.setBounds(10, 395, 176, 20);
		contentPane.add(textField_16);
		
		l3 = new JTextField();
		l3.setColumns(10);
		l3.setBounds(220, 392, 86, 20);
		contentPane.add(l3);
		
		textField_18 = new JTextField();
		textField_18.setText("Enter number of matches tie : ");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setColumns(10);
		textField_18.setBounds(10, 426, 174, 20);
		contentPane.add(textField_18);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(220, 426, 86, 20);
		contentPane.add(t3);
		
		JButton button_1 = new JButton("Compute");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamname[2] = team3.getText();
				int won = Integer.parseInt(w3.getText());
				int lost = Integer.parseInt(l3.getText());
				int tie = Integer.parseInt(t3.getText());
				score[2] = p.computeScore(won , lost , tie);
			}
		});
		button_1.setBounds(335, 360, 89, 23);
		contentPane.add(button_1);
		
		textField_20 = new JTextField();
		textField_20.setText("Enter name of the team : ");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setColumns(10);
		textField_20.setBounds(10, 484, 174, 20);
		contentPane.add(textField_20);
		
		team4 = new JTextField();
		team4.setColumns(10);
		team4.setBounds(220, 484, 86, 20);
		contentPane.add(team4);
		
		textField_22 = new JTextField();
		textField_22.setText("Enter number of matches won : ");
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setColumns(10);
		textField_22.setBounds(10, 515, 174, 20);
		contentPane.add(textField_22);
		
		w4 = new JTextField();
		w4.setColumns(10);
		w4.setBounds(220, 515, 86, 20);
		contentPane.add(w4);
		
		textField_24 = new JTextField();
		textField_24.setText("Enter number of matches lost : ");
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setColumns(10);
		textField_24.setBounds(10, 546, 176, 20);
		contentPane.add(textField_24);
		
		l4 = new JTextField();
		l4.setColumns(10);
		l4.setBounds(220, 546, 86, 20);
		contentPane.add(l4);
		
		textField_26 = new JTextField();
		textField_26.setText("Enter number of matches tie : ");
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setColumns(10);
		textField_26.setBounds(10, 577, 174, 20);
		contentPane.add(textField_26);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(220, 577, 86, 20);
		contentPane.add(t4);
		
		JButton button_2 = new JButton("Compute");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamname[3] = team4.getText();
				int won = Integer.parseInt(w4.getText());
				int lost = Integer.parseInt(l4.getText());
				int tie = Integer.parseInt(t4.getText());
				score[3] = p.computeScore(won , lost , tie);
			}
		});
		button_2.setBounds(335, 514, 89, 23);
		contentPane.add(button_2);
		
		textField_28 = new JTextField();
		textField_28.setText("Enter name of the team : ");
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setColumns(10);
		textField_28.setBounds(516, 29, 174, 20);
		contentPane.add(textField_28);
		
		team5 = new JTextField();
		team5.setColumns(10);
		team5.setBounds(731, 29, 86, 20);
		contentPane.add(team5);
		
		textField_30 = new JTextField();
		textField_30.setText("Enter number of matches won : ");
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setColumns(10);
		textField_30.setBounds(516, 60, 174, 20);
		contentPane.add(textField_30);
		
		w5 = new JTextField();
		w5.setColumns(10);
		w5.setBounds(731, 60, 86, 20);
		contentPane.add(w5);
		
		textField_32 = new JTextField();
		textField_32.setText("Enter number of matches lost : ");
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setColumns(10);
		textField_32.setBounds(514, 91, 176, 20);
		contentPane.add(textField_32);
		
		l5 = new JTextField();
		l5.setColumns(10);
		l5.setBounds(731, 91, 86, 20);
		contentPane.add(l5);
		
		textField_34 = new JTextField();
		textField_34.setText("Enter number of matches tie : ");
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setColumns(10);
		textField_34.setBounds(516, 122, 174, 20);
		contentPane.add(textField_34);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(731, 122, 86, 20);
		contentPane.add(t5);
		
		JButton button_3 = new JButton("Compute");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamname[4] = team5.getText();
				int won = Integer.parseInt(w5.getText());
				int lost = Integer.parseInt(l5.getText());
				int tie = Integer.parseInt(t5.getText());
				score[4] = p.computeScore(won , lost , tie);
			}
		});
		button_3.setBounds(850, 59, 89, 23);
		contentPane.add(button_3);
		
		textField_36 = new JTextField();
		textField_36.setText("Enter name of the team : ");
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setColumns(10);
		textField_36.setBounds(514, 182, 174, 20);
		contentPane.add(textField_36);
		
		team6 = new JTextField();
		team6.setColumns(10);
		team6.setBounds(731, 182, 86, 20);
		contentPane.add(team6);
		
		textField_38 = new JTextField();
		textField_38.setText("Enter number of matches won : ");
		textField_38.setHorizontalAlignment(SwingConstants.CENTER);
		textField_38.setColumns(10);
		textField_38.setBounds(516, 213, 174, 20);
		contentPane.add(textField_38);
		
		w6 = new JTextField();
		w6.setColumns(10);
		w6.setBounds(731, 213, 86, 20);
		contentPane.add(w6);
		
		textField_40 = new JTextField();
		textField_40.setText("Enter number of matches lost : ");
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setColumns(10);
		textField_40.setBounds(514, 244, 176, 20);
		contentPane.add(textField_40);
		
		l6 = new JTextField();
		l6.setColumns(10);
		l6.setBounds(731, 242, 86, 20);
		contentPane.add(l6);
		
		textField_42 = new JTextField();
		textField_42.setText("Enter number of matches tie : ");
		textField_42.setHorizontalAlignment(SwingConstants.CENTER);
		textField_42.setColumns(10);
		textField_42.setBounds(514, 275, 174, 20);
		contentPane.add(textField_42);
		
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(731, 273, 86, 20);
		contentPane.add(t6);
		
		JButton button_4 = new JButton("Compute");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamname[5] = team6.getText();
				int won = Integer.parseInt(w6.getText());
				int lost = Integer.parseInt(l6.getText());
				int tie = Integer.parseInt(t6.getText());
				score[5] = p.computeScore(won , lost , tie);
			}
		});
		button_4.setBounds(850, 210, 89, 23);
		contentPane.add(button_4);
		
		textField_3 = new JTextField();
		textField_3.setText("Enter name of the team : ");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(514, 330, 174, 20);
		contentPane.add(textField_3);
		
		team7 = new JTextField();
		team7.setColumns(10);
		team7.setBounds(731, 330, 86, 20);
		contentPane.add(team7);
		
		textField_9 = new JTextField();
		textField_9.setText("Enter number of matches won : ");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		textField_9.setBounds(514, 364, 174, 20);
		contentPane.add(textField_9);
		
		w7 = new JTextField();
		w7.setColumns(10);
		w7.setBounds(731, 364, 86, 20);
		contentPane.add(w7);
		
		textField_13 = new JTextField();
		textField_13.setText("Enter number of matches lost : ");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setColumns(10);
		textField_13.setBounds(512, 395, 176, 20);
		contentPane.add(textField_13);
		
		l7 = new JTextField();
		l7.setColumns(10);
		l7.setBounds(731, 395, 86, 20);
		contentPane.add(l7);
		
		textField_17 = new JTextField();
		textField_17.setText("Enter number of matches tie : ");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setColumns(10);
		textField_17.setBounds(512, 426, 174, 20);
		contentPane.add(textField_17);
		
		t7 = new JTextField();
		t7.setColumns(10);
		t7.setBounds(731, 426, 86, 20);
		contentPane.add(t7);
		
		JButton button_5 = new JButton("Compute");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamname[6] = team7.getText();
				int won = Integer.parseInt(w7.getText());
				int lost = Integer.parseInt(l7.getText());
				int tie = Integer.parseInt(t7.getText());
				score[6] = p.computeScore(won , lost , tie);
			}
		});
		button_5.setBounds(850, 360, 89, 23);
		contentPane.add(button_5);
		
		textField_7 = new JTextField();
		textField_7.setText("Enter name of the team : ");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(516, 484, 174, 20);
		contentPane.add(textField_7);
		
		team8 = new JTextField();
		team8.setColumns(10);
		team8.setBounds(731, 484, 86, 20);
		contentPane.add(team8);
		
		textField_15 = new JTextField();
		textField_15.setText("Enter number of matches won : ");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setColumns(10);
		textField_15.setBounds(516, 515, 174, 20);
		contentPane.add(textField_15);
		
		w8 = new JTextField();
		w8.setColumns(10);
		w8.setBounds(731, 515, 86, 20);
		contentPane.add(w8);
		
		textField_21 = new JTextField();
		textField_21.setText("Enter number of matches lost : ");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setColumns(10);
		textField_21.setBounds(514, 546, 176, 20);
		contentPane.add(textField_21);
		
		l8 = new JTextField();
		l8.setColumns(10);
		l8.setBounds(731, 546, 86, 20);
		contentPane.add(l8);
		
		textField_25 = new JTextField();
		textField_25.setText("Enter number of matches tie : ");
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setColumns(10);
		textField_25.setBounds(516, 577, 174, 20);
		contentPane.add(textField_25);
		
		t8 = new JTextField();
		t8.setColumns(10);
		t8.setBounds(731, 577, 86, 20);
		contentPane.add(t8);
		
		JButton button_6 = new JButton("Compute");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamname[7] = team8.getText();
				int won = Integer.parseInt(w8.getText());
				int lost = Integer.parseInt(l8.getText());
				int tie = Integer.parseInt(t8.getText());
				score[7] = p.computeScore(won , lost , tie);
			}
		});
		button_6.setBounds(850, 514, 89, 23);
		contentPane.add(button_6);
		
		JButton btnNewButton_1 = new JButton("Display");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(255, 160, 122));
		btnNewButton_1.setBounds(455, 665, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
