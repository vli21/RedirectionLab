public class PigLatin{

  public static String pigLatinSimple(String s){
    String pigged="";
      if (s.length()==0){
        return "";
      }
      else{
        char c= s.charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
          pigged= s+"hay";
        }
        else{
          pigged= s.substring(1,s.length())+s.charAt(0)+"ay";
        }
      }
    return pigged;
  }
  public static String pigLatin(String s){
    return "";
  }
  public static String pigLatinBest(String s){
    return "";
  }
  public static void main (String []args){
  /*  System.out.println(pigLatinSimple("mock")); //→ "ockmay"
    System.out.println(pigLatinSimple("pie")); //→ "iepay"
    System.out.println(pigLatinSimple("david")); //→ "avidday"
    System.out.println(pigLatinSimple("aaron")); //→ "aaronhay"
    */
  }
}
