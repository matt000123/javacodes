import java.io.*;

class m_c_d
{
  public static void main(String args[])
  {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    int x, y, mcd, rx, ry;
    String in, risp;
    do
    {
      System.out.println("Scrivi il valore del primo numero");
      try
      {
        in = tastiera.readLine();
      }
      catch(Exception e)
      {
        in = "";
      }
      x = Integer.valueOf(in).intValue();
      System.out.println("Scrivi il valore del secondo numero");
      try
      {
        in = tastiera.readLine();
      }
      catch(Exception e)
      {
        in = "";
      }
      y = Integer.valueOf(in).intValue();
      if((x > 0) && (y > 0))
      {
        if(x > y)
        {
          mcd = x;
        }
        else
        {
          mcd = y;
        }
        rx = x % mcd;
        ry = y % mcd;
        while((rx != 0) || (ry != 0))
        {
          mcd = mcd - 1;
          rx = x % mcd;
          ry = y % mcd;
        }
        System.out.println("Il MCD tra "+x+" e "+y+" è: "+mcd);
      }
        else
        {
          System.out.println("Dati inseriti non accettabili");
        }
        risp="";
        do
        {
          if((risp.compareTo("SI") != 0) && (risp.compareTo("NO") != 0) && (risp.compareTo("") != 0))
          {
            System.out.println("Puoi rispondere solo con SI o NO");
          }
          System.out.println("Vuoi riavviare il programma? [SI o NO]");
          try
          {
            risp=tastiera.readLine();
          }
          catch(Exception e)
          {
            risp = "";
          }
        }
        while((risp.compareTo("SI") != 0) && (risp.compareTo("NO") != 0));
    }
    while(risp.compareTo("SI") == 0);
  }
}