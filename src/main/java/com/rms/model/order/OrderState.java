package com.rms.model.order;

public interface OrderState {
    String next(Order ord);
    String prev(Order ord);
    void printStatus();

}
