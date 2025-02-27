package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    Passageiro passageiro;
    @BeforeEach
    void setUp(){
        passageiro = new Passageiro("1234","hanna");
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
}
