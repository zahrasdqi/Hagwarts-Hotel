import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Validation {
    private static final String email_regex="^[a-zA-Z]+(?:\\.[a-zA-Z0-9]+)*@" +"(?:[a-zA-Z0-9]+\\.)+[a-zA-Z]{2,}$";
    private String password;
    private String email;

    public Validation(String email, String password) {
        this.email=email;
        this.password=password;
    }

    public static boolean EmailValidator(String email) {

            Pattern pattern=Pattern.compile(email_regex);
            Matcher matcher= pattern.matcher(email);
            return matcher.matches();
        }
        public static boolean passcheck(String password){
                int c=0;

                String ptrn ="[a-z]+[A-Z]+[0-9]+";
                Scanner scanner=new Scanner(System.in);
                for (int i=0;i<password.length();i++){
                    char character=password.charAt(i);
                    if(Character.isLowerCase(character)){
                        c++;
                    }
                    if(Character.isUpperCase(character) && Character.isLowerCase(character)){
                        c++;
                    }
                    if(Character.isLowerCase(character) && Character.isUpperCase(character) && Character.isDigit(character)){
                        c++;
                    }
                    if(Character.isLowerCase(character) && Character.isUpperCase(character) && Character.isDigit(character)){
                        String pattern=".*[@#$%^+-].*";
                        Pattern regex=Pattern.compile(pattern);
                        Matcher matcher=regex.matcher(password);
                        if(matcher.matches()){
                            c++;
                        }
                    }
                    if(password.length()>8){
                        c++;
                    }

                }

                if(c>3) {
                    return true;
                }


                return false;
            }

        }



