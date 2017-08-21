package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    Button arigato;
    @FXML
    Button kayn;
    @FXML
    Button anni;
    @FXML
    Button tutio;
    @FXML
    Button janna;
    @FXML
    Button tupapa;
    @FXML
    Button nami;
    @FXML
    Button hola123;
    @FXML
    Button lux;


    public void kayn(ActionEvent actionEvent) {
        if (kayn.getText().equals("")) {
            kayn.setText("X");
            if (!nami.getText().equals("")){
                janna.setText("0");
            } else if (!tupapa.getText().equals("")){
                arigato.setText("0");
            } else {
                nami.setText("0");
            }
        }

    }

    public void anni(ActionEvent actionEvent){
        if (anni.getText().equals("")) {
            anni.setText("X");
            if (!tutio.getText().equals("")){
                arigato.setText("0");
            } else if (!lux.getText().equals("")){
                hola123.setText("0");
            } else {
                tutio.setText("0");
            }
        }

    }

    public void tutio(ActionEvent actionEvent) {
        if (tutio.getText().equals("")) {
            tutio.setText("X");
            if (!kayn.getText().equals("")){
                hola123.setText("0");
            } else if (!lux.getText().equals("")){
                anni.setText("0");
            } else {
                kayn.setText("0");
            }
        }
    }

    public void janna(ActionEvent actionEvent) {
        if (janna.getText().equals("")) {
            janna.setText("X");
            if (!arigato.getText().equals("")){
                lux.setText("0");
            } else if (!tutio.getText().equals("")){
                tupapa.setText("0");
            } else {
                arigato.setText("0");
            }
        }
    }

    public void tupapa(ActionEvent actionEvent) {
        if (tupapa.getText().equals("")) {
            tupapa.setText("X");
            if (!lux.getText().equals("")){
                arigato.setText("0");
            } else if (!janna.getText().equals("")){
                nami.setText("0");
            } else {
                lux.setText("0");
            }
        }
    }

    public void nami(ActionEvent actionEvent) {
        if (nami.getText().equals("")) {
            nami.setText("X");
            if (!hola123.getText().equals("")){
                lux.setText("0");
            } else if (!anni.getText().equals("")){
                tupapa.setText("0");
            } else {
                hola123.setText("0");
            }
        }
    }

    public void hola123(ActionEvent actionEvent) {
        if (hola123.getText().equals("")) {
            hola123.setText("X");
            if (!nami.getText().equals("")){
                arigato.setText("0");
            } else if (!janna.getText().equals("")){
                kayn.setText("0");
            } else {
                nami.setText("0");
            }
        }
    }

    public void lux(ActionEvent actionEvent) {
        if (lux.getText().equals("")) {
            lux.setText("X");
            if (!janna.getText().equals("")){
                tupapa.setText("0");
            } else if (!nami.getText().equals("")){
                hola123.setText("0");
            } else {
                janna.setText("0");
            }
        }
    }

    public void arigato(ActionEvent actionEvent) {
        if (arigato.getText().equals("")) {
            arigato.setText("X");
            if (!anni.getText().equals("")) {
                tupapa.setText("0");
            } else if (!nami.getText().equals("")) {
                lux.setText("0");
            } else if (!hola123.getText().equals("")) {
                kayn.setText("0");
            } else {
                anni.setText("0");
            }
        }
    }
}


