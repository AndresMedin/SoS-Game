package GUIToMainMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIToMainMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIToMainMenu frame = new GUIToMainMenu();
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
	public GUIToMainMenu() {
		setBackground(new Color(0, 0, 0));
		setTitle("SoS Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To S.O.S");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(124, 11, 173, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("== Main Menu ==");
		lblNewLabel_1.setForeground(SystemColor.menuText);
		lblNewLabel_1.setFont(new Font("Rockwell", Font.ITALIC, 18));
		lblNewLabel_1.setBounds(134, 46, 148, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Player 1");
		lblNewLabel_2.setFont(new Font("Rockwell", Font.BOLD, 16));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(72, 94, 65, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Player 2");
		lblNewLabel_3.setFont(new Font("Rockwell", Font.BOLD, 16));
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(301, 94, 65, 20);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Human");
		rdbtnNewRadioButton.setBackground(SystemColor.activeCaptionBorder);
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setFont(new Font("Rockwell", Font.BOLD, 12));
		rdbtnNewRadioButton.setBounds(49, 121, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Computer");
		rdbtnNewRadioButton_1.setBackground(SystemColor.activeCaptionBorder);
		rdbtnNewRadioButton_1.setFont(new Font("Rockwell", Font.BOLD, 12));
		rdbtnNewRadioButton_1.setBounds(49, 147, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Human");
		rdbtnNewRadioButton_2.setBackground(SystemColor.activeCaptionBorder);
		rdbtnNewRadioButton_2.setFont(new Font("Rockwell", Font.BOLD, 12));
		rdbtnNewRadioButton_2.setBounds(280, 121, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Computer");
		rdbtnNewRadioButton_3.setBackground(SystemColor.activeCaptionBorder);
		rdbtnNewRadioButton_3.setFont(new Font("Rockwell", Font.BOLD, 12));
		rdbtnNewRadioButton_3.setBounds(280, 147, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("Start Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Rockwell", Font.BOLD, 12));
		btnNewButton.setBounds(158, 206, 124, 23);
		contentPane.add(btnNewButton);
	}
}
