public class HeapSort {
    CreateFileCsv create = new CreateFileCsv();

    public void length(String[] data, String nameCase) {
        GetVariables v = new GetVariables();
        String[] copiaDados = data.clone();

        long startTime = System.nanoTime();

        heapSortLength(copiaDados, v);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Tempo de execução Heap Sort p/ o " + nameCase + ": " + duration + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_length_heapSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_length_heapSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_length_heapSort_piorCaso.csv";
        }

        create.criaCsv(copiaDados, filename);
    }

    private void heapSortLength(String[] array, GetVariables v) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapifyLength(array, n, i, v);

        for (int i = n - 1; i > 0; i--) {
            String temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapifyLength(array, i, 0, v);
        }
    }

    private void heapifyLength(String[] array, int n, int i, GetVariables v) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && v.getSizePassword(array[left]) < v.getSizePassword(array[largest]))
            largest = left;

        if (right < n && v.getSizePassword(array[right]) < v.getSizePassword(array[largest]))
            largest = right;

        if (largest != i) {
            String swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapifyLength(array, n, largest, v);
        }
    }

    // ------------------------------------------------------

    public void month(String[] data, String nameCase) {
        GetVariables v = new GetVariables();
        String[] copiaDados = data.clone();

        long startTime = System.nanoTime();

        heapSortMonth(copiaDados, v);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Tempo de execução Heap Sort p/ o " + nameCase + ": " + duration + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_data_month_heapSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_data_month_heapSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_month_heapSort_piorCaso.csv";
        }

        create.criaCsv(copiaDados, filename);
    }

    private void heapSortMonth(String[] array, GetVariables v) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapifyMonth(array, n, i, v);

        for (int i = n - 1; i > 0; i--) {
            String temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapifyMonth(array, i, 0, v);
        }
    }

    private void heapifyMonth(String[] array, int n, int i, GetVariables v) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && v.getMesData(array[left]) > v.getMesData(array[largest]))
            largest = left;

        if (right < n && v.getMesData(array[right]) > v.getMesData(array[largest]))
            largest = right;

        if (largest != i) {
            String swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapifyMonth(array, n, largest, v);
        }
    }

    //--------------------------------------------------------------------------

    public void date(String[] data, String nameCase) {
        GetVariables v = new GetVariables();
        String[] copiaDados = data.clone();

        long startTime = System.nanoTime();

        heapSortDate(copiaDados, v);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Tempo de execução Heap Sort p/ o " + nameCase + ": " + duration + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_data_heapSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_data_heapSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_heapSort_piorCaso.csv";
        }

        create.criaCsv(copiaDados, filename);
    }

    private void heapSortDate(String[] array, GetVariables v) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapifyDate(array, n, i, v);

        for (int i = n - 1; i > 0; i--) {
            String temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapifyDate(array, i, 0, v);
        }
    }

    private void heapifyDate(String[] array, int n, int i, GetVariables v) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && v.getData(array[left]) > v.getData(array[largest]))
            largest = left;

        if (right < n && v.getData(array[right]) > v.getData(array[largest]))
            largest = right;

        if (largest != i) {
            String swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapifyDate(array, n, largest, v);
        }
    }



}
