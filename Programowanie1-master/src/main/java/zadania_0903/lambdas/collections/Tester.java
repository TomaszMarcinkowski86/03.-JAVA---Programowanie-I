package zadania_0903.lambdas.collections;

public class Tester {
    public static void main(String[] args) {

        Lotto lotto = new Lotto();
        System.out.println(lotto.wylosuj());

        Lotto lotto2 = new Lotto();
        System.out.println(lotto2.wylosujArray());

        ListaKol listaKol = new ListaKol();
        System.out.println(listaKol.getLista());
        System.out.println(listaKol.getMin());
        System.out.println(listaKol.getMinStream());
        System.out.println(listaKol.max());

        Lista lista = new Lista() ;
        lista.zlaczListy();

        Task6 task6 = new Task6();
        task6.panstwa();
    }
}
