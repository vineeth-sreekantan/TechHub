package com.workshop.stack.java;

import java.util.Optional;

public class OptionalUsage {
    public static void main(String[] args) {

        // Using Optional.of() for a non-null value
        Optional<String> name = Optional.of("John");
        System.out.println(name.get()); // Output: John

        // Using Optional.ofNullable() for a nullable value
        Optional<String> nullableName = Optional.ofNullable(null);
        System.out.println(nullableName.orElse("Unknown"));

        // Using Optional.empty() for an empty Optional
        Optional<String> emptyName = Optional.empty();
        System.out.println(emptyName.orElse("No Name"));


        String string = null;

        // Using Optional.ofNullable() to wrap a potentially null value
        Optional<String> optionalName = Optional.ofNullable(string);

        // Check if the value is present before accessing it
        if (optionalName.isPresent()) {
            System.out.println(optionalName.get()); // This will not execute since name is null
        } else {
            System.out.println("Name is not present"); // Output: Name is not present
        }

        // ifPresent executes if value is present
        optionalName.ifPresent(n -> System.out.println("Hello, " + name));

        Optional<String> emptyOptional = Optional.empty();

        // orElse() provides a default value if the Optional is empty
        String result1 = emptyOptional.orElse("Default Name");
        System.out.println(result1);  // Output: Default Name

        // orElseGet() uses a Supplier to provide a default value
        String result2 = emptyOptional.orElseGet(() -> "Generated Default Name");
        System.out.println(result2);  // Output: Generated Default Name


        // Using map to transform the value inside the Optional
        Optional<String> upperCaseName = name.map(String::toUpperCase);
        System.out.println(upperCaseName.get());  // Output: JOHN

        // Using flatMap when the transformation returns an Optional
        Optional<Optional<String>> nestedName = name.map(n -> Optional.of(n.toUpperCase()));
        System.out.println(nestedName.get().get());  // Output: JOHN


        // Filter the value if it meets the condition
        Optional<String> filteredName = name.filter(n -> n.length() > 3);
        filteredName.ifPresent(n -> System.out.println("Filtered name: " + n)); // Output: Filtered name: John

        // If the condition is not met, it returns an empty Optional
        Optional<String> emptyFilter = name.filter(n -> n.length() < 3);
        System.out.println(emptyFilter.isPresent());  // Output: false

    }
}
