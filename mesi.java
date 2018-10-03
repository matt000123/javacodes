//Richiede il file "f.class"

class mesi
{
  public static void main(String args[])
  {
    int[] numero_giorni = new int[12];
    String[] nomi = new String[12];
    int cerca;
    String risp = "";
    numero_giorni[0] = 31;
    numero_giorni[1] = 28;
    numero_giorni[2] = 31;
    numero_giorni[3] = 30;
    numero_giorni[4] = 31;
    numero_giorni[5] = 30;
    numero_giorni[6] = 31;
    numero_giorni[7] = 31;
    numero_giorni[8] = 30;
    numero_giorni[9] = 31;
    numero_giorni[10] = 30;
    numero_giorni[11] = 31;
    nomi[0] = "Gennaio";
    nomi[1] = "Febbraio";
    nomi[2] = "Marzo";
    nomi[3] = "Aprile";
    nomi[4] = "Maggio";
    nomi[5] = "Giugno";
    nomi[6] = "Luglio";
    nomi[7] = "Agosto";
    nomi[8] = "Settembre";
    nomi[9] = "Ottobre";
    nomi[10] = "Novembre";
    nomi[11] = "Dicembre";
    do
    {
      System.out.println("Digita il numero del mese");
      cerca = f.leggi_int();
      cerca = cerca - 1;
      System.out.println("Hai cercato il mese di "+nomi[cerca]+" che conta "+numero_giorni[cerca]+" giorni");
      System.out.println("Vuoi cercare un altro mese? [si o no]");
      risp = f.leggi_string();
    }
    while(risp.compareTo("si") == 0);
  }
}
