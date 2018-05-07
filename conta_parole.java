//RICHIEDE IL FILE “f.java”

class conta_parole
{
  public static String[] a = new String[50];
  public static String da_cercare;
  public static int n;
  public static void main(String args[])
  {
    carica_parole();
    cerca_parole(a);
  }
  public static void carica_parole()
  {
    int i;
    System.out.println("Inserisci la prima parola");
    for(i = 0; i < 50; i++)
    {
      if(i > 0)
      {
        System.out.println("Inserisci la parola successiva ([SPAZIO] per uscire)");
      }
      a[i] = f.leggi_string();
      if(a[i].compareTo(" ") == 0)
      {
        n = i;
        i = 49;
      }
    }
  }
  public static void cerca_parole(String a[])
  {
    int i, trovate;
    trovate = 0;
    da_cercare = "";
    System.out.println("Quale parola devo cercare?");
    da_cercare = f.leggi_string();
    i = 0;
    while((i < 50)  && (i <= n))
    {
      if(da_cercare.compareTo(a[i]) == 0)
      {
        trovate = trovate + 1;
        System.out.println("Ho trovato la parola "+da_cercare+" nella posizione "+i+" dell'array!");
      }
      i++;
    }
   if(trovate == 0)
    {
      System.out.println("Non ho trovato la parola "+da_cercare+" nell'array.");
    }
    if(trovate == 1)
    {
      System.out.println("Ho trovato la parola "+da_cercare+" in totale 1 volta.");
    }
    if(trovate > 1)
    {
      System.out.println("Ho trovato la parola "+da_cercare+" in totale "+trovate+" volte.");
    }
  }
}