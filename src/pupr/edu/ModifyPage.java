package pupr.edu;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.TextField;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifyPage {
	private JFrame frmModifyPassport;
	private Passport list;
	private JLabel imgLabel;
	private JPanel imgJpane;
	private JTextField surNameLabel;
	private JTextField nameLabel;
	private JTextField dateBithdayLabel;
	private JTextField dateIssueLabel;
	private JTextField passportNoLabel;
	private JTextField sexLabel;
	private JTextField nationalityLabel;
	private JTextField dateofExpirationLabel;
	private JButton btnNewButton;

	public JFrame getFrmModifyPassport() {
		return frmModifyPassport;
	}

	public void setFrmModifyPassport(JFrame frmModifyPassport) {
		this.frmModifyPassport = frmModifyPassport;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyPage window = new ModifyPage();
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
	 public ModifyPage() {
		// TODO Auto-generated constructor stub
		
    initialize();
	SetInfo();
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 977, 839);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(new Rectangle(0, 0, 0, 837));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		GroupLayout groupLayout = new GroupLayout(getFrame().getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
		);
		
		imgJpane = new JPanel();
		imgJpane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JLabel lblNewLabel = new JLabel("Modify Passport");
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
		
		surNameLabel = new JTextField();
		surNameLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		surNameLabel.setColumns(10);
		
		nameLabel = new JTextField();
		nameLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		nameLabel.setColumns(10);
		
		dateBithdayLabel = new JTextField();
		dateBithdayLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		dateBithdayLabel.setColumns(10);
		
		dateIssueLabel = new JTextField();
		dateIssueLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		dateIssueLabel.setColumns(10);
		
		passportNoLabel = new JTextField();
		passportNoLabel.setEditable(false);
		passportNoLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		passportNoLabel.setColumns(10);
		
		sexLabel = new JTextField();
		sexLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		sexLabel.setColumns(10);
		
		nationalityLabel = new JTextField();
		nationalityLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		nationalityLabel.setColumns(10);
		 
		dateofExpirationLabel = new JTextField();
		dateofExpirationLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		dateofExpirationLabel.setColumns(10);
		
		btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Obtener los textos de cada JTextField
		        String surName = surNameLabel.getText();
		        String givenName = nameLabel.getText();
		        String dateOfBirth = dateBithdayLabel.getText();
		        String dateOfIssue = dateIssueLabel.getText();
		        String passportNo = passportNoLabel.getText();
		        String sex = sexLabel.getText();
		        String photo = "photo";
		        String nationality = nationalityLabel.getText();
		        String dateOfExpiration = dateofExpirationLabel.getText();
		        
		        //creating new passport
		       Passport passport= new Passport(passportNo, givenName,surName,nationality,dateOfBirth,photo,sex,nationality,dateOfIssue,dateOfExpiration);
		       
		       try {
		           MySQLConnection connection = new MySQLConnection();
		           
		           // Llamar al método modifyPassport para modificar el pasaporte
		           int result = connection.modifyPassport(passport);
		           
		           // Verificar el resultado de la operación
		           if (result > 0) {
		               JOptionPane.showMessageDialog(null, "Passport updated successfully!");
		           } else {
		               JOptionPane.showMessageDialog(null, "No passport found with the provided passport number.");
		           }
		           
		       } catch (Exception ex) {
		           JOptionPane.showMessageDialog(null, "Error updating passport: " + ex.getMessage());
		       }
		   
		        
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(102, 102, 204));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 32));
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Homepage home =new Homepage();
			
			}
		});
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 32));
		btnCancel.setBackground(new Color(102, 102, 204));
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
							.addComponent(imgJpane, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(surNameLabel, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1_2_4, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
								.addComponent(dateBithdayLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
								.addComponent(dateIssueLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
							.addGap(44))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel)
							.addGap(18)))
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
											.addComponent(passportNoLabel, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
												.addComponent(sexLabel, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)))
										.addGap(260)))
								.addGap(55))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(dateofExpirationLabel, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(nationalityLabel, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2_4_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1_2_3, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(103)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
					.addGap(231)
					.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(386, Short.MAX_VALUE))
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
							.addGap(83)
							.addComponent(imgJpane, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(18)
									.addComponent(surNameLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addGap(25)
									.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addGap(17)
									.addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addGap(23)
									.addComponent(lblNewLabel_1_2_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(dateBithdayLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addGap(18))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(passportNoLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addGap(24)
									.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(sexLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_1_2_3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(nationalityLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_2_4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2_4_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addGap(24)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(dateIssueLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(dateofExpirationLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
					.addGap(63))
		);
		
		imgLabel = new JLabel("");
		GroupLayout gl_imgJpane = new GroupLayout(imgJpane);
		gl_imgJpane.setHorizontalGroup(
			gl_imgJpane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_imgJpane.createSequentialGroup()
					.addComponent(imgLabel, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
					.addGap(20))
		);
		gl_imgJpane.setVerticalGroup(
			gl_imgJpane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_imgJpane.createSequentialGroup()
					.addComponent(imgLabel, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
					.addGap(22))
		);
		imgJpane.setLayout(gl_imgJpane);
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
		        
		        nameLabel.setText(list.getName() != null ? list.getName() : "N/A");
		        dateBithdayLabel.setText(list.getDobString() != null ? list.getDobString() : "N/A");
		        dateIssueLabel.setText(list.getDateOfIssue() != null ? list.getDateOfIssue() : "N/A");
		        passportNoLabel.setText(list.getPassportNo() != null ? list.getPassportNo() : "N/A");
		        
		        sexLabel.setText(list.getSex() != null ? list.getSex() : "N/A");
		        nationalityLabel.setText(list.getNationality() != null ? list.getNationality() : "N/A");
		        dateofExpirationLabel.setText(list.getDateOfExpiration() != null ? list.getDateOfExpiration() : "N/A");
		        if (list.getSex().equals("M")) {  // Usa .equals() para comparar Strings
		            ImageIcon img = new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\men.jpg");
		            
		            // Redimensionar la imagen para que sea de 20x20
		            Image scaledImage = img.getImage().getScaledInstance(275,287, Image.SCALE_SMOOTH);
		       
		            imgLabel.setIcon(new ImageIcon(scaledImage));
		            
		            // Revalidar y repintar el JLabel
		            imgLabel.revalidate();
		            imgLabel.repaint();
		        } else if (list.getSex().equals("F")) {  
		            ImageIcon img2 = new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\woman.jpg");
		            
		            // Redimensionar la imagen para que sea de 500x500
		            Image scaledImage = img2.getImage().getScaledInstance(275,287, Image.SCALE_SMOOTH);
		            imgLabel.setIcon(new ImageIcon(scaledImage));
		            
		            // Revalidar y repintar el JLabel
		            imgLabel.revalidate();
		            imgLabel.repaint();
		        }
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
		return frmModifyPassport;
	}

	public void setFrame(JFrame frame) {
		this.frmModifyPassport = frame;
		frmModifyPassport.setTitle("Modify passport");
	}

	public Passport getList() {
		return list;
	}

	public void setList(Passport list) {
		this.list = list;
	}
}
