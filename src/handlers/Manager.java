package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(cost, type)) {
            System.out.println("Manager approved purchase with id " + id + " that costs " + cost);

        } else {
        System.out.println("Purchase with id " + id + " needs approval from higher position than Manager.");
        next.approve(id, cost, type);
        }
    }

    @Override
    protected boolean canApprove(double cost, Type type) {
        boolean result = false;
        if (type == Type.CONSUMABLES && cost <= 300) {
            result = true;
        } else if (type == Type.CLERICAL && cost <= 500) {
            result = true;
        } else if (type == Type.GADGETS && cost <= 1000) {
            result = true;
        } else if (type == Type.GAMING && cost <= 3000) {
            result = true;
        } else if (type == Type.PC && cost <= 5000) {
            result = true;
        }
        return result;
    }
}
