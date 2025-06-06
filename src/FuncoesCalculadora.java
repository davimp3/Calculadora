public class FuncoesCalculadora {
    double numero1, numero2, total;

    public FuncoesCalculadora(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

        public double numero1(){
            return numero1;
        }

        public double numero2(){
            return numero2;
        }

        public double getSoma(){
            return this.total;
        }

        public void soma(){
            total = numero1+numero2;
        }

        public double getSubtracao(){
            return this.total;
        }

        public void subtracao(){
            total = numero1 - numero2;
        }

        public double getMultiplicacao(){
            return this.total;
        }

        public void multiplicacao(){
            total = numero1*numero2;
        }

        public double getDivisao(){
            return this.total;
        }

        public void divisao(){
                total = numero1/numero2;
                    if(numero2 == 0){
                        System.out.println("Impossível realizar divisão por 0");
                    }
        }

        public double getElevacao(){
            return this.total;
        }

        public void elevacao(){
            total = Math.pow(numero1, numero2);
                if(numero2 == 0){
                    System.out.println("Numeros elevados a 0 são iguais a 1.");
                }
        }

        public double getRaiz(){
            return this.total;
        }

        public void raizQuadrada(){
            total = Math.sqrt(numero1);
                if(numero1 < 0){
                    System.out.println("Não existe raiz quadrada de numero negativo.");
                }
        }

}
