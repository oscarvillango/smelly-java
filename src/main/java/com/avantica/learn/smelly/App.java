package com.avantica.learn.smelly;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App 
{
    static class Inputs {
        static int number = 4;
        static InputStream input = App.class.getResourceAsStream("input.txt");
    }
    
    public static void main( String[] args ) throws Exception
    {
        // Problem A
        int number = Inputs.number;
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<number; i++) {
            for (int k=0; k<number; k++) {
                if (k==i) {
                    builder.append('#');
                } else { 
                    builder.append('-');
                }
                if (k+1==number) builder.append('\n'); //end of line
            }
        }
        System.out.println(builder.toString());
        
        // Problem B
        BufferedReader br = new BufferedReader(new InputStreamReader(Inputs.input));
        String line;
        int lineNumber = 1;
        Map<String, List<Integer>> words = new HashMap<String, List<Integer>>();
        while ((line = br.readLine()) != null) {
           if (words.containsKey(line)) {
               words.get(line).add(lineNumber);
           } else {
               words.put(line, new ArrayList<Integer>());
               words.get(line).add(lineNumber);
           }

           lineNumber++;
        }

        for (Map.Entry<String, List<Integer>> entry : words.entrySet()) {
            System.out.println(String.format("%s: %s\n", entry.getKey(), entry.getValue()));
        }
        
    }
}
