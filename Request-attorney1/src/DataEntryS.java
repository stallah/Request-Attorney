//version 2.0

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
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Button;
import java.awt.Dimension;

public class DataEntryS {

	private JFrame frmDataEntry;
	private JTextField textField;
	private final Action action = new SwingAction();
	

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
		
		JLabel lblNewLabel = new JLabel("Attorney ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(23, 32, 100, 23);
		frmDataEntry.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(textField.getText());
				//RequestAttorneyAppointment.createRequestAttorneyAppointment("11/21/23", 001);
				//JOptionPane.showMessageDialog(null, "Getting information...");
				
				//call from workflow
			}
		});
		textField.setBounds(133, 35, 96, 20);
		frmDataEntry.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Screen2();
				Screen2 sc2 = new Screen2();
				//screen2 = new JFrame();
				//sc2.show();
				sc2.setBounds(100, 100, 450, 300);
				sc2.create_appt.setVisible(true);
				sc2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				sc2.getContentPane().setLayout(null);
				frmDataEntry.dispose();				
			}
		});
		
		btnNewButton.setBounds(140, 86, 89, 23);
		frmDataEntry.getContentPane().add(btnNewButton);
	}
	
	public boolean newAttorneyDetail(String newAttDetail) {
		//save new attorney detail
		return true;
	}
	
	public boolean updateAttorneyDetail(String modAttDetail){
		//when updated detail is saved
		return true;
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
