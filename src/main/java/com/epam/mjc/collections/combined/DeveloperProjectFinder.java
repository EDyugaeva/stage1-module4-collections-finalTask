package com.epam.mjc.collections.combined;

import java.util.*;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry :
                projects.entrySet()) {
            Set<String> developers = entry.getValue();
            if (developers.contains(developer)) {
                stringList.add(entry.getKey());
            }
        }
        stringList = stringList.stream()
                .sorted(Comparator.reverseOrder())
                .sorted((o1,o2) -> o2.length() - o1.length())
                .collect(Collectors.toList());



        return stringList;
    }
}
