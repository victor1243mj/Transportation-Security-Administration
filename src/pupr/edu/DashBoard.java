package pupr.edu;

import java.awt.BorderLayout;
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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class DashBoard {

	private JFrame frmTransportationSecurity;
	private JLabel labelPrincipal;
	private JPanel panel;
	private JButton btnHome;
	private JButton btnAddPassport;
	private JButton btnModifyAPassport;
	private JButton btnReport;
	private JButton btnExit;
	private JPanel panelContent;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;


	public static void main(String[] args) {
	

		FlatMaterialLighterIJTheme.setup();

        // Opcional: Verifica si el Look and Feel se aplicó correctamente
        try {
            UIManager.setLookAndFeel(new FlatMaterialLighterIJTheme());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        
      
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard window = new DashBoard();
					window.frmTransportationSecurity.setVisible(true);
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
	public void  ShowPanel (JPanel panel) {
		panel.setSize(panelContent.getWidth(),panelContent.getHeight());
		panel.setLocation(0, 0);
		panelContent.add(panel,BorderLayout.CENTER);
		panelContent.revalidate();
		panelContent.repaint();
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmTransportationSecurity = new JFrame();
		frmTransportationSecurity.setResizable(false);
		frmTransportationSecurity.setTitle("Transportation Security ");
		frmTransportationSecurity.setBounds(100, 100, 1020, 725);
		frmTransportationSecurity.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 287, 701);
		panel.setBackground(new Color(102, 102, 204));
		
		labelPrincipal = new JLabel("Transportation Security ");
		labelPrincipal.setForeground(new Color(255, 255, 255));
		labelPrincipal.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		btnHome = new JButton("Home");
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setHorizontalAlignment(SwingConstants.LEFT);
		btnHome.setIconTextGap(20);
		btnHome.setBackground(new Color(102, 102, 255));
		btnHome.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnHome.setFont(new Font("Dialog", Font.BOLD, 14));
		btnHome.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\home (4).png"));
		
	    
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHome.setBorderPainted(false);
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setBorder(new MatteBorder(1, 10, 1, 1, (Color) new Color(0, 0, 0)));
		
		btnAddPassport = new JButton("ADD Passport");
		btnAddPassport.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAddPassport.setForeground(new Color(255, 255, 255));
		btnAddPassport.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddPassport.setBackground(new Color(102, 102, 255));
		btnAddPassport.setIconTextGap(20);
		btnAddPassport.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\user-add.png"));
		btnAddPassport.setBorderPainted(false);
		btnAddPassport.setBorder(new MatteBorder(1, 10, 1, 1, (Color) new Color(0, 0, 0)));
		
		btnModifyAPassport = new JButton("Modify a passport");
		btnModifyAPassport.setFont(new Font("Dialog", Font.BOLD, 14));
		btnModifyAPassport.setForeground(new Color(255, 255, 255));
		btnModifyAPassport.setHorizontalAlignment(SwingConstants.LEFT);
		btnModifyAPassport.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnModifyAPassport.setAlignmentY(Component.TOP_ALIGNMENT);
		btnModifyAPassport.setBackground(new Color(102, 102, 255));
		btnModifyAPassport.setIconTextGap(20);
		btnModifyAPassport.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\edit.png"));
		btnModifyAPassport.setBorderPainted(false);
		btnModifyAPassport.setBorder(new MatteBorder(1, 10, 1, 1, (Color) new Color(0, 0, 0)));
		
		btnReport = new JButton("Report");
		btnReport.setFont(new Font("Dialog", Font.BOLD, 14));
		btnReport.setForeground(new Color(255, 255, 255));
		btnReport.setHorizontalAlignment(SwingConstants.LEFT);
		btnReport.setBackground(new Color(102, 102, 255));
		btnReport.setIconTextGap(20);
		btnReport.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\document.png"));
		btnReport.setBorderPainted(false);
		btnReport.setBorder(new MatteBorder(1, 10, 1, 1, (Color) new Color(0, 0, 0)));
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Dialog", Font.BOLD, 14));
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setHorizontalAlignment(SwingConstants.LEFT);
		btnExit.setBackground(new Color(102, 102, 255));
		btnExit.setIconTextGap(20);
		btnExit.setIcon(new ImageIcon("C:\\Users\\vipap\\git\\Transportation-Security-Administration\\img\\cross.png"));
		btnExit.setBorderPainted(false);
		btnExit.setBorder(new MatteBorder(1, 10, 1, 1, (Color) new Color(0, 0, 0)));
		
		panelContent = new JPanel();
		panelContent.setBounds(283, 0, 721, 688);
		panelContent.setBackground(new Color(128, 64, 64));
		frmTransportationSecurity.getContentPane().setLayout(null);
		frmTransportationSecurity.getContentPane().add(panel);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(labelPrincipal, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))
				.addComponent(btnAddPassport, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnModifyAPassport, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnReport, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(labelPrincipal, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addGap(113)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(59)
							.addComponent(btnAddPassport, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(116)
							.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnModifyAPassport, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(59)
							.addComponent(btnReport, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))))
		);
		panel.setLayout(gl_panel);
		frmTransportationSecurity.getContentPane().add(panelContent);
		GroupLayout gl_panelContent = new GroupLayout(panelContent);
		gl_panelContent.setHorizontalGroup(
			gl_panelContent.createParallelGroup(Alignment.LEADING)
				.addGap(0, 758, Short.MAX_VALUE)
		);
		gl_panelContent.setVerticalGroup(
			gl_panelContent.createParallelGroup(Alignment.LEADING)
				.addGap(0, 715, Short.MAX_VALUE)
		);
		panelContent.setLayout(gl_panelContent);
		frmTransportationSecurity.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		frmTransportationSecurity.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("ADD Passport");
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_3 = new JMenuItem("Modify a passport");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_4 = new JMenuItem("Report");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_5 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_1 = new JMenuItem("Help contents");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("About");
		mnNewMenu_1.add(mntmNewMenuItem_2);
	}
}
