package handlers;

import common.Type;

/**
 * Used as a fallback in approval chain.
 * Should not contain any additional logic.
 * If abstract methods are changed, be free to edit signatures.
 */
public class ExecutiveMeeting extends Approver {
    private static final ExecutiveMeeting INSTANCE = new ExecutiveMeeting();

    public static ExecutiveMeeting getInstance() {
        return INSTANCE;
    }

    @Override
    public void approve(int id, double cost, Type type) {

        System.out.println("Purchase with id " + id + " that costs " + cost + " requires an approval of executive meeting.");
    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
//        boolean result = false;
//
//        if (type == Type.CONSUMABLES && cost > 1000) {
//            result = true;
//
//        } else if (type == Type.CLERICAL && cost > 2000) {
//            result = true;
//
//        } else if (type == Type.GADGETS && cost > 3000) {
//            result = true;
//
//        } else if (type == Type.GAMING && cost > 5000) {
//            result = true;
//
//        } else if (type == Type.PC && cost > 8000) {
//            result = true;
//
//        }
//        return result;
        return false;
    }
}
