package com.Proyecto.Final.Programacion4.ProyectoFinal.Model;

import com.Proyecto.Final.Programacion4.ProyectoFinal.Model.Enum.MotorcycleType;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Motorcycle {
    private String displacement;
    private MotorcycleType motorcycleType;
}
