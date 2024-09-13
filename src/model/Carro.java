package model;
public class Carro {

    private String chassi;
    private String marca;
    private String model;
    private String placa;
    private double motor;
    private boolean ligado=false;
    private double tanque;

    public Carro(String ch, String mrc, String mod, String plq, double motor, double tq) {

        this.placa = plq;
        this.tanque = tq;
        this.chassi = ch;
        this.marca = mrc;
        this.model = mod;
        this.motor = motor;
    }
    public String getChassi() {
        return this.chassi;
    }
    public void setChassi(String ch) {
        this.chassi = ch;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String ch) {
        this.marca = ch;
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String ch) {
        this.model = ch;
    }
    public String getPlaca() {
        return this.placa;
    }
    public void setPlaca(String ch) {
        this.placa = ch;
    }
    public double getMotor() {
        return this.motor;
    }
    public void setMotor(double ch) {
        this.motor = ch;
    }
    public double getTanque() {
        return this.tanque;
    }
    public void setTanque(double ch) {
        this.tanque = ch;
    }
    public void ValorGasolina(double gasolina) {
        System.out.println(gasolina * this.tanque);
    }

    public void ligar() {
        System.out.println("Carro ligado");
        this.ligado=true;
    }
    public void desligar() {
        System.out.println("Carro desligado");
        this.ligado=false;
    }

    public void andar() {
        if (this.ligado) {
            System.out.println("Carro andando");
        } else {
            System.out.println("Carro desligado");
        }
    }}
