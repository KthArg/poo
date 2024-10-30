import Models.Character;
import Enums.Gender;
import Enums.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class Main {
    public static Character mapCharacter(JSONObject o) {
        int id = o.getInt("id");
        String name = o.getString("name");
        Status status = o.getEnum(Status.class, "status");
        Gender gender = o.getEnum(Gender.class, "gender");
        JSONArray eList = (JSONArray) o.get("episode");
        ArrayList<String> episodes = new ArrayList<>();
        for (int i = 0; i < eList.length(); i++) {
            episodes.add(eList.getString(i));
        }
        return new Character(id, name, status, gender, episodes);
    }

    public static void main(String[] args) {
        String url = "https://rickandmortyapi.com/api/character";
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject responseBody = new JSONObject(response.body());
            JSONArray resultsList = (JSONArray) responseBody.get("results");
            ArrayList<Character> characterList = new ArrayList<>();
            for (int i = 0; i < resultsList.length(); i++) {
                JSONObject character = (JSONObject) resultsList.get(i);
                characterList.add(mapCharacter(character));
            }

            for (Character c : characterList) {
                System.out.println(c.getName() + ' ' + c.getStatus());
                System.out.println("Episodes: " + c.getEpisodes().toArray().length);
            }

            System.out.println(characterList.toArray().length);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}