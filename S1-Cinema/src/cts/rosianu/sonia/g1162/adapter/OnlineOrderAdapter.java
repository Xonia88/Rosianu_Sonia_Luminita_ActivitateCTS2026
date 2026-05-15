package cts.rosianu.sonia.g1162.adapter;

public class OnlineOrderAdapter {

    private OnlineOrder onlineOrder;

    public OnlineOrderAdapter(OnlineOrder onlineOrder) {

        this.onlineOrder = onlineOrder;
    }

    public String print() {

        return onlineOrder
                .showOrderDetails()
                .replace("\n", ", ");
    }
}
