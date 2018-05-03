class array_carica_visualizza
{
  public static int vett[] = new int[20];
  public static void main(String args[])
  {
    carica(vett);
    mostra(vett);
  }
  public static void carica(int a[])
  {
    int i;
    for(i = 0; i < 20; i++)
    {
      a[i] = (int)(Math.random() * 100);
    }
  }
  public static void mostra(int a[])
  {
    int i;
    System.out.println("I valori registrati nell'array sono:");
    for(i = 0; i < 20; i++)
    {
      System.out.println(a[i]);
    }
  }
}