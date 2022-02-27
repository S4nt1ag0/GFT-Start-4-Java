package entities;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate localDate;

    private int workload = 0;

    public Mentoria(String title, String description, LocalDate localDate, int workload) {
        super(title, description);
        this.localDate = localDate;
        this.workload = workload;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public double calculatedXP() {
        return workload * super.XP_DEFAULT;
    }
}
