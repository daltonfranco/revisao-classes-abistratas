public class App {


    public static void main(String[] args) {
        
        Papagaio papagaio = new Papagaio();
        Aguia aguia = new Aguia();

        papagaio.setNome("Loro");
        System.out.println(papagaio.voar());
        System.out.println(papagaio.nadar());

        aguia.setNome("Jose");
        System.out.println(aguia.nadar());
        System.out.println(aguia.voar());

    }
    
}
