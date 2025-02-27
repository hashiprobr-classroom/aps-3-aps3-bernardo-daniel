package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    Passageiro passageiro;
    Motorista motorista;
    Corrida corrida;

    @BeforeEach
    void setUp(){
        passageiro = new Passageiro("1234","hanna");
        motorista = new Motorista("4321","Jorge");
        corrida = new Corrida(passageiro);
    }

    @Test
    void constroi(){
        assertEquals("1234",passageiro.getCpf());
        assertEquals("hanna",passageiro.getNome());
    }

    @Test
    void mudaNome(){
        passageiro.setNome("a");
        assertEquals("a",passageiro.getNome());
    }

    @Test
    void avalia(){
        passageiro.avalia(corrida,3);
        assertEquals(3,corrida.getNotaMotorista());
    }

    @Test
    void avaliaBaixo(){
        passageiro.avalia(corrida,0);
        assertEquals(1,corrida.getNotaMotorista());
    }

    @Test
    void avaliaAlto(){
        passageiro.avalia(corrida,6);
        assertEquals(5,corrida.getNotaMotorista());
    }
}
