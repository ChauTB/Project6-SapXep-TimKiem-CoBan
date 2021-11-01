package project1;

public class Algorithm {
    double[] a;

    Algorithm() {
    }

    // Hàm hiển thị mảng
    void display(IOArray A) {
        for (int i = 0; i < A.a.length; i++) {
            System.out.print(A.a[i] + " ");
        }
        System.out.println();
    }

    // Hàm sắp xếp nổi bọt
    void bubbleSort(IOArray A) {
        double temp = A.a[0];
        int n = A.a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A.a[j] > A.a[j + 1]) {
                    temp = A.a[j];
                    A.a[j] = A.a[j + 1];
                    A.a[j + 1] = temp;
                }
            }
            display(A);
        }
    }

    // Hàm tính thời gian sắp xếp nổi bọt
    void timeBubbleSort(IOArray A) {
        final long startTime = System.nanoTime();
        double temp = A.a[0];
        int n = A.a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A.a[j] > A.a[j + 1]) {
                    temp = A.a[j];
                    A.a[j] = A.a[j + 1];
                    A.a[j + 1] = temp;
                }
            }
        }
        final long endTime = System.nanoTime();
        final long time = endTime - startTime;
        System.out.printf("Total execution time: %,d ns", time);
        System.out.println();
    }

    // Hàm sắp xếp lựa chọn
    void selectSort(IOArray A) {
        int n = A.a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (A.a[minIndex] > A.a[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = A.a[minIndex];
                A.a[minIndex] = A.a[i];
                A.a[i] = temp;
            }
            display(A);
        }
    }

    // Hàm tính thời gian sắp xếp lựa chọn
    void timeSelectSort(IOArray A) {
        final long startTime = System.nanoTime();
        int n = A.a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (A.a[minIndex] > A.a[j]) {
                    minIndex = j;
                }
            }

            double temp = A.a[minIndex];
            A.a[minIndex] = A.a[i];
            A.a[i] = temp;

        }
        final long endTime = System.nanoTime();
        final long time = endTime - startTime;
        System.out.printf("Total execution time: %,d ns", time);
        System.out.println();
    }

    // Hàm sắp xếp chèn
    void insertSort(IOArray A) {
        double temp;
        int j;
        int n = A.a.length;
        for (int i = 1; i < n; i++) {
            temp = A.a[i];
            j = i - 1;
            while (j >= 0 && temp < A.a[j]) {
                A.a[j + 1] = A.a[j];
                j--;
            }
            A.a[j + 1] = temp;
            display(A);
        }

    }

    // Hàm tính thời gian sắp xếp chèn
    void timeInsertSort(IOArray A) {
        final long startTime = System.nanoTime();
        double temp;
        int j;
        int n = A.a.length;
        for (int i = 1; i < n; i++) {
            temp = A.a[i];
            j = i - 1;
            while (j >= 0 && temp < A.a[j]) {
                A.a[j + 1] = A.a[j];
                j--;
            }
            A.a[j + 1] = temp;
        }
        final long endTime = System.nanoTime();
        final long time = endTime - startTime;
        System.out.printf("Total execution time: %,d ns", time);
        System.out.println();
    }

    // Hàm tìm ra chỉ số của các phần tử lớn hơn giá trị nhập vào bằng tìm kiếm
    // tuyến tính
    int[] linearSearch(double value, IOArray A) {

        int num = 0;
        for (int i = 0; i < A.a.length; i++) {
            if (A.a[i] > value) {
                num = num + 1;
            }
        }
        int[] sub = new int[num];
        int j = 0;
        for (int i = 0; i < A.a.length; i++) {
            if (A.a[i] > value) {
                sub[j] = i;
                j++;
            }
        }

        return sub;
    }

    // Hàm tìm kiếm chỉ số của phần tử đầu tiên có giá trị bằng value trên mảng đã
    // được sắp xếp
    int binarySearch(double value, IOArray A) {
        int l = 0, r = A.a.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (A.a[m] < value) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (A.a[l] == value) {
            return l;
        } else {
            return -1;
        }
    }
}
