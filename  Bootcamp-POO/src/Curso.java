
public class Curso extends Conteudo{

    private  int cargaHoraria;

    public Curso(){
        
    } 
 
    
    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + ", CalcularXp()=" + CalcularXp() + ", getTitulo()=" + getTitulo()
                + ", getDescricao()=" + getDescricao() + "]";
    }


    @Override
    public double CalcularXp() {
        return XP_PADRAO + cargaHoraria ;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }


    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
}
