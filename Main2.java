import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.*;
public class Main2 implements ActionListener{
	
	
	//Lists Containing Events and Countries
	public static String[] CountriesList = {"Japan", "Italy", "Germany", "norway", "france", "netherlands", "Russia","luxembourg","china","Scotland", "Nothern Ireland"};
	public static String[] EventsList = { "whole country has covid", "Hurricane", "nuked "};
	public static Random rand = new Random();
	
	
	//Important Variables
	public static String Scenario = "";
	public static int NukeCounter = 0;
	public static JLabel label = new JLabel();
	public static JButton button = new JButton();
	public static JPanel panel = new JPanel();
	public static JLabel BackgroundLabel = new JLabel();
	
	
	//Pictures
	public static ImageIcon LabelImage = new ImageIcon("C:\\Users\\Joshua\\Downloads\\download (21).jpg");
	public static ImageIcon BackgroundImage = new ImageIcon("C:\\Users\\Joshua\\Downloads\\Wav for project\\BackgroundForVicenteProject.gif");
	public static ImageIcon ProjectIcon = new ImageIcon("C:\\Users\\Joshua\\Downloads\\Roast");
	
	
	//Song Files Strings
	public static String Germany = "C:\\Users\\Joshua\\Downloads\\horstw.wav";
	public static String Japan = "C:\\Users\\Joshua\\Downloads\\Wav for project\\Battotai - Imperial Japanese Army March.wav";
	public static String HitlerSpeech = "C:\\Users\\Joshua\\Downloads\\Wav for project\\Hitler Speech.wav";
	public static String DeclarationOfWar = "C:\\Users\\Joshua\\Downloads\\Enemy War Declaration Sound - Hoi 4.wav";
	public static String NukeSound = "C:\\Users\\Joshua\\Downloads\\Wav for project\\HoI 4 - Nuke Sound.wav";
	public static String aaaaa = "";
	
	
	
	//constructor
	public Main2() {
		
		
	}
	
	public static void main(String[] args) {
		Main2 m = new Main2();
		JFrame frame = new JFrame("Bruh");
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.add(BackgroundLabel);
		BackgroundLabel.setIcon(BackgroundImage);
		panel.add(label);
		panel.add(BackgroundLabel);
		//panel.setBounds(10, 10, 10, 10);
		//frame.add(button);
		
		
		
		
		label.setIcon(LabelImage);
		
		
		
		
		frame.setVisible(true);
		
		frame.setIconImage(ProjectIcon.getImage());
		
		
		Generator();
		
		

	}
	
	
	public static void Generator() {
		for(int i = 0; i <= 10; i++) {
			Wait(1000);
	    	int randomEvents = rand.nextInt(EventsList.length);
		    int randomCountry = rand.nextInt(CountriesList.length);
		    
		    Scenario = CountriesList[randomCountry] +" "+ EventsList[randomEvents];
		    
		    System.out.println(Scenario);
		    
		    label.setText(Scenario);
			label.update(label.getGraphics());
			
		    if(EventsList[randomEvents].equalsIgnoreCase(EventsList[2])) {
		    	NukeCounter++;
		    	CountryIsNuked();
		    	System.out.print(NukeCounter);
		    }
		    /*if(CountriesList[randomCountry].equalsIgnoreCase(CountriesList[0])) {
		    	playMusic(Japan);
		    }
		    */
	}
		    
		    
	    
	}
	
	
	
	public static void playMusic(String filepath) {
		
		try {
			File musicPath = new File(filepath);
			
			if(musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				Wait(2000);
				clip.stop();
			}
			else {
				System.out.print("Can't find file");
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void Wait(int a) {
		try {
			Thread.sleep(a);
		}catch(Exception e) {
			
		}
	}
	public static void FourthReich() {
		
		
	}
	public static void CountryIsNuked() {
		try {
			File musicPath = new File(NukeSound);
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			clip.start();
			if(NukeCounter > 1) {
				clip.stop();
			}
			if(NukeCounter >= 4) {
				
			}
		}
		catch(Exception e) {
			
		}
	}
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
