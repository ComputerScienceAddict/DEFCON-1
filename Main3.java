import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
public class Main3 implements ActionListener{
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
		public static ImageIcon ProjectIcon = new ImageIcon("C:\\Users\\Joshua\\Downloads\\Roast\\nazi-flag-md.png");
	
	public static String Japan = "C:\\Users\\Joshua\\Downloads\\Wav for project\\Battotai - Imperial Japanese Army March.wav";
	
	public static int Counter = 0;
	
	
	
	public static void main(String[] args) {
		JButton button = new JButton();
		JFrame frame = new JFrame();
		frame.setTitle("Fuck you Vicente");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.add(button);
		frame.add(panel);
		//panel.add(BackgroundLabel);
		panel.add(label);
		//label.add(BackgroundLabel);
		//label.setIcon(BackgroundImage);
		label.add(BackgroundLabel);
		BackgroundLabel.setText("Joe momma");
		BackgroundLabel.setForeground(Color.red);
		
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					Counter++;
					PlayMusic();
				}
		    }
		});
		
		
		
		frame.setVisible(true);
		
	}
	public static void PlayMusic() {
		try {
			System.out.println(Counter);
			File musicPath = new File(Japan);
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			clip.start();
			if(Counter > 1) {
				clip.stop();
			}
		}
		catch(Exception e) {
			
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//e.getCode();
		
	}
		
}
