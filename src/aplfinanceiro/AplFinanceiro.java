/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplfinanceiro;

import clientes.Aplicacao;
import clientes.Conta;
import clientes.ContaCorrente;

/**
 *
 * @author 00250205
 */
public class AplFinanceiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta cc = new Conta(1000.00f);
        System.out.println("Conta:");
        //System.out.println(cc);
        //cc.setSaldo(1000.00f);
        System.out.println(cc);
        cc.depositar(200.00f);
        System.out.println(cc);
        cc.sacar(300.00f);
        System.out.println(cc);
        
        ContaCorrente ccc = new ContaCorrente();
        System.out.println("ContaCorrente:");
        System.out.println(ccc);
        ccc.setSaldo(1000.00f);
        System.out.println(ccc);
        ccc.depositar(200.00f);
        System.out.println(ccc);
        ccc.sacar(300.00f);
        System.out.println(ccc);
        
                
        Aplicacao cccc = new Aplicacao(1000.00f, 0.10f);
        System.out.println("Rendimento:");
        //System.out.println(cccc);
        cccc.setSaldo(1000.00f);
        System.out.println(cccc);
        cccc.depositar(200.00f);
        System.out.println(cccc);
        cccc.sacar(300.00f);
        System.out.println(cccc);
        
    }
    
}
