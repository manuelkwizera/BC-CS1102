
import java.awt.*;

import javax.swing.*;

public class TrueFalseQuestion extends Question {
	
	
		String ask() {
	
		
		question.setVisible(true);
		return question.answer;
		
		}
		
		
		
		
		TrueFalseQuestion(String question, String answer){

			super(question);
			JPanel buttons = new JPanel();
			addButton(buttons,"TRUE");
			addButton(buttons,"FALSE");
			initQuestionDialog();
			this.correctAnswer = answer; //
			  

			}

			void addButton(JPanel buttons, String label) {

			JButton button = new JButton(label);
			button.addActionListener(question);
			buttons.add(button);
			
			this.question.add(buttons);
			}
		     
  }

