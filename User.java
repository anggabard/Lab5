import java.util.Vector;

public class User {

  private String Email;
  private String Parola;
  private Cos cos;

  public User(String email, String parola) {
    this.Email = email;
    this.Parola = parola;
    this.cos = new Cos();
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String email) {
    Email = email;
  }

  public String getParola() {
    return Parola;
  }

  public void setParola(String parola) {
    Parola = parola;
  }

  public Cos getCos() {
    return cos;
  }

  public void setCos(Cos cos) {
    this.cos = cos;
  }

  public void AdaugaProdus(Cos Cos, Produs Produs) {
  }

  public void ScoateProdus(Cos cos, Produs Produs) {
  }

  public void Plateste(Cos Cos) {
  }

}