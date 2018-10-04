/* Costruire un array che contenga i soli numeri pari di una sequenza di 50 casuali
 * calcolare poi la media e procedere alla sua visualizzazione */
 
 // Richiede il file "f.class"

class pari_casuali
{
  public static int[] casuali_pari = new int [50];
  public static void main(String args[])
  {
    int i = 0, num, c = 0, s = 0;
    float m;
    while(c < 50)
    {
      num = (int)(Math.random()*1000);
      if((num % 2) == 0)
      {
        casuali_pari[i] = num;
        i++;
      }
      c++;
    }
    c = 0;
    while(c < i)
    {
      s = s + casuali_pari[c];
      c++;
    }
    m = (float)(s / i);
    System.out.println("La media dei pari è "+m);
  }
}
