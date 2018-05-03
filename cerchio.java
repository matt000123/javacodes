import java.io.*;
  
  class cerchio
  {
    public static void main (String args[])
    {
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader tastiera = new BufferedReader(input);
      int raggio;
      String x;
      float area, circonferenza;
      System.out.println("Inserisci il valore del raggio");
      try
      {
        x = tastiera.readLine();
      }
      catch(Exception e)
      {
        x="";
      }
      raggio = Integer.valueOf(x).intValue();
      if(raggio>0)
      {
        area =(float) (raggio*raggio*3.14);
        circonferenza =(float) (2*raggio*3.14);
        System.out.println("L'area del cerchio misura "+area+" La circonferenza misura "+circonferenza);
      }
      else
      {
        System.out.println("VALORE NON CORRETTO");
      }
    }
  }