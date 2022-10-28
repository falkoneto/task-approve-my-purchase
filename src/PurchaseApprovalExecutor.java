import common.Type;
import handlers.Approver;
import handlers.Manager;

import java.util.Scanner;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the price for new device:");
        double cost = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the type of the new device ( only with capital letters ):");
        String type = scanner.nextLine();

        manager.approve(id, cost, Type.valueOf(type));




        //manager.approve(1, 8001, Type.PC);
        //manager.approve(2, 4900, Type.PC);
        //manager.approve(3, 5000, Type.GAMING);
        //manager.approve(4, 3000, Type.CLERICAL);
    }
}
