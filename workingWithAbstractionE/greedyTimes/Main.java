
package oop.workingWithAbstractionE.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        String[] save = scanner.nextLine().split("\\s+");

        Map<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();

        long gold = 0;
        long gem = 0;
        long money = 0;

        for (int i = 0; i < save.length; i += 2) {
            String name = save[i];
            long amount = Long.parseLong(save[i + 1]);

            String type = "";

            if (name.length() == 3) {
                type = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                type = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                type = "Gold";
            }

            if (type.equals("")) {
                continue;
            } else if (input < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + amount) {
                continue;
            }

            switch (type) {
                case "Gem":
                    if (!bag.containsKey(type)) {
                        if (bag.containsKey("Gold")) {
                            if (amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(type).values().stream().mapToLong(e -> e).sum() + amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(type)) {
                        if (bag.containsKey("Gem")) {
                            if (amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(type).values().stream().mapToLong(e -> e).sum() + amount > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(type)) {
                bag.put((type), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(type).containsKey(name)) {
                bag.get(type).put(name, 0L);
            }


            bag.get(type).put(name, bag.get(type).get(name) + amount);
            if (type.equals("Gold")) {
                gold += amount;
            } else if (type.equals("Gem")) {
                gem += amount;
            } else if (type.equals("Cash")) {
                money += amount;
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Long>> x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}