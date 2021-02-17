//import org.json.JSONObject;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.*;
//import org.json.*;

public class Recipes {

    public static void getRecipes(){
        try{
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/extract?url=http%3A%2F%2Fwww.melskitchencafe.com%2Fthe-best-fudgy-brownies%2F"))
                    .header("x-rapidapi-key", "edc2c05de3msh67b6ff4cf06ae0bp188e58jsn0bd9d44ab211")
                    .header("x-rapidapi-host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return;
        }
    }
}
