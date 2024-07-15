import java.time.LocalDate;

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
                mentoria.setTitulo("mentoria java");
                System.out.println(mentoria);

                //não da para por new em conteudo pq e uma classe abstrata 
                Conteudo conteudo = new Curso();
                

                        Bootcamp bootcamp = new Bootcamp();
                        bootcamp.setNome("Bootcamp java developer ");
                        bootcamp.setDescricao("descricao bootcamp java developer");
                        bootcamp.getConteudos().add(curso1);
                        bootcamp.getConteudos().add(curso2);
                        bootcamp.getConteudos().add(mentoria);

                        Dev devCamila = new Dev();
                        devCamila.setNome("Camila");
                        devCamila.increverBootcamp(bootcamp);
                        System.out.println("Conteudos inscritos "+devCamila.getConteudosInscritos());
                        devCamila.progredir();
                        System.out.println("Conteudos Concluidos "+devCamila.getConteudosConcluidos());

                        System.out.println("_____________________________________________________________");
                        Dev devJoao = new Dev();
                         devJoao.setNome("João");
                         devJoao.increverBootcamp(bootcamp);
                         System.out.println("Conteudos inscritos "+devJoao.getConteudosInscritos());
                         devJoao.progredir();
                         System.out.println("Conteudos Concluidos "+devJoao.getConteudosConcluidos());



                

            
        }
}
