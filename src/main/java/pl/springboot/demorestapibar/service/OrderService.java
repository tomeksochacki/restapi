package pl.springboot.demorestapibar.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.springboot.demorestapibar.model.Order;
import pl.springboot.demorestapibar.repository.OrderRepository;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrders(){
        return orderRepository.findAll();
    }

    /*public Order getSinglePost(long id) {
        return orderRepository.findById(id)
                .orElseThrow();
    }*/
}
