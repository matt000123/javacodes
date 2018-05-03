import java.io.*;

class input_numero{
  public static void main(String args[]){
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    int a;
    String x;
    System.out.println("Scrivi un numero intero");
    try
    {
      x = tastiera.readLine();
    }
    catch(Exception e)
    {
      x = "";
    }
    a = Integer.valueOf(x).intValue();
    System.out.println("Il numero immesso è "+a);
  }
}