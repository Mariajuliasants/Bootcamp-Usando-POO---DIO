import java.time.LocalDate;

public class Mentoria {
     String tituto;
     String descricao;
     LocalDate data;
     
    public Mentoria(){
        
    }

    public String getTituto() {
        return tituto;
    }
    public void setTituto(String tituto) {
        this.tituto = tituto;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria [tituto: " + tituto + ", descricao: " + descricao + ", data: " + data + " ]";
    }

     
}
