package com.Proyecto.Final.Programacion4.ProyectoFinal.Model;

import com.Proyecto.Final.Programacion4.ProyectoFinal.Model.Enum.Role;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private Long dni;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String email;
    private String password;
}
