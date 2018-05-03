class gioco_random
{
  public static void main(String args[])
  {
    String risp;
    int n, num, tentativi;
    do
    {
    n = (int)(Math.random()*100);
    tentativi = 5;
    while(tentativi > 0)
    {
      System.out.println("Che numero ho pensato?");
      num = f.leggi_int();
      if(num == n)
      {
        tentativi = -10;
      }
      else
      {
        tentativi = tentativi - 1;
        if(num < n)
        {
          System.out.println("Il numero che hai immesso è più piccolo del numero che ho generato. Riprova!!!");
        }
        if(num > n)
        {
          System.out.println("Il numero che hai immesso è più grande del numero che ho generato. Riprova!!!");
        }
      }
    }
    if(tentativi == -10)
    {
      System.out.println("HAI VINTO!!!");
    }
    else
    {
      System.out.println("HAI PERSO...");
      System.out.println("Avevo pensato al numero "+n);
    }
  System.out.println("Vuoi rigiocare? [SI o NO]");
  risp = f.leggi_string();
    }
    while(risp.compareTo("SI") == 0);
  }
}