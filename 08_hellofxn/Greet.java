//Ivina Wang
//APCS
//HW08 -- Refactor Freshie Zero
//2021-09-29

/*DISCOVERIES:
		- We reached the conclusion that “hardcoded” means pre-programmed into the function.
		- We reviewed information about random from our summer prework, since we considered implementing random in the function greet();

		UNRESOLVED MYSTERIES:
		- Should we use random in implementing greet()? Our team numbers had separate opinions about this question.
			^^ not sure how to do this too!! :/
		- Without the use of random, our idea was to use if statements and case on the value of string s. However, this approach pre-determines which person will always be greeted, and the argument in the function call must be modified to change the person greeted.*/



public class Greet {
	public static void main(String[] args){
		greet("Foo");
		greet("Moo");
		greet("Ooo")
	}
	public static void greet(String s){
		System.out.println("Why, hello there, " + s + ". How do you do?")
	}
}
