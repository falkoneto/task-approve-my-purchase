package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Approver {

    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(cost, type)) {
            System.out.println("Director approved purchase with id " + id + " that costs " + cost);

        } else {

            System.out.println("Purchase with id " + id + " needs approval from higher position than Director.");
            next.approve(id, cost, type);
        }
    }

    @Override
    protected boolean canApprove(double cost, Type type) {
        boolean result = false;
        if (type == Type.CONSUMABLES && cost <= 500) {
            result = true;
        } else if (type == Type.CLERICAL && cost <= 1000) {
            result = true;
        } else if (type == Type.GADGETS && cost <= 1500) {
            result = true;
        } else if (type == Type.GAMING && cost <= 3500) {
            result = true;
        } else if (type == Type.PC && cost <= 6000) {
            result = true;
        }
        return result;
    }
}
