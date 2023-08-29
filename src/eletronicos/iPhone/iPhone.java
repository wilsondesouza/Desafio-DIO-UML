package eletronicos.iPhone;

import eletronicos.internet.Internet;
import eletronicos.reprodutorMusical.reprodutorMusical;
import eletronicos.telefone.Telefone;

public class iPhone implements Internet, reprodutorMusical, Telefone {
    @Override
    public void abriEmail() {
        System.out.println("Abrindo email no iPhone");
    }

    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo Navegador no iPhone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibidndo Página no Safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página no Safari");
    }

    @Override
    public void abrirGoogleMaps() {
        System.out.println("Abrindo Google Maps no iPhone");
    }

    @Override
    public void abrirClima() {
        System.out.println("Abrindo Widget de Clima do iPhone");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Música no iPhone");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando Música no iPhone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhendo Música no iPhone");
    }

    @Override
    public void assistirVideo() {
        System.out.println("Assistindo vídeo no iPhone");
    }

    @Override
    public void pausarVideo() {
        System.out.println("Pausando vídeo no iPhone");
    }

    @Override
    public void alterarVolume() {
        System.out.println("Alterando volume no iPhone");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("Realizando ligação telefônica no iPhone");
    }

    @Override
    public void criarContatos() {
        System.out.println("Criando contatos no iPhone");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo ligação telefônica no iPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo Correio de Voz do iPhone");
    }

    @Override
    public void colocarEspera() {
        System.out.println("Colocar chamada telefônica em espera no iPhone");
    }

    @Override
    public void iniciarSMS() {
        System.out.println("Abrir SMS do iPhone");
    }

    @Override
    public void abrirFotos() {
        System.out.println("Abrir galeria de fotos do iPhone");
    }

    @Override
    public void abrirCalendario() {
        System.out.println("Abrir Calendário no iPhone");
    }
}
