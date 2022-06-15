/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author USUARIO
 */
public class DocenteNombramiento extends Docente {

    protected double valorS;
    protected double valorH;
    protected double numH;
    protected double sueldo;

    public void establecerValorS(double vS) {
        valorS = vS;
    }

    public void establecerValorH(double vH) {
        valorH = vH;
    }

    public void establecerNumH(double nH) {
        numH = nH;
    }

    public void calcularSueldo() {
        sueldo = valorS + (valorH * numH);
    }

    public double obtenerValorS() {
        return valorS;
    }

    public double obtenerValorH() {
        return valorH;
    }

    public double obtenerNumH() {
        return numH;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        String reporte = String.format("\nDocente Nombramiento\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Sueldo : %.2f\n"
                + "Valor de hora extra: %.2f\n"
                + "Numero de horas extra: %.2f\n"
                + "Sueldo Total: %.2f\n",
                nombres,
                identificacion,
                valorS,
                valorH,
                numH,
                sueldo);

        return reporte;
    }

}
