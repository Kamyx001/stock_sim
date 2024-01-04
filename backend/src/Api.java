import java.net.URI;
import java.net.http.HttpRequest;
public class Api {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public int getPrice(String item) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jokes-by-api-ninjas.p.rapidapi.com/v1/jokes"))
                .header("X-RapidAPI-Host", "jokes-by-api-ninjas.p.rapidapi.com")
                .header("X-RapidAPI-Key", "your-rapidapi-key")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        return 0;

    }

    public void setPrice(int price) {

    }
}
