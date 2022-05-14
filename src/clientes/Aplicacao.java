/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

/**
 *
 * @author 00250205
 */
public class Aplicacao extends Conta {
    private float rendimentos;
    public Aplicacao(float saldo, float rendimentos){
        super(saldo);
        this.rendimentos = rendimentos;
        
        
    }

    public Aplicacao(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void sacar(float valor){
        super.sacar(valor + valor * rendimentos - valor * IOF);
    }
}
