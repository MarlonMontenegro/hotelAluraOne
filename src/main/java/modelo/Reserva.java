package main.java.modelo;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fecha_entrada")
    private Date fechaEntrada;
    @Column(name = "fecha_salida")
    private Date fechaSalida;
    private double valor;
    @Column(name = "forma_pago")
    private String formaPago;

    @SuppressWarnings("unused")
    public Reserva() {
    }

    public Reserva(Date fechaEntrada, Date fechaSalida, double valor, String formaPago) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.valor = valor;
        this.formaPago = formaPago;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public int getId() {
        return id;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
}
