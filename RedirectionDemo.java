import java.util.*;
public class RedirectionDemo{
  public static void main( String[]args ){
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
        System.out.print(word.next()+" ");
      }
      System.out.println();
    }

  }
}
