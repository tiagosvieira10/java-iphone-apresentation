public class Iphone implements MusicPlayer, Phone, WebBrowser {
  @Override
  public void playMusic() {
      System.out.println("Reproduzindo música...");
  }

  @Override
  public void pauseMusic() {
      System.out.println("Música pausada.");
  }

  @Override
  public void stopMusic() {
      System.out.println("Música parada.");
  }

  @Override
  public void makeCall(String number) {
      System.out.println("Ligando para " + number + "...");
  }

  @Override
  public void receiveCall() {
      System.out.println("Recebendo chamada...");
  }

  @Override
  public void endCall() {
      System.out.println("Chamada encerrada.");
  }

  @Override
  public void openWebsite(String url) {
      System.out.println("Abrindo site: " + url);
  }

  @Override
  public void refreshPage() {
      System.out.println("Recarregando página...");
  }

  @Override
  public void goBack() {
      System.out.println("Voltando para a página anterior...");
  }
}
