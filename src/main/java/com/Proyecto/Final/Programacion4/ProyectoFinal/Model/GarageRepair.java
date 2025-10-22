package com.Proyecto.Final.Programacion4.ProyectoFinal.Model;

import com.Proyecto.Final.Programacion4.ProyectoFinal.Model.Enum.Specialty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class GarageRepair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Specialty specialty;
    private String garageName;
    @OneToOne
    private User garageManager;
    private List<Vehicle> vehicles;
    private String direction;
}
