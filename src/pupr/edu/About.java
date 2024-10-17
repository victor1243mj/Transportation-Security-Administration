package pupr.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class About {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About window = new About();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public About() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 773, 771);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblAboutUs = new JLabel("About US");
		lblAboutUs.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		
		JTextArea txtrCompanyNameGlobalpass = new JTextArea();
		txtrCompanyNameGlobalpass.setText("Company Name: GlobalPass Solutions\nProject Name: Passport Management System\nTeam Members:\n\nVictor Mejia – Lead Developer\nEricka Ramirez – Database Specialist");
		txtrCompanyNameGlobalpass.setEditable(false);
		
		JTextArea txtrMissionStatementAt = new JTextArea();
		txtrMissionStatementAt.setText("Mission Statement:\r\nAt GlobalPass Solutions, our mission is to revolutionize the passport management \r\nprocess by delivering user-friendly, efficient, and secure software. We are dedicated to providing solutions that empower institutions to handle passport-related tasks with ease, reliability, and full compliance with international standards.\r\n\r\nOur Vision:\r\nTo become a global leader in digital passport management systems, enhancing the efficiency of governments and private institutions alike, while ensuring top-tier security and streamlined operations.\r\n\r\nCore Values:\r\n\r\nInnovation: We believe in the power of technology to transform processes and improve lives.\r\nSecurity: Ensuring the highest levels of data protection and privacy for every individual is our priority.\r\nEfficiency: We aim to minimize the complexities of passport management, allowing for seamless user experiences.\r\nCollaboration: Teamwork drives our success, both within our organization and in our partnerships with clients.");
		txtrMissionStatementAt.setEditable(false);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		
		JTextArea txtrProjectOverviewThe = new JTextArea();
		txtrProjectOverviewThe.setText("Project Overview:\nThe Passport Management System is a cutting-edge solution designed to automate the creation, modification, and tracking of passport records. This system simplifies administrative tasks by providing an intuitive interface for adding new passports, searching through existing records, and managing related data such as expiration dates, visa statuses, and more. Our system is built with scalability in mind, ensuring it can handle small local agencies as well as large governmental institutions.\n\nKey Features:\n\nUser-Friendly Interface: Easy-to-navigate design for both technical and non-technical users.\nDatabase Integration: Seamless integration with MySQL databases to ensure fast and secure data access.\nAdvanced Search Capabilities: Quick search functions that allow for efficient retrieval of passport information.\nData Security: Implementing encryption and secure user authentication to safeguard sensitive information.\nCustom Reporting: Generate detailed reports based on various criteria, such as passport issuance dates, expiry reminders, and more.");
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 0, 0));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(lblAboutUs, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtrProjectOverviewThe, GroupLayout.PREFERRED_SIZE, 708, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 1423, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtrCompanyNameGlobalpass, GroupLayout.PREFERRED_SIZE, 751, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 1423, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator_2, GroupLayout.DEFAULT_SIZE, 1423, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtrMissionStatementAt, GroupLayout.PREFERRED_SIZE, 755, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(lblAboutUs, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(txtrCompanyNameGlobalpass, GroupLayout.PREFERRED_SIZE, 111, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtrMissionStatementAt, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtrProjectOverviewThe, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
					.addGap(23))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
