import java.util.Random;

public class Firma {
        double initialPrice = 100.0; // Example initial price
        double drift = 0.05; // Example average return (5%)
        double volatility = 0.2; // Example volatility (20%)
        int timeSteps = 24; // Number of days in the simulation
        double timeInterval = 1.0 / 24; // Time interval in years (daily)

    public Firma() {

    }

    public static double[] simulateGBM(double S0, double mu, double sigma, int steps, double dt) {
        Random random = new Random();
        double[] prices = new double[steps];
        prices[0] = S0;

        for (int i = 1; i < steps; i++) {
            double normalRandom = random.nextGaussian();
            double driftComponent = (mu - 0.5 * Math.pow(sigma, 2)) * dt;
            double diffusionComponent = sigma * Math.sqrt(dt) * normalRandom;
            prices[i] = prices[i - 1] * Math.exp(driftComponent + diffusionComponent);
        }

        return prices;
    }
}
