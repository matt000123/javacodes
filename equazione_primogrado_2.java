import java.io.*;

class equazione_primogrado_2
{
  public static void main(String args[])
  {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    int a, b;
    String in;
    float x;
    System.out.println("Inserisci il valore di B");
    try
    {
      in = tastiera.readLine();
    }
    catch (Exception e)
    {
      in = "";
    }
    b = Integer.valueOf(in).intValue();
    System.out.println("Inserisci il coefficiente di X");
    try
    {
      in = tastiera.readLine();
    }
    catch (Exception e)
    {
      in = "";
    }
    a = Integer.valueOf(in).intValue();
    if ((a!=0) && (b!=0))
    {
      x = b/a;
      System.out.println("Il valore dell'incognita è: "+x);
    }
    if((a==0) && (b==0))
    {
      System.out.println("L'equazione è INDETERMINATA");
    }
    if((a==0) && (b!=0))
    {
      System.out.println("L'equazione è IMPOSSIBILE");
    }
  }
}