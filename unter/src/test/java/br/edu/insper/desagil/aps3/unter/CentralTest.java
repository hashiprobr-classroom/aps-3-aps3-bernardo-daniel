package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CentralTest {
    public static final double DELTA = 0.0000000000000000000000000000001;
    Central central;

    @BeforeEach
    void setUp(){
        central=new Central();
    }
    @Test
    void nenhumaAvaliacaoPassageiro(){
        assertEquals(0,central.mediaPassageiro("1234"), DELTA);
    }
    @Test
    void nnhumaAvaliacaoMotorista(){
        assertEquals(0,central.mediaMotorista("1234"), DELTA);

    }
    @Test
    void avaliacoesPassageiro(){
        Passageiro passageiro = mock(Passageiro.class);
        Passageiro passageiro1 = mock(Passageiro.class);
        when(passageiro.getCpf()).thenReturn("123");
        when(passageiro1.getCpf()).thenReturn("456");

        Corrida corrida =new Corrida(passageiro);
        Corrida corrida1 =new Corrida(passageiro);
        corrida1.avaliaPassageiro(4);
        Corrida corrida2 =new Corrida(passageiro);
        corrida2.avaliaPassageiro(5);
        Corrida corrida3 =new Corrida(passageiro1);
        corrida3.avaliaPassageiro(3);
        central.adiciona(corrida);
        central.adiciona(corrida1);
        central.adiciona(corrida2);
        central.adiciona(corrida3);
        assertEquals(4.5, central.mediaPassageiro("123"),DELTA);

    }
    @Test
    void avaliacoesMotorista(){
        Passageiro passageiro = new Passageiro("789","a");
        Passageiro passageiro1 = mock(Passageiro.class);
        Motorista motorista = new Motorista("123","a");
        Motorista motorista1 = new Motorista("456","b");


        Corrida corrida =new Corrida(passageiro);
        corrida.setMotorista(motorista);

        Corrida corrida1 =new Corrida(passageiro);
        corrida1.setMotorista(motorista);
        corrida1.avaliaMotorista(2);

        Corrida corrida2 =new Corrida(passageiro);
        corrida2.setMotorista(motorista);
        corrida2.avaliaMotorista(3);

        Corrida corrida3 =new Corrida(passageiro1);
        corrida3.setMotorista(motorista1);
        corrida3.avaliaMotorista(1);

        Corrida corrida4 =new Corrida(passageiro1);
        corrida4.avaliaMotorista(1);

        central.adiciona(corrida);
        central.adiciona(corrida1);
        central.adiciona(corrida2);
        central.adiciona(corrida3);
        assertEquals(2.5, central.mediaMotorista("123"),DELTA);

    }
}
