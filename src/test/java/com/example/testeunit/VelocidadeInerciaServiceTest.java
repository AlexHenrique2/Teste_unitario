package com.example.testeunit; 

// Bibliotecas spring e JUnit
import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*;

class VelocidadeInerciaServiceTest {

    private final VelocidadeInerciaService service = new VelocidadeInerciaService();

    //Teste se 
    @Test 
    void TesteConversao() {
        float entrada = 452342;  
        var velocidades = service.converter(entrada, entrada, entrada);

        assertEquals(entrada, velocidades.velocidadeX);
        assertEquals(entrada, velocidades.velocidadeY); 
        assertEquals(entrada, velocidades.velocidadeZ);
    }

    @Test 
    void TestConversaoXXL() {
        float entrada = 1e20f; 
        var velocidades = service.converter(entrada, entrada, entrada);
        long esperado = (long) entrada; 

        assertEquals(esperado, velocidades.velocidadeX, "Overflow on (float) to (int)");
        
    }
}
