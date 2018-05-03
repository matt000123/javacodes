import java.io.*;

class input {
  public static void main (String args[]){
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    String a;
    try{
      a = tastiera.readLine();
    }
    catch (Exception e){
      a="";
    }
    System.out.println("La parola immessa è: "+a);
  }
}