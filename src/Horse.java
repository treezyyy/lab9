public class Horse extends Animal{

    protected String Race;

    Horse (String Race) {
        this.location = "stable";
        this.food = "carrot";
        this.Race = Race;
    }

    @Override
    public void MakeNoise() {
        System.out.println("Лошадь гагочет");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь питается");
    }

}
