// PERSON CHECKING JFRAME
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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Personcheck extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterTheName;
	private JTextField name;
	private JTextField txtToViewHighest;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Personcheck frame = new Personcheck();
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
	public Personcheck() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(700, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEnterTheName = new JTextField();
		txtEnterTheName.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterTheName.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtEnterTheName.setBackground(new Color(0, 0, 0));
		txtEnterTheName.setForeground(new Color(255, 255, 255));
		txtEnterTheName.setText("    Enter the name : ");
		txtEnterTheName.setBounds(30, 53, 146, 20);
		contentPane.add(txtEnterTheName);
		txtEnterTheName.setColumns(10);
		
		name = new JTextField();
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("Tahoma", Font.PLAIN, 12));
		name.setBackground(new Color(0, 0, 0));
		name.setForeground(new Color(255, 255, 255));
		name.setBounds(201, 54, 202, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = name.getText();
				Person p = new Person();
				p.personName(s);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(0, 206, 209));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(149, 98, 89, 23);
		contentPane.add(btnNewButton);
		
		txtToViewHighest = new JTextField();
		txtToViewHighest.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtToViewHighest.setHorizontalAlignment(SwingConstants.CENTER);
		txtToViewHighest.setText("To view highest paid , runs , wickets click below !!");
		txtToViewHighest.setBounds(30, 169, 373, 20);
		contentPane.add(txtToViewHighest);
		txtToViewHighest.setColumns(10);
		txtToViewHighest.setVisible(true);
		
		JButton btn = new JButton("View");
		btn.setForeground(new Color(0, 0, 0));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player p = new Player();
				p.displayHighest();
			}
		});
		btn.setBackground(new Color(0, 206, 209));
		btn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn.setBounds(149, 211, 89, 23);
		contentPane.add(btn);
		btn.setVisible(true);
	}
}
