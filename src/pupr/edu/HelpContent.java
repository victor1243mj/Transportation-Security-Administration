package pupr.edu;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class HelpContent extends JFrame {

    private JFrame frmHelpContent;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HelpContent window = new HelpContent();
                    window.getFrmHelpContent().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public HelpContent() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        setFrmHelpContent(new JFrame());
        getFrmHelpContent().setTitle("Help Content");
        getFrmHelpContent().setBounds(100, 100, 770, 595);
        getFrmHelpContent().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JLabel lblNewLabel = new JLabel("Help Content");
        lblNewLabel.setBounds(10, 11, 223, 61);
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 32));
        
        JSeparator separator = new JSeparator();
        separator.setBounds(0, 78, 786, 14);
        
        JTextPane txtpnAddPassportUse = new JTextPane();
        txtpnAddPassportUse.setFont(new Font("Times New Roman", Font.BOLD, 16));
        txtpnAddPassportUse.setText("Add Passport:\nUse this option to create a new passport profile for the first time. When selecting this option, you will be able to enter the personal information of a new applicant, including surname, given name, passport number, date of birth, nationality, and other essential details. This functionality allows you to register a new passport in the database.\n\nUpdate Passport Information:\nChoose this option to modify or correct existing information in a passport profile. If any of the details have changed or need to be corrected, this function will allow you to update the current data, such as changes to the name, nationality, or any other relevant information about the passport holder.\n\nSearch for a Passport:\nWith this option, you can search for a specific passport in the database. You can check the current status of the passport, verify if it is active or expired, or access specific details about the passport holder, such as their name, passport number, or any other stored information.\n\nReport:\nThis option will allow you to generate a detailed report of all passports registered in the system. You can view a complete list with all available information about the stored profiles, which helps provide full control and an overview of the managed data.\r\n");
        txtpnAddPassportUse.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(txtpnAddPassportUse);
        scrollPane.setBounds(0, 98, 750, 451);
        getFrmHelpContent().getContentPane().setLayout(null);
        getFrmHelpContent().getContentPane().add(lblNewLabel);
        getFrmHelpContent().getContentPane().add(separator);
        getFrmHelpContent().getContentPane().add(scrollPane);
    }

	public JFrame getFrmHelpContent() {
		return frmHelpContent;
	}

	public void setFrmHelpContent(JFrame frmHelpContent) {
		this.frmHelpContent = frmHelpContent;
	}
}
