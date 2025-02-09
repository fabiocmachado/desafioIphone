import iphone.iPhone;

public class Main {
    public static void main(String[] args) {

        iPhone meuIphone = new iPhone();

        System.out.println("== Reprodutor Musical ==");
        meuIphone.selecionarMusica("Metallica - One");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\n== Aparelho Telefônico ==");
        meuIphone.ligar("999-999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n== Navegador na Internet ==");
        meuIphone.exibirPagina("www.metallica.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}