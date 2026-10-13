
package com.example.test.controller;

import com.example.test.AppNavigator;
import com.example.test.model.Estudiante;
import com.example.test.model.EstudianteRepository;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FormController {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtEdad;

    @FXML
    private Label lblMensaje;

    @FXML
    private void guardarEstudiante() {

        String nombre =
                txtNombre.getText().trim();

        String correo =
                txtCorreo.getText().trim();

        String edadTexto =
                txtEdad.getText().trim();

        if (nombre.isEmpty()) {
            lblMensaje.setText(
                    "El nombre es obligatorio");
            return;
        }

        if (!correo.contains("@")) {
            lblMensaje.setText(
                    "El correo debe contener @"
            );
            return;
        }

        int edad;

        try {

            edad =
                Integer.parseInt(
                        edadTexto
                );

            if (edad <= 0) {
                lblMensaje.setText(
                        "La edad debe ser mayor que cero"
                );
                return;
            }

        } catch (NumberFormatException e) {

            lblMensaje.setText(
                    "La edad debe ser numérica"
            );
            return;
        }

        int nuevoId =
                EstudianteRepository
                        .getEstudiantes()
                        .size() + 1;

        EstudianteRepository.agregar(
                new Estudiante(
                        nuevoId,
                        nombre,
                        correo,
                        edad
                ));

        AppNavigator.showView(
                "lista-view.fxml",
                "Listado de estudiantes"
        );
    }

    @FXML
    private void volverLista() {

        AppNavigator.showView(
                "lista-view.fxml",
                "Listado de estudiantes"
        );
    }
}