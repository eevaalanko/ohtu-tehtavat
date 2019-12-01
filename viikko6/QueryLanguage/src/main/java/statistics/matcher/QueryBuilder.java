package statistics.matcher;


import java.util.ArrayList;

public class QueryBuilder {

    private ArrayList<Matcher>matchers = new ArrayList<>();


    public QueryBuilder () {
        this.matchers.add(new All());
    }

    public QueryBuilder playsIn(String team) {
        this.matchers.add(new PlaysIn(team));
        return this;

    }

    public QueryBuilder hasAtLeast(int value, String category) {
        this.matchers.add(new HasAtLeast(value, category));
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String category) {
        this.matchers.add(new HasFewerThan(value, category));
        return this;
    }

    public QueryBuilder not(String player) {
        this.matchers.add(new Not(player));
        return this;
    }

    public Matcher build() {
        Matcher[] matchers = this.matchers.toArray(new Matcher[0]);
        return new And( matchers);
    }
}
