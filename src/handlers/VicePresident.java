package handlers;

import common.Type;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(cost, type)) {
            System.out.println("Vice President approved purchase with id " + id + " that costs " + cost);
        } else {
            System.out.println("Purchase with id " + id + " needs approval from higher position than Vice President.");
            next.approve(id, cost, type);
        }
    }

    @Override
    protected boolean canApprove(double cost, Type type) {
        boolean result = false;
        if (type == Type.CONSUMABLES && cost <= 700) {
            result = true;
        } else if (type == Type.CLERICAL && cost <= 1500) {
            result = true;
        } else if (type == Type.GADGETS && cost <= 2000) {
            result = true;
        } else if (type == Type.GAMING && cost <= 4500) {
            result = true;
        } else if (type == Type.PC && cost <= 6500) {
            result = true;
        }
        return result;
    }
}
