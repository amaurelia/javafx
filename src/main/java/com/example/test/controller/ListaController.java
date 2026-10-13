package com.example.test.controller;


import com.example.test.AppNavigator;
import com.example.test.model.Estudiante;
import com.example.test.model.EstudianteRepository;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListaController {

    @FXML
    private TableView<Estudiante>
            tablaEstudiantes;

    @FXML
    private TableColumn<Estudiante,Integer>
            colId;

    @FXML
    private TableColumn<Estudiante,String>
            colNombre;

    @FXML
    private TableColumn<Estudiante,String>
            colCorreo;

    @FXML
    private TableColumn<Estudiante,Integer>
            colEdad;

    @FXML
    public void initialize() {

        colId.setCellValueFactory(
                new PropertyValueFactory<>("id"));

        colNombre.setCellValueFactory(
                new PropertyValueFactory<>("nombre"));

        colCorreo.setCellValueFactory(
                new PropertyValueFactory<>("correo"));

        colEdad.setCellValueFactory(
                new PropertyValueFactory<>("edad"));

        tablaEstudiantes.setItems(
                EstudianteRepository
                        .getEstudiantes()
        );
    }

    @FXML
    private void abrirFormulario() {

        AppNavigator.showView(
                "form-view.fxml",
                "Nuevo estudiante"
        );
    }
}