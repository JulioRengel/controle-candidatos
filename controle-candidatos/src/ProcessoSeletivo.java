import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos ){
            entrandoEmContato(candidato);

        }
       // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
    }
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
    static void entrandoEmContato (String candidato){
        int tentativasrealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasrealizadas ++ ;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
                
                


        }while(continuarTentando && tentativasrealizadas < 3);

        if (atendeu) 
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasrealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasrealizadas + " REALIZADAS");
        

    }

    static void imprimirSelecionados (){
         String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
         System.out.println("Imprimindo alista de candidados informando o indice do elemento");

         for(int indice = 0; indice < candidatos.length; indice ++){
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
         }
    }

    static void selecaoCandidatos (){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatoSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato +" Solicitou este valor de salario" + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
                candidatoSelecionados ++ ;

            }
            candidatoAtual ++; 
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        
        }else if (salarioBase == salarioPretendido) 
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA POPOSTA");
            
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
