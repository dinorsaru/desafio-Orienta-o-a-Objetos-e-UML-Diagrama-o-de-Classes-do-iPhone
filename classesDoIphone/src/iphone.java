public class iphone implements ReprodutorMusica, aparelhoEletronico, navegador{

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("musica pausada");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("selecionando musica...");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("musica tocando");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("correio de voz iniciado");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("ligando...");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("navegador abrindo outra aba");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("navegador atualizando pagina");
    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("pagina exibida" );
    }
    
    
}
