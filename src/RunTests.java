public class RunTests {

    CreateCasesByLength byLength = new CreateCasesByLength();
    CreateCasesByDate byDate= new CreateCasesByDate();
    CreateCasesByMonth byMonth = new CreateCasesByMonth();

    SelectionSort selectionSort = new SelectionSort();
    InsertionSort insertionSort = new InsertionSort();
    QuickSort quickSort = new QuickSort();
    MergeSort mergeSort = new MergeSort();
    CountingSort countingSort = new CountingSort();
    HeapSort heapSort = new HeapSort();
    QuickSortMedianaTres quickSortMedianaTres = new QuickSortMedianaTres();


    public void tamanhoSenha() {
        String[] bestCaseByLength = byLength.bestCase();
        String[] mediumCaseByLength = byLength.mediumCase();
        String[] worstCaseByLength = byLength.worstCase();
        System.out.println("\n****TAMANHO DA SENHA****");

        System.out.println("\nSelectionSort -> Tamanho da Senha:");
        selectionSort.length(worstCaseByLength, "pior caso");
        selectionSort.length(mediumCaseByLength, "médio caso");
        selectionSort.length(bestCaseByLength, "melhor caso");

        System.out.println("\nInsertionSort -> Tamanho da Senha:");
        insertionSort.length(worstCaseByLength, "pior caso");
        insertionSort.length(mediumCaseByLength, "médio caso");
        insertionSort.length(bestCaseByLength, "melhor caso");

        System.out.println("\nQuickSort -> Tamanho da Senha:");
        quickSort.length(worstCaseByLength, "pior caso");
        quickSort.length(mediumCaseByLength, "médio caso");
        quickSort.length(bestCaseByLength, "melhor caso");

        System.out.println("\nMergeSort -> Tamanho da Senha:");
        mergeSort.length(worstCaseByLength, "pior caso");
        mergeSort.length(mediumCaseByLength, "médio caso");
        mergeSort.length(bestCaseByLength, "melhor caso");

        System.out.println("\nCountingSort -> Tamanho da Senha:");
        countingSort.length(worstCaseByLength, "pior caso");
        countingSort.length(mediumCaseByLength, "médio caso");
        countingSort.length(bestCaseByLength, "melhor caso");

        System.out.println("\nHeapSort -> Tamanho da Senha:");
        heapSort.length(worstCaseByLength, "pior caso");
        heapSort.length(mediumCaseByLength, "médio caso");
        heapSort.length(bestCaseByLength, "melhor caso");

        System.out.println("\nQuickSort com Mediana 3 -> Tamanho da Senha:");
        quickSortMedianaTres.length(worstCaseByLength, "pior caso");
        quickSortMedianaTres.length(mediumCaseByLength, "médio caso");
        quickSortMedianaTres.length(bestCaseByLength, "melhor caso");
    }

    public void porMes() {
        String[] bestCaseByMonth = byMonth.bestCase();
        String[] mediumCaseByMonth = byMonth.mediumCase();
        String[] worstCaseByMonth = byMonth.worstCase();

        System.out.println("\n****MES****");

        //System.out.println("\nOs arrays para melhor, pior e medio caso foram criados...");

        System.out.println("\nSelectionSort -> Mês:");
        selectionSort.month(worstCaseByMonth, "pior caso");
        selectionSort.month(mediumCaseByMonth, "médio caso");
        selectionSort.month(bestCaseByMonth, "melhor caso");

        System.out.println("\nInsertionSort -> Mês:");
        insertionSort.month(worstCaseByMonth, "pior caso");
        insertionSort.month(mediumCaseByMonth, "médio caso");
        insertionSort.month(bestCaseByMonth, "melhor caso");

        System.out.println("\nQuickSort -> Mês:");
        quickSort.month(worstCaseByMonth, "pior caso");
        quickSort.month(mediumCaseByMonth, "médio caso");
        quickSort.month(bestCaseByMonth, "melhor caso");

        System.out.println("\nMergeSort -> Mês:");
        mergeSort.month(worstCaseByMonth, "pior caso");
        mergeSort.month(mediumCaseByMonth, "médio caso");
        mergeSort.month(bestCaseByMonth, "melhor caso");

        System.out.println("\nCountingSort -> Mês:");
        countingSort.month(worstCaseByMonth, "pior caso");
        countingSort.month(mediumCaseByMonth, "médio caso");
        countingSort.month(bestCaseByMonth, "melhor caso");

        System.out.println("\nHeapSort -> Mês:");
        heapSort.month(worstCaseByMonth, "pior caso");
        heapSort.month(mediumCaseByMonth, "médio caso");
        heapSort.month(bestCaseByMonth, "melhor caso");

        System.out.println("\nQuickSort com Mediana 3 -> Mês:");
        quickSortMedianaTres.month(worstCaseByMonth, "pior caso");
        quickSortMedianaTres.month(mediumCaseByMonth, "médio caso");
        quickSortMedianaTres.month(bestCaseByMonth, "melhor caso");
    }

    public void pordata() {
        String[] bestCaseByDate = byDate.melhorCaso();
        String[] mediumCaseByDate = byDate.medioCaso();
        String[] worstCaseByDate = byDate.piorCaso();

        System.out.println("\n****DATA***");

        //System.out.println("\nOs arrays para melhor, pior e medio caso foram criados...");

        System.out.println("\nSelectionSort -> Data:");
        selectionSort.date(worstCaseByDate, "pior caso");
        selectionSort.date(mediumCaseByDate, "médio caso");
        selectionSort.date(bestCaseByDate, "melhor caso");

        System.out.println("\nInsertionSort -> Data:");
        insertionSort.date(worstCaseByDate, "pior caso");
        insertionSort.date(mediumCaseByDate, "médio caso");
        insertionSort.date(bestCaseByDate, "melhor caso");

        System.out.println("\nQuickSort -> Data:");
        quickSort.date(worstCaseByDate, "pior caso");
        quickSort.date(mediumCaseByDate, "médio caso");
        quickSort.date(bestCaseByDate, "melhor caso");

        System.out.println("\nMergeSort -> Data:");
        mergeSort.date(worstCaseByDate, "pior caso");
        mergeSort.date(mediumCaseByDate, "médio caso");
        mergeSort.date(bestCaseByDate, "melhor caso");

        System.out.println("\nCountingSort -> Data:");
        countingSort.date(worstCaseByDate, "pior caso");
        countingSort.date(mediumCaseByDate, "médio caso");
        countingSort.date(bestCaseByDate, "melhor caso");

        System.out.println("\nHeapSort -> Data:");
        heapSort.date(worstCaseByDate, "pior caso");
        heapSort.date(mediumCaseByDate, "médio caso");
        heapSort.date(bestCaseByDate, "melhor caso");

        System.out.println("\nQuickSort com Mediana 3 -> Data:");
        quickSortMedianaTres.date(worstCaseByDate, "pior caso");
        quickSortMedianaTres.date(mediumCaseByDate, "médio caso");
        quickSortMedianaTres.date(bestCaseByDate, "melhor caso");
    }
}
