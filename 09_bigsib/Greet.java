/*
LIR - Lawrence Joa (Steve and John), Ivina Wang (Sealie), Ruiwen Tang (Bernard)
APCS
HW09 -- What Are BigSibs Good For?
2021-10-01

DISCOVERIES:
		- you can use separate java files to execute diff codes?
		- after you javac Greet.java you type java Greet/ without the .java
		- if you get the "error: reached end of file while parsing" it means missing/extra bracket

		UNRESOLVED MYSTERIES:
		- n/a
*/

public class Greet{
	public static void main(String[] args){
		BigSib.greet("Film");
		BigSib.greet("Flam");
		BigSib.greet("Kazaam");
	}
}
