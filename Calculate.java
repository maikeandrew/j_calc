import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;
import java.lang.foreign.SymbolLookup;


public class Calculate {

    //Functions
    static double sum(double x, double y){
        return x +y;
    }

    static double minus(double x, double y){
        return  x - y;
    }

    static double multiply(double x, double y){
        return x * y;
    }

    static double divide(double x, double y){
        if(y == 0){
            throw new ArithmeticException("Erro: Divisao por zero.");
        }
        return x / y;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Informe o primeiro valor: ");
            double x = scanner.nextDouble();

            System.out.print("Informe a operacao (+, -, *, /): ");
            String op = scanner.next();

            System.out.print("Informe o segundo valor: ");
            double y = scanner.nextDouble();

            double resultado;

            switch (op){
                case "+":
                    resultado = sum(x, y);
                    break;
                case "-":
                    resultado = minus(x,y);
                    break;
                case "*":
                    resultado = multiply(x, y);
                    break;
                case "/":
                    resultado = divide(x, y);
                    break;
                default:
                    System.out.println("Operacoes invalida. Use uma das seguintes: +, -, *, /");
                    return;
            }

            System.out.println("Resultado: " + resultado);
        } catch (IllegalArgumentException e){
            System.out.println("Erro: Os valores informados devem ser numeros.");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}