import java.util.*;
public class MakeStars{
  public static String toStars(String str){
    String copy="";
    for (int i=0; i < str.length(); i++){
      if (str.charAt(i) == ' '){
        copy+= " ";
      }
      else{
        copy+='*';
      }
    }
    return copy;
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
      Scanner word = new Scanner(line.nextLine());

      while(word.hasNext()){
        System.out.print(toStars(word.next())+" ");
      }
      System.out.println();
    }
  }
}
