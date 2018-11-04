package com.newYear.controller;

import com.newYear.models.ColoursEnum;
import com.newYear.models.NewYearToy;
import com.newYear.models.NewYearTree;

import java.util.*;

public class ToysController {

    public static void addToys() {
        NewYearToy blackToy = new NewYearToy(ColoursEnum.BLACK, "apple");
        NewYearToy whiteToy = new NewYearToy(ColoursEnum.WHITE, "banana");
        NewYearToy redToy = new NewYearToy(ColoursEnum.RED, "santa");
        NewYearToy blueToy = new NewYearToy(ColoursEnum.BLUE, "orange");
        NewYearToy redToy2 = new NewYearToy(ColoursEnum.RED, "bottle");

        List<NewYearToy> toys = new ArrayList<>();
        toys.add(blackToy);
        toys.add(whiteToy);
        toys.add(redToy);
        toys.add(blueToy);
        toys.add(redToy2);

        NewYearTree elka = new NewYearTree(1, toys);
        elka.addToy(new NewYearToy(ColoursEnum.RED, "redToy"));

        System.out.println("elka 1 = " + elka);

        NewYearTree elka2 = new NewYearTree();

        elka2.addToy(whiteToy);

        System.out.println("elka 2 = " + elka2);

        int numberOfRed = countNumberOfToysDependOnColour(elka, ColoursEnum.RED);
        System.out.println("количество красных = " + numberOfRed);
        int numberOfBlack = countNumberOfToysDependOnColour(elka, ColoursEnum.BLACK);
        System.out.println("количество черных = " + numberOfBlack);


        System.out.println("отсортированная елка = " + elka);


        Comparator<NewYearToy> byNameComparator = new Comparator<NewYearToy>() {
            @Override
            public int compare(NewYearToy o1, NewYearToy o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        elka.getToys().sort(byNameComparator);

        System.out.println("отсортированная по имени игрушки елка = " + elka);

    }

    public static int countNumberOfToysDependOnColour(NewYearTree elka, final ColoursEnum colour) {
        int counter = 0;
        for (NewYearToy newYearToy : elka.getToys()) {
            if (colour == newYearToy.getColour()) {
                counter++;
            }
        }
        return counter;
//
//        return (int) elka.getToys()
//                .stream()
//                .filter(toy -> colour == toy.getColour())
//                .count();
    }

//    public static void countRed(String color) {
//        NewYearTree newYearTree = new NewYearTree(1, "Шар", "Красный");
//        NewYearTree newYearTree1 = new NewYearTree(2, "Гирлянда", "Красный");
//        NewYearTree newYearTree2 = new NewYearTree(3, "Гирлянда", "Красный");
//        NewYearTree newYearTree3 = new NewYearTree(4, "Звезда", "Золотой");
//        NewYearTree newYearTree4 = new NewYearTree(5, "Шар", "Синий");
//
//        ArrayList<NewYearTree> newYearTrees = new ArrayList<>();
//        newYearTrees.add(newYearTree);
//        newYearTrees.add(newYearTree1);
//        newYearTrees.add(newYearTree2);
//        newYearTrees.add(newYearTree3);
//        newYearTrees.add(newYearTree4);
//        int i = 1;
//
//        for (NewYearTree array: newYearTrees
//             ) {
//            if (color.equals(array.getColor())) {
//                System.out.println("Количество красных цветов: " + i++);
//            }
//            else {
//                System.out.println("Извините такого цвета нет!");
//            }
//        }
//    }
}
