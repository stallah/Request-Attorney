/**
 * Second Screen for Data Entry
 * @author Smita Tallah and Ashna Tirougnaname
 *
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Screen2 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 JFrame create_appt;
	private JTextField date;
	private JTextField formNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen2 window = new Screen2();
					window.create_appt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Screen2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		create_appt = new JFrame();
		create_appt.setBounds(100, 100, 450, 300);
		create_appt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		create_appt.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Appointment Date:");
		lblNewLabel.setBounds(27, 31, 154, 29);
		create_appt.getContentPane().add(lblNewLabel);
		
		date = new JTextField();
		date.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		date.setBounds(202, 40, 96, 20);
		create_appt.getContentPane().add(date);
		date.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("(MM/DD/YYYY)");
		lblNewLabel_1.setBounds(49, 51, 106, 29);
		create_appt.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Form Number: ");
		lblNewLabel_2.setBounds(59, 101, 96, 29);
		create_appt.getContentPane().add(lblNewLabel_2);
		
		formNum = new JTextField();
		formNum.setBounds(202, 101, 96, 20);
		create_appt.getContentPane().add(formNum);
		formNum.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			RequestAttorneyAppointment.createRequestAttorneyAppointment(date.getText(),Integer.parseInt(formNum.getText()));
			JOptionPane.showMessageDialog(null, "Created Appointment " + RequestAttorneyAppointment.appointmentDetails(Integer.parseInt(formNum.getText())));
			create_appt.dispose();
			//call workflow
			}
		});
		btnNewButton.setBounds(209, 146, 89, 23);
		create_appt.getContentPane().add(btnNewButton);
	}
	



}
