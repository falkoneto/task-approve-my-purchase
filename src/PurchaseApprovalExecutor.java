import common.Type;
import handlers.Approver;
import handlers.Manager;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        manager.approve(1, 8001, Type.PC);
        manager.approve(2, 4900, Type.PC);
        manager.approve(3, 5000, Type.GAMING);
        manager.approve(4, 3000, Type.CLERICAL);
    }
}
