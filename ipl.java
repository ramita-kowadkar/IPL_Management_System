// IPL MANAGEMENT SYSTEM 
package oep;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class ipl extends JFrame {

	private JPanel contentPane;
	private JTextField txtMenuOfOperations;
	private JTextField txtClickTheOperation;
	private JTextField txtWelcomeToIpl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ipl frame = new ipl();
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
	public ipl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 491);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Thread t = new Thread(new Runnable(){
			public void run() {
				try {
					while(true) {
						getContentPane().setBackground(Color.BLACK);
						Thread.sleep(1000);
						getContentPane().setBackground(Color.DARK_GRAY);
						Thread.sleep(1000);
						getContentPane().setBackground(Color.GRAY);
						Thread.sleep(1000);
						getContentPane().setBackground(Color.WHITE);
						Thread.sleep(1000);
					}
				}
				catch(Exception e){
					
				}
			}
		});
		t.start();
		
		txtMenuOfOperations = new JTextField();
		txtMenuOfOperations.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenuOfOperations.setForeground(new Color(255, 255, 255));
		txtMenuOfOperations.setBackground(new Color(0, 0, 0));
		txtMenuOfOperations.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtMenuOfOperations.setText("   Menu Of Operations");
		txtMenuOfOperations.setBounds(318, 92, 204, 57);
		contentPane.add(txtMenuOfOperations);
		txtMenuOfOperations.setColumns(10);
		
		JButton btnNewButton = new JButton("1. Person");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Personcheck.NewScreen();
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(342, 226, 165, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2. Points Table");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PtTable.NewScreen();
				Points.NewScreen();
				//Points_Table pt = new Points_Table();
				//pt.getData();
				
			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(342, 260, 165, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3. History");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				History h = new History();
				h.dispHistory();
			}
		});
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(342, 294, 165, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4. Dates");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Schedule.NewScreen();
				//Date d = new Date();
				//d.scheduleCheck();
			}
		});
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBounds(342, 328, 165, 23);
		contentPane.add(btnNewButton_3);
		
		txtClickTheOperation = new JTextField();
		txtClickTheOperation.setHorizontalAlignment(SwingConstants.CENTER);
		txtClickTheOperation.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtClickTheOperation.setBackground(new Color(0, 0, 0));
		txtClickTheOperation.setForeground(new Color(255, 255, 255));
		txtClickTheOperation.setText("   Click the operation you want to perform ");
		txtClickTheOperation.setBounds(206, 174, 425, 41);
		contentPane.add(txtClickTheOperation);
		txtClickTheOperation.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("6. Exit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null , "Thank you !!");
				System.exit(0);
			}
		});
		btnNewButton_4.setBackground(new Color(0, 0, 0));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBounds(342, 396, 165, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5. Winners ");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Winner.NewScreen();
			}
		});
		btnNewButton_5.setBackground(new Color(0, 0, 0));
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setBounds(342, 362, 165, 23);
		contentPane.add(btnNewButton_5);
		
		txtWelcomeToIpl = new JTextField();
		txtWelcomeToIpl.setBackground(new Color(0, 0, 0));
		txtWelcomeToIpl.setForeground(new Color(255, 255, 255));
		txtWelcomeToIpl.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtWelcomeToIpl.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToIpl.setText("WELCOME TO IPL ");
		txtWelcomeToIpl.setBounds(274, 32, 320, 28);
		contentPane.add(txtWelcomeToIpl);
		txtWelcomeToIpl.setColumns(10);
	}
}
