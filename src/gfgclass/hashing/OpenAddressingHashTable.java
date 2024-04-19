package gfgclass.hashing;

class HashTalbe {
    int[] arr;
    int size;

    HashTalbe(int size) {
        this.size = size;
        arr = new int[size];
        for (int i : arr) {
            i = -1;
        }
    }

    int hashFunction(int n, int  size) {
        return n % size;
    }

    void insert(int n) {
        int position = hashFunction(n, size);
        if (arr[position] == -1) {
            arr[position] = n;
        }
        else {
//            while (position != )
        }
    }
}

public class OpenAddressingHashTable {


}
