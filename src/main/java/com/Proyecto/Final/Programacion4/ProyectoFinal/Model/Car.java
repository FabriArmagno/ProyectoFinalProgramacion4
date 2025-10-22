package com.Proyecto.Final.Programacion4.ProyectoFinal.Model;

import com.Proyecto.Final.Programacion4.ProyectoFinal.Model.Enum.Combustion;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patent;
    private String model;
    private Long price;
    private String color;
    private Long year;
    private Long kilometers;
    private String engine;
    @Enumerated(EnumType.STRING)
    private Combustion combustion;
    private String description;
    private LocalDate entryDate;
    private boolean inRepair;
}
