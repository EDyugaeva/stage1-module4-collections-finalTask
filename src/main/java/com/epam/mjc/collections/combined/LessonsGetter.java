package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> stringSet = new HashSet<>();
        List<String> values = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry:
        timetable.entrySet())
        {
            values.addAll(entry.getValue());
        }
        stringSet.addAll(values);

        return stringSet;


    }
}
