package com.ocj.adamk.challenges.looppractice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class OneArmedBandit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	
	
	int str;
	int myInt = 0;
	int myInt_1 = 0;
	int myInt_2 =0;
	int counter = 0;
	int price = 0;//declaring the new table

	char [] myArray = {'A', 'B', 'C', 'D', '1','3','4','5', 'Z'};
	Random myRandom = new Random();
	private JLabel lblNewLabel_1;
	private JLabel lblMoneySpent;
	private JTextField textField_3;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OneArmedBandit frame = new OneArmedBandit();
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
	public OneArmedBandit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{33, 86, 122, 86, 0};
		gbl_contentPane.rowHeights = new int[]{47, 23, 49, 36, 32, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 0;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.BOTH;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 0;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Gamble");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				price++;
				lblNewLabel_1.setText("Score is :" +counter);  //set the new table to increase the scores
				textField_3.setText("€ "+price+".00" );
				
				//code for the random selection
				myInt = myRandom.nextInt(9);
				myInt_1 = myRandom.nextInt(9);
				myInt_2 = myRandom.nextInt(9);
				
				//System.out.println(myArray[myInt]);
				//System.out.println(myInt);
				//str = (myArray[myInt])
				//String.valueOf(myArray[myInt]);
				textField.setText(String.valueOf(myArray[myInt]));
				textField_1.setText(String.valueOf(myArray[myInt_1]));
				textField_2.setText(String.valueOf(myArray[myInt_2]));
				//compaqring the results to match you set number
				
				if(textField.getText().equals("Z")&&textField_1.getText().equals("Z")&&textField_2.getText().equals("Z")){
					lblNewLabel.setText("you won 100 Points");
					counter = counter + 100;
				}
				else if(textField.getText().equals("A")&&textField_1.getText().equals("A")&&textField_2.getText().equals("1")){
					lblNewLabel.setText("you won 50 Points");
					counter = counter + 50;
					
				}
				
				else if(textField.getText().equals("B")&&textField_1.getText().equals("1")&&textField_2.getText().equals("B")){
					lblNewLabel.setText("you won 25 Points");
					counter = counter + 25;
					
				}
				
				else if(textField.getText().equals("C")&&textField_1.getText().equals("A")&&textField_2.getText().equals("D")){
					lblNewLabel.setText("you won 5 Points");
					counter = counter + 5;
					
				}
				
				
				else{
					lblNewLabel.setText("you Lost!");
				
				}
				
				
				
				//textField.setText(myArray[myInt]);
				
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 1;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Score");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 4;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblMoneySpent = new JLabel("Money Spent:");
		GridBagConstraints gbc_lblMoneySpent = new GridBagConstraints();
		gbc_lblMoneySpent.anchor = GridBagConstraints.EAST;
		gbc_lblMoneySpent.insets = new Insets(0, 0, 0, 5);
		gbc_lblMoneySpent.gridx = 1;
		gbc_lblMoneySpent.gridy = 5;
		contentPane.add(lblMoneySpent, gbc_lblMoneySpent);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 0, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 5;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
	}
}
