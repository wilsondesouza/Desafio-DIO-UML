import eletronicos.iPhone.iPhone;
import eletronicos.internet.Internet;
import eletronicos.telefone.Telefone;
import eletronicos.reprodutorMusical.reprodutorMusical;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        Internet internet = iphone;
        Telefone telefone = iphone;
        reprodutorMusical reprodutormusical = iphone;

        internet.abriEmail();
        telefone.abrirFotos();
        reprodutormusical.selecionarMusica();
        telefone.abrirCalendario();
        internet.abrirNavegador();
        reprodutormusical.tocarMusica();
        iphone.abriEmail();
        iphone.abrirGoogleMaps();
        iphone.assistirVideo();
        iphone.iniciarCorreioVoz();

    }
}