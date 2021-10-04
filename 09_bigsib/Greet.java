/*
LIR - Lawrence Joa (Steve and John), Ivina Wang (Sealie), Ruiwen Tang (Bernard)
APCS
HW09 -- What Are BigSibs Good For?
2021-10-01

DISCOVERIES:
		- BigSib.java does not need to be explicitly compiled if Greet.java is compiled (we don't need to use javac BigSib.java if we have already done javac Greet.java)
		- When Greet.java is compiled, a BigSib.class file is created as well - BigSib does not require a main function. It is not being run, but Greet is able to use it.
		- We use className.functionName(arguments) to use a function in another class
		- You can use separate java files to execute diff codes?
		- After you “javac Greet.java,” you type “java Greet” without the .java
		- If you get the "error: reached end of file while parsing,” it means missing/extra bracket

		UNRESOLVED MYSTERIES:
		- What would be the use of another java file? Does it help with organization or serve a more technical purpose?
		- What happens if you touch an already existing file? Is this a problem?
		- What are LF and CRLF? We saw these in a warning when touching again: “warning: LF will be replaced by CRLF in 09_bigsib/Greet.java. The file will have its original line endings in your working directory”
*/

public class Greet{
	public static void main(String[] args){
		BigSib.greet("Film");
		BigSib.greet("Flam");
		BigSib.greet("Kazaam");
	}
}
