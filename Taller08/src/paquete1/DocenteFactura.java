/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author USUARIO
 */
public class DocenteFactura extends Docente {

    protected double valorF;
    protected double iva;
    protected double vCancelar;

    public void establecerValorF(double vF) {
        valorF = vF;
    }

    public void establecerIva(double i) {
        iva = i;
    }

    public void calcularValorCancelar() {
        vCancelar = valorF - (valorF * iva) / 100;
    }

    public double obtenerValorF() {
        return valorF;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerValorCancelar() {
        return vCancelar;
    }

    @Override
    public String toString() {
        String reporte = String.format("\nDocente Factura"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Valor Factura: %.2f\n"
                + "Porcentaje de iva de descuento: %.2f\n"
                + "Valor a cancelar: %.2f\n",
                nombres,
                identificacion,
                valorF,
                iva,
                vCancelar);

        return reporte;
    }

}
