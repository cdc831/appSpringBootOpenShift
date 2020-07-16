package net.sytes.canterosoft.logger.Entity;

import lombok.Data;

import javax.persistence.*;
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
    private String fechaCreado;
    private String horaCreada;
}

