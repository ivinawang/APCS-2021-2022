#### Long Island Railroad: Lawrence Joa, Ivina Wang, Raven (Ruiwen) Tang
#### APCS
#### HW03 -- Codify the Revisions / revise binary-decimal work based on peer feedback
#### 2021-09-23

0. The "base" in a "base-X number system" determines what digits are used in the system (ex: base-10 uses digits 0 to 9, and base-2 uses digits 0 and 1). 
  In particular, powers of X correspond to place values. 
  For example, base-10's place values are ..., 10^3, 10^2, 10^1, 10^0. Similarly, base-2's place values are ..., 2^3, 2^2, 2^1, 2^0.
  
1. Binary is a numerical system in base 2. In binary, 1 indicates on or true, and 0 indicates off or false. 
   We care because binary is often used by computers to store information.

2. Let the binary number we receive be *n*. Keep track of a *sum* value that begins at 0 and an *exp* value that also begins at 0. <br>
  **Step 1:** Take the rightmost digit of *n*, multiply it by 2^*exp*, and add this value to *sum*. <br>
  **Step 2:** Add 1 to *exp*. <br>
  **Step 3:** Remove the rightmost digit of *n*. <br>
  **Step 4:** Repeat steps 1 to 3 until *n* no longer has any non-zero digits. <br>
  **Step 5:** *sum* is the converted decimal number. <br>

3. Let the decimal number we receive be *m*. Keep track of a *bin* value, beginning at 0. <br>
  **Step 1:** Find the greatest power of 2 less than or equal to *m*. This can be done by keeping track of an *exp* value that begins at 0. <br>
    **Step 1.1:** If 2^*exp* is less than or equal to *m*, add 1 to *exp* and repeat step 1.1. Otherwise, we have determined that 2^(*exp*-1) is the greatest power of 2 less than or equal to *m*. <br>
  **Step 2:** Add 10^(*exp*-1) to *bin* (treat *bin* as a base-10 number during this step). <br>
  **Step 3:** Subtract 2^(*exp*-1) from *m*. <br>
  **Step 4:** Subtract 1 from *exp*. If *exp* is equal to 0, skip the rest of the steps, and *bin* is the converted binary number. <br>
  **Step 5:** If 2^(*exp*-1) is less than or equal to *m*, repeat steps 2 to 5. Otherwise, repeat steps 4 and 5. <br>
  
  **Observations:**
  - bolding, italicizing in Markdown are extremely helpful (particularly, bolding specific steps and italicizing values)
  - the .md file extension allows the use of Markdown
  - breaking into steps and providing examples significantly aid in improving clarity
