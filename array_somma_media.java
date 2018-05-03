class array_somma_media
{
  public static int vett[] = new int[20];
  public static void main(String args[])
  {
    float media;
    media = 0;
    carica(vett);
    mostra(vett);
    media = calcola(vett);
    System.out.println("La media dei valori dell'array è: "+media);
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
  public static float calcola(int a[])
  {
    int somma, i;
    float media;
    somma = 0;
    for(i = 0; i<20; i++)
    {
      somma = somma + a[i];
    }
    media = (float)(somma / 20);
    return media;
  }
}