//RICHIEDE IL FILE “f.java”

class arraydiparole
{
  public static String[] parole= new String[50];
  public static int i;
  public static void main(String args[])
  {
    String r;
    do
    {
      r=elabora();
    }
    while(r.compareTo("si")==0);
  }
  public static String elabora()
  {
    int n;
    n=carica();
    String r;
    do
    {
      r=cerca(n);
    }
    while(r.compareTo("si")==0);
    ordina(n);
    ordina2(n);
    System.out.println("Vuoi rielaborare?");
    r=f.leggi_string();
    return r;
  }
  public static int carica()
  {
    i=0;
    System.out.println("Inserisci la prima parola");
    parole[i]=f.leggi_string();
    while((i<50)&&(parole[i].compareTo("*")!=0))
    {
      i++;
      System.out.println("dimmi un'altra parola");
      parole[i]=f.leggi_string();
    }
    return i;
  }
  public static String cerca(int n)
  {
    String p, r;
    boolean flag=false;
    System.out.println("dimmi la parola che vuoi cercare");
    p=f.leggi_string();
    for(i=0; i<n; i++)
    {
      if(p.compareTo(parole[i])==0)
      {
        System.out.println("la parola "+p+" è presente nella posizione "+(i+1));
        flag=true;
      }
    }
    if(flag==false)
    {
      System.out.println("La parola non è presente");
    }
    System.out.println("Vuoi fare un altra ricerca?");
    r=f.leggi_string();
    return r;
  }
  public static void ordina(int n)
  {
    int j;
    String help;
    for(i=0; i<n; i++)
    {
      for(j=i+i; j<n; j++)
      {
        if(parole[i].compareTo(parole[j])>0)
        {
          help=parole[i];
          parole[i]=parole[j];
          parole[j]=help;
        }
      }
    }
    System.out.println("Elenco delle parole ordinato in maniera crescente");
    for(i=0; i<n; i++)
    {
      System.out.println(parole[i]);
    }
  }
    public static void ordina2(int n)
  {
    boolean flag=false;
    String help;
    while(flag==true)
    {
      flag=false;
    for(i=0; i<n; i++)
    {
        if(parole[i].compareTo(parole[i+1])>0)
        {
          help=parole[i];
          parole[i]=parole[i+1];
          parole[i+1]=help;
          flag=true;
        }
    }
    System.out.println("Elenco delle parole ordinato in maniera decrescente");
    for(i=0; i<n; i++)
    {
      System.out.println(parole[i]);
    }
  }
}
}