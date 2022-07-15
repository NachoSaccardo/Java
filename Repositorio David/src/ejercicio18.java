/* Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
cambiando sus filas por columnas (o viceversa).
*/

public class ejercicio18 {
    public static void main(String[] args) {
        int [][] matriz = new int[4][4];
        int [][] matrizTraspuesta = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
        mostrar(matriz);

        System.out.println("");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }
        mostrar(matrizTraspuesta);
    }

    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}