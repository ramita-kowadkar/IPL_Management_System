// SCHEDULE CHECKING JFRAME
package oep;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Schedule extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToThe;
	private JTextField txtEnterTwoIpl;
	private JTextField txtEnterstIpl;
	private JTextField t1;
	private JTextField txtEnterndIpl;
	private JTextField t2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Schedule frame = new Schedule();
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
	public Schedule() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(700, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Date d = new Date();
		
		txtWelcomeToThe = new JTextField();
		txtWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToThe.setText("WELCOME TO THE IPL SCHEDULE CHECKER!");
		txtWelcomeToThe.setBounds(59, 56, 344, 20);
		contentPane.add(txtWelcomeToThe);
		txtWelcomeToThe.setColumns(10);
		
		txtEnterTwoIpl = new JTextField();
		txtEnterTwoIpl.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtEnterTwoIpl.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterTwoIpl.setText("Enter two IPL teams to check their next match!");
		txtEnterTwoIpl.setBounds(23, 116, 437, 20);
		contentPane.add(txtEnterTwoIpl);
		txtEnterTwoIpl.setColumns(10);
		
		txtEnterstIpl = new JTextField();
		txtEnterstIpl.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterstIpl.setText("Enter 1st IPL team : ");
		txtEnterstIpl.setBounds(59, 176, 156, 20);
		contentPane.add(txtEnterstIpl);
		txtEnterstIpl.setColumns(10);
		
		t1 = new JTextField();
		t1.setBounds(284, 176, 86, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		txtEnterndIpl = new JTextField();
		txtEnterndIpl.setText("Enter 2nd IPL team : ");
		txtEnterndIpl.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterndIpl.setColumns(10);
		txtEnterndIpl.setBounds(59, 239, 156, 20);
		contentPane.add(txtEnterndIpl);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(284, 239, 86, 20);
		contentPane.add(t2);
		
		btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.scheduleCheck(t1.getText() , t2.getText());
			}
		});
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(189, 320, 89, 23);
		contentPane.add(btnNewButton);
		
	}

}
