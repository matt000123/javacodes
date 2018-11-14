// RICHIEDE IL FILE "f.class"

class pos_pari_dispari
{
  public static int[] tutti_i_numeri = new int[150];
  public static int[] posti_pari = new int[150];
  public static int[] posti_dispari = new int[150];
  public static int ip = 0, id = 0;
  public static void main(String args[])
  {
    String risp;
    do
    {
      risp = elabora();
      while((risp.compareTo("SI") != 0) && (risp.compareTo("NO") != 0))
      {
        System.out.println("Valore immesso non valido: valori disponibili SI o NO.");
        risp = f.leggi_string();
      }
    }
    while(risp.compareTo("SI") == 0);
  }
  public static String elabora()
  {
    String risp;
    int n;
    n = carica();
    riempi_array(n);
    System.out.println("Vuoi eseguire una nuova elaborazione? [SI o NO]");
    risp = f.leggi_string();
    return risp;
  }
  public static int carica()
  {
    int i = 0, n;
    System.out.println("Quanti numeri vuoi inserire in array? [Max 150]");
    i = f.leggi_int();
    while((i > 150) || (i <= 0))
    {
      System.out.println("Valore non accettabile [Max 150]");
      i = f.leggi_int();
    }
    for(n = 0; n < i; n++)
    {
      System.out.println("Inserisci valore dell'array");
      tutti_i_numeri[n] = f.leggi_int();
    }
    return i;
  }
  public static void riempi_array(int n)
  {
    int i;
    for(i = 0; i < n; i++)
    {
      if((i % 2) == 0)
      {
        posti_pari[ip] = tutti_i_numeri[i];
        ip++;
      }
      else
      {
        posti_dispari[id] = tutti_i_numeri[i];
        id++;
      }
    }
    System.out.println("================= VALORI IN POSIZIONE PARI DELL'ARRAY =================");
    for(i = 0; i < ip; i++)
    {
      System.out.println("Posizione "+i+" => "+posti_pari[i]+";");
    }
    System.out.println("================= VALORI IN POSIZIONE DISPARI DELL'ARRAY =================");
    for(i = 0; i <ų id; i++)
    {
      System.out.println("Posizione "+i+" => "+posti_dispari[i]+";");
    }
  }
}
