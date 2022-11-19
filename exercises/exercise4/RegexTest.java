package exercises.exercise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Class to validate multiple regex patterns
 */
public class RegexTest{
    public static void main(String[] args) {
        
        // 1: Validate northeastern email
        String email1 = "posh@northeastern.edu";
        String email2 = "james@northeastern.edu";
        String email3 = "joshuanortheastern.edu";
        String email4 = "tatiana@sjsu@edu";

        String regStr = "^(.+)@northeastern.edu$";
        Pattern pattern = Pattern.compile(regStr);
        
        Matcher matcher1 = pattern.matcher(email1);
        if (matcher1.find()){
            System.out.println(email1 + " is valid");
        }else{
            System.out.println(email1 + " is invalid");
        }

        Matcher matcher2 = pattern.matcher(email2);
        if (matcher2.find()){
            System.out.println(email2 + " is valid");
        }else{
            System.out.println(email2 + " is invalid");
        }

        Matcher matcher3 = pattern.matcher(email3);
        if (matcher3.find()){
            System.out.println(email3 + " is valid");
        }else{
            System.out.println(email3 + " is invalid");
        }

        Matcher matcher4 = pattern.matcher(email4);
        if (matcher4.find()){
            System.out.println(email4 + " is valid");
        }else{
            System.out.println(email4 + " is invalid");
        }


        // 2: Validate URLs
        String url1 = "http://www.google.com";
        String url2 = "https://www.yahoo.com";
        String url3 = "httppp://w.apple.co";

        String regStr2 = "^https?:\\/\\/(?:www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b(?:[-a-zA-Z0-9()@:%_\\+.~#?&\\/=]*)$";
        Pattern pattern2 = Pattern.compile(regStr2);

        Matcher urlMatcher1 = pattern2.matcher(url1);
        if (urlMatcher1.find()){
            System.out.println(url1 + " is valid");
        }else{
            System.out.println(url1 + " is invalid");
        }

        Matcher urlMatcher2 = pattern2.matcher(url2);
        if (urlMatcher2.find()){
            System.out.println(url2 + " is valid");
        }else{
            System.out.println(url2 + " is invalid");
        }

        Matcher urlMatcher3 = pattern2.matcher(url3);
        if (urlMatcher3.find()){
            System.out.println(url3 + " is valid");
        }else{
            System.out.println(url3 + " is invalid");
        }

        // 3: Validate Date
        String date1 = "02/08/2015";
        String date2 = "02/08/15";
        String date3 = "2/20/2010";

        String regStr3 = "^[0-3][0-9]/[0-3][0-9]/(?:[0-9][0-9])?[0-9][0-9]$";

        Pattern pattern3 = Pattern.compile(regStr3);

        Matcher dateMatcher1 = pattern3.matcher(date1);
        if (dateMatcher1.find()){
            System.out.println(date1 + " is valid");
        }else{
            System.out.println(date1 + " is invalid");
        }

        Matcher dateMatcher2 = pattern3.matcher(date2);
        if (dateMatcher2.find()){
            System.out.println(date2 + " is valid");
        }else{
            System.out.println(date2 + " is invalid");
        }

        Matcher dateMatcher3 = pattern3.matcher(date3);
        if (dateMatcher3.find()){
            System.out.println(date3 + " is valid");
        }else{
            System.out.println(date3 + " is invalid");
        }

        // 4: Validate phone number
        String phone1  ="14806038999";
        String phone2 = "345678-333";
        String phone3 = "480-603--8955";
        String regStr4 = "^1[0-9]{10}$";

        Pattern pattern4 = Pattern.compile(regStr4);

        Matcher phoneMatcher1 = pattern4.matcher(phone1);
        if (phoneMatcher1.find()){
            System.out.println(phone1 + " is valid");
        }else{
            System.out.println(phone1 + " is invalid");
        }

        Matcher phoneMatcher2 = pattern4.matcher(phone2);
        if (phoneMatcher2.find()){
            System.out.println(phone2 + " is valid");
        }else{
            System.out.println(phone2 + " is invalid");
        }

        Matcher phoneMatcher3 = pattern4.matcher(phone3);
        if (phoneMatcher3.find()){
            System.out.println(phone3 + " is valid");
        }else{
            System.out.println(phone3 + " is invalid");
        }
    }
}







