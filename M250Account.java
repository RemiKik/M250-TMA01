
/**
 * Answer to TMA01 Question 1
 * 
 * @author (Remi Kik) 
 * @version (10/12/17)
 */
public class M250Account
{
   private String accountNum;

   /**
    * Constructor for objects of class M250Account
    */
   public M250Account()
   {
      accountNum = "X00000";
   }
   
   /**
    * An getter message
    */
   public String getAccountNum()
   {
      return accountNum;
   }
   
   /**
    * Method which check whether the String has a corrent length, which is 6
    */
   public boolean isValidLength(String s)
   {
      if (s.length() == 6)
      {
         return true;
      }
      else 
      {
         return false;
      }
   }

   /**
    * Method which check whether the first letter of string s is upper case.
    */
   public boolean isValidStart(String s)
   {
      if (Character.isUpperCase(s.charAt(0)))
      {
         return true;
      }
      else 
      {
         return false;
      }
   }
   
   /**
    * Method which check whether all the characters, except first one, in a string s are digits. 
    */
   public boolean hasValidDigits(String s)
   {
      for (int i = 1; i < s.length(); i++) {
         if (!Character.isDigit(s.charAt(i)))
         {
            return false;
         }
      }
      return true;
   }
   
   /**
    * Method which perfom length, first letter and digits check
    */
   public boolean isValidAccountNum(String s)
   {
      if ((isValidLength(s) && isValidStart(s)) && hasValidDigits(s))
      {
         return true;
      }
      return false;
   }
   
   /**
    * Method which print out whether the string s is a correct account number.
    * If so, assign value of string s to accountNum 
    */
   public void setAccountNum(String s)
   {
      if (isValidAccountNum(s))
      {
          System.out.println("Value " + s + " is valid");
          accountNum = s;
      }
      else
      {
         System.out.println("Value " + s + " is not valid");
      }
   }
}
