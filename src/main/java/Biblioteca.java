class Biblioteca {
    private List<Livro> livros;

    public Biblioteca(List<Livro> livros) {
        this.livros = livros;
        Collections.sort(this.livros); 
    }

    
    public Livro buscarLivroPorTitulo(String titulo) {
        int baixo = 0;
        int alto = livros.size() - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            Livro livroMeio = livros.get(meio);
            int comparacao = livroMeio.getTitulo().compareTo(titulo);

            if (comparacao == 0) {
                return livroMeio;
            } else if (comparacao < 0) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }

        return null; // Livro não encontrado
    }

       public List<Livro> buscarLivrosPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosDoAutor.add(livro);
            }
        }

        return livrosDoAutor;
    }

    
    public List<Livro> buscarLivrosPorAno(int ano) {
        List<Livro> livrosDoAno = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getAnoPublicacao() == ano) {
                livrosDoAno.add(livro);
            }
        }

        return livrosDoAno;
    }

    
    public int[] encontrarPeriodoPreco(double preco) {
        int primeiraOcorrencia = buscarPrimeiraOcorrenciaPreco(preco);
        int ultimaOcorrencia = buscarUltimaOcorrenciaPreco(preco);

        return new int[]{primeiraOcorrencia, ultimaOcorrencia};
    }

    
    private int buscarPrimeiraOcorrenciaPreco(double preco) {
        int baixo = 0;
        int alto = livros.size() - 1;
        int resultado = -1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            double precoMeio = livros.get(meio).getPreco();

            if (precoMeio == preco) {
                resultado = meio;
                alto = meio - 1;
            } else if (precoMeio < preco) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }

        return resultado;
    }

    
    private int buscarUltimaOcorrenciaPreco(double preco) {
        int baixo = 0;
        int alto = livros.size() - 1;
        int resultado = -1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            double precoMeio = livros.get(meio).getPreco();

            if (precoMeio == preco) {
                resultado = meio;
                baixo = meio + 1;
            } else if (precoMeio < preco) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }

        return resultado;
    }
}
