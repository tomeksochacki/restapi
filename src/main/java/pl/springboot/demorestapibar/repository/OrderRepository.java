package pl.springboot.demorestapibar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.springboot.demorestapibar.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
