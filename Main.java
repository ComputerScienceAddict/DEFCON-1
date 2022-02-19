import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class Main implements ActionListener{
	private static final long serialVersionUID = 1L;
	public static JFrame frame = new JFrame();
	public static JPanel panel = new JPanel();
	public static JLabel label = new JLabel("Da User");
	public static JTextField textfield = new JTextField(20);
	public static JButton button = new JButton("Press");
	public static String[] CountriesList = {"Japan", "Italy", "Germany", "norway", "france", "netherlands", "Russia","luxembourg","china","Scotland", "Nothern Ireland"};
	public static String[] EventsList = { "whole country has covid", "Hurricane", "nuked "};
	public static Random rand = new Random();
	
	
	
	//Important Variables
		public static String Scenario = "";
		public static int NukeCounter = 0;
		public static JLabel Label = new JLabel();
		public static JButton Button = new JButton();
		public static JPanel Panel = new JPanel();
		public static JLabel BackgroundLabel = new JLabel();
		
		
		//Pictures
		public static ImageIcon LabelImage = new ImageIcon("C:\\Users\\Joshua\\Downloads\\download (21).jpg");
		public static ImageIcon BackgroundImage = new ImageIcon("C:\\Users\\Joshua\\Downloads\\Wav for project\\BackgroundForVicenteProject.gif");
		public static ImageIcon ProjectIcon = new ImageIcon("C:\\Users\\Joshua\\Downloads\\Roast\\nazi-flag-md.png");
		
		
		
		
	/**
	 * 
	 */
	/*
	public static int x = 0;
	//public static final int Window_Width = 420;
	//public static JLabel label = new JLabel("Bruh Type Something Bloike");
	//public static JTextField textfield = new JTextField(20);
	//public static final JPanel panel = new JPanel();
	public Main() {
		//JLabel label = new JLabel();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel label = new JLabel("Da User");
		label.setBounds(10, 20, 80, 25);
		panel.add(label);
		
		JTextField textfield = new JTextField(20);
		textfield.setBounds(80, 20, 165, 25);
		panel.add(textfield);
		
		
		JButton button = new JButton("Press");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new Main());
		panel.add(button);
		frame.setVisible(true);
		
		
		
		//frame.add(g);
		
	}
	*/

	public static void main(String[] args) {
		//JLabel label = new JLabel();
				//JFrame frame = new JFrame();
				//JPanel panel = new JPanel();
				frame.setSize(275,200);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(panel);
				
				panel.setLayout(null);
				
				//JLabel label = new JLabel("Da User");
				label.setBounds(10, 20, 80, 25);
				panel.add(label);
				
				//JTextField textfield = new JTextField(20);
				textfield.setBounds(80, 20, 165, 25);
				panel.add(textfield);
				
				
				//JButton button = new JButton("Press");
				button.setBounds(100, 80, 80, 25);
				button.addActionListener(new Main());
				panel.add(button);
				frame.setVisible(true);

	}
	public static void Wait() {
		try {
			Thread.sleep(100);
		}catch(Exception e) {
			
		}
	}
	public static void FourthReich() {
		
		
	}
		
	/*
	public static void TheLabelContent() {
		label.setBounds(10, 20, 80, 25);
		panel.add(label);
		
		textfield.setBounds(100, 20, 165, 25);
		
		
	}
	*/

	@Override
	public void actionPerformed(ActionEvent e) {
		String UserText = textfield.getText();
		int randomEvents = rand.nextInt(EventsList.length);
	    int randomCountry = rand.nextInt(CountriesList.length);
	    String Save1 = CountriesList[randomCountry] +" "+ EventsList[randomEvents];
	    String Save2 = UserText +" "+ EventsList[randomEvents];
	    		for(int i = 0; i <= CountriesList.length; i++) {
	    			if(UserText != CountriesList[i]) {
	    				System.out.println("Not a Valib country doo doo head");
	    			}
	    	}
	    	if(UserText.equalsIgnoreCase("")) {
				System.out.println(Save1);
			
			}
			else {
				System.out.println(Save2);
			}
		
		
	    }

	}
}
