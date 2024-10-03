public class Palabra {
    private String palabraOriginal;
    private char[] palabraAdivinada;

    // Constructor que inicializa la palabra original y la palabra adivinada con guiones bajos
    public Palabra(String palabraOriginal) {
        this.palabraOriginal = palabraOriginal;
        this.palabraAdivinada = new char[palabraOriginal.length()];
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }
    }

    // Método para adivinar una letra y actualizar la palabra si la letra es correcta
    public boolean adivinarLetra(char letra) {
        boolean acierto = false;
        for (int i = 0; i < palabraOriginal.length(); i++) {
            if (palabraOriginal.charAt(i) == letra) {
                palabraAdivinada[i] = letra;
                acierto = true;
            }
        }
        return acierto;
    }

    // Método para verificar si la palabra ha sido completamente adivinada
    public boolean estaAdivinada() {
        for (char c : palabraAdivinada) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    // Método para mostrar la palabra en su estado actual, con las letras adivinadas y los guiones bajos
    public void mostrarPalabra() {
        for (char c : palabraAdivinada) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // Método que devuelve la palabra original para mostrarla cuando el juego ha terminado
    public String getPalabraOriginal() {
        return palabraOriginal;
    }
}
