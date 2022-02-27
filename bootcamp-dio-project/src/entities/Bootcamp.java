package entities;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate initalDate = LocalDate.now();
    private final LocalDate finishDate = initalDate.plusDays(50);

    private Set<Dev> devs = new LinkedHashSet<>();
    private Set<Conteudo> contents = new LinkedHashSet<>();

    public Bootcamp(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }

    public Set<Conteudo> getContents() {
        return contents;
    }

    public void setContents(Set<Conteudo> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return  "{ \n"+
                "\t description='" + description + '\'' + "\n" +
                "\t initalDate=" + initalDate + "\n" +
                "\t finishDate=" + finishDate + "\n" +
                "\t contents=" + contents +"} \n";
    }
}
