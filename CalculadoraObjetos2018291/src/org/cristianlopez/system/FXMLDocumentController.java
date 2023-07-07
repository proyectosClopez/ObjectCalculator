/*
Nombre: Cristian David Lopez Albeño
Carnet: 2018291
Codigo Tecnico: IN5AM
Fecha de creacion:
 */
package org.cristianlopez.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author informatica
 */
public class FXMLDocumentController implements Initializable {
    double dato1, dato2, result, opSuce = 0.0;
    String operador, operador2 = "";
    int cont = 1;
    @FXML private Button btnMasMenos;
    @FXML private Button btnCero;
    @FXML private Button btnPunto;
    @FXML private Button btnIgual;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnMas;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnMenos;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMulti;
    @FXML private Button btnUnoX;
    @FXML private Button btnXCuadrado;
    @FXML private Button btnRaiz;
    @FXML private Button btnDiv;
    @FXML private Button btnProm;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private TextField txtPantalla;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText() + "1");
        else if(event.getSource() == btnDos)
            txtPantalla.setText(txtPantalla.getText() + "2");
        else if(event.getSource() == btnTres)
            txtPantalla.setText(txtPantalla.getText() + "3");
        else if(event.getSource() == btnCuatro)
            txtPantalla.setText(txtPantalla.getText() + "4");
        else if(event.getSource() == btnCinco)
            txtPantalla.setText(txtPantalla.getText() + "5");
        else if(event.getSource() == btnSeis)
            txtPantalla.setText(txtPantalla.getText() + "6");
        else if(event.getSource() == btnSiete)
            txtPantalla.setText(txtPantalla.getText() + "7");
        else if(event.getSource() == btnOcho)
            txtPantalla.setText(txtPantalla.getText() + "8");
        else if(event.getSource() == btnNueve)
            txtPantalla.setText(txtPantalla.getText() + "9");
        else if(event.getSource() == btnCero)
            txtPantalla.setText(txtPantalla.getText() + "0");
        else if (event.getSource() == btnMas){                       
                dato1 = Double.parseDouble(txtPantalla.getText());
                txtPantalla.clear();
                if (cont == 2) {
                    opSuce = opSuce - dato1;
                }else{
                opSuce = opSuce + dato1;
                }
            operador = "+";
            cont = 3;
        }else if (event.getSource() == btnMenos){              
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear(); 
            if (cont == 1) {
                opSuce = dato1;
            }else if(cont == 3){
                opSuce = opSuce + dato1;
            }else{
                opSuce = opSuce - dato1;
            }
            cont = 2;
            operador = "-";
        }else if(event.getSource() == btnMulti){
            dato1 = Double.parseDouble(txtPantalla.getText());
             txtPantalla.clear(); 
            operador = "*";
        }else if(event.getSource() == btnDiv){
            dato1 = Double.parseDouble(txtPantalla.getText());
             txtPantalla.clear(); 
            operador = "/";
        }else if(event.getSource() == btnIgual){
                switch (operador){
                case "+":
                    if (operador2 == "+%") {
                       result = ((dato1 * dato2)/100);
                       result = dato1 + result;
                       txtPantalla.setText(String.valueOf(result)); 
                    }else{
                    dato2 = Double.parseDouble(txtPantalla.getText());
                    txtPantalla.clear();
                    result = opSuce + dato2;
                    opSuce = 0;
                    txtPantalla.setText(String.valueOf(result));
                    }
                    break;
                case "-":  
                    if (operador2 == "-%") {
                        result = ((dato1 * dato2)/100);
                        result = dato1 - result;
                    txtPantalla.setText(String.valueOf(result));
                    }else{
                    dato2 = Double.parseDouble(txtPantalla.getText());
                    txtPantalla.clear();
                    result = opSuce - dato2;
                    opSuce = 0;
                    cont = 1;
                    txtPantalla.setText(String.valueOf(result));
                    }
                     break;
                case "*":  
                    if (operador2 == "*%") {
                        result = ((dato1 * dato2)/100);
                        txtPantalla.setText(String.valueOf(result));
                    }else{
                    dato2 = Double.parseDouble(txtPantalla.getText());
                    txtPantalla.clear();
                    result = dato1 * dato2;
                    txtPantalla.setText(String.valueOf(result));
                    }
                     break;
                case "/":  
                    if (operador2 == "/%") {
                       result = (dato2 / 100);
                       result = (dato1 / result);
                       txtPantalla.setText(String.valueOf(result)); 
                    }else{
                    dato2 = Double.parseDouble(txtPantalla.getText());
                    txtPantalla.clear();
                    result = dato1 / dato2;
                    txtPantalla.setText(String.valueOf(result));
                    }
                     break;
                } 
        }else if (event.getSource() == btnMasMenos){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = dato1 * -1;
            txtPantalla.setText(String.valueOf(result));
        }else if(event.getSource() == btnXCuadrado){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = dato1 * dato1;
            txtPantalla.setText(String.valueOf(result));
        }else if(event.getSource() == btnRaiz){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = Math.sqrt(dato1);
            txtPantalla.setText(String.valueOf(result));
        }else if(event.getSource() == btnPunto){
            if (!(txtPantalla.getText().contains("."))) {
                txtPantalla.setText(txtPantalla.getText() + ".");
            }
        }else if(event.getSource() == btnC){
           dato1 = 0.0;
           dato2 = 0.0;
           result = 0.0;
           opSuce = 0.0;
           cont = 1;
           String operador = "";
           txtPantalla.setText("");
        }else if(event.getSource() == btnProm){
            dato2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            
            switch (operador){
                case "+":  
                    operador2 = "+%";
                     break;
                case "-":  
                    operador2 = "-%";
                     break;
                case "*":  
                    operador2 = "*%";
                     break;
                case "/":  
                    operador2 = "/%";
                     break;
                }
        }else if(event.getSource() == btnUnoX){
            dato1 = Double.parseDouble(txtPantalla.getText());
            result = (1 / dato1);
            txtPantalla.setText(String.valueOf(result));
        }else if(event.getSource() == btnCE){
            txtPantalla.setText("");
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
