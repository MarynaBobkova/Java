/**
 * @author Andrej Reutow
 * created on 09.10.2023
 */
public class PasswordValidatorApp {

    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator(
                2, 2, 2, 12, "#!/*-", 2
        );

        String pass1 = "!IAmValidPass007!";
        String pass2 = "notvalid";
        String pass3 = "notvalid007";
        String pass4 = "notValid007";
        String pass5 = "007";
        String pass6 = "007!";
        String pass7 = "n";
        String pass8 = "NOTVALID";
        String pass9 = "NOTVALID007";
        String pass10 = "NOTVALID007!";
        String pass11 = "!";
        String pass12 = "IAmNotValidPass007!";

        System.out.println("validate pass: " + pass1 + " result: " + passwordValidator.isValid(pass1));
        System.out.println("validate pass: " + pass2 + " result: " + passwordValidator.isValid(pass2));
        System.out.println("validate pass: " + pass3 + " result: " + passwordValidator.isValid(pass3));
        System.out.println("validate pass: " + pass4 + " result: " + passwordValidator.isValid(pass4));
        System.out.println("validate pass: " + pass5 + " result: " + passwordValidator.isValid(pass5));
        System.out.println("validate pass: " + pass6 + " result: " + passwordValidator.isValid(pass6));
        System.out.println("validate pass: " + pass7 + " result: " + passwordValidator.isValid(pass7));
        System.out.println("validate pass: " + pass8 + " result: " + passwordValidator.isValid(pass8));
        System.out.println("validate pass: " + pass9 + " result: " + passwordValidator.isValid(pass9));
        System.out.println("validate pass: " + pass10 + " result: " + passwordValidator.isValid(pass10));
        System.out.println("validate pass: " + pass11 + " result: " + passwordValidator.isValid(pass11));
        System.out.println("validate pass: " + pass12 + " result: " + passwordValidator.isValid(pass12));
    }
}
