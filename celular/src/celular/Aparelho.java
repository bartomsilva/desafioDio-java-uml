package celular;

public class Aparelho {
  public static void main(String[] args) {
    /*
      este aparelho é digital, considerando que tem os botões de volune analógicos
      só vão funcionar quando o aparelho estiver ligado, as demais funcionalidades
      sõ ficam disponíves na tela com o aparelho ligado então entendo que se foram
      acionadas é porque o aparelho está ligado.
    */

    Celular celular = new Celular();
    celular.conectarInternet();
    celular.navegar();
  }

}
