package com.epam.mjc;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(el -> el % 2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
         return list.stream().map(str -> str.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compare);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().map(list1 -> list1.stream().min(Integer::compare)).min(Comparator.comparing(Optional::get)).get();
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }
}
