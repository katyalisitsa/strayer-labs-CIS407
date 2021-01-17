import java.util.Scanner;

public class MileageTrackerLinkedList {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // References for MileageTrackerNode objects
        MileageTrackerNode headNode;
        MileageTrackerNode currNode;
        MileageTrackerNode lastNode;

        double miles;
        String date;
        int i;
        int numberOfNodes;

        // Front of nodes list
        headNode = new MileageTrackerNode();
        lastNode = headNode;

        // TODO: Scan the number of nodes

        numberOfNodes = scnr.nextInt();

        // TODO: for the scanned number of nodes, scan
        //       in data and insert into the linked list

        for (i = 0; i < numberOfNodes; ++i) {
            miles = scnr.nextDouble(); scnr.nextLine();
            date = scnr.nextLine();
            currNode = new MileageTrackerNode(miles, date);
            lastNode.insertAfter(currNode);
            lastNode = currNode;
            currNode.printNodeData();

        }


    }
}