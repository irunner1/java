package task12;

public class SortingStudentsByGPA implements Comparator{
    String name;
    int score;

    SortingStudentsByGPA(int _score, String _name) {
        score = _score;
        name = _name;
    }

    public void QuickSort(SortingStudentsByGPA[] array, int low, int high) {
        if (array.length == 0) return;
 
        if (low >= high) return;
 
        int middle = low + (high - low) / 2;
        int opora = array[middle].score;
 
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i].score < opora) {
                i++;
            }
 
            while (array[j].score > opora) {
                j--;
            }
 
            if (i <= j) {
                SortingStudentsByGPA temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            QuickSort(array, low, j);
 
        if (high > i)
            QuickSort(array, i, high);
    }
}