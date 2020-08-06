package net.sytes.canterosoft.logger.Entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "loggerdb")
public class Loggerdb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String clave;
    private String valor;
    private String opcional;
    @CreationTimestamp
    private Date fechaCreado;
}

