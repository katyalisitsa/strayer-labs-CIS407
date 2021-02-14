import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DateParser {
    public static int getMonthAsInt(String monthString) {
        int monthInt;

        // Java switch/case statement
        switch (monthString) {
            case "January":
                monthInt = 01;
                break;
            case "February":
                monthInt = 02;
                break;
            case "March":
                monthInt = 03;
                break;
            case "April":
                monthInt = 04;
                break;
            case "May":
                monthInt = 05;
                break;
            case "June":
                monthInt = 06;
                break;
            case "July":
                monthInt = 07;
                break;
            case "August":
                monthInt = 8;
                break;
            case "September":
                monthInt = 9;
                break;
            case "October":
                monthInt = 10;
                break;
            case "November":
                monthInt = 11;
                break;
            case "December":
                monthInt = 12;
                break;
            default:
                monthInt = 00;
        }

        return monthInt;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String dateInt;
        int monthInt;
        String yearInt;
        String userInput;
        List<String> userInputList = new ArrayList<>();


        // TODO: Read dates from input, parse the dates to find the one
        //       in the correct format, and output in mm/dd/yyyy format

        userInput = scnr.nextLine();
        userInputList.add(userInput);
        while (!userInput.equals("-1")) {
            userInput = scnr.nextLine();
            userInputList.add(userInput);
        }

        for (int i = 0; i < userInputList.size() - 1; i++) {

            if ((userInputList.get(i).contains(" ")) && (userInputList.get(i).contains(","))) {

                String[] validateInput = userInputList.get(i).split(" ");
                monthInt = getMonthAsInt(validateInput[0]);
                dateInt = validateInput[1];
                if (dateInt.contains(",")) {
                    dateInt = dateInt.replace(",", "");
                }

                yearInt = validateInput[2];


                System.out.println(monthInt + "/" + dateInt + "/" + yearInt);

            }
        }

        //System.out.println(userInputList.toString());

    }
}
