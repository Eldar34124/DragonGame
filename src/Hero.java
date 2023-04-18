public class Hero implements BitAble {

    private int Hp;
    private int sila;
    private int points;
    private int orujyia;
    private int shit;

    public Hero(int hp, int sila, int points, int orujyia, int shit) {
        Hp = hp;
        sila = sila;
        this.points = points;
        this.orujyia = orujyia;
        this.shit = shit;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getOrujyia() {
        return orujyia;
    }

    public void setOrujyia(int orujyia) {
        this.orujyia = orujyia;
    }

    public int getShit() {
        return shit;
    }

    public void setShit(int shit) {
        this.shit = shit;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "Hp=" + Hp +
                ", Health=" + sila +
                ", points=" + points +
                ", orujyia=" + orujyia +
                ", shit=" + shit +
                '}';
    }



    @Override
    public int bitDragonToHero(Dragon dragon) {
            this.Hp=this.Hp-dragon.getSila();

        return this.Hp;
    }
}
