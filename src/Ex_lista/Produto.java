package Ex_lista;

public class Produto {
	
	int primeiro = 0;
	int ultimo = 0;
	
	private String nome;
    private int qtd;
    private int vlr_total;
    private String descricao; 
    
    public Produto(String nome, int qtd, int vlr_total, String descricao) {
    this.nome = nome;
    this.qtd = qtd;
    this.vlr_total = vlr_total;
    this.descricao = descricao;
}
	
	   public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public int getVlr_total() {
		return vlr_total;
	}
	public void setVlr_total(int vlr_total) {
		this.vlr_total = vlr_total;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	   public void Imprime(Produto p1){
	         
	        System.out.println(this.nome);
	        System.out.println(this.qtd);
	        System.out.println(this.vlr_total);
	        System.out.println(this.descricao);
	        
	    }
		public boolean Vazia() {
			return(this.primeiro == this.ultimo);
		}




}
