package lasagna;

public class Lasagna2 {
    public static final int MINUTE_AST_EXPECTATE = 40;

    public int minuteRamanenteInCuptor(int minuteActuale) {
        int minuteRamase = MINUTE_AST_EXPECTATE - minuteActuale;
        return minuteRamase;
    }

    public static void main(String[] args) {
        Lasagna2 lasagna = new Lasagna2();
        int minuteActuale = 30;
        int minuteRamase = lasagna.minuteRamanenteInCuptor(minuteActuale);
        System.out.println("Minutele ramase in cuptor: " + minuteRamase + " minute");
    }
}
