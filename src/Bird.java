public class Bird implements  Flying{


    @Override
    public void canfly() {
        System.out.println("Birds fly with wings");
    }

    @Override
    public String toString() {
        return "Bird:";
    }
}
