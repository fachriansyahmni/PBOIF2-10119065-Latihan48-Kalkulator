package pboif2.pkg10119065.latihan48.kalkulator;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program kalkulator
 *                         dengan objek
 */
public class Kalkulator {
    private double value1, value2;
    
    public double getValue1()
    {
        return value1;
    }
    public double getValue2()
    {
        return value2;
    }
    public void setValue1(double value1)
    {
        this.value1 = value1;
    }
    public void setValue2(double value2)
    {
        this.value2 = value2;
    }
    public void setNameProject()
    {
        System.out.println("\nProject Calculator");
    }
    public void setNoteProject(String note)
    {
        System.out.println(note);
    }
    public double add(double val1,double val2)
    {
        return val1 + val2;
    }
    public double minus(double val1,double val2)
    {
        return val1 - val2;
    }
    public double multiplication(double val1,double val2)
    {
        return val1 * val2;
    }
    public double division(double val1,double val2)
    {
        return val1 / val2;
    }
}
