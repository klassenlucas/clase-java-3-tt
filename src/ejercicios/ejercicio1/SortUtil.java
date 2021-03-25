package ejercicios.ejercicio1;

public class SortUtil {
    public static <T> void ordenar(Precedable arr[]) {
         int n = arr.length - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j].precedeA(arr[j+1]) >= 1) {
                    Precedable<T> aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
}
