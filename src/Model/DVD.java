
package Model;


public class DVD {
    
    private String titulo;
    private String sinopse;
    
    private Genero Terror;
    
    private FaixaEtaria mais18;
    
    public DVD() {
        
    }

    public DVD(String titulo, String sinopse) {
        this.titulo = titulo;
        this.sinopse = sinopse;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "DVD{" + "titulo=" + titulo + ", sinopse=" + sinopse + '}';
    }
    
    
}
