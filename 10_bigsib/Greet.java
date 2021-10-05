/*
LIR - Lawrence Joa (Steve and John), Ivina Wang (Sealie), Ruiwen Tang (Bernard)
APCS
HW10 -- Refactor Big Sib One
2021-10-04

DISCOVERIES:
		- Returning and printing are different. We are able to print and perform operations with the value of a function call if the function returns a value. However, the same cannot be done with a function that only prints something.
		- “void” must be replaced with the data type of the output if the function returns a value.
		- BigSib.greet seems to fit into the in-class discussion of what a “method” is, since it is specifically tied to BigSib.

UNRESOLVED MYSTERIES:
		- How can we edit using nano more efficiently? Right now, we need to toggle our cursor a lot without a mouse.
		- Are Greet and BigSib objects? They both know information about the parameters of their methods and have the property of being public. Also, they have methods, main() and greet(String s), specifically.
*/

public class Greet{
	public static void main(String[] args){
		System.out.println( BigSib.greet("Crosby"));
		System.out.println( BigSib.greet("Stills"));
		System.out.println( BigSib.greet("Nash"));
	}
}
