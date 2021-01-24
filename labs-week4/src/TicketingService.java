import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingService {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String personName = "";
        int counter = 0;
        int youPosition = 1;

        Queue<String> peopleInQueue = new LinkedList<String>();

        personName = scnr.nextLine();
        while (!personName.equals("-1")) {
            // TODO: Add personName to peopleInQueue and
            //       determine position of "You" (youPosition)
            peopleInQueue.add(personName);
            counter = counter + 1;
            personName = scnr.nextLine();
            if (personName.equals("You")) {
                youPosition = counter + 1;
            }
        }

        System.out.println("Welcome to the ticketing service... ");
        System.out.println("You are number " + youPosition + " in the queue.");

        // TODO: In a loop, remove head person from peopleInQueue,
        //       output their name and that they have purchased a ticket,
        //       then output your position in the queue. When you are at
        //       the head, output that you can purchase your ticket.
        while (youPosition != 1) {
            if (!peopleInQueue.peek().equals("You")) {

                System.out.print(peopleInQueue.peek());
                peopleInQueue.remove();
                System.out.println(" has purchased a ticket.");
                System.out.println("You are now number " + (youPosition - 1));
                youPosition = youPosition - 1;
            }
        }
        System.out.println("You can now purchase your ticket!");


    }
}
