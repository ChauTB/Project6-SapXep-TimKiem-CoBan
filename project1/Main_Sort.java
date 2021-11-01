package project1;

import java.io.IOException;
import java.util.Scanner;

public class Main_Sort {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        IOArray arr = new IOArray();
        Algorithm SArr = new Algorithm();
        // Hiển thị menu lựa chọn vào lặp lại nhiều lần cho đến khi người dùng kết thúc
        do {
            System.out.println("+------------Menu------------+");
            System.out.println("|   1.Input                  |");
            System.out.println("|   2.Output                 |");
            System.out.println("|   3.Bubble sort            |");
            System.out.println("|   4.Selection sort         |");
            System.out.println("|   5.Insertion sort         |");
            System.out.println("|   6.Search > value         |");
            System.out.println("|   7.Search = value         |");
            System.out.println("|   8.Input random           |");
            System.out.println("|   9.Execution time         |");
            System.out.println("|   0.Exit                   |");
            System.out.println("+----------------------------+");
            System.out.println();
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
            case 1:
                arr.nhapInput();
                arr.inputFile();
                break;
            case 2:
                System.out.println("Read from file");
                System.out.print("Array a: ");
                SArr.display(arr);
                arr.outputFile("OUTPUT.TXT");
                break;
            case 3:
                arr.inputFile();
                System.out.println("Bubble sort");
                SArr.bubbleSort(arr);
                arr.outputFile("OUTPUT1.TXT");
                break;
            case 4:
                arr.inputFile();
                System.out.println("Selection sort");
                SArr.selectSort(arr);
                arr.outputFile("OUTPUT2.TXT");
                break;
            case 5:
                arr.inputFile();
                System.out.println("Insertion sort");
                SArr.insertSort(arr);
                arr.outputFile("OUTPUT3.TXT");
                break;
            case 6:
                System.out.println("Linear Search");
                System.out.print("Input value: ");
                int x = sc.nextInt();
                System.out.print("Index is: ");
                for (int i = 0; i < SArr.linearSearch(x, arr).length; i++) {
                    System.out.print(SArr.linearSearch(x, arr)[i] + " ");
                }
                arr.outputSearch1(SArr.linearSearch(x, arr));
                System.out.println();
                break;
            case 7:
                System.out.println("Binary Search");
                System.out.print("Input value: ");
                int y = sc.nextInt();
                System.out.println("Indext of fist element: " + SArr.binarySearch(y, arr));
                arr.outputSearch2(SArr.binarySearch(y, arr));
                break;
            case 8:
                System.out.print("Input random (1. Average case - 2. Best case - 3.Worst case): ");
                int inputChose = sc.nextInt();
                if (inputChose < 1 || inputChose > 3) {
                    System.out.println("Something wrong! Try again.");
                    break;
                }
                arr.randomInput(inputChose);
                arr.inputFile();
                break;
            case 9:
            arr.inputFile();
                System.out.print("Execution time (1. Bubble sort - 2. Selection sort - 3. Insertion sort): ");
                int z = sc.nextInt();
                switch (z) {
                case 1:
                    SArr.timeBubbleSort(arr);
                    break;
                case 2:
                    SArr.timeSelectSort(arr);
                    break;
                case 3:
                    SArr.timeInsertSort(arr);
                    break;
                default:
                    System.out.println("Something wrong! Try again.");
                }
                break;
            default:
                if (choice != 0) {
                    System.out.println("Something wrong! Try again.");
                }
            }
            if (choice == 0) {
                break;
            }
            System.out.println();
        } while (true);
        System.out.println("Thanks!!!");
        sc.close();
    }

}
