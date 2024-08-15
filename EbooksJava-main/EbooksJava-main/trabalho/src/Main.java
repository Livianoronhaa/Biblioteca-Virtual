import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        Biblical biblioteca = new Biblical();
        biblioteca.adicionarEbook(new Ebook("Java", "John", 29.99, 12345));
        biblioteca.adicionarEbook(new Ebook("Python", "Janete", 19.99, 67890));
        biblioteca.adicionarEbook(new Ebook("Javascript", "Mateus", 24.99, 11223));

        SwingUtilities.invokeLater(() -> new BibliotecaGUI(biblioteca));
    }
}


