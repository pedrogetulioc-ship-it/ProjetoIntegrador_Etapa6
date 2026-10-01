package com.mycompany.projetointegrador_etapa6.service;

import com.mycompany.projetointegrador_etapa6.model.Reserva;

public class ReservaService {

    // Método de validação de dados da reserva
    public boolean validarReserva(Reserva reserva) {
        if (reserva.getNomeCliente() == null || reserva.getNomeCliente().trim().isEmpty()) {
            System.out.println("Erro de Validação: Nome do cliente é obrigatório.");
            return false;
        }
        if (reserva.getEmail() == null || !reserva.getEmail().contains("@")) {
            System.out.println("Erro de Validação: E-mail inválido.");
            return false;
        }
        if (reserva.getQuantidadeAdultos() <= 0) {
            System.out.println("Erro de Validação: A quantidade de adultos deve ser no mínimo 1.");
            return false;
        }
        return true;
    }

    // Método de cálculo simples (Adicionado para os Testes Unitários do JUnit - Etapa 7)
    public double calcularValorTotalDiarias(int dias, double valorDiaria) {
        if (dias <= 0 || valorDiaria <= 0) {
            return 0.0;
        }
        return dias * valorDiaria;
    }
}