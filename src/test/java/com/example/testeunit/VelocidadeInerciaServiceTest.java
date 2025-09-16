package com.example.testeunit; 

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*;

class VelocidadeInerciaServiceTest {

    private final VelocidadeInerciaService service = new VelocidadeInerciaService();

    @Test 
    void TesteConversao() {
        float entrada = 5000000;  
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
