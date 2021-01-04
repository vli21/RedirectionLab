public class PigLatin{

  public static String pigLatinSimple(String s){
    String piggedsimple="";
      if (s.length()==0){
        return "";
      }
      else{
        char c= s.charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
          piggedsimple= s+"hay";
        }
        else{
          piggedsimple= s.substring(1,s.length())+s.charAt(0)+"ay";
        }
      }
    return piggedsimple;
  }

  public static String pigLatin(String s){
    String [] Digraphs= {"bl", "br", "ch", "ck", "cl", "cr", "dr","fl", "fr", "gh",
                         "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk",
                         "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    boolean isthereDigraph= false;
    String pigged="";
    for (int i=0; i<Digraphs.length;i++){
      if (s.substring(0,2).equals(Digraphs[i])){
        isthereDigraph=true;
      }
    }
    if(s.length()==0){
      return "";
    }
    else{
      if (isthereDigraph){
        pigged= s.substring(2,s.length()) + s.substring(0,2) + "ay";
      }
      else{
        pigged= pigLatinSimple(s);
      }
    }
    return pigged;
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
    System.out.println(pigLatin("the")); //→ "ethay"
    System.out.println(pigLatin("check")); //→ "eckchay"
    System.out.println(pigLatin("skee")); //→ "eeskay"
    System.out.println(pigLatin("emu")); //→ "emuhay"
    System.out.println(pigLatin("grade")); //→ "adegray"
  }
}
