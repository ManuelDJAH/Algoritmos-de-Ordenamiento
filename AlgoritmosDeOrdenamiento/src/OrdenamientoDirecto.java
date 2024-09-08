public class OrdenamientoDirecto {

    public void seleccionAscendente(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMin]) {
                    indiceMin = j;
                }
            }
            int temporal = arreglo[indiceMin];
            arreglo[indiceMin] = arreglo[i];
            arreglo[i] = temporal;
        }
    }

    public void seleccionDescendente(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMax = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] > arreglo[indiceMax]) {
                    indiceMax = j;
                }
            }
            int temporal = arreglo[indiceMax];
            arreglo[indiceMax] = arreglo[i];
            arreglo[i] = temporal;
        }
    }

    public void insercionAscendente(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int clave = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = clave;
        }
    }

    public void insercionDescendente(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int clave = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] < clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = clave;
        }
    }
}
