public class UppgiftA {
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
    }
}
