import java.time.LocalDate;

import Curso;
import Mentoria;


public class Main {
        public static void main(String[] args) {
       
                 Curso curso1 = new Curso();
                curso1.setTitulo("curso java");
                curso1.setDescricao("Descrição curso java:");
                curso1.setCargaHoraria(7);
                 System.out.println(curso1);

                 Curso curso2 = new Curso();
                curso1.setTitulo("curso js");
                curso1.setDescricao("Descrição curso js:");
                curso1.setCargaHoraria(4);
                 System.out.println(curso2);
                 
                Mentoria mentoria = new Mentoria();
               
                mentoria.setData(LocalDate.now());
                mentoria.setDescricao("descrição mentoria java");
                mentoria.setTituto("mentoria java");
                System.out.println(mentoria);

            
        }
}
