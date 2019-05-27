public class Tester
{
    public static void main(String[] args)
    {
        String emailString = "https://www.google.com\nhttp://corry.com\nhttps://youtube.com\nhttps://www.nasa.gov";
        String patternString = "(http[s]*://)([www.]*)(.*)([.]...)";
        
        RegexExample regexExample = new RegexExample(emailString,patternString);
        regexExample.printSegments();
    }
}