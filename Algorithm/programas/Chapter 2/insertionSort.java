int[] vetor = new int[3,4,5,6];

int[] vetor2 = new int[35,42,5,67,2,7];

public <T> insertionSort(<T>[] vet){
    for( int j=1;j<vet.length();j++){
        <T> key = vet[j];
        int i=j-1;
        while(i>=0 && vet[i] > key){
            vet[i+1] = vet[i]
            i--;
        }
        vet[i+1] = key;
    }
}

System.out.println(vetor.insertionSort);
System.out.println(vetor2.insertionSort);