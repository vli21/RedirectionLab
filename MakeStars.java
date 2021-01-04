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
  
}
