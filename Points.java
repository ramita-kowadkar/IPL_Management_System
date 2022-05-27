// POINTS TABLE JFRAME
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

public class Points extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterScoreOf;
	private JTextField txtEnterScoreOf_1;
	private JTextField txtEnterScoreOf_2;
	private JTextField txtEnterScoreOf_3;
	private JTextField txtEnterScoreOf_4;
	private JTextField txtEnterScoreOf_5;
	private JTextField txtEnterScoreOf_6;
	private JTextField txtEnterScoreOf_7;
	private JTextField rcb;
	private JTextField csk;
	private JTextField mi;
	private JTextField kxip;
	private JTextField kkr;
	private JTextField srh;
	private JTextField dc;
	private JTextField rr;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Points frame = new Points();
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
	public Points() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(700, 100, 546, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PointTable obj = new PointTable();
		String team[] = {"RCB" , "CSK" , "MI" , "KXIP" , "KKR" , "SRH" , "DC" , "RR"};
		int score[] = new int[9];
		
		txtEnterScoreOf = new JTextField();
		txtEnterScoreOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterScoreOf.setText("Enter score of RCB");
		txtEnterScoreOf.setBounds(53, 109, 189, 20);
		contentPane.add(txtEnterScoreOf);
		txtEnterScoreOf.setColumns(10);
		
		txtEnterScoreOf_1 = new JTextField();
		txtEnterScoreOf_1.setText("Enter score of CSK");
		txtEnterScoreOf_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterScoreOf_1.setColumns(10);
		txtEnterScoreOf_1.setBounds(53, 140, 189, 20);
		contentPane.add(txtEnterScoreOf_1);
		
		txtEnterScoreOf_2 = new JTextField();
		txtEnterScoreOf_2.setText("Enter score of MI");
		txtEnterScoreOf_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterScoreOf_2.setColumns(10);
		txtEnterScoreOf_2.setBounds(53, 171, 189, 20);
		contentPane.add(txtEnterScoreOf_2);
		
		txtEnterScoreOf_3 = new JTextField();
		txtEnterScoreOf_3.setText("Enter score of KXIP");
		txtEnterScoreOf_3.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterScoreOf_3.setColumns(10);
		txtEnterScoreOf_3.setBounds(53, 202, 189, 20);
		contentPane.add(txtEnterScoreOf_3);
		
		txtEnterScoreOf_4 = new JTextField();
		txtEnterScoreOf_4.setText("Enter score of KKR");
		txtEnterScoreOf_4.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterScoreOf_4.setColumns(10);
		txtEnterScoreOf_4.setBounds(53, 233, 189, 20);
		contentPane.add(txtEnterScoreOf_4);
		
		txtEnterScoreOf_5 = new JTextField();
		txtEnterScoreOf_5.setText("Enter score of SRH");
		txtEnterScoreOf_5.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterScoreOf_5.setColumns(10);
		txtEnterScoreOf_5.setBounds(53, 264, 189, 20);
		contentPane.add(txtEnterScoreOf_5);
		
		txtEnterScoreOf_6 = new JTextField();
		txtEnterScoreOf_6.setText("Enter score of DC");
		txtEnterScoreOf_6.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterScoreOf_6.setColumns(10);
		txtEnterScoreOf_6.setBounds(53, 295, 189, 20);
		contentPane.add(txtEnterScoreOf_6);
		
		txtEnterScoreOf_7 = new JTextField();
		txtEnterScoreOf_7.setText("Enter score of RR");
		txtEnterScoreOf_7.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterScoreOf_7.setColumns(10);
		txtEnterScoreOf_7.setBounds(53, 326, 189, 20);
		contentPane.add(txtEnterScoreOf_7);
		
		rcb = new JTextField();
		rcb.setBounds(291, 109, 86, 20);
		contentPane.add(rcb);
		rcb.setColumns(10);
		
		csk = new JTextField();
		csk.setColumns(10);
		csk.setBounds(291, 140, 86, 20);
		contentPane.add(csk);
		
		mi = new JTextField();
		mi.setColumns(10);
		mi.setBounds(291, 171, 86, 20);
		contentPane.add(mi);
		
		kxip = new JTextField();
		kxip.setColumns(10);
		kxip.setBounds(291, 202, 86, 20);
		contentPane.add(kxip);
		
		kkr = new JTextField();
		kkr.setColumns(10);
		kkr.setBounds(291, 233, 86, 20);
		contentPane.add(kkr);
		
		srh = new JTextField();
		srh.setColumns(10);
		srh.setBounds(291, 264, 86, 20);
		contentPane.add(srh);
		
		dc = new JTextField();
		dc.setColumns(10);
		dc.setBounds(291, 295, 86, 20);
		contentPane.add(dc);
		
		rr = new JTextField();
		rr.setColumns(10);
		rr.setBounds(291, 326, 86, 20);
		contentPane.add(rr);
		
		JButton btnNewButton = new JButton("Display");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score[0] = Integer.parseInt(rcb.getText());
				score[1] = Integer.parseInt(csk.getText());
				score[2] = Integer.parseInt(mi.getText());
				score[3] = Integer.parseInt(kxip.getText());
				score[4] = Integer.parseInt(kkr.getText());
				score[5] = Integer.parseInt(srh.getText());
				score[6] = Integer.parseInt(dc.getText());
				score[7] = Integer.parseInt(rr.getText());
				obj.sortScore(score , team);
			}
		});
		btnNewButton.setBounds(413, 215, 89, 23);
		contentPane.add(btnNewButton);
		
	}
}
