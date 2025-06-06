
import java.util.Scanner;

public class Menu extends FuncoesCalculadora {
    private String [] menu ={ 
        "Selecione o tipo da operação:  |Soma, Subtracao, Divisao, Multiplicacao, Elevacao, Raiz. Para sair, pressione Q|",
        "Digite o primeiro numero:",
        "Digite o segundo numero:",
        "Gostaria de repetir a operação? [S | N]",
        "Pressione Q para sair.",
    };
    private String operacao;
    private boolean repetirCalculo = false;

    public Menu(double numero1, double numero2) {
        super(numero1, numero2);
    }

        public void processadorEntradas(){


                    Scanner scanner = new Scanner(System.in);


                    System.out.println(menu[0]);
                            operacao = scanner.next().toLowerCase();
                                if(operacao.equals("q")){
                                    repetirCalculo = true;
                                }

                    while(!repetirCalculo){
                                     
                        System.out.println(menu[1]);
                        double numero1 = scanner.nextDouble();

                        System.out.println(menu[2]);
                        double numero2 = scanner.nextDouble();

                                                   
                            FuncoesCalculadora funcoesCalculadora = new FuncoesCalculadora(numero1, numero2);

                            switch(operacao){
                                case "soma" -> {
                                    funcoesCalculadora.soma();
                                    System.out.println("O resultado é:"+funcoesCalculadora.getSoma());
                                }

                                case "subtracao" -> {
                                    funcoesCalculadora.subtracao();
                                    System.out.println(funcoesCalculadora.getSubtracao());
                                }

                                case "divisao" ->{
                                    funcoesCalculadora.divisao();
                                    System.out.println(funcoesCalculadora.getDivisao());
                                }

                                case "multiplicacao" ->{
                                    funcoesCalculadora.multiplicacao();
                                    System.out.println(funcoesCalculadora.getMultiplicacao());
                                }

                                case "elevacao" ->{
                                    funcoesCalculadora.elevacao();
                                    System.out.println(funcoesCalculadora.getElevacao());
                                }

                                case "raiz" ->{
                                    funcoesCalculadora.raizQuadrada();
                                    System.out.println(funcoesCalculadora.getRaiz());
                                }
                            }

                               System.out.println(menu[3]);
                                operacao = scanner.next().toLowerCase();
                                if(operacao.equals("n")){
                                    repetirCalculo = true;
                                }
                    }

                     scanner.close();
             
        }

        
        
    
}
