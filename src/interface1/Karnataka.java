package interface1;

public class Karnataka extends Telangana implements FinMinistry,ITMinistry {

    public static void main(String[] args) {

        Karnataka kar = new Karnataka();
        kar.finBudget();
        kar.finMeetings();
        kar.SEZ();
        kar.incomeTax();
        kar.TechPark();
    }

}
