import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	String question;
	String correctAnswer;
	
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		
		question = query+"\n";
		question += "A. "+a+"\n";
		question += "B. "+b+"\n";
		question += "C. "+c+"\n";
		question += "D. "+d+"\n";
		question += "E. "+e+"\n";
		
		correctAnswer = answer.toUpperCase();
	}
	
	/*Convert "ask" from a class method of "Quiz" to an instance method of "MultipleChoiceQuestion" */
	
	String ask() {
			
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
	
	/*Now convert "check" from a class method of "Quiz" to an instance method of "MultipleChoiceQuestion". */	
	
	void check() {
		nQuestions = nQuestions + 1; //Incrementing static variable by one
		String answer = ask();
		if(answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
			nCorrect = nCorrect + 1; //Incrementing static variable by one
		}
		else {
			
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is:"+" "+correctAnswer);
			
		}
	}
	
	/*Add a new class method called "showResults" to display the number of questions and correct answers.*/
	
	static void showResults() {
		
		JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
	}

}
