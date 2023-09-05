package org.mindustack.minterpreter;

public class Parser {
    static Module parse(String code) {

        Module module = new Module();

        String[] splitLines = code.split("\n");


        for (String line : splitLines) {
            if (line.startsWith("#")) {
                continue;
            } else if (line.endsWith(":")) {
                module.labels.put(line.replaceAll("[ :]", ""), module.insts.size());
            } else {
                String[] split = line.split(" ");
                module.insts.add(split);
//
            }
        }

        return module;
    }


}