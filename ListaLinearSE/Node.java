public class Node{
  private int valor;
  private Node prox;

  public Node(int v){
    valor = v;
    prox = null;
  }

  public String toString(){
    return "["+valor+"]";
  }

  public void setProx(Node p){
    prox = p;
  }

  public Node getProx(){
    return prox;
  }

  public int getValor(){
    return valor;
  }
}