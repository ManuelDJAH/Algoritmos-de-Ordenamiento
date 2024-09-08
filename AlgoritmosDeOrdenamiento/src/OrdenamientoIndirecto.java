public class OrdenamientoIndirecto {

    public void shellAscendente(int[] arreglo) {
        int n = arreglo.length;
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < n; i++) {
                int temporal = arreglo[i];
                int j;
                for (j = i; j >= intervalo && arreglo[j - intervalo] > temporal; j -= intervalo) {
                    arreglo[j] = arreglo[j - intervalo];
                }
                arreglo[j] = temporal;
            }
        }
    }

    public void shellDescendente(int[] arreglo) {
        int n = arreglo.length;
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < n; i++) {
                int temporal = arreglo[i];
                int j;
                for (j = i; j >= intervalo && arreglo[j - intervalo] < temporal; j -= intervalo) {
                    arreglo[j] = arreglo[j - intervalo];
                }
                arreglo[j] = temporal;
            }
        }
    }

    public void quicksortAscendente(int[] arreglo, int bajo, int alto) {
        if (bajo < alto) {
            int indicePivote = particionAscendente(arreglo, bajo, alto);
            quicksortAscendente(arreglo, bajo, indicePivote - 1);
            quicksortAscendente(arreglo, indicePivote + 1, alto);
        }
    }

    private int particionAscendente(int[] arreglo, int bajo, int alto) {
        int pivote = arreglo[alto];
        int i = (bajo - 1);
        for (int j = bajo; j < alto; j++) {
            if (arreglo[j] < pivote) {
                i++;
                int temporal = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temporal;
            }
        }
        int temporal = arreglo[i + 1];
        arreglo[i + 1] = arreglo[alto];
        arreglo[alto] = temporal;
        return i + 1;
    }

    public void quicksortDescendente(int[] arreglo, int bajo, int alto) {
        if (bajo < alto) {
            int indicePivote = particionDescendente(arreglo, bajo, alto);
            quicksortDescendente(arreglo, bajo, indicePivote - 1);
            quicksortDescendente(arreglo, indicePivote + 1, alto);
        }
    }

    private int particionDescendente(int[] arreglo, int bajo, int alto) {
        int pivote = arreglo[alto];
        int i = (bajo - 1);
        for (int j = bajo; j < alto; j++) {
            if (arreglo[j] > pivote) {
                i++;
                int temporal = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temporal;
            }
        }
        int temporal = arreglo[i + 1];
        arreglo[i + 1] = arreglo[alto];
        arreglo[alto] = temporal;
        return i + 1;
    }
}
