/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author SANTIAGO CUERVO
 */
public class Controlador implements ActionListener{
    private String NombreFuncionario;
    private String leerdatoString;
    private int LeerDatoInt;
    private Modelo modelo;
    private Vista vista;
    public Controlador(Modelo modelo, Vista vista){
        this.modelo = modelo;
        this.vista = vista;
        this.vista.CalcularProd.addActionListener(this);
    }
    public void comenzarVista() {
        vista.setTitle("Lavado de Autos - La Estrellita");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true); 
    }
    public void actionPerformed(ActionEvent clic) {
        if(vista.CalcularProd == clic.getSource())
        {
           modelo.setTipoVehiculo(vista.obtenerTipoVehiculo.getItemAt(vista.obtenerTipoVehiculo.getSelectedIndex()));
           modelo.setNombreFun(vista.obtenerNombreFuncionario.getText());
           modelo.setCantLB(Integer.parseInt(vista.obtenerCantLB.getText()));
           modelo.setCantLE(Integer.parseInt(vista.obtenerCantLE.getText()));
           modelo.setCantDB(Integer.parseInt(vista.obtenerCantDB.getText()));
           modelo.setCantDA(Integer.parseInt(vista.obtenerCantDA.getText()));
           modelo.setCantC1(Integer.parseInt(vista.obtenerCantC1.getText()));
           modelo.setCantC2(Integer.parseInt(vista.obtenerCantC2.getText()));
           modelo.setCantC3(Integer.parseInt(vista.obtenerCantC3.getText()));
           
           modelo.CalcularLavadoBasico();
           modelo.CalcularLavadoEspecial();
           modelo.CalcularDesinfecciónBasica();   
           modelo.CalcularDesinfecciónAvanzada();
           modelo.CalcularCombo1(); 
           modelo.CalcularCombo2();
           modelo.CalcularCombo3();   
           modelo.CalcularFuncionario();
           vista.MostrarTotLB.setText(modelo.getTotCantLB()+"");
           vista.MostrarTotLE.setText(modelo.getTotCantLE()+"");
           vista.MostrarTotDB.setText(modelo.getTotCantDB()+"");
           vista.MostrarTotDA.setText(modelo.getTotCantDA()+"");
           vista.MostrarTotC1.setText(modelo.getTotCantC1()+"");
           vista.MostrarTotC2.setText(modelo.getTotCantC2()+"");
           vista.MostrarTotC3.setText(modelo.getTotCantC3()+"");
           vista.MostrarTotProdFun.setText(modelo.getTotCantFun()+"");
           vista.colocarNomFun.setText(modelo.getNombreFun());
           vista.FechaActual.setText(modelo.CalcularFecha());
        }
    }
}
    
