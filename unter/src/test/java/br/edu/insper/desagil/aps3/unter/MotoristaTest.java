package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class MotoristaTest {
    Motorista motorista;
    @BeforeEach
    void setUp(){
        motorista=new Motorista("1234","a");
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
        Corrida corrida=mock(Corrida.class);
        motorista.avalia(corrida,3);
        assertEquals(3,corrida.getNotaPassageiro());
    }
}
