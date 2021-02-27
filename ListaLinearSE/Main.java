class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Node n = new Node(18);
    //System.out.println(n);

    ListaSE l = new ListaSE();
    l.setHead(n);
    l.inserir(13);
    l.inserir(50);
    l.imprimir();
    l.inserir(100);
    l.imprimir();
    //[18]->[13]->//
    System.out.println(l.busca(0));
    System.out.println(l.busca(20));
    System.out.println(l.busca(50));
  }
}