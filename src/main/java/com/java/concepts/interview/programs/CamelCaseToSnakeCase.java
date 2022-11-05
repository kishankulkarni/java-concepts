package com.java.concepts.interview.programs;

public class CamelCaseToSnakeCase {

    public static void main(String[] args) {

        // camel case to snake case
        String camelCase = "thisIsSampleText";
        String snakeCase = camelCase.replaceAll("([A-Z])", "_$1");
        System.out.println("camel case to snake case: "+snakeCase);

        // snake case to camel case
       while (camelCase.contains("_")) {

            camelCase = snakeCase.replaceFirst("_[a-z]",
                    String.valueOf(Character.toUpperCase(camelCase.charAt(camelCase.indexOf("_") + 1))));
        }
        System.out.println("snake case to camel case: "+camelCase);
    }
}
