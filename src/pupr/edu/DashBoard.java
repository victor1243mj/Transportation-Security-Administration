package pupr.edu;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class DashBoard {

	private JFrame frame;
	private JLabel labelPrincipal;
	private JPanel panel;
	private JButton btnHome;
	private JButton btnAddPassport;
	private JButton btnModifyAPassport;
	private JButton btnReport;
	private JButton btnExit;
	private JPanel panelContent;


	public static void main(String[] args) {
	

		FlatMaterialLighterIJTheme.setup();

        // Opcional: Verifica si el Look and Feel se aplicó correctamente
        try {
            UIManager.setLookAndFeel(new FlatMaterialLighterIJTheme());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        System.out.print("kkk");
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard window = new DashBoard();
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
	public DashBoard() {	
		InitStyle() ;
		initialize();
	
		
	}
public void InitStyle() {
    UIManager.put( "Button.arc", 999 );
    UIManager.put( "Component.arc", 999 );
    UIManager.put( "ProgressBar.arc", 999 );
    UIManager.put( "TextComponent.arc", 999 );

  
	
}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1020, 721);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 287, 715);
		panel.setBackground(new Color(0, 0, 205));
		
		labelPrincipal = new JLabel("Transportation Security ");
		labelPrincipal.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		btnHome = new JButton("Home");
		btnHome.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHome.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\home (4).png"));
		
	    
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHome.setBorderPainted(false);
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setBorder(null);
		
		btnAddPassport = new JButton("ADD Passport");
		btnAddPassport.setIconTextGap(10);
		btnAddPassport.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\user-add.png"));
		btnAddPassport.setBorderPainted(false);
		btnAddPassport.setBorder(null);
		
		btnModifyAPassport = new JButton("Modify a passport");
		btnModifyAPassport.setIconTextGap(10);
		btnModifyAPassport.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\edit.png"));
		btnModifyAPassport.setBorderPainted(false);
		btnModifyAPassport.setBorder(null);
		
		btnReport = new JButton("Report");
		btnReport.setIconTextGap(10);
		btnReport.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\document.png"));
		btnReport.setBorderPainted(false);
		btnReport.setBorder(null);
		
		btnExit = new JButton("Exit");
		btnExit.setIconTextGap(10);
		btnExit.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\cross.png"));
		btnExit.setBorderPainted(false);
		btnExit.setBorder(null);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addComponent(labelPrincipal)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(btnReport, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnHome, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnModifyAPassport, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAddPassport, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(29)
					.addComponent(labelPrincipal, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAddPassport, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnModifyAPassport, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnReport, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(246, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		panelContent = new JPanel();
		panelContent.setBounds(259, 0, 775, 715);
		panelContent.setBackground(new Color(128, 64, 64));
		GroupLayout gl_panelContent = new GroupLayout(panelContent);
		gl_panelContent.setHorizontalGroup(
			gl_panelContent.createParallelGroup(Alignment.LEADING)
				.addGap(0, 737, Short.MAX_VALUE)
		);
		gl_panelContent.setVerticalGroup(
			gl_panelContent.createParallelGroup(Alignment.LEADING)
				.addGap(0, 686, Short.MAX_VALUE)
		);
		panelContent.setLayout(gl_panelContent);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panel);
		frame.getContentPane().add(panelContent);
		frame.setLocationRelativeTo(null);
	}
}
