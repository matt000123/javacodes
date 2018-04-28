//FUNZIONI PER L’IMMISSIONE DEI DATI DA TASTIERA

import java.io.*;

class f
{
  public static int leggi_int()
  {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    int x;
    String help;
    try
    {
      help = tastiera.readLine();
    }
    catch(Exception e)
    {
      help = "";
    }
    x = Integer.valueOf(help).intValue();
    return x;
  }
  public static String leggi_string()
  {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    String help;
    try
    {
      help = tastiera.readLine();
    }
    catch(Exception e)
    {
      help = "";
    }
    return help;
  }
}