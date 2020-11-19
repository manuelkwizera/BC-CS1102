import javax.swing.JOptionPane;
//import java.lang.*;
public class Quiz {
	
	static void check(String question, String correctAnswer) {
		
		String answer = ask(question);
		if(answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is \"Java ARchive\"");
			System.exit(0);
		}
	}
	
	
	static String ask(String question) {
		
		while(true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			
			if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")||answer.equals("E")) {
				 return answer;
				}
			
			else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
			}
		}
	}
	
	
	public static void main(String[] args) {
		String question = "IN JAVA, JAR STANDS FOR?\n";
		question += "A. Java Archive Runner\n";
		question += "B. Java Application Resource\n";
		question += "C. Java ARchive\n";
		question += "D. Java Application Runner\n";
		question += "E. None of the above\n";
		String correctAnswer = "C";
		check(question,correctAnswer);
		
	}
}


