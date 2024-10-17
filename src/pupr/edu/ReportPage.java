package pupr.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.util.List;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;

public class ReportPage {

	private JFrame frmReport;
	private JTable tableSQL;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReportPage window = new ReportPage();
					window.frmReport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReportPage() {
		initialize();
		MySQLConnection connection =new MySQLConnection();
		List <Passport> list= connection.getAllPassports();
	    tableSQL= this.crearTablaDePasaportes(list);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReport = new JFrame();
		frmReport.setTitle("Report");
		frmReport.setBounds(100, 100, 721, 688);
		frmReport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setPanel(new JPanel());
		GroupLayout groupLayout = new GroupLayout(frmReport.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(getPanel(), GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(getPanel(), GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
		);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setWheelScrollingEnabled(false);
		
		JLabel lblNewLabel = new JLabel("Passport Report ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		GroupLayout gl_panel = new GroupLayout(getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(54)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 602, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(43)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(91)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(157, Short.MAX_VALUE))
		);
		MySQLConnection connection = new MySQLConnection();

		tableSQL = new JTable();    
		List<Passport> list = connection.getAllPassports();
		tableSQL = crearTablaDePasaportes(list); // Tabla creada con los datos correctos
		tableSQL.removeEditor();
		scrollPane.setViewportView(tableSQL);  // Mostrar la tabla con los datos cargados
		

		
		scrollPane.setViewportView(tableSQL);
		getPanel().setLayout(gl_panel);
		frmReport.getContentPane().setLayout(groupLayout);
	}
	 public static JTable crearTablaDePasaportes(List<Passport> listaDePasaportes) {
	        // Nombres de las columnas
	        String[] columnas = {"passport_no", "sur_name", "given_name", "nationality", "dob", "photo", "sex", "place_of_birth", "date_of_issue", "date_of_expiration"
			};

	        // Crear el modelo de la tabla
	        DefaultTableModel model = new DefaultTableModel(columnas, 0);
	     
	        // Llenar el modelo con los datos de los pasaportes
	        for (Passport passport : listaDePasaportes) {
	            Object[] fila = {
	                passport.getPassportNo(),
	                passport.getName(),
	                passport.getSurName(),
	                passport.getNationality(),
	                passport.getDobString(),
	                passport.getPhoto(),
	                passport.getSex(),
	                passport.getPlaceOfBirth(),
	                passport.getDateOfIssue(),
	                passport.getDateOfExpiration()
	            };
	            model.addRow(fila);  // Añadir la fila al modelo
	        }
	       
	        // Crear y devolver la JTable con el modelo
	        return new JTable(model);
	    }

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
}
