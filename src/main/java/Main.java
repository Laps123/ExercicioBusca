public class Main {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Aventuras de Alice no País das Maravilhas", "Lewis Carroll", 1865, 25.0);
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, 30.0);
        Livro livro3 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, 20.0);
        Livro livro4 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 35.0);

        
        List<Livro> listaLivros = new ArrayList<>();
        listaLivros.add(livro1);
        listaLivros.add(livro2);
        listaLivros.add(livro3);
        listaLivros.add(livro4);

        
        Biblioteca biblioteca = new Biblioteca(listaLivros);

        
        System.out.println("Busca por título:");
        Livro livroEncontrado = biblioteca.buscarLivroPorTitulo("Dom Quixote");
        if (livroEncontrado != null) {
            System.out.println("Livro encontrado: " + livroEncontrado);
        } else {
            System.out.println("Livro não encontrado.");
        }

        
        System.out.println("\nBusca por autor:");
        List<Livro> livrosAutor = biblioteca.buscarLivrosPorAutor("J.K. Rowling");
        if (!livrosAutor.isEmpty()) {
            System.out.println("Livros encontrados do autor J.K. Rowling:");
            for (Livro livro : livrosAutor) {
                System.out.println(livro);
            }
        } else {
            System.out.println("Nenhum livro encontrado do autor J.K. Rowling.");
        }

        
        System.out.println("\nBusca por ano de publicação:");
        List<Livro> livrosAno = biblioteca.buscarLivrosPorAno(1997);
        if (!livrosAno.isEmpty()) {
            System.out.println("Livros publicados em 1997:");
            for (Livro livro : livrosAno) {
                System.out.println(livro);
            }
        } else {
            System.out.println("Nenhum livro publicado em 1997 encontrado.");
        }

        
        System.out.println("\nMonitoramento de variação de preços:");
        int[] periodoPreco = biblioteca.encontrarPeriodoPreco(30.0);
        System.out.println("Primeira ocorrência do preço 30.0: " + periodoPreco[0]);
        System.out.println("Última ocorrência do preço 30.0: " + periodoPreco[1]);
    }
}
