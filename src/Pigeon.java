// Task 3
public class Pigeon extends Bird implements Walking, Running{

    @Override
    public void fly() {
        System.out.println("Лети, птица");
    }

    public static void main(String[] args) {
        Pigeon someBird = new Pigeon();
        someBird.setAge(10);
        System.out.println(someBird.getAge());
    }

    @Override
    public void run() {
        System.out.println("Птица умеет бегать");
    }

    @Override
    public void walk() {
        System.out.println("Птица умеет ходить");
    }
}
