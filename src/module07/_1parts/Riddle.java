package module07._1parts;

public class Riddle
{
   // write 2 instance variables for Riddle's question and answer: private type variableName;
   private String question;
   private String answer; 
   
   // constructor
   public Riddle(String initQuestion, String initAnswer)
   {
      // set the instance variables to the init parameter variables
      question = initQuestion;
      answer = initAnswer;
   }
   
   // Print riddle question
   public void printQuestion()
   {
     // print out the riddle question with System.out.println
     System.out.println(question);
   }
   
   // Print riddle answer
   public void printAnswer()
   {
     // print out the riddle answer with System.out.println
     System.out.println(answer);
   }
   
   // main method for testing
   public static void main(String[] args)
   {
      // call the constructor to create 2 new Riddle objects
      Riddle r1 = new Riddle("What do you call a fake noodle?", "An impasta!");
      Riddle r2 = new Riddle("How do you make a tissue dance?", "Put a little boogie in it!");
      // call their printQuestion() and printAnswer methods
     r1.printQuestion();
     r1.printAnswer();
     r2.printQuestion();
     r2.printAnswer();
   }
}
