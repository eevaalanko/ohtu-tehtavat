package ohtu;

import com.google.gson.Gson;
import org.apache.http.client.fluent.Request;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";

        String bodyText = Request.Get(url).execute().returnContent().asString();

//        System.out.println("json-muotoinen data:");
//        System.out.println(bodyText);

        Gson mapper = new Gson();

        Player[] players = mapper.fromJson(bodyText, Player[].class);

        final List<Player> finnPlayers =
                Arrays.stream(mapper.fromJson(bodyText, Player[].class))
                        .filter(p -> p.getNationality().equals("FIN"))
                        .sorted(Comparator.comparing(Player::getResults).reversed())
                        .collect(Collectors.toList());



/*        System.out.println("Oliot:");
        for (Player player : players) {
            System.out.println(player);
        } */

        System.out.println("Players from FIN " + new Date());
        for (Player player : finnPlayers) {
            System.out.println(player);
        }
    }

}