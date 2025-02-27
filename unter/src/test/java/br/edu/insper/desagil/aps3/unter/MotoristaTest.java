package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest {
    Motorista motorista;
    @BeforeEach
    void setUp(){
        motorista=new Motorista("1234","a");
    }
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
}
