package statistics.matcher;


import java.util.ArrayList;

public class QueryBuilder {

    private Matcher matcher;
    private And and;
    private ArrayList<Matcher>matchers = new ArrayList<>();


    public QueryBuilder () {
        this.matcher = new All();
    }

    public QueryBuilder playsIn(String team) {
        Matcher uusi = new PlaysIn(team);
        this.matchers.add(uusi);
        return this;

    }

    public QueryBuilder hasAtLeast(int value, String category) {
        Matcher uusi = new HasAtLeast(value, category);
        this.matchers.add(uusi);
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String category) {
        Matcher uusi  = new HasFewerThan(value, category);
        this.matchers.add(uusi);
        return this;
    }

    public QueryBuilder not(String player) {

        Matcher uusi = new Not(player);
        this.matchers.add(uusi);
        return this;
    }

    public Matcher build() {
        Matcher[] matchers = this.matchers.toArray(new Matcher[0]);
        return new And( matchers);
    }
}
