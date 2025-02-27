package br.edu.insper.desagil.aps3.unter;

public class Corrida {

    private Passageiro passageiro;
    private Motorista motorista;
    private int notaPassageiro;
    private int notaMotorista;

    public Corrida(Passageiro passageiro){
        this.passageiro=passageiro;
        motorista=null;
        notaPassageiro=0;
        notaMotorista=0;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public int getNotaPassageiro() {
        return notaPassageiro;
    }

    public int getNotaMotorista() {
        return notaMotorista;
    }

    private int truncado(int nota){
        if(nota<1){
            return 1;
        }
        if(nota>5){
            return 5;
        }
        return nota;
    }

    public void avaliaPassageiro(int notaPassageiro1){
        notaPassageiro=truncado(notaPassageiro1);
    }

    public void avaliaMotorista(int notaMotorista1){
        notaMotorista=truncado(notaMotorista1);

    }
}
