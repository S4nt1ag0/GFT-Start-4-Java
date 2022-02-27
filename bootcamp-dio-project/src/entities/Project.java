package entities;

public class Project extends Conteudo{

    private Double xp;

    private String link;

    public Project(String title, String description, String link) {
        super(title, description);
        this.link = link;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(Double xp) {
        this.xp = xp;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public double calculatedXP() {
        return (xp != null ? xp : super.XP_DEFAULT);
    }

}
