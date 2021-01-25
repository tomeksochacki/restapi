package pl.springboot.demorestapibar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Order {
    @Id
    private long id;
    private String title;
    private String content;
    private LocalDateTime created;

    @OneToMany
    @JoinColumn(name = "order_id")
    private List<Invoice> invoice;
}
