package entities;

import java.time.LocalDate;

public class Curso extends Conteudo{

        private Double xp;

        private int workload = 0;

        public Curso(String title, String description, int workload) {
            super(title, description);
            this.workload = workload;
        }

        public double getXp() {
            return xp;
        }

        public void setXp(double xp) {
            this.xp = xp;
        }

        public int getWorkload() {
            return workload;
        }

        public void setWorkload(int workload) {
            this.workload = workload;
        }

        @Override
        public double calculatedXP() {
            return workload * (xp != null ? xp : super.XP_DEFAULT);
        }

}
