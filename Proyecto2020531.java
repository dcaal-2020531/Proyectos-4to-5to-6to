package org.diegocaal.proyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Proyecto2020531 {
    public Proyecto2020531() {
    }

    public static void main(String[] var0) {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        InputStreamReader var7 = new InputStreamReader(System.in);
        BufferedReader var8 = new BufferedReader(var7);

        label65:
        do {
            try {
                System.out.print("\n            Menu      \n");
                System.out.println("");
                System.out.println("");
                System.out.println("0. Salir del programa");
                System.out.println("1. Operaciones aritmeticas");
                System.out.println("2. potencias enesimas");
                System.out.println("3. area de un circulo");
                System.out.println("4. razones trigonometricas ");
                System.out.println("5. Raices enesimas");
                System.out.println("6.logaritmos naturales");
                System.out.println("7. Distancia entre 2 puntos");
                System.out.println("8. El mayor de 3 numeros");
                System.out.println("9. año bisiesto");
                System.out.println("10. Factorial");
                System.out.println("11. Sumatoria entre dos valores naturales");
                System.out.println("12. serie de fibonacci");
                System.out.println("13. sistema de ecuaciones lineales 2x2");
                System.out.println("14. ecuacion cuadratica");
                System.out.println("15. Dibujo de un triangulo");
                System.out.println("16. area bajo la curva");
                var1 = Integer.parseInt(var8.readLine());
                switch (var1) {
                    case 0:
                        System.out.println("Se cerrara el programa");
                        break;
                    case 1:
                        while (true) {
                            try {
                                new Scanner(System.in);
                                System.out.print("\n   Que quiere hacer\n  \n");
                                System.out.println("0. volver al menu");
                                System.out.println("1 suma");
                                System.out.println("2. resta");
                                System.out.println("3. multiplicacion");
                                System.out.println("4. division");
                                var2 = Integer.parseInt(var8.readLine());
                                int var20;
                                switch (var2) {
                                    case 0:
                                        System.out.println("Volviendo al menu");
                                        break;
                                    case 1:
                                        System.out.println("Inserte el primer numero");
                                        var20 = Integer.parseInt(var8.readLine());
                                        System.out.println("Inserte el segundo numero");
                                        var4 = Integer.parseInt(var8.readLine());
                                        System.out.println("El resultado es " + (var20 + var4));
                                        break;
                                    case 2:
                                        System.out.println("Inserte el primer numero");
                                        var20 = Integer.parseInt(var8.readLine());
                                        System.out.println("Inserte el segundo numero");
                                        var4 = Integer.parseInt(var8.readLine());
                                        System.out.println("El resultado es " + (var20 - var4));
                                        break;
                                    case 3:
                                        System.out.println("Inserte el primer numero");
                                        var20 = Integer.parseInt(var8.readLine());
                                        System.out.println("Inserte el segundo numero");
                                        var4 = Integer.parseInt(var8.readLine());
                                        System.out.println("El resultado es " + var20 * var4);
                                        break;
                                    case 4:
                                        System.out.println("Inserte el primer numero");
                                        var20 = Integer.parseInt(var8.readLine());
                                        System.out.println("Inserte el segundo numero");
                                        var4 = Integer.parseInt(var8.readLine());
                                        if (var4 == 0) {
                                            System.out.println("No se puede dividir entre 0");
                                        } else {
                                            System.out.println("El resultado es " + (var20 / var4));
                                        }
                                        break;
                                    default:
                                        System.out.println("Esta accion no se puede ejecutar porfavor ingrese un numero de 0-4");
                                }
                            } catch (IOException var18) {
                                var18.printStackTrace();
                            }

                            if (var2 == 0) {
                                continue label65;
                            }
                        }
                    case 2:
                        System.out.println("Ingrese la Base de la potencia porfavor");
                        int var21 = Integer.parseInt(var8.readLine());
                        System.out.println("Ingrese el exponente de la potencia");
                        int var22 = Integer.parseInt(var8.readLine());
                        System.out.println("El resultado es: " + Math.pow((double) var21, (double) var22));
                        break;
                    case 3:
                        double var9 = 0.0;
                        System.out.println("Porfavor Inserte el radio el circulo");
                        var9 = (double) Integer.parseInt(var8.readLine());
                        System.out.println("El area del circulo es: " + Math.PI * var9 * var9);
                        break;
                    case 4:
                        double var11 = 0.0;
                        System.out.println("Inserte el numero al cual quiera sacar sus razones trigonometricas");
                        var11 = (double) Integer.parseInt(var8.readLine());
                        System.out.println("El valor del coseno es de: " + Math.cos(var11));
                        System.out.println("El valor del seno es de: " + Math.sin(var11));
                        System.out.println("El valor de la tangente es de: " + Math.tan(var11));
                        break;
                    case 5:
                        float var13 = 0.0F;
                        float var14 = 0.0F;
                        System.out.println("Ingrese el valor del radicando");
                        var13 = (float) Integer.parseInt(var8.readLine());
                        System.out.println("Ingrese el valor del indice");
                        var14 = (float) Integer.parseInt(var8.readLine());
                        System.out.println("El resultado es: " + Math.pow((double) var13, (double) (1.0F / var14)));
                        break;
                    case 6:
                        int var15 = 0;
                        while (true) {
                            try {
                                System.out.println("Inserte el numero que quiera sacarle el logaritmo");
                                int var23 = Integer.parseInt(var8.readLine());
                                if (var23 <= 0) {
                                    System.out.println("El logaritmo de 0 o numeros negativos no existe, por favor ingrese otro numero");
                                    continue;
                                }
                                System.out.print("\n Como quiere el resultado del logaritmo \n");
                                System.out.println("0 Volver al menu ");
                                System.out.println("1. Positivo");
                                System.out.println("2. negativo");
                                var15 = Integer.parseInt(var8.readLine());
                                switch (var15) {
                                    case 0:
                                        System.out.println("Volviendo...");
                                        break;
                                    case 1:
                                        System.out.println(" El resultado es: " + Math.log((double) var23));
                                        break;
                                    case 2:
                                        System.out.println("El resultado es: " + (Math.log((double) var23) * -1.0));
                                        break;
                                }
                            } catch (IOException var17) {
                                var17.printStackTrace();
                            }
                            if (var15 == 0) {
                                continue label65;
                            }
                        }
                    case 7:
                        System.out.println("Inserte coordenada X1:");
                        double x1 = Double.parseDouble(var8.readLine());
                        System.out.println("Inserte coordenada Y1:");
                        double y1 = Double.parseDouble(var8.readLine());
                        System.out.println("Inserte coordenada X2:");
                        double x2 = Double.parseDouble(var8.readLine());
                        System.out.println("Inserte coordenada Y2:");
                        double y2 = Double.parseDouble(var8.readLine());
                        double distancia = Math.hypot(x2 - x1, y2 - y1);
                        System.out.println("La distancia entre los puntos es: " + distancia);
                        break;
                    case 8:
                        System.out.println("Inserte primer numero:");
                        int a = Integer.parseInt(var8.readLine());
                        System.out.println("Inserte segundo numero:");
                        int b = Integer.parseInt(var8.readLine());
                        System.out.println("Inserte tercer numero:");
                        int c = Integer.parseInt(var8.readLine());
                        int max = Math.max(a, Math.max(b, c));
                        System.out.println("El mayor de los tres numeros es: " + max);
                        break;
                    case 9:
                        System.out.println("Inserte el año:");
                        int año = Integer.parseInt(var8.readLine());
                        boolean bisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
                        System.out.println(año + (bisiesto ? " es bisiesto" : " no es bisiesto"));
                        break;
                    case 10:
                        System.out.println("Inserte numero para factorial:");
                        int n = Integer.parseInt(var8.readLine());
                        long fact = 1;
                        for (int i = 1; i <= n; i++) fact *= i;
                        System.out.println("El factorial de " + n + " es: " + fact);
                        break;
                    case 11:
                        System.out.println("Inserte valor inicial (natural):");
                        int inicio = Integer.parseInt(var8.readLine());
                        System.out.println("Inserte valor final (natural):");
                        int fin = Integer.parseInt(var8.readLine());
                        long suma = 0;
                        for (int i = inicio; i <= fin; i++) suma += i;
                        System.out.println("La sumatoria de " + inicio + " a " + fin + " es: " + suma);
                        break;
                    case 12:
                        System.out.println("Inserte numero de terminos Fibonacci:");
                        int terminos = Integer.parseInt(var8.readLine());
                        long f1 = 0, f2 = 1;
                        System.out.print("Serie: ");
                        for (int i = 1; i <= terminos; i++) {
                            System.out.print(f1 + (i < terminos ? ", " : ""));
                            long siguiente = f1 + f2;
                            f1 = f2;
                            f2 = siguiente;
                        }
                        System.out.println();
                        break;
                    case 13:
                        System.out.println("Ecuaciones: a1x + b1y = c1, a2x + b2y = c2");
                        System.out.println("Ingrese a1:"); double a1 = Double.parseDouble(var8.readLine());
                        System.out.println("Ingrese b1:"); double b1 = Double.parseDouble(var8.readLine());
                        System.out.println("Ingrese c1:"); double c1 = Double.parseDouble(var8.readLine());
                        System.out.println("Ingrese a2:"); double a2 = Double.parseDouble(var8.readLine());
                        System.out.println("Ingrese b2:"); double b2 = Double.parseDouble(var8.readLine());
                        System.out.println("Ingrese c2:"); double c2 = Double.parseDouble(var8.readLine());
                        double det = a1 * b2 - a2 * b1;
                        if (det == 0) {
                            System.out.println("El sistema no tiene solucion unica");
                        } else {
                            double x = (c1 * b2 - c2 * b1) / det;
                            double y = (a1 * c2 - a2 * c1) / det;
                            System.out.println("Solucion: x = " + x + ", y = " + y);
                        }
                        break;
                    case 14:
                        System.out.println("Ecuacion ax^2 + bx + c = 0");
                        System.out.println("Ingrese a:"); double A = Double.parseDouble(var8.readLine());
                        System.out.println("Ingrese b:"); double B = Double.parseDouble(var8.readLine());
                        System.out.println("Ingrese c:"); double C = Double.parseDouble(var8.readLine());
                        double disc = B * B - 4 * A * C;
                        if (disc < 0) {
                            System.out.println("No hay raices reales");
                        } else {
                            double r1 = (-B + Math.sqrt(disc)) / (2 * A);
                            double r2 = (-B - Math.sqrt(disc)) / (2 * A);
                            System.out.println("Raices: " + r1 + " y " + r2);
                        }
                        break;
                    case 15:
                        System.out.println("Ingrese altura del triangulo:");        
                        int altura = Integer.parseInt(var8.readLine());
                        for (int i = 1; i <= altura; i++) {
                            for (int j = 0; j < i; j++) System.out.print("*");
                            System.out.println();
                        }
                        break;
                    case 16:
                        System.out.println("Ingrese limite inferior:");
                        double li = Double.parseDouble(var8.readLine());
                        System.out.println("Ingrese limite superior:");
                        double ls = Double.parseDouble(var8.readLine());
                        System.out.println("Ingrese numero de trapecios:");
                        int ntrap = Integer.parseInt(var8.readLine());
                        double h = (ls - li) / ntrap;
                        System.out.println("Ingrese grado del polinomio:");
                        int grado = Integer.parseInt(var8.readLine());
                        double[] coef = new double[grado+1];
                        for (int i = 0; i <= grado; i++) {
                            System.out.println("coeficiente a" + i + ":");
                            coef[i] = Double.parseDouble(var8.readLine());
                        }
                        double area = 0;
                        for (int i = 0; i < ntrap; i++) {
                            double x_i = li + i * h;
                            double x_i1 = x_i + h;
                            double fxi = 0, fxi1 = 0;
                            for (int j = 0; j <= grado; j++) {
                                fxi += coef[j] * Math.pow(x_i, j);
                                fxi1 += coef[j] * Math.pow(x_i1, j);
                            }
                            area += (fxi + fxi1) * h / 2;
                        }
                        System.out.println("El area bajo la curva es: " + area);
                        break;
                    default:
                        System.out.println("Porfavor ingresar un numero del 0-16");
                }
            } catch (IOException var19) {
                var19.printStackTrace();
            }
        } while (var1 != 0);
    }
}
