package lasagna;

public class Lasagna3 {
    public int preparationTimeInMinutes(int numberOfLayers) {
        // Presupunem că fiecare strat necesită 2 minute de preparare
        return numberOfLayers * 2;
    }

    public static void main(String[] args) {
        Lasagna3 lasagna = new Lasagna3();
        int layers = 2;
        int preparationTime = lasagna.preparationTimeInMinutes(layers);
        System.out.println("Timpul de pregătire în minute: " + preparationTime + " minute");
    }
}
