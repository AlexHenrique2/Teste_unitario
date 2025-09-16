package com.example.testeunit;

import org.springframework.stereotype.Service;

@Service
public class VelocidadeInerciaService {

    class Velocidades {

        float velocidadeX;
        float velocidadeY;
        float velocidadeZ;
    }

    public Velocidades conversaoDouble (float velocidadeX, float velocidadeY, float velocidadeZ) {

        Velocidades velocidades = new Velocidades(); 
        velocidades.velocidadeX = (int) velocidadeX; 
        velocidades.velocidadeY = (int) velocidadeY; 
        velocidades.velocidadeZ = (int) velocidadeZ;
        return velocidades;
    } 

    public Velocidades converter (float velocidadeX, float velocidadeY, float velocidadeZ) {
        if (velocidadeX > 20000) {
            return conversaoDouble(velocidadeX, velocidadeY, velocidadeZ);
        } else {
            Velocidades velocidades = new Velocidades();
            velocidades.velocidadeX = velocidadeX; 
            velocidades.velocidadeY = velocidadeY; 
             velocidades.velocidadeZ = velocidadeZ;
            return velocidades;
        }
    }

    

}
    
