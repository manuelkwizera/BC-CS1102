
public class Quiz {

	public static void main(String[] args) {
		
		//Use "/*" and "*/" to comment out all your questions except one true/false question.
		
		Question question1 = new MultipleChoiceQuestion(
				"WHICH OF THE FOLLOWING FOR LOOP DECLARATION IS NOT VALID?",
				"for ( int i = 99; i >= 0; i / 9 )",
				"for ( int i = 7; i <= 77; i += 7 )",
				"for ( int i = 20; i >= 2; - -i )",
				"for ( int i = 2; i <= 20; i = 2* i )",
				"for ( int i = 20; i >= 2; i += i )",
				"a");
		question1.check();
		
		Question question2 = new MultipleChoiceQuestion(
				"WHAT DO YOU MEAN BY NAMELESS OBJECTS?",
				"An object created by using the new keyword.",
				"An object of a superclass created in the subclass.",
				"An object without having any name but having a reference.",
				"An object that has no reference.",
				"An object with void return type and no arguments.",
				"d");
		question2.check();
		
		Question question3 = new MultipleChoiceQuestion(
				"WHEN DOES METHOD OVERLOADING IS DETERMINED?",
				"At run time",
				"At compile time",
				"At coding time",
				"At execution time",
				"None of the above",
				"b");
		question3.check();
		
		Question question4 = new MultipleChoiceQuestion(
				"WHICH PACKAGE CONTAINS THE RANDOM CLASS?",
				"java.awt package",
				"java.lang package",
				"java.util package",
				"java.io package",
				"None of the above",
				"c");
		question4.check();
		
		Question question5 = new MultipleChoiceQuestion(
				"WHICH OF THE FOLLOWING IS A MARKER INTERFACE?",
				"Runnable interface",
				"Remote interface",
				"Readable interface",
				"Result interface",
				"Both D and E",
				"b");
		question5.check();
		
		
		
		Question question6 = new TrueFalseQuestion("Constructor overloading is not possible in Java",
				"FALSE");
		question6.check();
		
		Question question7 = new TrueFalseQuestion("Variables declared inside a for loop are limited in scope to the loop",
				"TRUE");
		question7.check();
		
		Question question8 = new TrueFalseQuestion("In an instance method \"this\" is a reference to the current object",
				"TRUE");
		question8.check();
		
		Question question9 = new TrueFalseQuestion("Abstraction is a process in which local variable has the same name as one of the instance variables",
				"FALSE");
		question9.check();
		
		Question question10 = new TrueFalseQuestion("Java technology is both a programming language and a platform",
				"TRUE");
		question10.check();
		
		
		MultipleChoiceQuestion.showResults();
	}

}
