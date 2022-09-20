package Ex_lista;

public class Lista {
	
	
	int primeiro = 0;
	int ultimo = 0;
	int max;
	
	Produto[] produtos = new Produto[max];
	
	public Lista(int max) {
		this.max =max;
	}
	
	
	public void Inserir(Produto p1) {
		if(this.ultimo >= this.produtos.length) {
			System.out.println("Lista cheia");
		}else {
			this.produtos[this.ultimo] = p1;
			this.ultimo = this.ultimo+1;
			System.out.println("Produto inserido");
		}
	}
	
	
	
	
	

}
