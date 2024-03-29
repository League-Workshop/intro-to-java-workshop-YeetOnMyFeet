package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell Yeet");
		String answer = JOptionPane.showInputDialog("Spell what I said");
		if(answer.equalsIgnoreCase("Yeet")) {
			JOptionPane.showMessageDialog(null, "Great job! I can tell you passed first grade!");
		}
		else { 
			JOptionPane.showMessageDialog(null, "Wrong! Go back to first grade!");
		}
		
		
		// 2. Catch the user's answer in a String

		// 3. If the user spelled the word correctly, speak "correct"

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


