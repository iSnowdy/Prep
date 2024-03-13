package org.example.BMEva2Real;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Web {
    private Map<String, Integer> wordMap;

    public Web() {
        wordMap = new HashMap<>();
    }

    public void insert(String word) {
        wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
    }

    public List<String> autoComplete(String prefix) {
        List<String> result = new ArrayList<>();
        for (String word : wordMap.keySet()) {
            if (word.startsWith(prefix)) {
                result.add(word);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Web system = new Web();
        system.insert("decretado");
        system.insert("ciervo");
        system.insert("declarativo");

        List<String> completions = system.autoComplete("de");
        System.out.println("Completions for 'de': " + completions);
    }
}
