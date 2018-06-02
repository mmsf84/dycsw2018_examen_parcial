package pregunta4;

public class RefIEEE {
	private String anhio;
    private String autor;
    private String titulo;
    
    public RefIEEE(String[] ref) {
    	this.anhio = ref[0];
		this.autor = ref[1];
		this.titulo = ref[2];
    }
    
	public RefIEEE(String anhio, String autor, String titulo) {
		this.anhio = anhio;
		this.autor = autor;
		this.titulo = titulo;
	}

	public String getAnhio() {
		return anhio;
	}

	public void setAnhio(String anhio) {
		this.anhio = anhio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
