import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.*;
public class Tictoc extends Frame{
    JFrame frame = new JFrame("Tictoc");
	JPanel panel = new JPanel(null); 
	JButton []inputButton = new JButton[9];
	JLabel winner = new JLabel();
	JButton home = new JButton("Back to home");
	JLabel player1 = new JLabel("Player 1");
	JLabel player2 = new JLabel("Player 2");
	JTextField field1 = new JTextField();
	JTextField field2 = new JTextField();
	JButton save1 = new JButton("save");
	//save1.setFocusPainted(false);
	JButton save2 = new JButton("save");
	//save2.setFocusPainted(false);
	
	public Tictoc(){
		setLayout(null);
		JLabel label = new JLabel("TICTOC GAME");
		label.setBounds(150,20,300,40);
		label.setForeground(new java.awt.Color(220,20,60));
		label.setFont(new Font("Serif",Font.BOLD,25));
		panel.setBackground(new java.awt.Color(250,128,114));
		
		panel.add(label);
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JButton option1 = new JButton("Play with 1 player");
		JButton option2 = new JButton("Play with 2 player");
		option1.setBounds(150,90,200,40);
		option2.setBounds(150,140,200,40);
		option1.setForeground(Color.WHITE);
		option2.setForeground(Color.WHITE);
		option1.setBackground(Color.BLACK);
		option2.setBackground(Color.BLACK);
		option1.setFocusPainted(false);
		option2.setFocusPainted(false);
	    panel.add(option1);
	    panel.add(option2);
		
		
		option1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				option1.setVisible(false);
				option2.setVisible(false);
				home.setVisible(true);
				player1.setVisible(true);
				field1.setVisible(true);
				save1.setVisible(true);
				
				player1.setForeground(new java.awt.Color(0,0,128));
				player1.setBounds(150,90,200,40);
		        player1.setFont(new Font("Serif",Font.ITALIC+Font.BOLD,20));
				option1.setForeground(Color.WHITE);
				option1.setBackground(Color.BLACK);
				
				field1.setBounds(230,100,150,20);
				field1.setFont(new Font("Sans Serif",Font.ITALIC+Font.BOLD,15));
				field1.setBackground(new java.awt.Color(250,128,114));
				field1.setForeground(Color.BLACK);
				
				save1.setBounds(390,100,60,20);
	            save1.setFont(new Font("Sans Serif",Font.ITALIC,12));
	            save1.setBackground(Color.WHITE);
	            save1.setForeground(Color.BLACK);
				
				panel.add(player1);
				panel.add(field1);
				panel.add(save1);
				
				
				Util.startPlayWithOne(inputButton,panel,winner,player1,field1,save1);
			}
		});
		
		
		option2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				option1.setVisible(false);
				option2.setVisible(false);
				home.setVisible(true);
				player1.setVisible(true);
				player2.setVisible(true);
				field1.setVisible(true);
				field2.setVisible(true);
				save1.setVisible(true);
				save2.setVisible(true);
				
				player1.setForeground(new java.awt.Color(0,0,128));
				player1.setBounds(150,90,200,40);
		        player1.setFont(new Font("Serif",Font.ITALIC+Font.BOLD,20));
				option1.setForeground(Color.WHITE);
				option1.setBackground(Color.BLACK);
				
				player2.setForeground(new java.awt.Color(0,0,128));
				player2.setBounds(150,120,200,40);
		        player2.setFont(new Font("Serif",Font.ITALIC+Font.BOLD,20));
				option2.setForeground(Color.WHITE);
				option2.setBackground(Color.BLACK);
				
				field1.setBounds(230,100,150,20);
				field1.setFont(new Font("Sans Serif",Font.ITALIC+Font.BOLD,15));
				field1.setBackground(new java.awt.Color(250,128,114));
				field1.setForeground(Color.BLACK);
				
				field2.setBounds(230,130,150,20);
				field2.setFont(new Font("Sans Serif",Font.ITALIC+Font.BOLD,15));
				field2.setBackground(new java.awt.Color(250,128,114));
				field2.setForeground(Color.BLACK);
				
				save1.setBounds(390,100,60,20);
	            save1.setFont(new Font("Sans Serif",Font.ITALIC,12));
	            save1.setBackground(Color.WHITE);
	            save1.setForeground(Color.BLACK);
				
				save2.setBounds(390,130,60,20);
	            save2.setFont(new Font("Sans Serif",Font.ITALIC,12));
	            save2.setBackground(Color.WHITE);
	            save2.setForeground(Color.BLACK);
				
				panel.add(player1);
				panel.add(player2);
				panel.add(field1);
				panel.add(field2);
				panel.add(save1);
				panel.add(save2);
	    
				Util.startPlayWithTwo(inputButton,panel,winner,player1,player2,field1,field2,save1,save2);
			}
		});
		
		home.setBounds(150,380,200,40);
		home.setForeground(Color.WHITE);
		home.setBackground(Color.BLACK);
		home.setFocusPainted(false);
	    panel.add(home);
		home.setVisible(false);
		
		home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				for(int i=0;i<9;i++){
					inputButton[i].setVisible(false);
				}
				home.setVisible(false);
				winner.setVisible(false);
				option1.setVisible(true);
				option2.setVisible(true);
				player1.setVisible(false);
				player2.setVisible(false);
				field1.setVisible(false);
				field2.setVisible(false);
				save1.setVisible(false);
				save2.setVisible(false);
				field1.setText(null);
				field2.setText(null);
				
			}
		});
	}
	
	public static void main(String args[]){
		Tictoc myFrame = new Tictoc();
	}
}