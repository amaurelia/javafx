package com.example.test.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EstudianteRepository {

    private static final ObservableList<Estudiante>
            estudiantes =
            FXCollections.observableArrayList(
                    new Estudiante(
                            1,
                            "Ana",
                            "ana@correo.com",
                            20
                    ),
                    new Estudiante(
                            2,
                            "Luis",
                            "luis@correo.com",
                            22
                    )
            );

    public static ObservableList<Estudiante>
    getEstudiantes() {

        return estudiantes;
    }

    public static void agregar(
            Estudiante estudiante) {

        estudiantes.add(estudiante);
    }
}