import java.time.Year;

public class UppgiftC {
    public static void main(String[] args) {
        // Assignment does not call for the usage of a Person Class!

        // String for first- and lastnames, the majority of names consists of more than a single character
        String firstName = "Alexander";
        String lastName = "J.";
        // Byte as the oldest recorded person became 122 years and 164 days old, a few years off the byte range of 127
        // But we are lazy so we use int
        int age = 25;
        // Float as height is usually measured with a decimal precision of 2
        float heightM = 1.85f;
        // Float as weight is usually measured with a decimal precision of 2
        float weightKg = 900.0f;
        // Boolean as the person is either a student or not a student
        boolean isStudent = true;

    }

    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static boolean isAdult(int age) {
        if (age < 0)
            throw new RuntimeException();
        return age >= 18;
    }

    public static String getAgeStatusString(int age) {
        if (age < 13)
            return "\"Child\"";
        else if (age >= 13 && age <= 19)
            return "\"Teen\"";
        else if (age >= 20 && age <= 64)
            return "\"Adult\"";

        return "\"Senior\"";
    }

    public static float calculateBMI(float weightKg, float heightMeters) {
        if (heightMeters == 0)
            throw new RuntimeException();
        return weightKg / (float) (Math.pow(heightMeters, 2));
    }

    public static String getBMICategory(float bmi) {
        if (bmi < 18.5f)
            return "Underweight";
        else if (bmi >= 18.5f && bmi < 25.0f)
            return "Healthy Weight";
        else if (bmi >= 25.0f && bmi < 30.0f)
            return "Overweight";
        else if (bmi >= 30.0f && bmi < 35.0f)
            return "Class 1 Obesity";
        else if (bmi >= 35.0f && bmi < 40.0f)
            return "Class 2 Obesity";
        else // bmi >= 40.0f
            return "Class 3 Obesity (Severe Obesity)";
    }

    public static void printAgeStats(int age) {
        int year = Year.now().getValue();
        System.out.println("Your age in the next 10 years:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d: %d\n", year, age + i);
            year++;
        }
    }

    public static void printNameFormat(String name) {
        switch(name.split(" ").length) {
            case 1:
                System.out.println("Only first or last name present!");
            case 2:
                System.out.println("First and last name present (or middlename??)!");
            case 3:
                System.out.println("First, middle and last name present!");
            default:
                System.out.println("A lot of names present!");
        }
    }

    public static int getVowelCount(String name) {

    }

    public static String getHeightString(float heightInMeters) {
        return "Height: " + heightInMeters + "m (" + (heightInMeters * 100) + "cm)";
    }

    public static void prettyPrintPerson(
            String firstName,
            String lastName,
            int age,
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
