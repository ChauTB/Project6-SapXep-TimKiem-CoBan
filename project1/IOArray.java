package project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;

public class IOArray extends Algorithm {
    // Hàm lấy dữ liệu từ file input
    void inputFile() throws FileNotFoundException {
        FileInputStream fi = new FileInputStream("input.txt");
        Scanner sc = new Scanner(fi);
        String temp = sc.nextLine();
        sc.close();
        String[] item = temp.split(" ");
        a = new double[item.length];
        for (int i = 0; i < item.length; i++) {
            a[i] = Double.parseDouble(item[i]);
        }
    }

    Scanner input = new Scanner(System.in);

    // Hàm in dữ liệu ra file output arr
    void outputFile(String arr) throws IOException {
        FileOutputStream fo = new FileOutputStream(arr);
        PrintWriter out = new PrintWriter(fo);
        for (int i = 0; i < a.length; i++) {
            out.print(a[i]+" ");
        }
        out.close();
    }

    // Hàm in dữ liệu tìm kiếm tuyến tính được ra file output
    void outputSearch1(int[] sub) throws IOException {
        FileOutputStream fo = new FileOutputStream("OUTPUT4.TXT");
        PrintWriter out = new PrintWriter(fo);
        for (int i = 0; i < sub.length; i++) {
            out.print(sub[i]+" ");
        }
        out.close();
    }

    // Hàm in dữ liệu tìm kiếm nhị phân được ra file output
    void outputSearch2(double x) throws IOException {
        FileOutputStream fo = new FileOutputStream("OUTPUT5.TXT");
        PrintWriter out = new PrintWriter(fo);
        out.print(x);
        out.close();
    }

    // Hàm nhập input và ghi vào file input
    void nhapInput() throws FileNotFoundException {

        FileOutputStream fo = new FileOutputStream("input.txt");
        PrintWriter out = new PrintWriter(fo);
        System.out.print("Input number of elements: ");
        int n = input.nextInt();
        System.out.println("Input elements: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= ", i);
            out.print(input.nextDouble()+" ");
        }
        out.close();

    }

    // Hàm random Input và ghi vào file input theo từng lựa chọn ngẫu nhiên, tăng
    // dần hoặc giảm dần
    void randomInput(int chose) throws FileNotFoundException {
        Random rd = new Random();
        FileOutputStream fo = new FileOutputStream("input.txt");
        PrintWriter out = new PrintWriter(fo);
        System.out.print("Input number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(n);
        }
        switch (chose) {
        case 1:

            break;
        case 2:
            int temp;
            int j;
            for (int i = 1; i < n; i++) {
                temp = arr[i];
                j = i - 1;
                while (j >= 0 && temp < arr[j]) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }

            break;
        case 3:
            int temp1;
            int z;
            for (int i = 1; i < n; i++) {
                temp1 = arr[i];
                z = i - 1;
                while (z >= 0 && temp1 > arr[z]) {
                    arr[z + 1] = arr[z];
                    z--;
                }
                arr[z + 1] = temp1;
            }
            break;
        }
        for (int i = 0; i < n; i++) {
            out.printf("%d ", arr[i]);

        }
        out.close();

    }

}
