package com.mycompany.projetointegrador_etapa6.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservaServiceTest {

    @Test
    public void testCalcularValorTotalDiariasComSucesso() {
        ReservaService service = new ReservaService();
        double resultado = service.calcularValorTotalDiarias(5, 150.0);
        assertEquals(750.0, resultado, 0.001, "O valor total das diárias deve ser R$ 750,00");
    }

    @Test
    public void testCalcularValorTotalDiariasComDiasInvalidos() {
        ReservaService service = new ReservaService();
        double resultado = service.calcularValorTotalDiarias(0, 150.0);
        assertEquals(0.0, resultado, 0.001, "Dias zerados devem retornar 0.0");
    }
}