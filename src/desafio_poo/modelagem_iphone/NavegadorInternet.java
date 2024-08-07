package desafio_poo.modelagem_iphone;

public class NavegadorInternet {
  private String url;
  
  public NavegadorInternet(String url) {
    this.url = url;
    System.out.println("bem vindo ao safari, voce esta na aba inicial");
  }
  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String exibirPagina(String url) {
    return "https://" + url;
  }
  
  public void adicionarNovaAba() {
    System.out.println("adicionando uma nova aba ao navegador...");
  }
  
  public void atualizarPagina() {
    System.out.println("atualizando pagina...");
  }
}
