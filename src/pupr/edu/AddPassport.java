package pupr.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class AddPassport {

	private JFrame frame;
	private JTextField textField_4;
	private JTextField textField_9;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPassport window = new AddPassport();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddPassport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 974, 910);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Passport");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 42));
		
		JLabel lblNewLabel_1 = new JLabel("SurName");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JPanel imgJpane = new JPanel();
		imgJpane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JSeparator separator = new JSeparator();
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel lblNewLabel_1_2 = new JLabel("Name");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Date of Birthday");
		lblNewLabel_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Date of Issue");
		lblNewLabel_1_2_4.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_2 = new JLabel("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\r\n\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Passport Number");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Sex");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Nationality\r\n");
		lblNewLabel_1_2_3.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_1_2_4_1 = new JLabel("Date of Expiration\r\n");
		lblNewLabel_1_2_4_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_2_1 = new JLabel("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\r\n\r\n");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(22)
											.addComponent(separator, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
											.addGap(28))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(33)
											.addComponent(imgJpane, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_1_2_2, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_1_2_3, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_1_2_4, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_1_2_4_1, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)))))
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 806, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(59)
							.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 745, GroupLayout.PREFERRED_SIZE)
							.addGap(41))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(61)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(80)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
											.addGap(15)
											.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
											.addGap(73)
											.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_1_2_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_1_2_3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
									.addGap(41)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_1_2_4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_1_2_4_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(71)
									.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
							.addGap(88))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addComponent(imgJpane, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(22))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
