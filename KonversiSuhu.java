package konversisuhu;
import java.util.*;

public class KonversiSuhu {
    static double SuhuAwal;
    static char Awal;
    
    public static void main(String[] args) {
        Celcius fromCelcius = new Celcius();
        Fahrenheit fromFahrenheit = new Fahrenheit();
        Reamur fromReamur = new Reamur();
        Kelvin fromKelvin = new Kelvin();
       
        double Fahrenheit, Kelvin,Celcius,Reamur;
        boolean valid=false;
        Scanner input = new Scanner(System.in);
       
        while(valid!=true)
        {
            System.out.println("Program Konversi Suhu");
            System.out.print("Masukkan nilai suhu awal dan satuannya (C/F/R/K) = ");
            SuhuAwal=input.nextDouble();
            Awal = input.next().charAt(0);
 
            switch(Awal){
                case 'C':
                    Reamur = fromCelcius.toReamur();
                    Fahrenheit = fromCelcius.toFahrenheit();
                    Kelvin = fromCelcius.toKelvin();
                    System.out.println("Suhu awal : "+SuhuAwal+" Celcius");
                    System.out.println("\nHasil,");
                    System.out.println("Fahrenheit : "+Fahrenheit);
                    System.out.println("Kelvin : "+Kelvin);
                    System.out.println("Reamur : "+Reamur);
                    valid=true;
                    break;
                case 'F':
                    Celcius = fromFahrenheit.toCelcius();
                    Reamur = fromFahrenheit.toReamur();
                    Kelvin = fromFahrenheit.toKelvin();
                    System.out.println("Suhu awal : "+SuhuAwal+" Fahrenheit");
                    System.out.println("\nHasil,");
                    System.out.println("Celcius : "+Celcius);
                    System.out.println("Kelvin : "+Kelvin);
                    System.out.println("Reamur : "+Reamur);
                    valid=true;
                    break;
                case 'K':
                    Celcius = fromKelvin.toCelcius();
                    Reamur = fromKelvin.toReamur();
                    Fahrenheit = fromKelvin.toFahrenheit();
                    System.out.println("Suhu awal : "+SuhuAwal+" Kelvin");
                    System.out.println("\nHasil,");
                    System.out.println("Celcius : "+Celcius);
                    System.out.println("Fahrenheit : "+Fahrenheit);
                    System.out.println("Reamur : "+Reamur);
                    valid=true;
                    break;
                case 'R':
                    Celcius = fromReamur.toCelcius();
                    Fahrenheit = fromReamur.toFahrenheit();
                    Kelvin = fromReamur.toKelvin();
                    System.out.println("Suhu awal : "+SuhuAwal+" Reamur");
                    System.out.println("\nHasil,");
                    System.out.println("Celcius : "+Celcius);
                    System.out.println("Fahrenheit : "+Fahrenheit);
                    System.out.println("Kelvin : "+Kelvin);
                    valid=true;
                    break;
                default :
                    System.out.println("Masukkan suhu secara benar [C,F,K,R]");
}   }   }   }
