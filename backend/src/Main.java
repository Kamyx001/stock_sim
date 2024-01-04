import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginPage loginPage = new LoginPage("Login Page");
            loginPage.init();
            /*
            Company company =new Company();
            System.out.println(company.getprice(0.11));
            System.out.println(company.getprice(0.12));
            System.out.println(company.getprice(0.13));

             */



            double initialPrice = 100.0; // Example initial price
            double drift = 0.05; // Example average return (5%)
            double volatility = 0.2; // Example volatility (20%)
            int timeSteps = 24; // Number of days in the simulation
            double timeInterval = 1.0 / 24; // Time interval in years (daily)
            Firma firma=new Firma(initialPrice, drift, volatility, timeSteps, timeInterval);
            double[] prices = new double[timeSteps];
            prices=firma.simulateGBM(initialPrice, drift, volatility, timeSteps, timeInterval);

            for (int i=0;i<timeSteps;i++){

                System.out.println("time :"+i+" :"+prices[i]);
            }


            //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa



        });

    }
}