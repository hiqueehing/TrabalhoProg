/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoprog;

/**
 *
 * @author 08330943941
 */
public class Pedido {
    
    private int idPedido;
    private String data;
    private String hora;
    private String status;
    private int qtd;
    private Produto produto;

    public Pedido(int idPedido, String data, String hora, String status, int qtd, Produto produto) {
        this.idPedido = idPedido;
        this.data = data;
        this.hora = hora;
        this.status = status;
        this.qtd = qtd;
        this.produto = produto;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
