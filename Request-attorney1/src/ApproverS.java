import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.TextArea;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.TextField;
import java.awt.Panel;

public class ApproverS {

	private JFrame frmApprover;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApproverS window = new ApproverS();
					window.frmApprover.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApproverS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmApprover = new JFrame();
		frmApprover.getContentPane().setBackground(Color.WHITE);
		
		TextField textField = new TextField();
		textField.setText("Enter Form Number");
		textField.setBackground(Color.LIGHT_GRAY);
		frmApprover.getContentPane().add(textField, BorderLayout.NORTH);
		
		Panel panel = new Panel();
		frmApprover.getContentPane().add(panel, BorderLayout.CENTER);
		frmApprover.setTitle(" Approver Screen");
		frmApprover.setBounds(100, 100, 450, 300);
		frmApprover.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
