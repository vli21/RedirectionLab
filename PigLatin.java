import java.util.*;
import java.util.regex.Pattern;
import java.util.Locale;

public class PigLatin{

  public static String pigLatinSimple(String s){
    String piggedsimple="";
    s=s.toLowerCase();
      if (s.length()==0){
        return s;
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
    s=s.toLowerCase();
    String [] Digraphs= {"bl", "br", "ch", "ck", "cl", "cr", "dr","fl", "fr", "gh",
                         "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk",
                         "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    boolean isthereDigraph= false;
    String pigged="";
    for (int i=0; i<Digraphs.length;i++){
      if (s.length()>2 && s.substring(0,2).equals(Digraphs[i])){
        isthereDigraph=true;
      }
    }
    if(s.length()==0){
      return s;
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
    s=s.toLowerCase();
    String piggedBest ="";
    if (s.length()==0 || Character.isLetter(s.charAt(0))==false){
      return s;
    }
    else{
      if (Pattern.matches("\\p{IsPunctuation}", s.substring(s.length()-1))){
        piggedBest= pigLatin(s.substring(0,s.length()-1))+ s.charAt(s.length()-1);
      }
      else{
        piggedBest=pigLatin(s);
      }
    }
    return piggedBest;
  }
  public static void main (String []args){
    //use the standard input (terminal input)
    //as the string that you read from
    Scanner line = new Scanner( System.in );
    //use hasNextLine()/nextLine() to loop over
    //all of the data
    //If you want to read the input word by word
    //this can be replaced with hasNext() and next()
    //do something with line
    while(line.hasNextLine()){
      String fixed="";
      Scanner word = new Scanner(line.nextLine());
      while(word.hasNext()){
        fixed+= pigLatinBest(word.next());
        fixed+=" ";
    }
    System.out.println(fixed.substring(0,fixed.length()-1));
  }
}
}
