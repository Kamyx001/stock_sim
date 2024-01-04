import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class Company {
    public Company() {
    }
    //int a,b,c,d,e;
    //int a = ThreadLocalRandom.nextInt(10);

    Random rand = new Random();
    float min = 5.0f;
    float max = 10.0f;

    float a = min + rand.nextFloat() * (max - min);
    float b = min + rand.nextFloat() * (max - min);
    float c = min + rand.nextFloat() * (max - min);
    float d = min + rand.nextFloat() * (max - min);
    float e = min + rand.nextFloat() * (max - min);
    //float c =Math.pow(2,5);




    public double getprice(double x ){
        double price;
        price=a*Math.pow(x,5)+b*Math.pow(x,4)+c*Math.pow(x,3)+d*Math.pow(x,2)+e;


        return price;
    }





}
