package entities;

public class Challenge extends Conteudo {

    private Double xp;

    private int difficult;

    public Challenge(String title, String description, int difficult) {
        super(title, description);
        this.difficult = difficult;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(Double xp) {
        this.xp = xp;
    }

    public int getDifficult() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }


    @Override
    public double calculatedXP() {
        return difficult*(xp != null ? xp : super.XP_DEFAULT);
    }
}
