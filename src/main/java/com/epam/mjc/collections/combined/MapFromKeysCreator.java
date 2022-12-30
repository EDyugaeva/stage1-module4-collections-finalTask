package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        Set<String> keys = new HashSet<>();

        for (Map.Entry<String, Integer> entry :
                sourceMap.entrySet()) {
            Set<String> values = new HashSet<>();
            int length = entry.getKey().length();
            if (map.containsKey(length)) {
                values.addAll(map.get(length));
                values.add(entry.getKey());


            } else {
                values.add(entry.getKey());
            }
            map.put(length, values);

        }


        return map;
    }
}
