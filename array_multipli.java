//RICHIEDE IL FILE “f.java”

class array_multipli
{
  public static int[] a = new int[20];
  public static boolean trovato = false;
  public static void main(String args[])
  {
    carica(a);
    int search;
    System.out.println("Inserisci valore da elaborare");
    search = f.leggi_int();
    cerca(search, a);
    if(trovato == false)
    {
      System.out.println("Nessun valore trovato");
    }
  }
  public static void carica(int a[])
  {
    int i = 0;
    for(i = 0; i<20; i++)
    {
      a[i] = (int)(Math.random() * 100);
    }
  }
  public static boolean cerca(int n, int array[])
  {
    int i, r, numero_multipli;
    numero_multipli = 0;
    for(i = 0; i<20; i++)
    {
      r = array[i] % n;
      if(r == 0)
      {
        numero_multipli = numero_multipli + 1;
        trovato = true;
      }
    }
    if(trovato == true)
    {
      System.out.println("I multipli sono "+ numero_multipli);
    }
    return trovato;
  }
}