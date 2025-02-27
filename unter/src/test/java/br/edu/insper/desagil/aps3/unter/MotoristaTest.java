package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class MotoristaTest {
    Motorista motorista;
    Passageiro passageiro;
    Corrida corrida;

    @BeforeEach
    void setUp(){
        motorista = new Motorista("1234","a");
        passageiro = new Passageiro("4321","b");
        corrida = new Corrida(passageiro);
    };

    @Test
    void controi(){
        assertEquals("1234",motorista.getCpf());
        assertEquals("a",motorista.getNome());
    }

    @Test
    void mudaNome(){
        motorista.setNome("b");
        assertEquals("b",motorista.getNome());
    }
    @Test
    void avalia(){

        motorista.avalia(corrida,3);
        assertEquals(3,corrida.getNotaPassageiro());
    }

    @Test
    void avaliaBaixo(){
        motorista.avalia(corrida,0);
        assertEquals(1,corrida.getNotaPassageiro());
    }

    @Test
    void avaliaAlto(){
        motorista.avalia(corrida,6);
        assertEquals(5,corrida.getNotaPassageiro());
    }
}
