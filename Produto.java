package Model;

/**
 *
 * @author kauaw
 */
public class Produto {
    public String nome;
    public double ValorCusto;
    public double ValorVenda;
    public int quantidade;
    
  //metodos
    public double calcularLucroUnitario(){
        return this.ValorVenda-this.ValorCusto;
    }
    public double calcularLucroTotal(){
     return this.calcularLucroUnitario()*this.quantidade;
    }
}
