import java.io.*;

class mcm
{
  public static void main (String args[])
  {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    int n, m, r, mcm;
    String x, riavvia;
    do
    {
      System.out.println("Dimmi il valore intero e positivo del primo numero.");
      try
      {
        x = tastiera.readLine();
      }
      catch(Exception e)
      {
        x = "";
      }
      n = Integer.valueOf(x).intValue();
      System.out.println("Dimmi il valore intero e positivo del secondo numero.");
      try
      {
        x = tastiera.readLine();
      }
      catch(Exception e)
      {
        x = "";
      }
      m = Integer.valueOf(x).intValue();
      if((n > 0) && (m > 0))
      {
        mcm = n;
        r = mcm%m;
        while(r != 0)
        {
          mcm = mcm+n;
          r = mcm%m;
        }
        System.out.println("Il m.c.m. dei numeri "+ n +" e "+ m +" è: "+ mcm);
      }
      else
      {
        System.out.println("Valori inseriti non corretti");
      }
      do
    {
      System.out.println("Vuoi riavviare il programma? [SI o NO]");
      try
      {
        riavvia = tastiera.readLine();
      }
      catch(Exception e)
      {
        riavvia = "";
      }
    }
    while((riavvia.compareTo("SI") != 0) && (riavvia.compareTo("NO") != 0));
    }
    while(riavvia.compareTo("SI") == 0);
  }
}