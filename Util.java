import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Util{
	static int count = 0;
	static String name1 = "Player1";
	static String name2 = "Player2";
	static JLabel turn1 = new JLabel();
	static JLabel turn2 = new JLabel();
	
    public static void startPlayWithOne(JButton []inputButton,JPanel panel,JLabel winner,JLabel player1,JTextField field1,JButton save1){
		count = 0;
		name1 = "Player1";
		save1.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent e){
				name1 = field1.getText();
			}
		});
		String inputButtonText[] = {"1","2","3","4","5","6","7","8","9"};
		
		final int HEIGHT = 50,WIDTH = 50;
		final int TOPX = 120,TOPY = 60;
		
		//set co-ordinates of inputButton
		int inputX = TOPX + WIDTH ;
		int inputY = TOPY + 2*HEIGHT ;
		int tempX = inputX;
		int tempY = inputY;
		
		for(int i=0;i<inputButtonText.length;i++){
			JButton b = new JButton(inputButtonText[i]);
			b.setFocusPainted(false);
			inputButton[i] = b;
			b.setBounds(tempX,tempY,WIDTH,HEIGHT);
			b.setForeground(Color.WHITE);
			b.setBackground(Color.BLACK);
			panel.add(b);
			tempX = tempX+WIDTH;
			if((i+1)%3==0){
				tempX=inputX;
				tempY = tempY + HEIGHT;
			}
			b.addActionListener(new ActionListener(){
				boolean answerFound = false;
				public void actionPerformed(ActionEvent e){
					count++;
					b.setText("X");
					b.setBackground(Color.WHITE);
					b.setForeground(Color.BLACK);
					b.setEnabled(false);
					boolean con1 = (inputButton[0].getText().equals(inputButton[1].getText()) && inputButton[0].getText().equals(inputButton[2].getText()));
		            boolean con2 = (inputButton[3].getText().equals(inputButton[4].getText()) && inputButton[3].getText().equals(inputButton[5].getText()));
					boolean con3 = (inputButton[6].getText().equals(inputButton[7].getText()) && inputButton[6].getText().equals(inputButton[8].getText()));
					boolean con4 = (inputButton[0].getText().equals(inputButton[3].getText()) && inputButton[0].getText().equals(inputButton[6].getText()));
					boolean con5 = (inputButton[1].getText().equals(inputButton[4].getText()) && inputButton[1].getText().equals(inputButton[7].getText()));
					boolean con6 = (inputButton[2].getText().equals(inputButton[5].getText()) && inputButton[2].getText().equals(inputButton[8].getText()));
					boolean con7 = (inputButton[0].getText().equals(inputButton[4].getText()) && inputButton[0].getText().equals(inputButton[8].getText()));
					boolean con8 = (inputButton[2].getText().equals(inputButton[4].getText()) && inputButton[2].getText().equals(inputButton[6].getText()));
		
	
					if(con1){
						winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
					    inputButton[0].setBackground(new java.awt.Color(127,255,212));
					    inputButton[1].setBackground(new java.awt.Color(127,255,212));
					    inputButton[2].setBackground(new java.awt.Color(127,255,212));
						for(int i=0;i<9;i++){
							inputButton[i].setEnabled(false);
						}
						answerFound = true;
				    }
					if(con2){
						winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
					    inputButton[3].setBackground(new java.awt.Color(127,255,212));
					    inputButton[4].setBackground(new java.awt.Color(127,255,212));
					    inputButton[5].setBackground(new java.awt.Color(127,255,212));
						for(int i=0;i<9;i++){
							inputButton[i].setEnabled(false);
						}
					    answerFound = true;
					}
					if(con3){
						winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
					    inputButton[6].setBackground(new java.awt.Color(127,255,212));
					    inputButton[7].setBackground(new java.awt.Color(127,255,212));
					    inputButton[8].setBackground(new java.awt.Color(127,255,212));
						for(int i=0;i<9;i++){
							inputButton[i].setEnabled(false);
						}
						answerFound = true;
					}
					if(con4){
						winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
					    inputButton[0].setBackground(new java.awt.Color(127,255,212));
					    inputButton[3].setBackground(new java.awt.Color(127,255,212));
					    inputButton[6].setBackground(new java.awt.Color(127,255,212));
						for(int i=0;i<9;i++){
							inputButton[i].setEnabled(false);
						}
						answerFound = true;
					}
					if(con5){
						winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
					    inputButton[1].setBackground(new java.awt.Color(127,255,212));
					    inputButton[4].setBackground(new java.awt.Color(127,255,212));
					    inputButton[7].setBackground(new java.awt.Color(127,255,212));
						for(int i=0;i<9;i++){
							inputButton[i].setEnabled(false);
						}
						answerFound = true;
						
					}
					if(con6){
						winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
					    inputButton[2].setBackground(new java.awt.Color(127,255,212));
					    inputButton[5].setBackground(new java.awt.Color(127,255,212));
					    inputButton[8].setBackground(new java.awt.Color(127,255,212));
						for(int i=0;i<9;i++){
							inputButton[i].setEnabled(false);
				        }
						answerFound = true;
					}
					if(con7){
						winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
					    inputButton[0].setBackground(new java.awt.Color(127,255,212));
					    inputButton[4].setBackground(new java.awt.Color(127,255,212));
					    inputButton[8].setBackground(new java.awt.Color(127,255,212));
						for(int i=0;i<9;i++){
							inputButton[i].setEnabled(false);
						}
						answerFound = true;
					}
					if(con8){
						winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
					    inputButton[2].setBackground(new java.awt.Color(127,255,212));
					    inputButton[4].setBackground(new java.awt.Color(127,255,212));
					    inputButton[6].setBackground(new java.awt.Color(127,255,212));
						for(int i=0;i<9;i++){
							inputButton[i].setEnabled(false);
						}
						answerFound = true;
					}
					
					
					if(count!=9 && answerFound==false){
						count++;
						boolean carryOn = false;
						do{
							carryOn = false;
							java.util.Random rand = new java.util.Random();
							String select = ""+rand.nextInt(9);
							int i;
							for(i=0;i<9;i++){
								if(select.equals(inputButton[i].getText())){
									inputButton[i].setText("O");
									inputButton[i].setBackground(new java.awt.Color(211,211,211));
									inputButton[i].setForeground(Color.BLACK);
									inputButton[i].setEnabled(false);
									
								    con1 = (inputButton[0].getText().equals("O") && inputButton[1].getText().equals("O") && inputButton[2].getText().equals("O"));
		                            con2 = (inputButton[3].getText().equals("O") && inputButton[4].getText().equals("O") && inputButton[5].getText().equals("O"));
									con3 = (inputButton[6].getText().equals("O") && inputButton[8].getText().equals("O") && inputButton[7].getText().equals("O"));
									con4 = (inputButton[0].getText().equals("O") && inputButton[6].getText().equals("O") && inputButton[3].getText().equals("O"));
									con5 = (inputButton[1].getText().equals("O") && inputButton[4].getText().equals("O") && inputButton[7].getText().equals("O"));
									con6 = (inputButton[2].getText().equals("O") && inputButton[5].getText().equals("O") && inputButton[8].getText().equals("O"));
									con7 = (inputButton[0].getText().equals("O") && inputButton[4].getText().equals("O") && inputButton[8].getText().equals("O"));
									con8 = (inputButton[2].getText().equals("O") && inputButton[4].getText().equals("O") && inputButton[6].getText().equals("O"));
											                            
									if(con1){
										winner.setText("         COMPUTER WON ");
										inputButton[0].setBackground(new java.awt.Color(127,255,212));
										inputButton[1].setBackground(new java.awt.Color(127,255,212));
										inputButton[2].setBackground(new java.awt.Color(127,255,212));
										for(int j=0;j<9;j++){
											inputButton[j].setEnabled(false);
										}
									    answerFound = true;
				                    }
									if(con2){
										winner.setText("         COMPUTER WON ");
										inputButton[3].setBackground(new java.awt.Color(127,255,212));
										inputButton[4].setBackground(new java.awt.Color(127,255,212));
										inputButton[5].setBackground(new java.awt.Color(127,255,212));
										for(int j=0;j<9;j++){
											inputButton[j].setEnabled(false);
										}
									    answerFound = true;
									}
									if(con3){
										winner.setText("         COMPUTER WON ");
										inputButton[6].setBackground(new java.awt.Color(127,255,212));
										inputButton[7].setBackground(new java.awt.Color(127,255,212));
										inputButton[8].setBackground(new java.awt.Color(127,255,212));
										for(int j=0;j<9;j++){
											inputButton[j].setEnabled(false);
										}
										answerFound = true;
									}
									if(con4){
										winner.setText("         COMPUTER WON ");
										inputButton[0].setBackground(new java.awt.Color(127,255,212));
										inputButton[3].setBackground(new java.awt.Color(127,255,212));
										inputButton[6].setBackground(new java.awt.Color(127,255,212));
										for(int j=0;j<9;j++){
											inputButton[j].setEnabled(false);
										}
										answerFound = true;
									}
									if(con5){
										winner.setText("         COMPUTER WON ");
										inputButton[1].setBackground(new java.awt.Color(127,255,212));
										inputButton[4].setBackground(new java.awt.Color(127,255,212));
										inputButton[7].setBackground(new java.awt.Color(127,255,212));
										for(int j=0;j<9;j++){
											inputButton[j].setEnabled(false);
										}
										answerFound = true;
									}
									if(con6){
										winner.setText("         COMPUTER WON ");
										inputButton[2].setBackground(new java.awt.Color(127,255,212));
										inputButton[5].setBackground(new java.awt.Color(127,255,212));
										inputButton[8].setBackground(new java.awt.Color(127,255,212));
										for(int j=0;j<9;j++){
											inputButton[j].setEnabled(false);
										}
								        answerFound = true;
									}
									if(con7){
										winner.setText("         COMPUTER WON ");
										inputButton[0].setBackground(new java.awt.Color(127,255,212));
										inputButton[4].setBackground(new java.awt.Color(127,255,212));
										inputButton[8].setBackground(new java.awt.Color(127,255,212));
										for(int j=0;j<9;j++){
											inputButton[j].setEnabled(false);
										}
								        answerFound = true;
									}
									if(con8){
										winner.setText("         COMPUTER WON ");
										inputButton[2].setBackground(new java.awt.Color(127,255,212));
										inputButton[4].setBackground(new java.awt.Color(127,255,212));
										inputButton[6].setBackground(new java.awt.Color(127,255,212));
										for(int j=0;j<9;j++){
											inputButton[j].setEnabled(false);
										}
										answerFound = true;
									}
									break;
								}
							}
							if(i==9){
								carryOn = true;
							}
						}while(carryOn!=false);
					}
					
					winner.setBounds(45,350,700,20);
					winner.setFont(new Font("Sans Serif",Font.ITALIC+Font.BOLD,20));
					panel.add(winner);
				    winner.setForeground(new java.awt.Color(25,25,112));
					if(answerFound==true)
					    winner.setVisible(true);
					
					if(answerFound==false && count==9){
						winner.setText("!!Match is Draw!!");
						winner.setBounds(150,350,700,20);
						winner.setFont(new Font("Sans Serif",Font.ITALIC+Font.BOLD,20));
						panel.add(winner);
						winner.setVisible(true);
						winner.setForeground(new java.awt.Color(25,25,112));
					}
					
				}
			});
		}
	}	
	
	public static void startPlayWithTwo(JButton []inputButton,JPanel panel,JLabel winner,JLabel player1,JLabel player2,JTextField field1,JTextField field2,JButton save1,JButton save2){
		count = 0;
		name1 = "Player1";
		name2 = "Player2";
		save1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				name1 = field1.getText();
			}
		});
		
		save2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				name2 = field2.getText();
			}
		});
			
		turn1.setText("Player1's Turn");
		turn2.setText("Player2's Turn");
		turn1.setBounds(40,200,100,20);
		turn2.setBounds(340,200,100,20);
		turn1.setFont(new Font("Serif",Font.ITALIC+Font.BOLD,15));
		turn2.setFont(new Font("Serif",Font.ITALIC+Font.BOLD,15));
		turn1.setForeground(new java.awt.Color(102,0,0));
		turn2.setForeground(new java.awt.Color(102,0,0));
		turn1.setVisible(true);
		turn2.setVisible(false);
		
		String inputButtonText[] = {"1","2","3","4","5","6","7","8","9"};
		
		final int HEIGHT = 50,WIDTH = 50;
		final int TOPX = 120,TOPY = 80;
		
		//set co-ordinates of inputButton
		int inputX = TOPX + WIDTH ;
		int inputY = TOPY + 2*HEIGHT ;
		int tempX = inputX;
		int tempY = inputY;
		
		
		for(int i=0;i<inputButtonText.length;i++){
			JButton b = new JButton(inputButtonText[i]);
			b.setFocusPainted(false);
			inputButton[i] = b;
			b.setBounds(tempX,tempY,WIDTH,HEIGHT);
			b.setForeground(Color.WHITE);
			b.setBackground(Color.BLACK);
			panel.add(b);
			tempX = tempX+WIDTH;
			if((i+1)%3==0){
				tempX=inputX;
				tempY = tempY + HEIGHT;
			}
			
			b.addActionListener(new ActionListener(){
				boolean answerFound = false;
				public void actionPerformed(ActionEvent e){
					count++;
					if(count%2!=0){
						b.setText("X");
						b.setBackground(Color.WHITE);
						b.setForeground(Color.BLACK);
						b.setEnabled(false);
		                boolean conX1 = (inputButton[0].getText().equals("X") && inputButton[1].getText().equals("X") && inputButton[2].getText().equals("X"));
						boolean conX2 = (inputButton[3].getText().equals("X") && inputButton[4].getText().equals("X") && inputButton[5].getText().equals("X"));
						boolean conX3 = (inputButton[6].getText().equals("X") && inputButton[8].getText().equals("X") && inputButton[7].getText().equals("X"));
						boolean conX4 = (inputButton[0].getText().equals("X") && inputButton[6].getText().equals("X") && inputButton[3].getText().equals("X"));
						boolean conX5 = (inputButton[1].getText().equals("X") && inputButton[4].getText().equals("X") && inputButton[7].getText().equals("X"));
						boolean conX6 = (inputButton[2].getText().equals("X") && inputButton[5].getText().equals("X") && inputButton[8].getText().equals("X"));
						boolean conX7 = (inputButton[0].getText().equals("X") && inputButton[4].getText().equals("X") && inputButton[8].getText().equals("X"));
						boolean conX8 = (inputButton[2].getText().equals("X") && inputButton[4].getText().equals("X") && inputButton[6].getText().equals("X"));
				
						if(conX1){
							winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
							inputButton[0].setBackground(new java.awt.Color(127,255,212));
							inputButton[1].setBackground(new java.awt.Color(127,255,212));
							inputButton[2].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						if(conX2){
							winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
							inputButton[3].setBackground(new java.awt.Color(127,255,212));
							inputButton[4].setBackground(new java.awt.Color(127,255,212));
							inputButton[5].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						if(conX3){
							winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
							inputButton[6].setBackground(new java.awt.Color(127,255,212));
							inputButton[7].setBackground(new java.awt.Color(127,255,212));
							inputButton[8].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						if(conX4){
							winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
							inputButton[0].setBackground(new java.awt.Color(127,255,212));
							inputButton[3].setBackground(new java.awt.Color(127,255,212));
							inputButton[6].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						if(conX5){
							winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
							inputButton[1].setBackground(new java.awt.Color(127,255,212));
							inputButton[4].setBackground(new java.awt.Color(127,255,212));
							inputButton[7].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
							
						}
						if(conX6){
							winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
							inputButton[2].setBackground(new java.awt.Color(127,255,212));
							inputButton[5].setBackground(new java.awt.Color(127,255,212));
							inputButton[8].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						if(conX7){
							winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
							inputButton[0].setBackground(new java.awt.Color(127,255,212));
							inputButton[4].setBackground(new java.awt.Color(127,255,212));
							inputButton[8].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						if(conX8){
							winner.setText("CONGRATULATIONS " + name1.toUpperCase()+" YOU WON ");
							inputButton[2].setBackground(Color.RED);
							inputButton[4].setBackground(Color.RED);
							inputButton[6].setBackground(Color.RED);
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						turn1.setVisible(false);
						turn2.setVisible(true);
					}else{
						b.setText("O");
						b.setBackground(new java.awt.Color(211,211,211));
						b.setForeground(Color.BLACK);
						b.setEnabled(false);
						
                        boolean conO1 = (inputButton[0].getText().equals("O") && inputButton[1].getText().equals("O") && inputButton[2].getText().equals("O"));
						boolean conO2 = (inputButton[3].getText().equals("O") && inputButton[4].getText().equals("O") && inputButton[5].getText().equals("O"));
						boolean conO3 = (inputButton[6].getText().equals("O") && inputButton[8].getText().equals("O") && inputButton[7].getText().equals("O"));
						boolean conO4 = (inputButton[0].getText().equals("O") && inputButton[6].getText().equals("O") && inputButton[3].getText().equals("O"));
						boolean conO5 = (inputButton[1].getText().equals("O") && inputButton[4].getText().equals("O") && inputButton[7].getText().equals("O"));
						boolean conO6 = (inputButton[2].getText().equals("O") && inputButton[5].getText().equals("O") && inputButton[8].getText().equals("O"));
						boolean conO7 = (inputButton[0].getText().equals("O") && inputButton[4].getText().equals("O") && inputButton[8].getText().equals("O"));
						boolean conO8 = (inputButton[2].getText().equals("O") && inputButton[4].getText().equals("O") && inputButton[6].getText().equals("O"));
										
		
						if(conO1){
							winner.setText("CONGRATULATIONS " + name2.toUpperCase()+" YOU WON ");
							inputButton[0].setBackground(new java.awt.Color(127,255,212));
							inputButton[1].setBackground(new java.awt.Color(127,255,212));
							inputButton[2].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						if(conO2){
							winner.setText("CONGRATULATIONS " + name2.toUpperCase()+" YOU WON ");
							inputButton[3].setBackground(new java.awt.Color(127,255,212));
							inputButton[4].setBackground(new java.awt.Color(127,255,212));
							inputButton[5].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						if(conO3){
							winner.setText("CONGRATULATIONS " + name2.toUpperCase()+" YOU WON ");
							inputButton[6].setBackground(new java.awt.Color(127,255,212));
							inputButton[7].setBackground(new java.awt.Color(127,255,212));
							inputButton[8].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						if(conO4){
							winner.setText("CONGRATULATIONS " + name2.toUpperCase()+" YOU WON ");
							inputButton[0].setBackground(new java.awt.Color(127,255,212));
							inputButton[3].setBackground(new java.awt.Color(127,255,212));
							inputButton[6].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						if(conO5){
							winner.setText("CONGRATULATIONS " + name2.toUpperCase()+" YOU WON ");
							inputButton[1].setBackground(new java.awt.Color(127,255,212));
							inputButton[4].setBackground(new java.awt.Color(127,255,212));
							inputButton[7].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						if(conO6){
							winner.setText("CONGRATULATIONS " + name2.toUpperCase()+" YOU WON ");
							inputButton[2].setBackground(new java.awt.Color(127,255,212));
							inputButton[5].setBackground(new java.awt.Color(127,255,212));
							inputButton[8].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						if(conO7){
							winner.setText("CONGRATULATIONS " + name2.toUpperCase()+" YOU WON ");
							inputButton[0].setBackground(new java.awt.Color(127,255,212));
							inputButton[4].setBackground(new java.awt.Color(127,255,212));
							inputButton[8].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						if(conO8){
							winner.setText("CONGRATULATIONS " + name2.toUpperCase()+" YOU WON ");
							inputButton[2].setBackground(new java.awt.Color(127,255,212));
							inputButton[4].setBackground(new java.awt.Color(127,255,212));
							inputButton[6].setBackground(new java.awt.Color(127,255,212));
							for(int i=0;i<9;i++){
								inputButton[i].setEnabled(false);
							}
							answerFound = true;
						}
						turn1.setVisible(true);
						turn2.setVisible(false);
					
					}
					
					winner.setBounds(45,350,700,20);
					winner.setFont(new Font("Sans Serif",Font.ITALIC+Font.BOLD,20));
					panel.add(winner);
					winner.setForeground(new java.awt.Color(25,25,112));
					if(answerFound==true){
						winner.setVisible(true);
						turn1.setVisible(false);
						turn2.setVisible(false);
					
					}
					
					if(answerFound==false && count==9){
						winner.setText("!!Match is Draw!!");
						winner.setBounds(150,350,700,20);
						winner.setFont(new Font("Sans Serif",Font.ITALIC+Font.BOLD,20));
						panel.add(winner);
						winner.setVisible(true);
						winner.setForeground(new java.awt.Color(25,25,112));
						turn1.setVisible(false);
						turn2.setVisible(false);
					
					}
				}
			});
		}
		panel.add(turn1);
		panel.add(turn2);
    }
}