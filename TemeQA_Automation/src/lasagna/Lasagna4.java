package lasagna;

public class Lasagna4 {
    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        int preparationTime = numberOfLayers * 2;
        return preparationTime + minutesInOven;
    }

    public static void main(String[] args) {
        Lasagna4 lasagna = new Lasagna4();
        int layers = 3;
        int minutesInOven = 20;
        int totalTime = lasagna.totalTimeInMinutes(layers, minutesInOven);
        System.out.println("Timpul total de lucru în minute: " + totalTime + " minute");
    }
}
