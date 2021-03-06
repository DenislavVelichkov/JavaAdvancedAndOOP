package JavaAdvanced.IteratorsAndComperators_19.Exercise.Collection_2;

import JavaAdvanced.IteratorsAndComperators_19.Exercise.Collection_2.ListIterator.ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> data =
                Arrays.stream(sc.nextLine().split("\\s+"))
                        .skip(1)
                        .collect(Collectors.toCollection(ArrayList::new));

        ListIterator listIterator = new ListIterator(data);

        String line = sc.nextLine();

        while (!line.equalsIgnoreCase("END")) {

            switch (line) {
                case "Move":
                    System.out.println(listIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listIterator.hasNext());
                    break;
                case "Print":
                    try {
                        System.out.println(listIterator.print());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "PrintAll":
                    for (String str : listIterator) {
                        System.out.print(str + " ");
                    }
                    System.out.println();
                    break;
                default:
                    break;
            }

            line = sc.nextLine();
        }
    }
}
