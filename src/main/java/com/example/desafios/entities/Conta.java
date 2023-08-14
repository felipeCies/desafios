package com.example.desafios.entities;

public class Conta {
    private int id;
    private String titular;
    private double saldo;

    public Conta (int id){
        this.id = id;
    }

    public Conta(int id, String titular, double saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double sacar(double valorSaque) {
        this.saldo = saldo - valorSaque;
        return this.saldo;
    }

    public double depositar(double valorDeposito) {
        this.saldo = saldo + valorDeposito;
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
