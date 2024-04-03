
package Model;


public class FaixaEtaria {
    
    private int de;
    private int ate;

    public FaixaEtaria() {
        
    }
    
    public FaixaEtaria(int de, int ate) {
        this.de = de;
        this.ate = ate;
    }

    public int getDe() {
        return de;
    }

    public int getAte() {
        return ate;
    }

    public void setDe(int de) {
        this.de = de;
    }

    public void setAte(int ate) {
        this.ate = ate;
    }
    
    public boolean ehAbaixo() {
       return false;
     }
    
}
