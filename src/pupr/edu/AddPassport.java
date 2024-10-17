package pupr.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.classfile.instruction.ConstantInstruction.IntrinsicConstantInstruction;
import java.sql.Connection;
import java.util.InputMismatchException;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class AddPassport {

	private JFrame frmModifyPassport;
	private Passport list;
	private JLabel imgLabel;
	private JPanel imgJpane;
	private JTextField surNameLabel;
	private JTextField nameLabel;
	private JTextField dateBithdayLabel;
	private JTextField dateIssueLabel;
	private JTextField passportNoLabel;
	private JTextField nationalityLabel;
	private JTextField dateofExpirationLabel;
	private JButton btnNewButton;
	private JComboBox comboBox;
	private JComboBox <String> country;
	

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
					AddPassport window = new AddPassport();
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
	 public AddPassport() {
		// TODO Auto-generated constructor stub
		
    initialize();
	
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	@SuppressWarnings("unchecked")
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
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1309, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
		);
		
		imgJpane = new JPanel();
		imgJpane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JLabel lblNewLabel = new JLabel("ADDPassport");
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
		passportNoLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		passportNoLabel.setColumns(10);
		
		nationalityLabel = new JTextField();
		nationalityLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		nationalityLabel.setColumns(10);
		
		dateofExpirationLabel = new JTextField();
		dateofExpirationLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		dateofExpirationLabel.setColumns(10);
		
		btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

		        // Validar fechas
		        try {
		        	String surName = surNameLabel.getText();
			        String givenName = nameLabel.getText();
			        String dateOfBirth = dateBithdayLabel.getText();
			        String dateOfIssue = dateIssueLabel.getText();
			        String passportNo = passportNoLabel.getText();
			        String sex = (String) comboBox.getSelectedItem();
			        String nationality = nationalityLabel.getText();
			        String dateOfExpiration = dateofExpirationLabel.getText();
			        String photo = "photo";
			        String place = (String) country.getSelectedItem();
			        
		

			        // Formato de fecha esperado
			        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			        dateFormat.setLenient(false); // Evita que acepte fechas inválidas como "32/01/2020"
			        
		            // Intentar convertir las cadenas a objetos Date
		            Date birthDate = dateFormat.parse(dateOfBirth);
		            Date issueDate = dateFormat.parse(dateOfIssue);
		            Date expirationDate = dateFormat.parse(dateOfExpiration);

		            // Aquí puedes agregar validaciones adicionales, como asegurarte de que las fechas tengan sentido
		            if (issueDate.after(expirationDate)) {
		                JOptionPane.showMessageDialog(null, "La fecha de emisión no puede ser posterior a la de expiración.");
		                return;
		            }

		            if (birthDate.after(issueDate)) {
		                JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser posterior a la de emisión.");
		                return;
		            }

		            // Si las fechas son válidas, crear el pasaporte
		            Passport passport = new Passport(passportNo, givenName, surName, nationality, dateOfBirth, photo, sex, place, dateOfIssue, dateOfExpiration);
		            System.out.println(passport);

		            // Intentar agregar el pasaporte a la base de datos
		            try {
		                MySQLConnection connection = new MySQLConnection();
		                int result = connection.addPassport(passport);
		                
		                // Verificar el resultado de la operación
		                if (result > 0) {
		                    JOptionPane.showMessageDialog(null, "¡Pasaporte agregado exitosamente!");
		                } else {
		                    JOptionPane.showMessageDialog(null, "No se encontró el pasaporte con el número proporcionado.");
		                }
		                
		            } catch (Exception ex) {
		                JOptionPane.showMessageDialog(null, "Error al agregar el pasaporte: " + ex.getMessage());
		            }

		        } catch (ParseException ex) {
		            // Mostrar un mensaje de error si alguna fecha no tiene el formato adecuado
		            JOptionPane.showMessageDialog(null, "Por favor, ingrese las fechas en el formato yyyy/MM/dd.");
		        }catch (IllegalArgumentException x) {
					// TODO: handle exception
		        	JOptionPane.showMessageDialog(null, "fill all the campus");
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
		
		JLabel lblNewLabel_1_2_4_2 = new JLabel("Place Birthday");
		lblNewLabel_1_2_4_2.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		comboBox  = new JComboBox<String>();
		comboBox.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"F", "M"}));
		
		country = new JComboBox<>();
		country.setModel(new DefaultComboBoxModel<>(new String[] {"Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Costa Rica", "Cuba", "República Dominicana", "Ecuador", "El Salvador", "Guatemala", "Honduras", "México", "Nicaragua", "Panamá", "Paraguay", "Perú", "Puerto Rico", "Uruguay", "Venezuela"}));
		country.setFont(new Font("Times New Roman", Font.BOLD, 24));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(30)
							.addComponent(imgJpane, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(44)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(country, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_1_2_4_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(surNameLabel, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2_2, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
								.addComponent(dateBithdayLabel, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2_4, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
								.addComponent(dateIssueLabel, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel)))
					.addGap(36)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1_2_4_1)
							.addContainerGap())
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1_2_3, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
										.addComponent(passportNoLabel, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
										.addComponent(comboBox, 0, 303, Short.MAX_VALUE)
										.addComponent(nationalityLabel, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
										.addComponent(dateofExpirationLabel, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
									.addGap(332))
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
									.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE)
									.addGap(55))))))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(103)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
					.addGap(231)
					.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(395, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
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
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(83)
							.addComponent(imgJpane, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGap(40)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addGap(13))
								.addComponent(lblNewLabel_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(passportNoLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(surNameLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_2_3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(dateBithdayLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(nationalityLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))))
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_2_4_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_2_4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_2_4_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(country, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(dateofExpirationLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addComponent(dateIssueLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
					.addGap(95)
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
