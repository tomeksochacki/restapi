package pl.springboot.demorestapibar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
class Invoice {

    @Id
    private long id;
    private double price;
    private LocalDateTime created;
}
