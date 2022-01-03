package com.rms.model.order;

import com.rms.model.beverage.Beverage;
import com.rms.model.meal.Meal;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Order", schema = "public")
public class Order {
    @Id
    private long id;
    private Integer orderId;
    private String orderedItem;
    private Integer status;

    @Transient
    private OrderState state = new OrderedState(this);


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
