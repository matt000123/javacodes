import java.io.*;

  class equazione_primogrado
  {
    public static void main(String args[])
    {
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader tastiera = new BufferedReader(input);
      int a, b;
      float x;
      String in;
      System.out.println("Inserisci il valore intero di B");
      try
      {
        in = tastiera.readLine();
      }
      catch (Exception e)
      {
        in="";
      }
      b = Integer.valueOf(in).intValue();
      System.out.println("Inserisci il valore intero del termine noto");
      try
      {
        in = tastiera.readLine();
      }
      catch (Exception e)
      {
        in="";
      }
      a = Integer.valueOf(in).intValue();
      if((a==0) && (b==0))
      {
        System.out.println("L'equazione è INDETERMINATA");
      }
      else
      {
        if((a==0) && (b!=0))
        {
          System.out.println("L'equazione è IMPOSSIBILE");
        }
        else
        {
          x = b/a;
          System.out.println("Il valore di x è: "+x);
        }
      }
    }
  }