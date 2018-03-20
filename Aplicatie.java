import java.util.Vector;

public class Aplicatie {

  public Aplicatie instance;

  public Vector  myBazaDeDate;
  public Vector  myUser;

  public Aplicatie getIstance () {
    if (instance == null) {
      instance = new Aplicatie();
    }
    return instance;
  }

  public void AdaugaUser(User user, BazaDeDate bd) {
  }

  public void LogIn(User user, BazaDeDate bd) {
  }

  public void EliminaProdus(Produs produs, BazaDeDate bd) {
  }

  public Produs Search(String numeProdus, BazaDeDate bd) {
    return new Produs();
  }

  public void AdaugaProdus(Produs produs, BazaDeDate bd) {
  }

  public void scoateUser(User User, BazaDeDate bd) {
  }


}