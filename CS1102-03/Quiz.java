import javax.swing.JOptionPane;
public class Quiz {
	
	 //Declaring two static member variables
	
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	//Declaring Check Method
	
	static void check(String question, String correctAnswer) {
		nQuestions = nQuestions + 1; //Incrementing static variable by one
		String answer = ask(question);
		if(answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
			nCorrect = nCorrect + 1; //Incrementing static variable by one
		}
		else {
			
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is:"+" "+correctAnswer);
			
		}
	}
	
	//Declaring Ask Method
	
	static String ask(String question) {
		
		while(true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase(); //Convert valid answer converted upper case
			
			if (answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")||answer.equals("E")) {
				 return answer;
				}
			
			else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		//FIRST QUESTION
		
		String question = "IN JAVA, JAR STANDS FOR?\n";
		question += "A. Java Archive Runner\n";
		question += "B. Java Application Resource\n";
		question += "C. Java ARchive\n";
		question += "D. Java Application Runner\n";
		question += "E. None of the above\n";
		String correctAnswer = "C";
		check(question,correctAnswer); //First check Method call
		
		//SECOND QUESTION
		
		question = "WHICH PACKAGE CONTAINS THE RANDOM CLASS?\n";
		question += "A. java.util package\n";
		question += "B. java.lang package\n";
		question += "C. java.awt package\n";
		question += "D. java.io package\n";
		question += "E. None of the above\n";
		correctAnswer = "A";
		check(question,correctAnswer); //Second Check Method Call
		
		//THIRD QUESTION
		
		question = "WHICH OF THE FOLLOWING IS A MARKER INTERFACE?\n";
		question += "A. Runnable interface\n";
		question += "B. Remote interface\n";
		question += "C. Readable interface\n";
		question += "D. Result interface\n";
		question += "E. Both D and E\n";
		correctAnswer = "B";
		check(question,correctAnswer); //Third Check Method Call
		
		//Displaying the score Using Static variables
		
		JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
	}
}


