package stockmaster;

import Vista.Login;

public class StockMaster {

    public static void main(String[] args) {
        try {
            System.out.println("Inicio de la aplicación");

            Login lg = new Login();
            lg.setVisible(true);

            System.out.println("Ventana Login mostrada");
        } catch (Exception e) {
            e.printStackTrace();  // Imprime el error completo en la consola
        }
    }
}
