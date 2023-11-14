/**
 * Second Screen after Approver enters form number.
 * @author Smita Tallah and Ashna Tirougnaname
 *
 */

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
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class ApproverS {

	private JFrame frmApprover;
	private TextField formNum;

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
		
		formNum = new TextField();
		
		formNum.setBounds(181, 59, 154, 21);
		panel.add(formNum);
		LinkedList<Integer> list = setList();
		formNum.setText(Integer.toString(Workflow.createWorkflow().getRequestFormNumber(list)));
	
		JLabel lblNewLabel = new JLabel("Enter Form Number:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(31, 59, 144, 21);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//call workflow methods
				//LinkedList<Integer> list = RequestAttorneyAppointment.list;
				//Workflow.createWorkflow().getRequestFormNumber(list);

				JOptionPane.showMessageDialog(null, "retrieving form...");
				//frmApprover.dispose();
				
				AScreen2 sc = new AScreen2();
				sc.frame.setVisible(true);
				
				
				
			}
		});
		btnNewButton.setBounds(223, 110, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//workflow object
				//LinkedList<Integer> list = setList();
				formNum.setText(Integer.toString(Workflow.createWorkflow().getRequestFormNumber(list)));

			}
		});
		btnNewButton_1.setBounds(297, 192, 89, 23);
		panel.add(btnNewButton_1);
		frmApprover.setTitle(" Approver Screen");
		frmApprover.setBounds(100, 100, 450, 300);
		frmApprover.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	protected LinkedList<Integer> setList(){
		LinkedList<Integer> list = RequestAttorneyAppointment.list;
		list.add(112);
		list.add(113);
		list.add(114);
		return list;
	}
	
	//send Ascreen2 current form number
		protected Integer getCurrentFormNumber() {
		return Integer.parseInt(formNum.getText());
		}
	}
