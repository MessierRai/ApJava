package CeV.exerciciospt1;

public class Livro implements Publicacao {
	
	private String titulo, autor;
	private int totPaginas, pagAtual;
	private boolean aberto;
	private Pessoa pessoa;
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa pessoa) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 1;
		this.aberto = false;
		this.pessoa = pessoa;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getTotPaginas() {
		return this.totPaginas;
	}
	
	public int getPagAtual() {
		return this.pagAtual;
	}
	
	public void setPagAtual(int pagina) {
		this.pagAtual = pagina;
	}
	
	public boolean getAberto() {
		return this.aberto;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public String getPessoa() {
		return pessoa.getNome();
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void detalhes() {
		System.out.println(this.getTitulo() + "; " + this.getAutor() + "; " + this.getTotPaginas() + " paginas.");
	}

	@Override
	public void abrir() {
		if(this.aberto) {
			System.out.println("Livro já aberto!");
		}else {
			this.setAberto(true);
		}
	}

	@Override
	public void fechar() {
		if(this.aberto) {
			this.setAberto(false);
		}else {
			System.out.println("Livro já fechado!");
		}
	}

	@Override
	public void folhear() {
		for(int i = 1; i <= this.getTotPaginas(); i++) {
			System.out.println("Folheando pg." + i);
		}
		System.out.println("Livro folheado! \n");
	}

	@Override
	public void avancarPag() {
		if(this.getPagAtual() == this.getTotPaginas()) {
			System.out.println("Impossivel avançar!");
		}else {
			this.pagAtual++;
		}
	}

	@Override
	public void voltarPag() {
		if(this.getPagAtual() <= 0) {
			System.out.println("Impossivel voltar!");
		}else {
			this.pagAtual--;
		}
	}

}
