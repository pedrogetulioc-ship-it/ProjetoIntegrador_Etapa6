package com.mycompany.projetointegrador_etapa6.model;

public class Reserva {
    private String nomeCliente;
    private String email;
    private String dataEntrada;
    private String dataSaida;
    private int quantidadeAdultos;
    private int quantidadeCriancas;

    public Reserva(String nomeCliente, String email, String dataEntrada, String dataSaida, int quantidadeAdultos, int quantidadeCriancas) {
        this.nomeCliente = nomeCliente;
        this.email = email;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quantidadeAdultos = quantidadeAdultos;
        this.quantidadeCriancas = quantidadeCriancas;
    }

    // Getters e Setters
    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDataEntrada() { return dataEntrada; }
    public void setDataEntrada(String dataEntrada) { this.dataEntrada = dataEntrada; }

    public String getDataSaida() { return dataSaida; }
    public void setDataSaida(String dataSaida) { this.dataSaida = dataSaida; }

    public int getQuantidadeAdultos() { return quantidadeAdultos; }
    public void setQuantidadeAdultos(int quantidadeAdultos) { this.quantidadeAdultos = quantidadeAdultos; }

    public int getQuantidadeCriancas() { return quantidadeCriancas; }
    public void setQuantidadeCriancas(int quantidadeCriancas) { this.quantidadeCriancas = quantidadeCriancas; }
}