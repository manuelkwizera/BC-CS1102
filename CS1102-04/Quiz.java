
public class Quiz {
	
	
	public static void main(String[] args) {
		
		MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
				"WHICH OF THE FOLLOWING FOR LOOP DECLARATION IS NOT VALID?",
				"for ( int i = 99; i >= 0; i / 9 )",
				"for ( int i = 7; i <= 77; i += 7 )",
				"for ( int i = 20; i >= 2; - -i )",
				"for ( int i = 2; i <= 20; i = 2* i )",
				"for ( int i = 20; i >= 2; i += i )",
				"a");
		question1.check();
		
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
				"WHAT DO YOU MEAN BY NAMELESS OBJECTS?",
				"An object created by using the new keyword.",
				"An object of a superclass created in the subclass.",
				"An object without having any name but having a reference.",
				"An object that has no reference.",
				"An object with void return type and no arguments.",
				"d");
		question2.check();
		
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
				"WHEN DOES METHOD OVERLOADING IS DETERMINED?",
				"At run time",
				"At compile time",
				"At coding time",
				"At execution time",
				"None of the above",
				"b");
		question3.check();
		
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
				"WHICH PACKAGE CONTAINS THE RANDOM CLASS?",
				"java.awt package",
				"java.lang package",
				"java.util package",
				"java.io package",
				"None of the above",
				"c");
		question4.check();
		
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
				"WHICH OF THE FOLLOWING IS A MARKER INTERFACE?",
				"Runnable interface",
				"Remote interface",
				"Readable interface",
				"Result interface",
				"Both D and E",
				"b");
		question5.check();
		
		
		MultipleChoiceQuestion.showResults();
		
	}
		
		
}


