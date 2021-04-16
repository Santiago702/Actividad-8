/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SANTIAGO CUERVO
 */
public class Modelo{
    private String TipoVehiculo;
    private String NombreFun;
    private int CantLB;
    private int CantLE;
    private int CantDB;
    private int CantDA;
    private int CantC1;
    private int CantC2;
    private int CantC3; 
    
    private int precioLB = 5;  // TODO SE MANEJA EN CANTIDADES DE DOLARES 
    private int precioLE = 7;
    private int precioDB = 6;
    private int precioDA = 8;
    private int precioC1 = 11;
    private int precioC2 = 10;
    private int precioC3 = 12;
    private int precioporsercamionetaynoautoJAJAXD = 2;
    
    
    

    private int TotCantLB = 0;
    private int TotCantLE = 0;
    private int TotCantDB = 0;
    private int TotCantDA = 0;
    private int TotCantC1 = 0;
    private int TotCantC2 = 0;
    private int TotCantC3 = 0;
    private int TotCantFun = 0;

    public int getPrecioLB() {
        return precioLB;
    }

    public int getPrecioLE() {
        return precioLE;
    }

    public int getPrecioDB() {
        return precioDB;
    }

    public int getPrecioDA() {
        return precioDA;
    }

    public int getPrecioC1() {
        return precioC1;
    }

    public int getPrecioC2() {
        return precioC2;
    }

    public int getPrecioC3() {
        return precioC3;
    }
    

    public String getNombreFun() {
        return NombreFun;
    }

    public void setNombreFun(String NombreFun) {
        this.NombreFun = NombreFun;
    }
    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    public int getCantLB() {
        return CantLB;
    }

    public void setCantLB(int CantLB) {
        this.CantLB = CantLB;
    }

    public int getCantLE() {
        return CantLE;
    }

    public void setCantLE(int CantLE) {
        this.CantLE = CantLE;
    }

    public int getCantDB() {
        return CantDB;
    }

    public void setCantDB(int CantDB) {
        this.CantDB = CantDB;
    }

    public int getCantDA() {
        return CantDA;
    }

    public void setCantDA(int CantDA) {
        this.CantDA = CantDA;
    }

    public int getCantC1() {
        return CantC1;
    }

    public void setCantC1(int CantC1) {
        this.CantC1 = CantC1;
    }

    public int getCantC2() {
        return CantC2;
    }

    public void setCantC2(int CantC2) {
        this.CantC2 = CantC2;
    }

    public int getCantC3() {
        return CantC3;
    }

    public void setCantC3(int CantC3) {
        this.CantC3 = CantC3;
    }

    public int getTotCantLB() {
        return TotCantLB;
    }

    public void setTotCantLB(int TotCantLB) {
        this.TotCantLB = TotCantLB;
    }

    public int getTotCantLE() {
        return TotCantLE;
    }

    public void setTotCantLE(int TotCantLE) {
        this.TotCantLE = TotCantLE;
    }

    public int getTotCantDB() {
        return TotCantDB;
    }

    public void setTotCantDB(int TotCantDB) {
        this.TotCantDB = TotCantDB;
    }

    public int getTotCantDA() {
        return TotCantDA;
    }

    public void setTotCantDA(int TotCantDA) {
        this.TotCantDA = TotCantDA;
    }

    public int getTotCantC1() {
        return TotCantC1;
    }

    public void setTotCantC1(int TotCantC1) {
        this.TotCantC1 = TotCantC1;
    }

    public int getTotCantC2() {
        return TotCantC2;
    }

    public void setTotCantC2(int TotCantC2) {
        this.TotCantC2 = TotCantC2;
    }

    public int getTotCantC3() {
        return TotCantC3;
    }

    public void setTotCantC3(int TotCantC3) {
        this.TotCantC3 = TotCantC3;
    }

    public int getTotCantFun() {
        return TotCantFun;
    }

    public void setTotCantFun(int TotCantFun) {
        this.TotCantFun = TotCantFun;
    }

    public void CalcularLavadoBasico()
    {
        if(TipoVehiculo == "Automovil")
        {
            TotCantLB = CantLB * precioLB;
        }
        if(TipoVehiculo == "Camioneta")
        {
            TotCantLB = CantLB*(precioLB + precioporsercamionetaynoautoJAJAXD);
        }
        
    }
    
    public void CalcularLavadoEspecial()
    {
        if(TipoVehiculo == "Automovil")
        {
            TotCantLE = CantLE * precioLE;
        }
        if(TipoVehiculo == "Camioneta")
        {
            TotCantLE = CantLE*(precioLE + precioporsercamionetaynoautoJAJAXD);
        } 
    }
    
    public void CalcularDesinfecciónBasica()
    {
        if(TipoVehiculo == "Automovil")
        {
            TotCantDB = CantDB * precioDB;
        }
        if(TipoVehiculo == "Camioneta")
        {
            TotCantDB = CantDB*(precioDB + precioporsercamionetaynoautoJAJAXD);
        }
        
    }
    
    public void CalcularDesinfecciónAvanzada()
    {
        if(TipoVehiculo == "Automovil")
        {
            TotCantDA = CantDA * precioDA;
        }
        if(TipoVehiculo == "Camioneta")
        {
            TotCantDA = CantDA*(precioDA + precioporsercamionetaynoautoJAJAXD);
        } 
    }
    
    public void CalcularCombo1()
    {
        if(TipoVehiculo == "Automovil")
        {
            TotCantC1 = CantC1 * precioC1;
        }
        if(TipoVehiculo == "Camioneta")
        {
            TotCantC1 = CantC1*(precioC1 + precioporsercamionetaynoautoJAJAXD);
        }
    }
    
    public void CalcularCombo2()
    {
        if(TipoVehiculo == "Automovil")
        {
            TotCantC2 = CantC2 * precioC2;
        }
        if(TipoVehiculo == "Camioneta")
        {
            TotCantC2 = CantC2*(precioC2 + precioporsercamionetaynoautoJAJAXD);
        }
    }
    
    public void CalcularCombo3()
    {
        if(TipoVehiculo == "Automovil")
        {
            TotCantC3 = CantC3 * precioC3;
        }
        if(TipoVehiculo == "Camioneta")
        {
            TotCantC3 = CantC3*(precioC3 + precioporsercamionetaynoautoJAJAXD);
        }
    }
    
    public void CalcularFuncionario()
    {
        TotCantFun = TotCantC1 + TotCantC2 + TotCantC3 + TotCantDA + TotCantDB + TotCantLB + TotCantLE;
    }
    
    public String CalcularFecha()
    {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        
        return formatoFecha.format(fecha);
    }
}
