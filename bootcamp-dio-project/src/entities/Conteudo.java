package entities;

import java.util.Objects;

public abstract class Conteudo {

    protected static double XP_DEFAULT = 10d;

    private String title;
    private String description;

    public Conteudo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract double calculatedXP();

    public static double getXpDefault() {
        return XP_DEFAULT;
    }

    public static void setXpDefault(double xpDefault) {
        XP_DEFAULT = xpDefault;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conteudo conteudo = (Conteudo) o;
        return Objects.equals(title, conteudo.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Conteudo:{ \n" +
                "\t title='" + title + '\''+ "\n" +
                "\t  description='" + description + "\n" +
                '}';
    }

    public void setXp(Double x){};
}
