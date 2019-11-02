import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {

        while (true) {
            Scanner entry = new Scanner(System.in);
            String size;
            String[] fila1 = {" -", "   ", " -", " -", "   ", " -", " -", " -", " -", " -"};
            String[] fila2 = {"| |", " | ", " |", " |", "| |", "| ", "|  ", "  |", "| |", "| |"};
            String[] fila3 = {"   ", "   ", " -", " -", " -", " -", " -", "   ", " -", " -"};
            String[] fila4 = {"| |", " | ", "|  ", " |", " |", " |", "| |", "  |", "| |", " |"};
            String[] fila5 = {" -", "   ", " -", " -", "   ", " -", " -", "   ", " -", " -"};

            size = entry.next();
            String[] sizeElements = size.split(",");
            //verifica si el string es un numero o una cadena
            if (StringUtils.isNumeric(sizeElements[0]) == false || StringUtils.isNumeric(sizeElements[1]) == false) {
                System.out.println("Ingrese un valor numérico");
            } //termina el programa
            else if (Integer.parseInt(sizeElements[0]) == 0 && Integer.parseInt(sizeElements[1]) == 0) {
                break;
            } //limita los numeros al rango deseado
            else if (Integer.parseInt(sizeElements[0]) < 1 || Integer.parseInt(sizeElements[0]) > 10) {
                System.out.println("Ingrese un número entero dentro del rango permitido (1<=n<=10)");
            } else if (Integer.parseInt(sizeElements[0]) >= 1 && Integer.parseInt(sizeElements[0]) <= 10) {
                String number = sizeElements[1];
                System.out.println(number.length());

                for (int i = 0; i < number.length(); i++) {
                    int a = Integer.parseInt(String.valueOf(number.charAt(i)));
                    String[] f2 = fila2[i].split(" ");
                    String[] f4 = fila4[i].split(" ");
                    String b = "  ";
                    for (int j = 0; j < Integer.parseInt(sizeElements[0]); j++) {
                        System.out.print(fila1[a]);
                    }
                    System.out.println("");

                    if (a == 1 || a == 2 || a == 3 || a == 7) {
                        for (int k = 0; k < Integer.parseInt(sizeElements[0]); k++) {
                            System.out.print(new String(new char[Integer.parseInt(sizeElements[0])]).replace("\0", b));
                            System.out.print(fila2[a]);
                            System.out.println("");
                        }
                    } else if (a == 0 || a == 4 || a == 8 || a == 9) {
                        for (int k = 0; k < Integer.parseInt(sizeElements[0]); k++) {
                            System.out.println(f2[1] + new String(new char[Integer.parseInt(sizeElements[0])]).replace("\0", b) + f2[1]);
                        }
                    } else {
                        for (int k = 0; k < Integer.parseInt(sizeElements[0]); k++) {
                            System.out.println(fila2[a]);
                        }
                    }

                    for (int j = 0; j < Integer.parseInt(sizeElements[0]); j++) {
                        System.out.print(fila3[a]);
                    }
                    System.out.println("");
                    if (a == 1 || a == 3 || a == 4 || a == 5 || a == 7 || a == 9) {

                        for (int k = 0; k < Integer.parseInt(sizeElements[0]); k++) {
                            System.out.print(new String(new char[Integer.parseInt(sizeElements[0])]).replace("\0", b));
                            System.out.print(fila4[a]);
                            System.out.println("");
                        }
                    } else if (a == 0 || a == 6 || a == 8) {
                        for (int k = 0; k < Integer.parseInt(sizeElements[0]); k++) {
                            System.out.println(f4[1] + new String(new char[Integer.parseInt(sizeElements[0])]).replace("\0", b) + f4[1]);
                        }
                    } else {
                        for (int k = 0; k < Integer.parseInt(sizeElements[0]); k++) {
                            System.out.println(fila4[a]);
                        }
                    }

                    for (int j = 0; j < Integer.parseInt(sizeElements[0]); j++) {
                        System.out.print(fila5[a]);
                    }
                    System.out.println("");
                }
            }

        }
    }

}
