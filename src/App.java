import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        // Console cons = System.console();

        // String activity = cons.readLine("What is your favourite activity?\n");
        // activity = activity.trim().toLowerCase();

        // If/Else method

        // if (activity.equals("swimming")) {
        // System.out.println("Swimming is good for the lungs.");

        // } else if (activity.equals("running")) {
        // System.out.println("Running sweats your body.");

        // } else if (activity.equals("dancing")) {
        // System.out.println("Dancing is fun!");
        // } else {
        // System.out.printf("Great! Keep going! Jiayou in %s!\n", activity);

        // }

        // Switch method

        // switch (activity.trim().toLowerCase()) {
        // case "swimming":
        // System.out.printf("How often do you go %s?\n", activity);
        // break;

        // case "reading":
        // System.out.printf("How many pages you you finished %s in a day?\n",
        // activity);
        // break;

        // default:
        // System.out.printf("Other than %s, do you enjoy doing other
        // activities?\n",activity);
        // }

        // Creating an Array from user input

        // Console console = System.console();

        // String [] shoppingCart = new String[3];

        // for (int i = 0; i < shoppingCart.length;i++) {
        // String items = console.readLine("Enter item %d: ", i+1);
        // shoppingCart[i]=items;
        // }

        // for (int i = 0; i < shoppingCart.length; i++) {
        // System.out.printf("%d. %s\n ",(i+1),shoppingCart[i]);
        // }

        // Creating an Array using List function
        // Method 1

        // List<String> shoppingCart = new ArrayList<>();
        // shoppingCart.add("tomato");
        // shoppingCart.add("veggie");
        // shoppingCart.add("capsicums");

        // List<String> sortedshoppingCart =
        // shoppingCart.stream().sorted().collect(Collectors.toList());
        // {
        // System.out.println(sortedshoppingCart);
        // }

        // Method 2

        // List<String> itemCart = List.of("tomato","veggie","capsicums");

        // List<String> sortedItemCart =
        // itemCart.stream().sorted().collect(Collectors.toList()); {
        // System.out.println(sortedItemCart);
        // }

        // String inputDataList = "fish,prawns,frog,pork,beef,lamb,chicken,snake";
        // Scanner scan = new Scanner(inputDataList).useDelimiter(",");
        // while(scan.hasNext()) {
        // System.out.println(scan.next());
        // }

        // Scanner scanner = new Scanner (System.in);
        // String person = scanner.next();
        // String activity = scanner.nextLine();
        // System.out.println(person + " enjoyed" + activity + "?");

        // Day 1 Workshop- allows a user to add, remove and list the contents of a
        // shopping card.

        // System.out.println("Welcome to your shopping cart!");

        // List <String> shoppingCart = new ArrayList<>();
        // String input = "";

        // Console console = System.console();

        // while (!input.equals("quit")) {
        // input = console.readLine("> ");
        // if (input.equals("list")) {
        // if (shoppingCart.size()>0) {
        // for (int i = 0; i < shoppingCart.size(); i++) {
        // System.out.printf("%d. %s\n", (i+1),shoppingCart.get(i));
        // }
        // } else {
        // System.out.println("Your shopping cart is empty.");
        // }
        // } else if (input.startsWith("add")) {
        // input = input.toLowerCase();
        // input = input.replace(","," ");
        // Scanner scanner = new Scanner(input.substring(4));
        // String entry = "";
        // while (scanner.hasNext()) {
        // entry = scanner.next();
        // shoppingCart.add(entry);
        // System.out.printf("%s added to your shopping cart.\n", entry);

        // }

        // } else if (input.startsWith("delete")) {
        // Scanner scanner = new Scanner(input.substring(6));
        // String value= "";
        // while (scanner.hasNext()){

        // value = scanner.next();
        // int deleteNo= Integer.parseInt(value);
        // deleteNo = deleteNo -1;
        // if (deleteNo < shoppingCart.size()) {
        // shoppingCart.remove(deleteNo);
        // } else {
        // System.out.println("Incorrect item index");
        // }
        // }
        // }
        // } System.out.println("Bye Bye!See you again");

        // Extra Practice - Clothes rack

        System.out.println("Welcome to your wardrobe!");

        List<String> wardrobe = new ArrayList<>();
        String buy = "";

        Console console = System.console();

        while (!buy.equals("quit")) {
            buy = console.readLine("> ");
            if (buy.equals("list")) {
                if (wardrobe.size()>0) {
                    for (int i = 0; i < wardrobe.size(); i++) {
                        System.out.printf("%d. %s\n", (i+1), wardrobe.get(i));
                    }
                } else System.out.println("Your wardrobe is empty.");
            } else if (buy.startsWith("add")) {
                Scanner scanner = new Scanner (buy.substring(4));
                String value = "";

                while (scanner.hasNext()) {
                    value = scanner.next();
                    wardrobe.add(value);
                    System.out.printf("%s has been added.\n", value);
                }



            } else if (buy.startsWith("delete")) {
                Scanner scanner = new Scanner (buy.substring(6));
                String value = "";

                while (scanner.hasNext()) {
                    value = scanner.next();
                    int valued = Integer.parseInt(value);
                    valued = valued-1;
                    if (valued<wardrobe.size()) {
                        wardrobe.remove(valued);
                    } else {
                        System.out.println("Incorrect entry.");
                    }
                }
            }
        } System.out.println("You can add more things to your wardrobe!");
        



    }

}
