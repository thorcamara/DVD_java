
package Model;

import java.util.*;

public class Amigo extends Pessoa {
    
    private long numTelefone;
    private String email;
    private String endereco;
    
    public Amigo() {
        
    }

    public Amigo(long numTelefone, String email, String endereco) {
        this.numTelefone = numTelefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Amigo(long numTelefone, String email, String endereco, String nome) {
        super(nome);
        this.numTelefone = numTelefone;
        this.email = email;
        this.endereco = endereco;
    }

    public long getNumTelefone() {
        return numTelefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNumTelefone(long numTelefone) {
        this.numTelefone = numTelefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Amigo{" + "numTelefone=" + numTelefone + ", email=" + email + ", endereco=" + endereco + '}';
    }

     
    
   
    
    
    
}
