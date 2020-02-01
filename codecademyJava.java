// “Write once, run everywhere”

// Introduction to Java
// Run the code in the text editor to see what is printed to the screen.

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}

// Hello Java File!
// Inside main(), add a statement which prints Hello someName!, with your name replacing someName.

public class HelloYou {
  public static void main(String[] args) {
    System.out.println("Hello Kyra!");
  }
}

// Commenting Code
// The file Timeline.java has plain text information about Java. Plain text facts aren’t valid syntax. We’ll use comments to avoid breaking the program. Use the single-line comment syntax for the first fact and the multi-line syntax for the second.

public class Timeline {
  public static void main(String[] args) {
    System.out.println("Hello Java!");
    
    System.out.println("You were born in 1995");

    // Sun Microsystems announced the release of Java in 1995
    
    System.out.println("You were created by James Gosling");
    
		/* James Gosling is a Canadian engineer who 
		created Java while working at Sun Microsystems. 
		His favorite number is the square root of 2! */
    
    System.out.println("You are a fun language!");
  }
} 

// Semicolons and Whitespace
// This file prints information about Java to the screen. Unfortunately, the writer of the file has avoided using whitespace. Make the file easier to read by adding a newline after each statement! Inside main(), add a new statement printing how you feel about coding.

public class LanguageFacts {
  public static void main(String[] args) {
    System.out.println("Programming is amazing!");
    
    System.out.println("Java is a class-based language.");
    System.out.println("Java classes have a 'main' method.");
    System.out.println("Java statements end with a semicolon.");
  }
}

// Java Review: Putting It All Together
// The text editor holds an empty file named Review.java. Fill it in! Define a public class named Review. Define the main() method. Inside the main() method, write "The main method executes the tasks of the class" as a single-line comment. Below the comment, write a statement that prints the following: My first Java program from scratch!

public class Review{
  public static void main(String[] args){
    // The main method executes the tasks of the class
    System.out.println("My first Java program from scratch!")
  }
}

// Planting a Tree
// Define a class that follows the Java naming conventions. Define the main() method inside of the Tree class. Write a comment to explain the goal then use a print statement to introduce yourself. After introducing yourself, use another print statement to output the project goal! Use multiple print statements to plant your tree.

public class Tree{
  public static void main(String[] args){
    // I'm going to introduce myself and print a tree to the screen.
    System.out.println("My name is Kyra and I'm learning Java!");
    System.out.println("I'm going to plant a tree today!");
    System.out.println("  *** ");
    System.out.println(" *****");
    System.out.println(" *****");
    System.out.println("   | ");
    System.out.println("   | ");
    System.out.println("^^^^^^^");
  }
}

// VARIABLES: Introduction
// Inside main(), use System.out.println() to print out the variable name. Use the same command to print out yearCreated.

public class Creator {
	public static void main(String[] args) {
    String name = "James Gosling";
    int yearCreated = 1995;
    System.out.println("The creator of Java is " + name + ".");
    System.out.println("It was created in " + yearCreated + ".");
	}
}

// ints
// Count the number of comments. Then declare a variable called numComments that holds how many comments you counted. Print out numComments.

//This is the class declaration
public class CountComment {
  //This is the main method that runs when you compile
	public static void main(String[] args) {
    //This is where you will define your variable
    int numComments = 6;
    //This is where you will print your variable
    System.out.println(numComments);
	}
  
  //This is the end of the class
}
//This is outside the class

// doubles
// As of 2016, Android has 81.7 percent of the market share for mobile operating systems. Create a variable called androidShare that holds this percentage as a double. Print out androidShare to the console.

public class MarketShare {
	public static void main(String[] args) {
    double androidShare = 81.7;
    System.out.println(androidShare);
	}
}

// booleans
// Create a variable called intsCanHoldDecimals. Set it to true if the int type can hold a decimal number or to false if the int type cannot do this then print out your intsCanHoldDecimals variable.

public class Booleans {
	public static void main(String[] args) {    
    boolean intsCanHoldDecimals = false;
    System.out.println(intsCanHoldDecimals);
	}
}

// char
// Create a variable called expectedGrade of type char. Fill it with a single letter, representing the grade you think you would get in a graded Java course where the grades A, B, C, D and F are possible. Then print out your expectedGrade variable.

public class Char {
	public static void main(String[] args) {   
char expectedGrade = 'A';
    System.out.println(expectedGrade);
	}
}

// String
// Create a variable called openingLyrics that holds "Yesterday, all my troubles seemed so far away". Then print out openingLyrics.

public class Song {
	public static void main(String[] args) {   
String openingLyrics = "Yesterday, all my troubles seemed so far away";
    System.out.println(openingLyrics);
	}
}

// Static Checking
// Change the types of the variables so that they correspond with the type of the assignment values. 

public class Mess {
	public static void main(String[] args) {   
		int year = 2001;
    String title = "Shrek";
    char genre = 'C';
    double runtime = 1.58;
    boolean isPG = true;
	}
}

// Naming
// We declared variables with confusing names. Change the ones that are preventing the file from compiling.

public class BadNames {
	public static void main(String[] args) {   
		String firstName = "Samira";
    String lastName = "Smith";
    String userWebsite = "samira@google.com";
    int salaryExpectation = 100000;
    int yearOfBirth = 1955;
    
    System.out.println("The program runs!");
	}
}

// Review
// The file MyProfile.java contains a class that represents your hiring profile as presented to potential employers. In the main() method, create a variable called name that holds your name, as a sequence of characters. Create a variable called age that holds your age as a whole number. Create a variable called desiredSalary that holds your desired salary per year to a precision of two decimal points. Create a variable called gender that holds a single character, m (male), f (female), n (for none), or o (for other). Create a variable called lookingForJob that holds whether or not you are currently open to job offers.

public class MyProfile {
	public static void main(String[] args) {   
String name = "Kyra";
    int age = 99;
    double desiredSalary = 1000000000.99;
    char gender = 'f';
    boolean lookingForJob = true;
	}
}

// Java Variables: Mad Libs
// Let’s create a comment that describes the program! Create a String called name1 that stores the name of the main character. Create three Strings, adjective1, adjective2, and adjective3 and store different adjectives in them. Create a String called verb1 and store a verb in it. Create six Strings, noun1, noun2, noun3, noun4, noun5, and noun6 and initialize them to your favorite nouns. Declare a String variable called name2 and initialize it to the value of another name. Declare an int variable called number and set it to any whole number you like. Declare a String called place1 and store any place in it. This could be a city, or a town, or a country, or a planet!

public class MadLibs {
  /*
  This program generates a mad libbed story.
Author: Laura
Date: 2/19/2049
  */
  	public static void main(String[] args){
      String name1 = "Lady Susan";
      String adjective1 = "supersticious";
      String adjective2 = "hungry as a wolf";
      String adjective3 = "fantastical";
      String verb1 = "leap";
      String noun1 = "cat";
      String noun2 = "flowers";
      String noun3 = "parakeet";
      String noun4 = "shoehorn";
      String noun5 = "cruise ship";
      String noun6 = "bowling ball";
      String name2 = "High Preist Larry";
      int number = 22;
      String place1 = "Villagetown: est. 3027";
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      System.out.println(story);
    }       
}





