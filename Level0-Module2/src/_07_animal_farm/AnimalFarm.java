//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _07_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	public static void main(String[] args) {
		Boolean keepPlaying = true;
		while(keepPlaying == true){
			String userInput = JOptionPane.showInputDialog("Please enter a number between 1 and 5", null);
			
			int i = Integer.parseInt(userInput);
			System.out.println(i);
			if(i == 1){
				playMoo();
			} else if(i == 2) {
				
			}
			
			
			String keepPlayingUserInput = JOptionPane.showInputDialog("Would you like to keen playing Y/N",null);
			if(keepPlayingUserInput.equalsIgnoreCase("yes") || keepPlayingUserInput.equalsIgnoreCase("y")){
				keepPlaying = true;
			} else {
				keepPlaying = false;
			}
		}
		/* 1. Ask the user which animal they want, then play the sound of that animal. */
		
		/* 2. Make it so that the user can keep entering new animals. */
			
	}

	static void playMoo() {
		playNoise(mooFile);
	}

	static void playQuack() {
		playNoise(quackFile);
	}

	static void playWoof() {
		playNoise(woofFile);
	}
	
	static void playMeow() {
		playNoise(meowFile);
	}
	
	static void playLlama() {
		playNoise(llamaFile);
	}

	static String quackFile = "quack.wav";
	static String mooFile = "moo.wav";
	static String woofFile = "woof.wav";
	static String meowFile = "meow.wav";
	static String llamaFile = "llama.wav";

	/* Ignore this stuff */
	
	public static void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(AnimalFarm.class.getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}