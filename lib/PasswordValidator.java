package lib;


public class PasswordValidator {

    /**
     * @param รับค่า password รหัสผ่านที่ผู้ใช้ต้องการตั้ง ควรประกอบไปด้วย ตัวพิมเล็ก พิมพ์ใหญ่ ตัวเลขและตัวอักษรพิเศษในรหัสผ่าน
     * @return ส่งค่าระดับความแข็งแรงของรหัสผ่าน (ง่าย /ปานกลาง/ ยาก)
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { 
        
        if (password.length()<8){
            return PasswordStrength.INVALID;
        }
    

        boolean DigitCase = false;
        boolean UpperCase = false;
        boolean LowerCase = false;
        boolean SpecialChar = false;

        for(char c : password.toCharArray()){
            if(Character.isDigit(c)) {
                DigitCase = true;
        }   else if(Character.isUpperCase(c)) {
                UpperCase = true;
        }   else if(Character.isLowerCase(c)) {
                LowerCase = true;
        }   else if(!Character.isWhitespace(c) && !Character.isLetterOrDigit(c)) {
                SpecialChar = true;
        }
    }

        
        if (LowerCase&&UpperCase&&DigitCase&&SpecialChar){
            return PasswordStrength.STRONG;
         } else if (LowerCase&&DigitCase) {
            return PasswordStrength.MEDIUM;
         } else if (LowerCase || UpperCase) {
            return PasswordStrength.WEAK;
         } else
            return PasswordStrength.WEAK;
        } 
}
    
    
