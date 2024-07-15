import java.time.LocalDate;

public class Mentoria extends Conteudo {
     
     private LocalDate data;
     
    public Mentoria(){

    }
    

    @Override
    public double CalcularXp() {
        return XP_PADRAO + 20 ;
    }

    @Override
    public String toString() {
        return "Mentoria [data=" + data + ", CalcularXp()=" + CalcularXp() + ", getTitulo()=" + getTitulo()
                + ", getDescricao()=" + getDescricao() + "]";
    }


    public LocalDate getData() {
        return data;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }

    

     
}
