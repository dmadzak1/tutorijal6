package ba.unsa.etf.rpr.tutorijal06;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Controller  {
    Double prvi=0d;
    int operacija=-1;

    @FXML
    private Button nula;
    @FXML
    private Button jedan;
    @FXML
    private Button dva;
    @FXML
    private Button tri;
    @FXML
    private Button cetiri;
    @FXML
    private Button pet;
    @FXML
    private Button sest;
    @FXML
    private Button sedam;
    @FXML
    private Button osam;
    @FXML
    private Button devet;
    @FXML
    private Button tacka;
    @FXML
    private Button jednako;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button mnozi;
    @FXML
    private Button dijeli;
    @FXML
    private Button modiraj;
    @FXML
    private TextField ekran;


    public void pritisnutoDugme(javafx.event.ActionEvent e) {
        if(e.getSource()==jedan) ekran.setText(ekran.getText()+"1");
        else if(e.getSource()==dva) ekran.setText(ekran.getText()+"2");
        else if(e.getSource()==tri) ekran.setText(ekran.getText()+"3");
        else if(e.getSource()==cetiri) ekran.setText(ekran.getText()+"4");
        else if(e.getSource()==pet) ekran.setText(ekran.getText()+"5");
        else if(e.getSource()==sest) ekran.setText(ekran.getText()+"6");
        else if(e.getSource()==sedam) ekran.setText(ekran.getText()+"7");
        else if(e.getSource()==osam) ekran.setText(ekran.getText()+"8");
        else if(e.getSource()==devet) ekran.setText(ekran.getText()+"9");
        else if(e.getSource()==nula) ekran.setText(ekran.getText()+"0");
        else if(e.getSource()==tacka) ekran.setText(ekran.getText()+".");
        else if(e.getSource()==plus){
            prvi=Double.parseDouble(ekran.getText());
            operacija=1;
            ekran.setText("");
        }
        else if(e.getSource()==minus){
            prvi=Double.parseDouble(ekran.getText());
            operacija=2;
            ekran.setText("");
        }
        else if(e.getSource()==mnozi){
            prvi=Double.parseDouble(ekran.getText());
            operacija=3;
            ekran.setText("");
        }
        else if(e.getSource()==dijeli){
            prvi=Double.parseDouble(ekran.getText());
            operacija=4;
            ekran.setText("");
        }
        else if(e.getSource()==modiraj){
            prvi=Double.parseDouble(ekran.getText());
            operacija=5;
            ekran.setText("");
        }
        else if(e.getSource()==jednako){
            Double drugi=Double.parseDouble(ekran.getText());
            switch (operacija){
                case 1:
                    Double rezultat=prvi+drugi;
                    ekran.setText(String.valueOf(rezultat));
                    break;
                case 2:
                    rezultat=prvi-drugi;
                    ekran.setText(String.valueOf(rezultat));
                    break;
                case 3:
                    rezultat=prvi*drugi;
                    ekran.setText(String.valueOf(rezultat));
                    break;
                case 4:
                    if(drugi==0) ekran.setText("Greska");
                    else{
                        rezultat=prvi/drugi;
                        ekran.setText(String.valueOf(rezultat));
                    }
                    break;
                case 5:
                    rezultat=prvi%drugi;
                    ekran.setText(String.valueOf(rezultat));
                    break;
            }
        }
    }
}
