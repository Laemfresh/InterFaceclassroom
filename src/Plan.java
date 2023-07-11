public class Plan implements Flying {

    @Override
    public void canfly() {
        System.out.println("Airplans also  fly with wings ");
    }

    @Override
    public String toString() {
        return "Plan:";
    }
}
