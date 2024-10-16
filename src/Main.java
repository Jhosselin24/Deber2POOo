public class Main {
    public static void main(String[] args) {
        // Cancion
        Cancion cancion1 = new Cancion("Sparks fly", "Tylor Swift");
        Cancion cancion2 = new Cancion("All of me", "John Legend");
        cancion1.imprimirInfo();
        cancion2.imprimirInfo();

        // Serie
        Serie serie1 = new Serie("Breaking Bad", 5);
        Serie serie2 = new Serie("Elite", 4);
        serie1.imprimirInfo();
        serie2.imprimirInfo();

        // Videojuego
        Videojuego juego1 = new Videojuego("The Legend of Zelda", "Aventura");
        Videojuego juego2 = new Videojuego("God of War", "Acción");
        juego1.imprimirInfo();
        juego2.imprimirInfo();

        // Persona
        Persona persona1 = new Persona("Jhosselin", 23);
        Persona persona2 = new Persona("Britani", 20);
        persona1.imprimirInfo();
        persona2.imprimirInfo();

        // Auto
        Auto auto1 = new Auto("Toyota", "Corolla");
        Auto auto2 = new Auto("Ford", "Mustang");
        auto1.imprimirInfo();
        auto2.imprimirInfo();

        // Transporte
        Transporte transporte1 = new Transporte("Avión", 600);
        Transporte transporte2 = new Transporte("Tren", 80);
        transporte1.imprimirInfo();
        transporte2.imprimirInfo();

        // Materia
        Materia materia1 = new Materia("Matemáticas", "Álgebra");
        Materia materia2 = new Materia("Historia", "Edad Media");
        materia1.imprimirInfo();
        materia2.imprimirInfo();

        // Zapato
        Zapato zapato1 = new Zapato("Nike", 42);
        Zapato zapato2 = new Zapato("Adidas", 31);
        zapato1.imprimirInfo();
        zapato2.imprimirInfo();

        // InstrumentoMusical
        InstrumentoMusical instrumento1 = new InstrumentoMusical("Guitarra", "Cuerdas");
        InstrumentoMusical instrumento2 = new InstrumentoMusical("Piano", "Teclas");
        instrumento1.imprimirInfo();
        instrumento2.imprimirInfo();

        // Pelicula
        Pelicula pelicula1 = new Pelicula("Inception", "Christopher Nolan");
        Pelicula pelicula2 = new Pelicula("The Godfather", "Francis Ford Coppola");
        pelicula1.imprimirInfo();
        pelicula2.imprimirInfo();
    }
}

class Cancion {
    private String titulo;
    private String artista;

    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public void imprimirInfo() {
        System.out.println("Canción: " + titulo + " - Artista: " + artista);
    }
}

class Serie {
    private String titulo;
    private int temporadas;

    public Serie(String titulo, int temporadas) {
        this.titulo = titulo;
        this.temporadas = temporadas;
    }

    public void imprimirInfo() {
        System.out.println("Serie: " + titulo + " - Temporadas: " + temporadas);
    }
}

class Videojuego {
    private String titulo;
    private String genero;

    public Videojuego(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public void imprimirInfo() {
        System.out.println("Videojuego: " + titulo + " - Género: " + genero);
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirInfo() {
        System.out.println("Persona: " + nombre + " - Edad: " + edad);
    }
}

class Auto {
    private String marca;
    private String modelo;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void imprimirInfo() {
        System.out.println("Auto: " + marca + " - Modelo: " + modelo);
    }
}

class Transporte {
    private String tipo;
    private int velocidadMaxima;

    public Transporte(String tipo, int velocidadMaxima) {
        this.tipo = tipo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void imprimirInfo() {
        System.out.println("Transporte: " + tipo + " - Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}

class Materia {
    private String nombre;
    private String tema;

    public Materia(String nombre, String tema) {
        this.nombre = nombre;
        this.tema = tema;
    }

    public void imprimirInfo() {
        System.out.println("Materia: " + nombre + " - Tema: " + tema);
    }
}

class Zapato {
    private String marca;
    private int talla;

    public Zapato(String marca, int talla) {
        this.marca = marca;
        this.talla = talla;
    }

    public void imprimirInfo() {
        System.out.println("Zapato: " + marca + " - Talla: " + talla);
    }
}

class InstrumentoMusical {
    private String nombre;
    private String tipo;

    public InstrumentoMusical(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void imprimirInfo() {
        System.out.println("Instrumento Musical: " + nombre + " - Tipo: " + tipo);
    }
}

class Pelicula {
    private String titulo;
    private String director;

    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    public void imprimirInfo() {
        System.out.println("Película: " + titulo + " - Director: " + director);
    }
}
