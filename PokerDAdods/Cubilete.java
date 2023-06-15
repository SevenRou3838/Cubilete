import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cubilete {
        public static void main(String[] args) {
                // Contendor dador que contiene las 6 caras
                ArrayList caras = new ArrayList<>();
                caras.add(new Dados(1, 14, " AS"));
                caras.add(new Dados(2, 13, " K"));
                caras.add(new Dados(3, 12, " Q"));
                caras.add(new Dados(4, 11, " J"));
                caras.add(new Dados(5, 10, " Then"));
                caras.add(new Dados(6, 9, " nine"));
                // cada random es un dado con una valor de retorno
                System.out.println("-----Mostrar Lista Aleatoria--------");
                int d1 = (int) (Math.random() * 6);
                System.out.println("Dado1 : " + ((Dados) caras.get(d1)).getId() + " "
                                + ((Dados) caras.get(d1)).getValor() + " "
                                + ((Dados) caras.get(d1)).getCara());

                int d2 = (int) (Math.random() * 6);
                System.out.println("Dado2 : " + ((Dados) caras.get(d2)).getId() + " "
                                + ((Dados) caras.get(d2)).getValor() + " "
                                + ((Dados) caras.get(d2)).getCara());

                int d3 = (int) (Math.random() * 6);
                System.out.println("Dado3 : " + ((Dados) caras.get(d3)).getId() + " "
                                + ((Dados) caras.get(d3)).getValor() + " "
                                + ((Dados) caras.get(d3)).getCara());
                int d4 = (int) (Math.random() * 6);
                System.out.println("Dado4 : " + ((Dados) caras.get(d4)).getId() + " "
                                + ((Dados) caras.get(d4)).getValor() + " "
                                + ((Dados) caras.get(d4)).getCara());
                int d5 = (int) (Math.random() * 6);
                System.out.println("Dado5 : " + ((Dados) caras.get(d5)).getId() + " "
                                + ((Dados) caras.get(d5)).getValor() + " "
                                + ((Dados) caras.get(d5)).getCara());
                int d6 = (int) (Math.random() * 6);
                System.out.println("Dado6 : " + ((Dados) caras.get(d6)).getId() + " "
                                + ((Dados) caras.get(d6)).getValor() + " "
                                + ((Dados) caras.get(d6)).getCara());
                // Sumamos lo svaloes de los dados
                int r = sumar(((Dados) caras.get(d1)).getValor(), ((Dados) caras.get(d2)).getValor(),
                                ((Dados) caras.get(d3)).getValor(), ((Dados) caras.get(d4)).getValor(),
                                ((Dados) caras.get(d5)).getValor(), ((Dados) caras.get(d6)).getValor());
                System.out.println("sumar: " + r);
                //

                Scanner sn = new Scanner(System.in);
                boolean next = false;
                int option;
                while (!next) {
                        System.out.println("Mejorando tu Juego?");
                        System.out.println("Dado1 - tecla 1 ");
                        System.out.println("Dado2 - tecla 2 ");
                        System.out.println("Dado3 - tecla 3 ");
                        System.out.println("Dado4 - tecla 4 ");
                        System.out.println("Dado5 - tecla 5 ");
                        System.out.println("Dado6 - tecla 6 ");

                        System.out.println("Elige los dados: ");
                        option = sn.nextInt();
                        switch (option) {
                                case 1:
                                        System.out.println("Dado1 - tecla 1 ");
                                        break;
                                case 2:
                                        System.out.println("Dado1 - tecla 1 ");
                                        break;
                                case 3:
                                        System.out.println("Dado1 - tecla 1 ");
                                        break;
                                case 4:
                                        System.out.println("Dado1 - tecla 1 ");
                                        break;
                                case 5:
                                        System.out.println("Dado1 - tecla 1 ");
                                        break;
                                case 6:
                                        System.out.println("Dado1 - tecla 1 ");
                                        break;
                                case 7:
                                        System.out.println("next");
                                        next = true;
                                        break;
                                default:
                                        System.out.println("Los dados son solo 652 ");
                        }
                }
        }

        // operaciones logicas
        private static int sumar(int valor, int valor2, int valor3, int valor4, int valor5, int valor6) {
                int c;
                c = valor + valor2 + valor3 + valor4 + valor5 + valor6;
                return c;
        }

        public static void metod(String option) {
                System.out.println(option);
        }

        private static int win(int r) {
                int w;
                return w;
        }

}
