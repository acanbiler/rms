package com.rms.model.order;

import com.rms.model.beverage.Beverage;
import com.rms.model.meal.Meal;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Order", schema = "public")
public class Order {
    @Id
    private long id;

    @Column(name = "orderid")
    private Integer orderId;

    @Column(name = "ordereditem")
    private String orderedItem;

    @Column(name = "status")
    private Integer status;

    @Transient
    private OrderState state;


    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }
}
