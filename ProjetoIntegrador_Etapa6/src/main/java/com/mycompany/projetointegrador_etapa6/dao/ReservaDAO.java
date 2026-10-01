package com.mycompany.projetointegrador_etapa6.dao;

import com.mycompany.projetointegrador_etapa6.model.Reserva;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {
    private List<Reserva> bancoDadosSimulado = new ArrayList<>();

    public boolean salvar(Reserva reserva) {
        bancoDadosSimulado.add(reserva);
        System.out.println("DAO: Reserva salva com sucesso para o cliente " + reserva.getNomeCliente());
        return true;
    }

    public List<Reserva> listarTodas() {
        return bancoDadosSimulado;
    }
}