// RICHIEDE IL FILE "f.class"

class ricerca
{
  public static int array[] = new int[50];
  public static int i;
  public static void main(String args[])
  {
    int n;
    System.out.println("Quanti numeri vuoi caricare?");
    n = f.leggi_int();
    while((n <= 0) || (n > 50))
    {
      System.out.println("Valore non corretto");
      n = f.leggi_int();
    }
    carica(n);
    ricerca(n);
  }
  public static void carica(int n)
  {
    for(i = 0; i < n; i++)
    {
      System.out.println("Dimmi il numero in posizione "+i);
      array[i] = f.leggi_int();
    }
  }
  public static void ricerca(int n)
  {
    int valore;
    boolean flag = false;
    System.out.println("Quale numero vuoi cercare?");
    valore = f.leggi_int();
    for(i = 0; i < n; i++)
    {
      if(array[i] == valore)
      {
        flag = true;
      }
    }
    if(flag == true)
    {
      System.out.println("PRESENTE");
    }
    else
    {
      System.out.println("NON PRESENTE");
    }
  }
}
