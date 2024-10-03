public class Ahorcado {
    private int intentosFallidos;

    // Constructor que inicializa los intentos fallidos en 0
    public Ahorcado() {
        this.intentosFallidos = 0;
    }

    // Método para aumentar el número de intentos fallidos
    public void aumentarIntentos() {
        intentosFallidos++;
    }

    // Método para mostrar el dibujo del ahorcado en función de los intentos fallidos
    public void mostrarAhorcado() {
        switch (intentosFallidos) {
            case 1:
                System.out.println("O");
                break;
            case 2:
                System.out.println("O");
                System.out.println("|");
                break;
            case 3:
                System.out.println(" O");
                System.out.println("/|");
                break;
            case 4:
                System.out.println(" O");
                System.out.println("/|\\");
                break;
            case 5:
                System.out.println(" O");
                System.out.println("/|\\");
                System.out.println("/");
                break;
            case 6:
                System.out.println(" O");
                System.out.println("/|\\");
                System.out.println("/ \\");
                System.out.println("¡Perdiste!");
                break;
        }
    }

    // Método para obtener el número de intentos fallidos actuales
    public int getIntentosFallidos() {
        return intentosFallidos;
    }
}
