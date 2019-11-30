
package statistics.matcher;

import statistics.Player;

public class Not implements Matcher {
    private String player;
    public Not(String player) {
        this.player = player;

    }

    @Override
    public boolean matches(Player p) {
        return !p.getName().equals(player);
    }

}
