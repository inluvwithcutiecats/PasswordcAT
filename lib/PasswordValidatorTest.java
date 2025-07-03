package lib;


public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }
        // Test Case 1: รหัสผ่านสั้นควรจะ WEAK
        PasswordStrength result2 = PasswordValidator.validate("12345678");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 1 Passed: Short password is WEAK.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result2);
        }
        // Test Case 1: รหัสผ่านสั้นควรจะ WEAK
        PasswordStrength result3 = PasswordValidator.validate("imisshim");
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 1 Passed: Short password is WEAK.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result3);
        }
        // Test Case 1: รหัสผ่านสั้นควรจะ MEDIUM
        PasswordStrength result4 = PasswordValidator.validate("12356Asd");
        if (result4 == PasswordStrength. MEDIUM) {
            System.out.println("Test Case 1 Passed: Short password is MEDIUM.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result4);
        }
        // Test Case 1: รหัสผ่านสั้นควรจะ STRONG
        PasswordStrength result5 = PasswordValidator.validate("Ggez555!");
        if (result5 == PasswordStrength.STRONG) {
            System.out.println("Test Case 1 Passed: Short password is STRONG.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result5);
        }
        // --- เขียน Test Case อื่นๆ ต่อ ---

        System.out.println("--------------------------------");
    }
}
