package celular;

public class Celular implements Telefone, Internet, TocadorMusical {

  public boolean isOn = false;
  public boolean isConnected = false;
  public boolean isCall = false;
  public boolean isPlay = false;

  @Override
  public void ligar() {
    if (!isOn) {
      System.out.println("celular ligado!");
      isOn = true;
    } else {
      desligar();
    }
  }

  @Override
  public void desligar() {
    if (isOn) {
      System.out.println("By by desligando....");
      isOn = false;
    } else {
      ligar();
    }
  }

  @Override
  public void atenderLigacao() {
    System.out.println("ligação atendida!");
    isCall = true;
  }

  @Override
  public void fazerChamada() {
    if (!isCall) {
      System.out.println("chamada em progresso...");
      isCall = true;
    } else {
      System.out.println("já existe uma chamama ativa!");
    }
  }

  @Override
  public void encerrarLigacao() {
    if (isCall) {
      System.out.println("chamada finalizada!");
      isCall = false;
    } else {
      System.out.println("nenhuma chamada ativa!");
    }
  }

  @Override
  public void aumentarVolume() {
    if (isOn) {
      System.out.println("volume aumentado!");
    }
  }

  @Override
  public void baixarVolume() {
    if (isOn) {
      System.out.println("volume diminuído");
    }
  }

  @Override
  public void listarMusicas() {
    System.out.println("lista de musicas........");
  }

  @Override
  public void tocarMusica() {
    System.out.println("música tocando");
    isPlay = true;
  }

  @Override
  public void pausarMusica() {
    if (isPlay) {
      System.out.println("música pausada");
      isPlay = false;
    } else {
      System.out.println("nenhuma música sendo reproduzida");
    }
  }

  @Override
  public void pararMusica() {
    if (isPlay) {
      System.out.println("música parada");
      isPlay = false;
    } else {
      System.out.println("nenhuma música sendo reproduzida");
    }
  }

  @Override
  public void apagarMusica() {
    System.out.println("música apagada!");
  }

  @Override
  public void procurarMusica() {
    System.out.println("procurando música...");
  }

  @Override
  public void conectarInternet() {
    System.out.println("conectado a internet!");
    isConnected = true;
  }

  @Override
  public void desconectarInternet() {
    System.out.println("desconectado da internet!");
    isConnected = false;
  }

  @Override
  public void navegar() {
    if (isConnected) {
      System.out.println("acessando sites...");
    } else {
      System.out.println("sem internet...");
    }
  }
}
