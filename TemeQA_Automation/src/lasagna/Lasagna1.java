package lasagna;

public class Lasagna1 {
    public int minuteAsteptateInCuptor() {
        return 40;
    }

    public static void main(String[] args) {
        Lasagna1 lasagna = new Lasagna1();
        int minuteAsteptate = lasagna.minuteAsteptateInCuptor();
        System.out.println("Timpul așteptat în cuptor: " + minuteAsteptate + " minute");
    }
}
