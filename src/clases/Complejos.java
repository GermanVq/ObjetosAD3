/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lenovo
 */
public class Complejos {
    private double Real;
    private double Imaginaria;
    public Complejos (){
        Real = 0.0;
        Imaginaria = 0.0;
    }
    public Complejos (double r , double in){
        this.Real = r;
        this.Imaginaria = in;
        
    }

    public double getReal() {
        return Real;
    }

    public void setReal(double Real) {
        this.Real = Real;
    }

    public double getImaginaria() {
        return Imaginaria;
    }

    public void setImaginaria(double Imaginaria) {
        this.Imaginaria = Imaginaria;
    }
    
     public Complejos Suma (Complejos res2){
     Complejos res;
     
     res = new Complejos ();
     res.setReal(this.Real + res2.Real);
     res.setImaginaria(this.Imaginaria + res2.Imaginaria);
     return res;
    }

    private void Imaginaria(double d) {
    }
    public Complejos Resta (Complejos res2){
     Complejos res;
     
     res = new Complejos ();
     res.setReal(this.Real - res2.getReal());
     res.setImaginaria(this.Imaginaria - res2.Imaginaria);
     return res;
    }
    
    public Complejos Multiplicacion (Complejos res2){
        Complejos res;
        
        res = new Complejos ();
        
        res.setReal(this.Real*res2.Real - this.Imaginaria *res2.Imaginaria);
        res.setImaginaria(this.Real * res2.Imaginaria + this.Imaginaria * res2.Real);
        return res;
    
    }
    public Complejos Division (Complejos res2){
        Complejos res;
        double aux;
        
        res = new Complejos ();
        
        aux = res2.Real * res2.Real + res2.Imaginaria * res2.Imaginaria;
        res.setReal((this.Real * res2.Real + this.Imaginaria * res2.Imaginaria)/aux);
        res.setImaginaria((this.Imaginaria * res2.Real - this.Real * res2.Imaginaria)/aux);
        
        
        return res;
    }
}
