package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    List<Corrida> corridas;

    public Central() {
        corridas = new ArrayList<>();
    }

    public void adiciona(Corrida corrida){corridas.add(corrida);}
    public double mediaPassageiro (String cpf){
        double soma = 0;
        double contador = 0;
        for(Corrida corrida : corridas){
            Passageiro passageiro = corrida.getPassageiro();
            if(passageiro.getCpf().equals(cpf)){
                if(corrida.getNotaPassageiro()>0){
                    soma+=corrida.getNotaPassageiro();
                    contador +=1;}
            }

        }
        if(contador==0){return 0;}
        return soma/contador;
    }
    public double mediaMotorista(String cpf){
        double soma=0;
        double contador =0;
        for(Corrida corrida : corridas){
            Motorista motorista =corrida.getMotorista();
            if(motorista.getCpf().equals(cpf)){
                if(corrida.getNotaMotorista()>0){
                    soma+= corrida.getNotaMotorista();
                    contador+=1;
                }
            }
        }
//        if(contador==0){return 0;}
        return soma/contador;
    }
}
