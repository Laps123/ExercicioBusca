class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Livro outroLivro) {
        return this.titulo.compareTo(outroLivro.getTitulo());
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao + ", Preço: " + preco;
    }
}
