package model;

public abstract class Conta {
    protected String tipoConta;
    protected String tipoCliente;
    protected String dataAbertura;
    protected double saldo;

    public Conta(String tipoConta, String tipoCliente, String dataAbertura, double saldo) {
        this.tipoConta = tipoConta;
        this.tipoCliente = tipoCliente;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract double calculaValorTarifaManutencao();
}
