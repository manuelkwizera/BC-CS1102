import java.awt.*;
import javax.swing.*;

public abstract class Question {
	
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	
	QuestionDialog question;
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
	
	
	
	String ask() {
		
		
		question.setVisible(true);
		return question.answer;
	}
	
	Question(String question) {
		
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel("        "+question+"					",JLabel.CENTER));
	}
	
	void initQuestionDialog() {
		
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
	}

}
