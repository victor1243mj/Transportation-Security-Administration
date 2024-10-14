package pupr.edu;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FindPassport {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindPassport window = new FindPassport();
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
	public FindPassport() {
		initialize();
		try {
			String numberPass= JOptionPane.showInputDialog(null, "Enter the passaport number : ");
		MySQLConnection connection = new MySQLConnection();
		Passport list = connection.getAPassportsByno_pass(numberPass);
		
	  System.out.println(list.getSurName());
			
		} catch (NullPointerException ex) {
			JOptionPane.showMessageDialog(null, "passport no found ");
			
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 876, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
