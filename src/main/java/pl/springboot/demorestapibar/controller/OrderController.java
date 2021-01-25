package pl.springboot.demorestapibar.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.springboot.demorestapibar.model.Order;
import pl.springboot.demorestapibar.service.OrderService;

import java.util.List;

@RestController
//@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    /*@GetMapping("/orders/{id}")
    public Order getSingleOrder(@PathVariable long id){
        return orderService.getSinglePost(id);
    }*/
}
