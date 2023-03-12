public class Animal {
    protected String food; // в пределах все наследников
    protected String location;
    public void MakeNoise() {
        System.out.println("Животное говорит");
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public void sleep() {
        System.out.println("Животное спит");
    }
}
