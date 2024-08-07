package desafio_controle_fluxo;

/**
 * @author tiago_bela
 */
public class ParametrosInvalidosException extends Exception {
  private static final long serialVersionUID = 1L;

  public ParametrosInvalidosException(String mensagem_erro) {
    super(mensagem_erro);
  }
  
  public ParametrosInvalidosException() {
    super("ERRO!!");
  }
  
}
