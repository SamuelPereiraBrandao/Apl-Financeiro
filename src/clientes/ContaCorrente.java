/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import tarifas.Tarifas;

/**
 *
 * @author 00250205
 */
public class ContaCorrente extends Conta implements Tarifas{
    public ContaCorrente(){
        super();
    }
    
    public ContaCorrente(float saldo){
        super(saldo);
        
    }
    @Override
    public void depositar(float valor){
            super.depositar(valor);
    
        
    }
    @Override
    public void setSaldo(float saldo){
        super.setSaldo(getSaldo() + saldo - TARIFA);
    }
}
