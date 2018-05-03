import java.io.*;

class perimetro_area {
  public static void main(String args[]){
    String x;
    int base, altezza, area, perimetro;
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    System.out.println("Inserisci il valore intero della base");
    try{
      x = tastiera.readLine();
    }
    catch (Exception e){
      x = "";
    }
    base = Integer.valueOf(x).intValue();
        System.out.println("Inserisci il valore intero dell'altezza");
    try{
      x = tastiera.readLine();
    }
    catch (Exception e){
      x = "";
    }
    altezza = Integer.valueOf(x).intValue();
    area = base*altezza;
    perimetro = base*2+altezza*2;
    System.out.println("Il perimetro misurerà "+perimetro+" e l'area misurerà "+area);
  }
}