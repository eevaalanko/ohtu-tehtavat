package ohtuesimerkki;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StatisticsTest {

    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri", "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    Statistics stats;

    @Before
    public void setUp() {
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }

    @Test
    public void playerIsSearched() {
        assertEquals(readerStub.getPlayers().get(0).getName(), stats.search("Semenko").getName());
        assertNull(stats.search("Diibadaaba"));

    }

    @Test
    public void teamInfoReturnedCorrectly() {
        assertEquals(3, stats.team("EDM").toArray().length);
        assertEquals("Semenko", stats.team("EDM").get(0).getName());
    }

    @Test
    public void bestPlayersReturned() {
        assertEquals("Gretzky", stats.topScorers(1).get(0).getName());
    }

}
