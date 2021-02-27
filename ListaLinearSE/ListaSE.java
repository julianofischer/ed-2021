public class ListaSE{
    private Node head;

    public ListaSE(){
      head = null;
    }

    public void setHead(Node h){
      head = h;
    }

    public void inserir(int v){
      Node n = new Node(v);
      if (head == null){
        head = n;
      }else{
         Node pr = head;
         while(pr.getProx() != null){
           pr = pr.getProx();
         }
         pr.setProx(n);
      }
    }

    public void remover(int v){

    }

    public void imprimir(){
      Node pr = head;
      while(pr != null){
        System.out.print(pr);
        System.out.print("->");
        pr = pr.getProx();
      }
      System.out.println("");
    }

    public boolean busca(int v){
      Node pr = head;
      while(pr != null){
        if (pr.getValor()==v){
          return true;
        }
        pr = pr.getProx();
      }
      return false;
    }

    public int tamanho(){
      return 0;
    }
}