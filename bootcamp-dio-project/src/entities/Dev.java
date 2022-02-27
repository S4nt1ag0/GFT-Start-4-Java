package entities;

import java.util.*;

public class Dev {
    private String name;
    private int Level = 0;
    private Map<String,Bootcamp> bootcamps =  new HashMap<>();
    private Set<Conteudo> contentsFinished = new LinkedHashSet<>();

    public Dev(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return Level;
    }

    public Map<String,Bootcamp> getBootcamps() {
        return bootcamps;
    }

    public Set<Conteudo> getContentsFinished() {
        return contentsFinished;
    }

    public void registerBootcamp(Bootcamp bootcamp){
        bootcamp.getDevs().add(this);
        this.bootcamps.put(bootcamp.getName(),bootcamp);

    }

    public void progress(Bootcamp bootcamp){
        if(bootcamp != null && this.bootcamps.containsKey(bootcamp.getName())){
            Optional<Conteudo> contentActual = this.bootcamps.get(bootcamp.getName()).getContents().stream().findFirst();
            if(contentActual != null){
            this.contentsFinished.add(contentActual.get());
            this.bootcamps.get(bootcamp.getName()).getContents().remove(contentActual.get());
            this.loadXp();
            }else{
                System.out.println("Invalid bootcamp");
            }
        }else{
            System.out.println("Invalid bootcamp");
        }
    }

    private void loadXp() {
        Double amountXp = this.contentsFinished.stream().mapToDouble(Conteudo::calculatedXP).sum();

        int quotient = 0;
        int level = 0;
        do{
            amountXp = amountXp/(100-10*quotient);

            if(amountXp > 1 ){
                quotient++;
                level++;
            }else{
                quotient = 0;
            }

        } while(quotient != 0);

        this.Level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + "\n" +
                "\t Level=" + Level + "\n" +
                "\t bootcamps= [" + bootcamps + "]"+"\n" +
                "\t contentsFinished=" + contentsFinished;
    }
}

