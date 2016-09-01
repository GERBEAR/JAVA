import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.Random;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;


public class Lucky7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField dtrpnScore;
	
	private int totalScore = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lucky7 frame = new Lucky7();
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
	public Lucky7() {
		Random randomGen = new Random();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		boolean running = true;
		
		
		
		JButton btnPress = new JButton("Press!");
		btnPress.addActionListener(new ActionListener() {
		
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
			
				//make random object
				//declare 3 chars
				char[] select1 = {'A','B','C','1','7'};

				//assign each char a 'randomly' chosen char from the array
				//hint: char num1 = arrayName[rand.nextInt(arraySize)];
				char num1 = select1[randomGen.nextInt(5)];//genetares random numbers and assigns them to num1,2,3
				char num2 = select1[randomGen.nextInt(5)];
				char num3 = select1[randomGen.nextInt(5)];
				textField.setText(num1 + "");//uses random numbers that were picked and places them in each box
				textField_1.setText(num2 + "");
				textField_2.setText(num3 + "");
				
				if(num1 == '7' && num2 == '7' && num3 =='7'){
					
					totalScore += 100;	//adds 100 points to score
					dtrpnScore.setText("Score : "+totalScore);
				}else if(num1 == 'A' && num2 == 'A' && num3 == 'A'){
					totalScore += 50;
					dtrpnScore.setText("Score : "+totalScore);
				}else if(num1 == 'B' && num2 == 'B' && num3 == 'B'){
					totalScore += 20;
					dtrpnScore.setText("Score : "+totalScore);
				}else if(num1 == 1 && num2 == 1 && num3 ==1){
					
					totalScore += 5;	//adds 100 points to score
					dtrpnScore.setText("Score : "+totalScore);
				}else if(num1 == 'C' && num2 == 'C' && num3 == 'C'){
					totalScore += 2;
					dtrpnScore.setText("Score : "+totalScore);
				}else{
				}
			
			}});
		
		btnPress.setForeground(new Color(255, 0, 0));
		btnPress.setFont(new Font("Segoe Print", Font.BOLD, 13));
		btnPress.setBounds(166, 11, 89, 23);
		contentPane.add(btnPress);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("SimSun", Font.BOLD, 98));
		textField.setBounds(33, 57, 86, 129);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("SimSun", Font.BOLD, 98));
		textField_1.setBounds(166, 58, 89, 129);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("SimSun", Font.BOLD, 98));
		textField_2.setBounds(291, 57, 96, 129);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		dtrpnScore = new JTextField();
		dtrpnScore.setFont(new Font("Simplified Arabic Fixed", Font.BOLD, 16));
		dtrpnScore.setText("Score: ");
		dtrpnScore.setBounds(13, 210, 168, 41);
		contentPane.add(dtrpnScore);
	}
}
