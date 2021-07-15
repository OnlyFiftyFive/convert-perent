public class convert {
    public static void main(String[] args) {
        System.out.println(" У тебя " + convertEurToUsd() + " долларов!");
        System.out.println("А могло быть " + convertEurToRub() + "рублей!");

    }

    public static double convertEurToUsd() {
        double exchangeRate = 1.18c;
        int eur = 125;
        double x = eur * exchangeRate;
        return x;
    }

    public static double convertEurToRub() {
        double exchangeRite = 87.79;
        int eur = 125;
        double y = eur * exchangeRite;
        return y;
    }
}
