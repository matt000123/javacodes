import java.io.*;

class massimo
{
  public static void main (String args[])
  {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    int n, num, max;
    String x;
    do
    {
    System.out.println("Quanti numeri ci sono nella sequenza");
    try
    {
      x = tastiera.readLine();
    }
    catch(Exception e)
    {
      x = "";
    }
    n = Integer.valueOf(x).intValue();
    max = 0;
    do
    {
      System.out.println("Scrivi un numero della sequenza");
      try
      {
        x = tastiera.readLine();
      }
      catch(Exception e)
      {
        x = "";
      }
      num = Integer.valueOf(x).intValue();
      if(num > max)
      {
        max = num;
      }
      n = n - 1;
    }
    while(n > 0);
    System.out.println("Il massimo numero della sequenza è "+max);
    do
    {
      System.out.println("Vuoi riavviare il programma? [SI o NO]");
      try
      {
        x = tastiera.readLine();
      }
      catch(Exception e)
      {
        x = "";
      }
    }
    while((x.compareTo("SI") != 0) && (x.compareTo("NO") != 0));
  }
  while(x.compareTo("SI") == 0);
}
}