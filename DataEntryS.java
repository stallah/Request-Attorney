import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DataEntryS {

	private JFrame frmDataEntry;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataEntryS window = new DataEntryS();
					window.frmDataEntry.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DataEntryS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDataEntry = new JFrame();
		frmDataEntry.setTitle("Data Entry");
		frmDataEntry.setBounds(100, 100, 450, 300);
		frmDataEntry.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDataEntry.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(23, 32, 100, 23);
		frmDataEntry.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Getting information...");
			}
		});
		textField.setBounds(133, 35, 96, 20);
		frmDataEntry.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
