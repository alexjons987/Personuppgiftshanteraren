public class UppgiftB {
    public static void main(String[] args) {
        // Assignment does not call for the usage of a Person Class!

        // String for first- and lastnames, the majority of names consists of more than a single character
        String firstName = "Alexander";
        String lastName = "J.";
        // Byte as the oldest recorded person became 122 years and 164 days old, a few years off the byte range of 127
        byte age = 25;
        // Float as height is usually measured with a decimal precision of 2
        float heightM = 1.85f;
        // Float as weight is usually measured with a decimal precision of 2
        float weightKg = 900.0f;
        // Boolean as the person is either a student or not a student
        boolean isStudent = true;

        System.out.printf(
                "I am %s %s and I'm currently %d. I am roughly %.2fm %.1f Kg beast.\n",
                firstName,
                lastName,
                age,
                heightM,
                weightKg
        );
        if (isStudent)
            System.out.println("I am currently a Lexicon student.");
        else
            System.out.println("I am not a student.");

        System.out.printf("In 5 years I will be %d years old\n", (age + 5));
        System.out.println("My height in centimeter is " + heightM * 100);

        String fullName = getFullName(firstName, lastName);
        boolean isAdult = isAdult(age);
        float bmi = calculateBMI(weightKg, heightM);
        String heightString = getHeightString(heightM);

        System.out.println(); // Newline for better demonstration in console output

        prettyPrintPerson(firstName, lastName, age, heightM, weightKg, isStudent, isAdult, bmi);
    }

    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static boolean isAdult(byte age) {
        if (age < 0)
            throw new RuntimeException();
        return age >= 18;
    }

    public static float calculateBMI(float weightKg, float heightMeters) {
        if (heightMeters == 0)
            throw new RuntimeException();
        return weightKg / (float) (Math.pow(heightMeters, 2));
    }

    public static String getHeightString(float heightInMeters) {
        return "Height: " + heightInMeters + "m (" + (heightInMeters * 100) + "cm)";
    }

    public static void prettyPrintPerson(
            String firstName,
            String lastName,
            byte age,
            float heightInMeters,
            float weightKg,
            boolean isStudent,
            boolean isAdult,
            float bmi
    ) {
        if (isStudent)
            System.out.printf("%s (Student)\n", getFullName(firstName, lastName));
        else
            System.out.printf("%s\n", getFullName(firstName, lastName));
        System.out.printf("Is adult: %s\n", isAdult);
        System.out.printf("Age: %d\n", age);
        System.out.printf("%s\n", getHeightString(heightInMeters));
        System.out.printf("Weight: %.2f Kg\n", weightKg);
        System.out.printf("BMI: %.1f\n", bmi);
    }
}
