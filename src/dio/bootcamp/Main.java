package dio.bootcamp;

public class Main {

      public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem( 9);
        Mensagem.obterMensagem( 14);
        Mensagem.obterMensagem( 1);


        //Emprestimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);


        int i;
        //int i;
        int I;
        //int 1a;
        int _1a;
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15;
        int asrn24678md;
        //int asrn246 78md;
        int asrn246_78md;
        //int asrn2$46%78_md;

        asrn24678md = 100;
        asrn246_78md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5;
        int QUANTIDADE_OPCOES = 25;
        //int qtdeProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn246_78md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 60000;

        //int i1 = -10000000000000000000000;
        int i2 = 20500;

        long l1 = 1000000000000000000L;
        long l2 = 2009400000000000000L;

        //float f1 = 4.5;
        float f2 = 10.5f;

        double d1 = 25.09;
        double d2 = 99.10d;

        char c1 = 'w';
        //char c2 = 'lw';
        char c3 = '\u0057'; //é o cod unicode do w

        String st1 = "fulano";
        String st2 = "ciclano";
        String st3 = "hoje a aula está daquele jeito";

        //String st4 = "15/07/2022";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        System.out.println("PrePós");
        prePos();
        System.out.println("Aritméticos");
        aritmeticos();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

    }
        private static void prePos(){
            int k = 10;

            int i = ++k;
            int j = k--;
            int x = k;

            System.out.println("i: " + i);
            System.out.println("j: " + j);
            System.out.println("x: " + x);
    }

        private static void aritmeticos(){
            int a = 10;
            int b = 20;
            int c = 30;
            int d = 40;
            int e = 50;

            int r1 = a+b;
            int r2 = c-a;
            int r3 = d*b;
            int r4 = e/a;
            int r5 = c%b;

            System.out.println("a+b = " + r1);
            System.out.println("c-a = " + r2);
            System.out.println("d*b = " + r3);
            System.out.println("e/a = " + r4);
            System.out.println("c%b = " + r5);
    }

        private static void atribuicao(){
            int i = 1500;
            short j = 15;
            long l = 500L;
            int k = 35;
            float f = 3.5f;
            double d = f;

            System.out.println("d: " + d);

            i += 5; // i = i + 5;
            j -= 3; // j = j - 3;
            d /= 2.7d; // d = d / 2.7d;
            l *= 3; // l = l * 3;
            k %= 2; // k = k % 2;


            System.out.println("i = " + i);
            System.out.println("j = " + j);
            System.out.println("d = " + d);
            System.out.println("l = " + l);
            System.out.println("k = " + k);

            i = k + j;

            System.out.println("k = " + k);
            System.out.println("i = " + i);

    }

        private static void precedencia(){

            int i = 10;
            int j = 20;
            int k = 30;

            int a = i++ + --j * k; // 10 + 19 * 30 = 10 + 570 = 580

            System.out.println("i++ + --j * k: " + a);
            System.out.println("i: " + i); //11

            int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 = 3 % 3 + 1 = 0 + 1 = 1
            System.out.println("k / --i % 3 + 1: " + b);
            System.out.println("i: " + i); //10

            int c = 2;
            c *= i += 5; // c = 2 * i; i = i + 5; c = 2 * i; i = 10 + 5; c = 2 * 15; c = 30;
            System.out.println("c *= i +=5: " + c);

        }

}
