// WINNERS LIST JFRAME
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

public class Winner extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterTheYear;
	private JTextField year;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Winner frame = new Winner();
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
	public Winner() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(700, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEnterTheYear = new JTextField();
		txtEnterTheYear.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtEnterTheYear.setText("Enter the year");
		txtEnterTheYear.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterTheYear.setBounds(23, 40, 194, 20);
		contentPane.add(txtEnterTheYear);
		txtEnterTheYear.setColumns(10);
		
		year = new JTextField();
		year.setBounds(265, 41, 86, 20);
		contentPane.add(year);
		year.setColumns(10);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WinnerList w = new WinnerList();
				w.dispWinners(year.getText());
			}
		});
		btnNewButton.setBackground(new Color(0, 206, 209));
		btnNewButton.setBounds(175, 101, 89, 23);
		contentPane.add(btnNewButton);
	}

}
