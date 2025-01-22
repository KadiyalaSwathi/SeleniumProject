package interface1;

public class Telangana implements FinMinistry,ITMinistry{

    public static void main(String[] args) {

        Telangana obj = new Telangana();
        obj.finBudget();
        obj.finMeetings();
        obj.SEZ();
        obj.incomeTax();
        obj.TechPark();
    }


    @Override
    public void finBudget() {

        System.out.println("Fin Budget method");
    }

    @Override
    public void finMeetings() {
        System.out.println("Fin meetings method");
    }

    @Override
    public void SEZ() {
        System.out.println("SEZ method");
    }

    @Override
    public void incomeTax() {
        System.out.println("income tax method");
    }

    @Override
    public void TechPark() {
        System.out.println("Tech park method");
    }
}
