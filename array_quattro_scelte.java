class array_quattro_scelte
{
  public static String parole[]=new String[50];
  public static int i;
  public static void main(String args[])
  {
    String risp;
    int scelta, n;
    do
    {
      risp="";
      scelta=0;
      n=carica();
      do
      {
       if((scelta!=1)&&(scelta!=2)&&(scelta!=3)&&(scelta!=4)&&(scelta!=0))
       {
         System.out.println("Sei pregato di scegliere una delle scelte proposte");
       }
      System.out.println("Cosa vuoi visualizzare?\n 1_cercare una parola \n 2_visualizzare la sua posizione nell'array\n 3_ordinare in ordine crescente \n 4_ordine decrescente");
      scelta=f.leggi_int();
      }
      while((scelta!=1)&&(scelta!=2)&&(scelta!=3)&&(scelta!=4));
      
      if((scelta==1)||(scelta==2))
      {
        cerca(n,scelta);
      }
      if((scelta==3)||(scelta==4))
      {
        if(scelta==3)
        {
          ordina1(n);
        }
        else
        {
          ordina2(n);
        }
        for(i=0;i<n;i++)
        {
        System.out.println("Nella posizione "+(i+1)+" è presente la parola "+parole[i]);
        }
      }
      do
      {
        if((risp.compareTo("si")!=0)&&(risp.compareTo("no")!=0)&&(risp.compareTo("")!=0))
        {
          System.out.println("Sei pregato di inserire si o no");
        }
      System.out.println("Vuoi rielaborare?");
      risp=f.leggi_string();
      }
      while((risp.compareTo("si")!=0)&&(risp.compareTo("no")!=0));
    }
    while(risp.compareTo("si")==0);
  }
  public static int carica()
  {
    i=0;
    System.out.println("Dimmi la prima parola");
    parole[i]=f.leggi_string();
    while((parole[i].compareTo("*")!=0)&&(i<50))
    {
      i++;
      System.out.println("Dimmi un'altra parola");
      parole[i]=f.leggi_string();
    }
    return i;
  }
  public static void cerca(int n, int scelta)
  {
    String p;
    int c=0;
    boolean flag=false;
    System.out.println("Dimmi la parola da cercare");
    p=f.leggi_string();
    for(i=0; i<n; i++)
    {
      if(parole[i].compareTo(p)==0)
      {
        flag=true;
        c=i;
      }
    }
    if(scelta==2)
    {
      if(flag==false)
      {
        System.out.println("La parola "+p+" non è presente");
      }
      else
      {
      System.out.println("la parola "+p+" è presente nella posizione "+(c+1));
      }
    }
    else
    {
      if(flag==false)
      {
        System.out.println("La parola "+p+" non è presente");
      }
      else
      {
      System.out.println("La parola "+p+" è presente");
      }
    }
  }
  public static void ordina1(int n)
  {
    int j; 
    String h;
    for(i=0; i<n; i++)
    {
      for(j=i+1; j<n; j++)
      {
        if(parole[j].compareTo(parole[i])<0)
        {
          h=parole[i];
          parole[i]=parole[j];
          parole[j]=h;
        }
      }
    }
  }
  public static void ordina2(int n)
  {
    boolean flag;
    String c;
    do
    {
      flag=false;
      for(i=0; i<(n-1); i++)
      {
        if(parole[i].compareTo(parole[i+1])<0)
        {
          c=parole[i];
          parole[i]=parole[i+1];
          parole[i+1]=c;
          flag=true;
        }
      }
    }
    while(flag==true);
  }
}
