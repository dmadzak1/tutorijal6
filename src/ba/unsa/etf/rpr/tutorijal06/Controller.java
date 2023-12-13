package ba.unsa.etf.rpr.tutorijal06;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller  {
    Double prvi=0d;
    int operacija=-1;

    @FXML
    private Button btn0;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button dotBtn;
    @FXML
    private Button equalsBtn;
    @FXML
    private Button plusBtn;
    @FXML
    private Button minusBtn;
    @FXML
    private Button mulBtn;
    @FXML
    private Button divBtn;
    @FXML
    private Button modBtn;
    @FXML
    private TextField display;


    public void pritisnutoDugme(javafx.event.ActionEvent e) {
        if(e.getSource()==btn1) display.setText(display.getText()+"1");
        else if(e.getSource()==btn2) display.setText(display.getText()+"2");
        else if(e.getSource()== btn3) display.setText(display.getText()+"3");
        else if(e.getSource()== btn4) display.setText(display.getText()+"4");
        else if(e.getSource()== btn5) display.setText(display.getText()+"5");
        else if(e.getSource()== btn6) display.setText(display.getText()+"6");
        else if(e.getSource()== btn7) display.setText(display.getText()+"7");
        else if(e.getSource()== btn8) display.setText(display.getText()+"8");
        else if(e.getSource()== btn9) display.setText(display.getText()+"9");
        else if(e.getSource()==btn0) display.setText(display.getText()+"0");
        else if(e.getSource()== dotBtn) display.setText(display.getText()+".");
        else if(e.getSource()== plusBtn){
            prvi=Double.parseDouble(display.getText());
            operacija=1;
            display.setText("");
        }
        else if(e.getSource()== minusBtn){
            prvi=Double.parseDouble(display.getText());
            operacija=2;
            display.setText("");
        }
        else if(e.getSource()== mulBtn){
            prvi=Double.parseDouble(display.getText());
            operacija=3;
            display.setText("");
        }
        else if(e.getSource()== divBtn){
            prvi=Double.parseDouble(display.getText());
            operacija=4;
            display.setText("");
        }
        else if(e.getSource()== modBtn){
            prvi=Double.parseDouble(display.getText());
            operacija=5;
            display.setText("");
        }
        else if(e.getSource()== equalsBtn){
            Double drugi=Double.parseDouble(display.getText());
            switch (operacija){
                case 1:
                    Double rezultat=prvi+drugi;
                    display.setText(String.valueOf(rezultat));
                    break;
                case 2:
                    rezultat=prvi-drugi;
                    display.setText(String.valueOf(rezultat));
                    break;
                case 3:
                    rezultat=prvi*drugi;
                    display.setText(String.valueOf(rezultat));
                    break;
                case 4:
                    if(drugi==0) display.setText("Greska");
                    else{
                        rezultat=prvi/drugi;
                        display.setText(String.valueOf(rezultat));
                    }
                    break;
                case 5:
                    rezultat=prvi%drugi;
                    display.setText(String.valueOf(rezultat));
                    break;
            }
        }
    }
}
