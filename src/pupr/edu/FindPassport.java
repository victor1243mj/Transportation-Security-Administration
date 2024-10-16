package pupr.edu;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.List;

import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class FindPassport {

	private JFrame frame;
	private Passport list;
	private JLabel surNameLabel;
	private JLabel nameLabel;
	private JLabel dateBithdayLabel;
	private JLabel dateIssueLabel;
	private JLabel passportNoLabel;
	private JLabel sexLabel;
	private JLabel nationalityLabel;
	private JLabel dateofExpirationLabel;
	private JLabel surNameLabel1;
	private JLabel passportNoLabel1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindPassport window = new FindPassport();
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
	public FindPassport() {
		
		initialize();
	SetInfo();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 977, 839);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		GroupLayout groupLayout = new GroupLayout(getFrame().getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
					.addGap(20))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 783, GroupLayout.PREFERRED_SIZE))
		);
		
		JPanel imgJpane = new JPanel();
		imgJpane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JLabel lblNewLabel = new JLabel("Passport");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 42));
		
		JSeparator separator = new JSeparator();
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel lblNewLabel_1 = new JLabel("SurName");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_1_1 = new JLabel("Passport Number");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_1_2 = new JLabel("Name");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Sex");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Date of Birthday");
		lblNewLabel_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Nationality\r\n");
		lblNewLabel_1_2_3.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Date of Issue");
		lblNewLabel_1_2_4.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JLabel lblNewLabel_1_2_4_1 = new JLabel("Date of Expiration\r\n");
		lblNewLabel_1_2_4_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		surNameLabel = new JLabel("New label");
		surNameLabel.setOpaque(true);
		surNameLabel.setBackground(new Color(255, 255, 204));
		surNameLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		
		passportNoLabel = new JLabel("New label");
		passportNoLabel.setOpaque(true);
		passportNoLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		passportNoLabel.setBackground(new Color(255, 255, 204));
		
		nameLabel = new JLabel("New label");
		nameLabel.setBackground(new Color(255, 255, 204));
		nameLabel.setOpaque(true);
		nameLabel.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		
		sexLabel = new JLabel("New label");
		sexLabel.setBackground(new Color(255, 255, 204));
		sexLabel.setOpaque(true);
		sexLabel.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		
		dateBithdayLabel = new JLabel("New label");
		dateBithdayLabel.setBackground(new Color(255, 255, 204));
		dateBithdayLabel.setOpaque(true);
		dateBithdayLabel.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		
		nationalityLabel = new JLabel("New label");
		nationalityLabel.setBackground(new Color(255, 255, 204));
		nationalityLabel.setOpaque(true);
		nationalityLabel.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		
		dateIssueLabel = new JLabel("New label");
		dateIssueLabel.setOpaque(true);
		dateIssueLabel.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		dateIssueLabel.setBackground(new Color(255, 255, 204));
		dateofExpirationLabel = new JLabel("New label");
		dateofExpirationLabel.setBackground(new Color(255, 255, 204));
		dateofExpirationLabel.setOpaque(true);
		dateofExpirationLabel.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		
		JLabel lblNewLabel_2 = new JLabel("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\r\n\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblNewLabel_2_1 = new JLabel("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\r\n\r\n");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		surNameLabel1 = new JLabel("New label");
		surNameLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
		surNameLabel1.setOpaque(true);
		surNameLabel1.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		surNameLabel1.setBackground(new Color(255, 255, 255));
		
		passportNoLabel1 = new JLabel("New label");
		passportNoLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
		passportNoLabel1.setOpaque(true);
		passportNoLabel1.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		passportNoLabel1.setBackground(new Color(255, 255, 255));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(30)
							.addComponent(imgJpane, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)))
					.addGap(34)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1_2_4, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
								.addComponent(surNameLabel, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
								.addComponent(dateBithdayLabel, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
								.addComponent(dateIssueLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(40)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(sexLabel, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2_3, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
								.addComponent(passportNoLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(dateofExpirationLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1_2_4_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nationalityLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addContainerGap(37, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(passportNoLabel1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2_1))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(surNameLabel1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 806, GroupLayout.PREFERRED_SIZE)))
					.addGap(6))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(61)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(36)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(surNameLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(passportNoLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(sexLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
							.addGap(23)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_2_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2_3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(dateBithdayLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(nationalityLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
							.addGap(25)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_2_4_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2_4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(17)
									.addComponent(dateofExpirationLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(dateIssueLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(83)
							.addComponent(imgJpane, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(surNameLabel1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(passportNoLabel1))
					.addGap(47))
		);
		panel.setLayout(gl_panel);
		getFrame().getContentPane().setLayout(groupLayout);
	}
	
	public void SetInfo() {
		try {
		    String numberPass = JOptionPane.showInputDialog(null, "Enter the passport number: ");
		    
		    // Obtener la conexión y el pasaporte
		    MySQLConnection connection = new MySQLConnection();
		    Passport list = connection.getAPassportsByno_pass(numberPass); // Asegúrate que el tipo sea correcto
		    
		    if (list != null) {
		        // Asignar valores a los labels si la búsqueda fue exitosa
		    
		        
		        surNameLabel.setText(list.getSurName().toUpperCase() != null ? list.getSurName() : "N/A");
		        surNameLabel1.setText("<<<<"+list.getSurName() != null ? list.getSurName() : "N/A");
		        nameLabel.setText(list.getName() != null ? list.getName() : "N/A");
		        dateBithdayLabel.setText(list.getDoubString() != null ? list.getDoubString() : "N/A");
		        dateIssueLabel.setText(list.getDateOfIssue() != null ? list.getDateOfIssue() : "N/A");
		        passportNoLabel.setText(list.getPassportNo() != null ? list.getPassportNo() : "N/A");
		        passportNoLabel1.setText("<<<<"+list.getPassportNo() != null ? list.getPassportNo() : "N/A");
		        sexLabel.setText(list.getSex() != null ? list.getSex() : "N/A");
		        nationalityLabel.setText(list.getNationality() != null ? list.getNationality() : "N/A");
		        dateofExpirationLabel.setText(list.getDateOfExpiration() != null ? list.getDateOfExpiration() : "N/A");
		    } else {
		        // Si el pasaporte no se encontró
		        JOptionPane.showMessageDialog(null, "Passport not found");
		    }
		    
		} catch (NullPointerException ex) {
		    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage());
		    ex.printStackTrace();  // Para obtener más detalles en la consola
		} catch (Exception ex) {
		    // Para capturar cualquier otro error no previsto
		    JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + ex.getMessage());
		    ex.printStackTrace();  // Para más detalles en la consola
		}

		
		
		
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public Passport getList() {
		return list;
	}

	public void setList(Passport list) {
		this.list = list;
	}
}
