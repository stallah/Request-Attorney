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
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		frmApprover.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextPane txtpnEnterFormNumber = new JTextPane();
		txtpnEnterFormNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnEnterFormNumber.setBackground(Color.LIGHT_GRAY);
		txtpnEnterFormNumber.setBounds(10, 60, 150, 20);
		txtpnEnterFormNumber.setText("Enter Form Number:");
		panel.add(txtpnEnterFormNumber);
		
		TextField textField = new TextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//call sendRequestForm
			}
		});
		textField.setBounds(166, 59, 154, 21);
		panel.add(textField);
		frmApprover.setTitle(" Approver Screen");
		frmApprover.setBounds(100, 100, 450, 300);
		frmApprover.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
