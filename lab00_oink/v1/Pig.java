/**
Noobies - Lawrence Joa(Steve, John), Ivina Wang (Sealie), Jacc Chen (Large)
APCS
L00: Etterbay Odingcay Oughthray Ollaborationcay
2021-11-09
time spent: 1.5 hr

DISCO:
* When we transalted yay, the outcome was yayway(for the old Pig.java)- bc it counted the y as a vowel,
but when y is the first letter in a word, it is usually not a vowel (now it is ayyay!)
* Punctuation string can not use indexOf, we must write a for loop.

QCC:
* Do we have to create another final String to add numbers to the translator?
* How do we translate a word that has a ' in between it- like "you're"?

NEW IN v1:
* Fufilled all of the general rules
* Can handle multiple consonants at the beginnning of the word
* Can handle capitalization (to a certain extent; like the beginning of a word, or
if it is in the middle of the sentence, but it cannot do both)
* Can handle punctuation and hyphens

class Pig
a Pig Latin translator
~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~

          9
    ,--.-'-,--.
    \  /-~-\  /
   / )' a a `( \
  ( (  ,---.  ) )
   \ `(_o_o_)' /
    \   `-'   /
     | |---| |
     [_]   [_]

     PROTIP: Make this class compilable first,
     then develop and test one method at a time.
     NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
*/


public class Pig {

		private static final String VOWELS = "aeiouy";
    private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String PUNCS = ".,:;!?";


		/**
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p") -> false
  	**/
  	public static boolean hasA( String w, String letter ) {
    		return w.indexOf(letter) != -1;

  	/* equiv code, wo using indexOf()...
       boolean ans = false;
       for( int i = 0; i < w.length(); i++ ) {
       if ( w.substring(i,i+1).equals(letter) ) {
       ans = true;
       //Q: is there a more efficient way?
       }
       }
       return ans;
    */
  	}//end hasA()


  /**
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    **/
  	public static boolean isAVowel( String letter ) {
    		return VOWELS.indexOf( letter ) != -1;
  	}


  /**
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    **/
  	public static int countVowels( String w ) {
      	return allVowels(w).length();
    }

    /* long version using for
       int numVowels = 0; //init vowels counter var
       //must touch each letter in word, so use FOR
       for( int i = 0; i < w.length(); i++ ) {
       if ( isAVowel( w.substring(i,i+1) ) )
       numVowels++;
       }
       return numVowels;
    */


  /**
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz") -> false
    **/
  	public static boolean hasAVowel( String w ){
        if (countVowels(w)>0) {
            return true;
    	  } else {
    		    return false;
        }
  	}


  /**
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    **/
  	public static String allVowels( String w ) {
        String ans = ""; //init return String
        for(int i = 0; i < w.length(); i++ ) {
          	if ( isAVowel( w.substring(i,i+1) ) )
            ans += w.substring( i, i+1 ); //grow the return String
        		}
        return ans;
    }


  /**
    String firstVowel(String) -- returns first vowel in a String
    pre:  w != null
    post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
    **/
  	public static String firstVowel( String w ) {
    		String ans = "";
    		if ( hasAVowel(w) ) //Q: Why this necess?
      ans = allVowels(w).substring(0,1);
    		return ans;
  	}


  /**
    boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
    pre:  w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
    beginsWithVowel("strong") --> false
    **/
  	public static boolean beginsWithVowel( String w ) {
    		return isAVowel( w.substring(0,1) );
  	}


  /**
    String engToPig(String) -- converts an English word to Pig Latin
    pre:  w.length() > 0
    post: engToPig("apple")  --> "appleway"
    engToPig("strong") --> "ongstray"
    engToPig("java")   --> "avajay"
    **/
    public static String engToPig( String w ) {
        String ans = "";

        if (beginsWithVowel(w)) {
        		ans = w + "way";
        }
      	if (w.substring(0,1).equals("y")){
            int vPos = w.indexOf( firstVowel(w) );
            ans = w.substring(vPos + 1) + w.substring(0,vPos + 1) + "ay";
        }
        else {
          	int vPos = w.indexOf( firstVowel(w) );
          	ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
        }

        if(isUpperCase(w.substring(0,1))){
          	ans = ans.toLowerCase();
        		ans = (char)(ans.charAt(0) - 32) + ans.substring(1);
        }

      	if(hasPunc(w)){
          	ans = engToPig(w.substring(0,w.length()-1)) + w.substring(w.length()-1);
        }
        return ans;
    }


    /*=====================================
    boolean isPunc(String) -- tells whether a character is punctuation
    pre:  symbol.length() == 1
    post: isPunc(".") -> true
          isPunc("b") -> false
    =====================================*/

      public static boolean isPunc( String symbol ) {
          return PUNCS.indexOf( symbol ) != -1;
        }


  /*=====================================
    boolean isUpperCase(String) -- tells whether a letter is uppercase
    pre:  letter.length() == 1
    post: isUpperCase("a") -> false
          isUpperCase("A") -> true
    =====================================*/
      public static boolean isUpperCase( String letter ) {
          return CAPS.indexOf( letter ) != -1;
      }


  /*=====================================
    boolean hasPunc(String) -- tells whether a String contains punctuation
    pre:  w != null
    post: hasPunc(“cat.") -> true
          hasPunc(“cat") -> false
    =====================================*/
      public static boolean hasPunc( String w ) {
          boolean punc = false;
          for (int i=0; i<w.length(); i++){
              if(PUNCS.indexOf(w.substring(i,i+1)) != -1){
              punc = true;
              }
          }
          return punc;
      }


  /*=====================================
    boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
    pre:  w != null and w.length() > 0
    post: beginsWithUpper("Apple") -> true
          beginsWithUpper("apple") -> false
    =====================================*/
      public static boolean beginsWithUpper( String w ) {
          return isUpperCase( w.substring(0,1) );
  }


  	public static String pigSentence(String w){
			int startLetter=0;
			String pigSentence = "";
			for(int i=0; i<w.length()-1;i++){
					if(w.substring(i,i+1).equals(" ")){
							pigSentence = pigSentence + engToPig(w.substring(startLetter,i)) + " ";
							startLetter = i + 1;
					}
          if(w.substring(i,i+1).equals("-")){
							pigSentence = pigSentence + engToPig(w.substring(startLetter,i)) + "-";
							startLetter = i + 1;
					}
			}
			if(w.substring(w.length()-1).equals(" ")){
					pigSentence = pigSentence + engToPig(w.substring(startLetter,w.length()-1));
			} else {
          pigSentence = pigSentence + engToPig(w.substring(startLetter,w.length()));
      }
      return pigSentence;
	}

			public static void main( String[] args ) {

    			for( String word : args ) {
      				/*System.out.println( "allVowels \t" + allVowels(word) );
      				System.out.println( "firstVowels \t" + firstVowel(word) );
      				System.out.println( "countVowels \t" + countVowels(word) );
      				System.out.println( "engToPig \t" + engToPig(word) );
      				System.out.println( "---------------------" );*/
            	System.out.print( pigSentence(word) + " ");
    			}

  		}//end main()

}//end class Pig
