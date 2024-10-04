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
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Point;
import javax.swing.border.MatteBorder;

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
		panel.setBackground(new Color(51, 51, 204));
		
		labelPrincipal = new JLabel("Transportation Security ");
		labelPrincipal.setBounds(24, 29, 253, 85);
		labelPrincipal.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		btnHome = new JButton("Home");
		btnHome.setBounds(0, 209, 287, 60);
		btnHome.setHorizontalAlignment(SwingConstants.LEFT);
		btnHome.setIconTextGap(20);
		btnHome.setBackground(new Color(51, 51, 255));
		btnHome.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHome.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\home (4).png"));
		
	    
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHome.setBorderPainted(false);
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setBorder(new MatteBorder(1, 10, 1, 1, (Color) new Color(0, 0, 0)));
		
		btnAddPassport = new JButton("ADD Passport");
		btnAddPassport.setBounds(0, 268, 287, 60);
		btnAddPassport.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddPassport.setBackground(new Color(51, 51, 255));
		btnAddPassport.setIconTextGap(20);
		btnAddPassport.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\user-add.png"));
		btnAddPassport.setBorderPainted(false);
		btnAddPassport.setBorder(new MatteBorder(1, 10, 1, 1, (Color) new Color(0, 0, 0)));
		
		btnModifyAPassport = new JButton("Modify a passport");
		btnModifyAPassport.setBounds(0, 328, 287, 60);
		btnModifyAPassport.setHorizontalAlignment(SwingConstants.LEFT);
		btnModifyAPassport.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnModifyAPassport.setAlignmentY(Component.TOP_ALIGNMENT);
		btnModifyAPassport.setBackground(new Color(51, 51, 255));
		btnModifyAPassport.setIconTextGap(20);
		btnModifyAPassport.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\edit.png"));
		btnModifyAPassport.setBorderPainted(false);
		btnModifyAPassport.setBorder(new MatteBorder(1, 10, 1, 1, (Color) new Color(0, 0, 0)));
		
		btnReport = new JButton("Report");
		btnReport.setBounds(0, 387, 287, 60);
		btnReport.setHorizontalAlignment(SwingConstants.LEFT);
		btnReport.setBackground(new Color(51, 51, 255));
		btnReport.setIconTextGap(20);
		btnReport.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\document.png"));
		btnReport.setBorderPainted(false);
		btnReport.setBorder(new MatteBorder(1, 10, 1, 1, (Color) new Color(0, 0, 0)));
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(0, 444, 287, 60);
		btnExit.setHorizontalAlignment(SwingConstants.LEFT);
		btnExit.setBackground(new Color(51, 51, 255));
		btnExit.setIconTextGap(20);
		btnExit.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\cross.png"));
		btnExit.setBorderPainted(false);
		btnExit.setBorder(new MatteBorder(1, 10, 1, 1, (Color) new Color(0, 0, 0)));
		
		panelContent = new JPanel();
		panelContent.setBounds(276, 0, 758, 715);
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
		panel.setLayout(null);
		panel.add(btnExit);
		panel.add(labelPrincipal);
		panel.add(btnAddPassport);
		panel.add(btnHome);
		panel.add(btnModifyAPassport);
		panel.add(btnReport);
		frame.getContentPane().add(panelContent);
		frame.setLocationRelativeTo(null);
	}
}
