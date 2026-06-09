import java.util.LinkedList;

public class TrainReservation {

    public static void main(String[] args) {

        LinkedList<String> waitingList = new LinkedList<>();

        waitingList.add("Arun");
        waitingList.add("Divya");
        waitingList.add("Kavin");

        System.out.println("First Passenger Gets Seat:");

        String passenger = waitingList.removeFirst();

        System.out.println(passenger + " Seat Confirmed");

        System.out.println("Remaining Waiting List:");
        System.out.println(waitingList);
    }
}