public class Cat extends Animal{

    protected String Thoroughbred;

    Cat (String Thoroughbred) {
        this.location = "Cat House ";
        this.food = "Whiskas ";
        this.Thoroughbred = Thoroughbred;
    }

    @Override
    public void MakeNoise() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кошка питается");
    }

}
