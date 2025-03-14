package app;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println("Funções Reprodutor Musical");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Música Teste");
        System.out.println("Funções Aparelho Telefônico");
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("Funções Navegador Internet");
        iphone.exibirPagina("URL teste");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}