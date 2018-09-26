// Richiede il file "f.java"

class roulette
{
  public static int soldi_disponibili, puntata;
  public static void main(String args[])
  {
    String risp;
    do
    {
      risp = elabora();
      while((risp.compareTo("SI") != 0) && (risp.compareTo("NO") != 0))
      {
        System.out.println("Hai inserito una risposta non valida: riprova! [SI o NO]");
        risp = f.leggi_string();
      }
    }
    while(risp.compareTo("SI")== 0);
  }
  public static String elabora()
  {
    System.out.println("Quanti soldi hai a disposizione? [V. INTERO]");
    soldi_disponibili = f.leggi_int();
    while(soldi_disponibili <= 0)
    {
      System.out.println("Hai inserito un valore minore o uguale a zero: riprova!");
      soldi_disponibili = f.leggi_int();
    }
    String risp = "NO";
    do
    {
      risp = gioca();
    }
    while(risp.compareTo("SI") == 0);
    System.out.println("------------ PARTITA TERMINATA ------------");
    System.out.println("Vuoi ricominciare una nuova partita?");
    risp = f.leggi_string();
    return risp;
  }
  public static String gioca()
  {
    int tipo_puntata;
    String risp = "";
    System.out.println("Hai a disposizione € "+soldi_disponibili);
    System.out.print(" Quanti vuoi puntarne?");
    puntata = f.leggi_int();
    while((puntata <= 0) || (puntata > soldi_disponibili))
    {
      System.out.println("Hai puntato un importo non valido: riprova! [V. < "+soldi_disponibili+"]");
      puntata = f.leggi_int();
    }
    System.out.println("Su cosa vuoi puntare? [1 => Numeri] [2 => Colori]");
    tipo_puntata = f.leggi_int();
    while((tipo_puntata != 1) && (tipo_puntata != 2) && (tipo_puntata != 3))
    {
      System.out.println("Hai immesso un tipo puntata non disponibile: riprova!");
      tipo_puntata = f.leggi_int();
    }
    if(tipo_puntata == 1)
    {
      risp = punta_numeri();
    }
    else if(tipo_puntata == 2)
    {
      risp = punta_colori();
    }
    return risp;
  }
  public static String punta_numeri()
  {
    int puntato, estratto;
    String risp;
    System.out.println("Su che numero vuoi puntare? [Da 1 a 100]");
    puntato = f.leggi_int();
    while((puntato < 0) || (puntato > 100))
    {
      System.out.println("Hai inserito un numero scorretto: riprova! [Da 1 a 100]");
      puntato = f.leggi_int();
    }
    estratto = (int)(Math.random()*100);
    if(puntato == estratto)
    {
      soldi_disponibili = soldi_disponibili + puntata;
      System.out.println("Hai indovinato! Ora hai a disposizione € "+soldi_disponibili);
    }
    else
    {
      soldi_disponibili = soldi_disponibili - puntata;
      System.out.println("Non hai indovinato! Ora hai a disposizione € "+soldi_disponibili);
    }
    if(soldi_disponibili > 0)
    {
      System.out.println("Vuoi rigiocare continuando la stessa partita?");
      risp = f.leggi_string();
    }
    else
    {
      System.out.println("Hai perso...");
      risp = "NO";
    }
    return risp;
  }
  public static String punta_colori()
  {
    int puntato, estratto;
    String risp;
    System.out.println("Su che colore vuoi puntare? [1 => Rosso] [2=> Nero] [3 => Verde]");
    puntato = f.leggi_int();
    while((puntato < 1) || (puntato > 3))
    {
      System.out.println("Hai inserito un colore scorretto: riprova! [Da 1 a 3]");
      puntato = f.leggi_int();
    }
    estratto = (int)(Math.random()*3);
    if(puntato == estratto)
    {
      soldi_disponibili = soldi_disponibili + puntata;
      System.out.println("Hai indovinato! Ora hai a disposizione € "+soldi_disponibili);
    }
    else
    {
      soldi_disponibili = soldi_disponibili - puntata;
      System.out.println("Non hai indovinato! Ora hai a disposizione € "+soldi_disponibili);
    }
    if(soldi_disponibili > 0)
    {
      System.out.println("Vuoi rigiocare continuando la stessa partita?");
      risp = f.leggi_string();
    }
    else
    {
      System.out.println("Hai perso...");
      risp = "NO";
    }
    return risp;
  }
}
