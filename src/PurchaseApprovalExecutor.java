import common.Type;
import handlers.Approver;
import handlers.Manager;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {
    private PurchaseApprovalExecutor() {
    }

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        Scanner s = new Scanner(System.in);
        int id;
        do {
            System.out.println("Enter your ID:");
            while (!s.hasNextInt()) {
                System.err.println("Not correctly entered ID value, please try again!");
                System.out.println("Enter your ID:");
                s.next();
            }
            id = s.nextInt();
        } while (id < 0);

        double cost;
        do {
            System.out.println("Enter the price for new request:");
            while (!s.hasNextDouble()) {
                System.err.println("Not correctly entered money value, please try again!");
                System.out.println("Enter the price for new request:");
                s.next();
            }
            cost = s.nextDouble();
        } while (cost < 0);

        System.out.println("Enter the type of the new request (CONSUMABLES, CLERICAL, GADGETS, GAMING or PC):");
        String type = s.next().toUpperCase();

        manager.approve(id, cost, Type.valueOf(type));


        while (true) {
            System.out.println("\nDo you want to continue (y / n):");
            String answer = s.next().toLowerCase();
            if (answer.equals("y")) {
                execute();
            } else if (answer.equals("n")) {
                s.close();
                break;
            }
        }


/*
//This is your input
           manager.approve(1, 8001, Type.PC);
           manager.approve(2, 4900, Type.PC);
           manager.approve(3, 5000, Type.GAMING);
           manager.approve(4, 3000, Type.CLERICAL);
*/
    }
}