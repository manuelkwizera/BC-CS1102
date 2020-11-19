import javax.swing.JOptionPane;

public abstract class Question {
	
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	String question;
	String correctAnswer;
	
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
	
	
	static void showResults() {
		
		JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
	}
	
	
	abstract String ask();

}
