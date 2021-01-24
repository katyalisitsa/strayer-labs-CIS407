import java.util.Scanner;

public class ShoppingList {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);

        ItemNode headNode;  // Create intNode objects
        ItemNode currNode;
        ItemNode lastNode;
        ItemNode tmpNode;

        String item;
        int i;

        // Front of nodes list
        headNode = new ItemNode();
        lastNode = headNode;

        int input = scnr.nextInt();

        for(i = 0; i < input; i++ ){
            item = scnr.next();
            currNode = new ItemNode(item);
            lastNode.insertAfter(currNode);
            lastNode = currNode;
        }

        // Insert an item to the end of the list
        item = scnr.next();
        tmpNode = new ItemNode(item);
        tmpNode.insertAtEnd(headNode, tmpNode);


        // Print linked list
        currNode = headNode.getNext();
        while (currNode != null) {
            currNode.printNodeData();
            currNode = currNode.getNext();
        }
    }
}