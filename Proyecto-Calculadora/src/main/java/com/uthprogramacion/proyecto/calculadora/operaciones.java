package com.uthprogramacion.proyecto.calculadora;

public class operaciones {
    double num1, num2;

    public operaciones(){
    }

    public operaciones(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1(){
        return num1;
    }

    public void setNum1(double num1){
        this.num1 = num1;
    }

    public double getNum2(){
        return num2;
    }

    public void setNum2(double num2){
        this.num2 = num2;
    }

    public double Suma(){
        return num1 + num2;
    }
    
    public double Resta(){
        return num1 - num2;
    }
    
    public double Multiplicacion(){
        return num1 * num2;
    }
    
    public double Division(){
        return num1 / num2;
    }
    
    public double Raiz(double num1){
        double rai = Math.sqrt(num1);
        System.out.println(rai);
        return rai;
    }
    
}