package pboif2.pkg10119065.latihan48.kalkulator;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program kalkulator
 *                         dengan objek
 */
public class PBOIF210119065Latihan48Kalkulator {
    
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        
        System.out.print("VALUE 1 = "+kalkulator.getValue1());
        System.out.print("\nVALUE 2 = "+kalkulator.getValue2());
        
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = "+kalkulator.add(kalkulator.getValue1(),kalkulator.getValue2()));
        System.out.println("Result Minus is = "+kalkulator.minus(kalkulator.getValue1(),kalkulator.getValue2()));
        System.out.println("Result Multiple is = "+kalkulator.multiplication(kalkulator.getValue1(),kalkulator.getValue2()));
        System.out.println("Result Division is = "+kalkulator.division(kalkulator.getValue1(),kalkulator.getValue2()));
    }
    
}
