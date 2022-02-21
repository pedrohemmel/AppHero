package br.com.local.apphero;

public class Hero {
    private int id;
    private String name, realName;
    private int rating;
    private String teamaffiliation;

    public Hero(int id, String name, String realName, int rating, String teamaffiliation) {
        this.id = id;
        this.name = name;
        this.realName = realName;
        this.rating = rating;
        this.teamaffiliation = teamaffiliation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTeamaffiliation() {
        return teamaffiliation;
    }

    public void setTeamaffiliation(String teamaffiliation) {
        this.teamaffiliation = teamaffiliation;
    }
}
