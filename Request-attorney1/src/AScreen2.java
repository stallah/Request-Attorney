import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AScreen2 {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AScreen2 window = new AScreen2();
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
	public AScreen2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton aForm = new JRadioButton("Accept Form");
		aForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String status = "Rejected";
				if(RequestAttorneyAppointment.acceptRequest(232)){
					status = "Accepted";
					ApproverS a = new ApproverS();
					Workflow.createWorkflow().sendAttResponse(a.getCurrentFormNumber());
				}
				JOptionPane.showMessageDialog(null, "Request Form: "+ status +"\nEmail will be sent to user.");
				frame.dispose();
				
			
			}
		});
		aForm.setBounds(91, 110, 111, 23);
		frame.getContentPane().add(aForm);
		
		JRadioButton rForm = new JRadioButton("Reject Form");
		rForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String status = "Accepted";
				if(RequestAttorneyAppointment.rejectRequest(232)){
					status = "Rejected";
					ApproverS a = new ApproverS();
					//send decision to workflow
					Workflow.createWorkflow().sendAttResponse(a.getCurrentFormNumber());
				}
				JOptionPane.showMessageDialog(null, "Request Form: "+ status +"\nSent form back to reviewer.");
				
				frame.dispose();
				
			}
		});
		rForm.setBounds(91, 136, 111, 23);
		frame.getContentPane().add(rForm);
		
		JLabel lblNewLabel = new JLabel("Accept or Reject form entered: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(73, 69, 205, 34);
		frame.getContentPane().add(lblNewLabel);
	}
}
