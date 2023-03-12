public class Dog extends Animal{
    protected String DogColor;
    Dog (String DogColor) {
        this.location = "House";
        this.food = "Meatball";
        this.DogColor = DogColor;
    }
    @Override
    public void MakeNoise() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }
}
