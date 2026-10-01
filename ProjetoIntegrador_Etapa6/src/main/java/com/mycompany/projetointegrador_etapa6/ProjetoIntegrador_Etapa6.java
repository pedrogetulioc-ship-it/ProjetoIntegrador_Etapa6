package com.mycompany.projetointegrador_etapa6;

import com.mycompany.projetointegrador_etapa6.model.Reserva;
import com.mycompany.projetointegrador_etapa6.service.ReservaService;
import com.mycompany.projetointegrador_etapa6.dao.ReservaDAO;

public class ProjetoIntegrador_Etapa6 {

    public static void main(String[] args) {
        System.out.println("=== TESTANDO SISTEMA REFACTORADO (ETAPA 6) ===");

        // Instanciando serviços e DAO
        ReservaService service = new ReservaService();
        ReservaDAO dao = new ReservaDAO();

        // Teste 1: Criando uma reserva válida
        Reserva reservaValida = new Reserva("Pedro Henrique", "pedro@email.com", "10/10/2026", "15/10/2026", 2, 1);
        
        System.out.println("\n--- Teste 1: Cadastro Válido ---");
        if (service.validarReserva(reservaValida)) {
            dao.salvar(reservaValida);
            System.out.println("Resultado: TESTE 1 PASSOU!");
        } else {
            System.out.println("Resultado: TESTE 1 FALHOU!");
        }

        // Teste 2: Criando uma reserva inválida (sem e-mail correto)
        Reserva reservaInvalida = new Reserva("João Silva", "joaosilva.com", "12/10/2026", "14/10/2026", 0, 0);
        
        System.out.println("\n--- Teste 2: Cadastro Inválido ---");
        if (service.validarReserva(reservaInvalida)) {
            dao.salvar(reservaInvalida);
        } else {
            System.out.println("Resultado: TESTE 2 PASSOU (O sistema bloqueou dados inválidos corretamente)!");
        }
    }
}