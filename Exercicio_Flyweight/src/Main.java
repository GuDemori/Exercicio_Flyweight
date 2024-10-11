import java.util.Random;

public class Main {

   public static FormaManager formaManager = new FormaManager();

    public static void main(String[] args) {
        formaManager.addForma("Vermelho", "12,35", 7);
        formaManager.addForma("Rosa", "24,02", 12);
        formaManager.addForma("Preto", "19,45", 3);
        formaManager.addForma("Amarelo", "17,29", 35);
        formaManager.addForma("Verde", "10,01", 54);
        formaManager.addForma("Azul", "27, 34", 19);

        FormaManager.apresentar();
    }

}
