import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jackpot extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jackpot frame = new Jackpot();
					frame.setTitle("Jackpot");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jackpot() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");;
			}
		});
		textField.setBounds(24, 31, 95, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_1.setBounds(162, 31, 86, 47);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_2.setBounds(305, 31, 86, 47);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Game logic
				String[] array = {"2","4","6","7","8"};
				
				Random ran = new Random();
				boolean win = false;
				int index	= ran.nextInt(5);
				int index2 = ran.nextInt(5);
				int index3 = ran.nextInt(5);
				
						//	char number	= array[index];
				textField.setText(array[index]);
				String box1 = array[index];
				textField_1.setText(array[index2]);
				String box2 = array[index2];
				textField_2.setText(array[index3]);
				String box3 = array[index3];
				
				if(box1.equals(box2) && box1.equals(box3)){
					win = true;
					
				}if(win == true){
					JOptionPane.showMessageDialog(null, "You won");
				}
			}
		});
		btnNewButton.setBounds(133, 154, 156, 47);
		contentPane.add(btnNewButton);
		
		
			
	}

}
