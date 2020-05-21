package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton jButtonArr[];
	
	//2 create an integer variable called hiddenButton
	int hiddenButton;
	
	
	//Within this class, why does our main method call a new instance of the class and then run the start function? Why not just have the start
	//function be the main method?
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		int userEntry = Integer.parseInt(
			JOptionPane.showInputDialog("Please enter a positive number")
		);
		
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		jButtonArr = new JButton[userEntry];
		
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		for(int i = 0; i < jButtonArr.length; i++) {
			jButtonArr[i] = new JButton();
			jButtonArr[i].addActionListener(this);
			panel.add(jButtonArr[i]);
			
		}
		//9 add the panel to the window
		window.add(panel);
		
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//11. set the JFrame to visible.
		window.setVisible(true);
		
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(window, "Click the correct button or face clicking yet another button!");
		
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		Random rand = new Random();
		int hiddenButton = rand.nextInt(jButtonArr.length-1);

		//14. Set the text of the JButton located at hiddenButton to read "ME"
		jButtonArr[hiddenButton].setText("ME");
		
		//15. Use Thread.sleep(100); to pause the program.
		try {
			  Thread.sleep(100);
			} catch (InterruptedException ex) {
			  Thread.currentThread().interrupt();
			  throw new RuntimeException(ex);
			}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		jButtonArr[hiddenButton].setText("");
	}
	//MY QUESTION2 - WHAT ARE THESE @ SYMBOLS AND WHY ARE THEY USED?
	@Override
	public void actionPerformed(ActionEvent e) {
		//MY QUESTION 3 - What is this syntax with (JButton)e...............?
		JButton buttonClicked = (JButton)e.getSource();
		
		System.out.println(jButtonArr[hiddenButton].getX());
		System.out.println(buttonClicked.getX());
		System.out.println("Y " + jButtonArr[hiddenButton].getY());
		
		System.out.println("Y " + buttonClicked.getY());
		
		
		if(buttonClicked.getX() == jButtonArr[hiddenButton].getX() && buttonClicked.getY() ==  jButtonArr[hiddenButton].getY()){
			JOptionPane.showMessageDialog(window, "Correct!");
		} else {
			JOptionPane.showMessageDialog(window, "Try again!");
		}
	
		//17. if the hiddenButton is clicked, tell the user that they win.
		
		//18. else tell them to try again
	}
}
