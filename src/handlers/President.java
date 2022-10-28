package handlers;

import common.Type;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver{
    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(cost, type)) {
            System.out.println("President approved purchase with id " + id + " that costs " + cost);
        } else {
            System.out.println("Purchase with id " + id + " needs approval from higher position than President.");
            next.approve(id, cost, type);
        }
    }

    @Override
    protected boolean canApprove(double cost, Type type) {
        boolean result = false;
        if (type == Type.CONSUMABLES && cost <= 1000) {
            result = true;
        } else if (type == Type.CLERICAL && cost <= 2000) {
            result = true;
        } else if (type == Type.GADGETS && cost <= 3000) {
            result = true;
        } else if (type == Type.GAMING && cost <= 5000) {
            result = true;
        } else if (type == Type.PC && cost <= 8000) {
            result = true;
        }
        return result;
    }
}
