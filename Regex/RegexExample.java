import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample
{
    private String emails;
    private Pattern patternObj;
    private Matcher matcherObj; 

    public RegexExample(String emailAddress, String pattern)
    {
        this.setEmails(emailAddress);
        this.setPattern(pattern);
        this.setMatcher(emailAddress);
    }

    public String getEmails()
    {
        return this.emails;
    }

    public void setEmails(String emails)
    {
        this.emails = emails;
    }

    public Pattern getPattern()
    {
        return this.patternObj;
    }

    public void setPattern(String pattern)
    {
        this.patternObj = Pattern.compile(pattern);
    }

    public Matcher getMatcher()
    {
        return this.matcherObj;
    }

    public void setMatcher(String emails)
    {
        this.matcherObj = patternObj.matcher(emails);
    }

    public void printSegments()
    {
        Matcher matcher = this.getMatcher();
        while(matcher.find( )) 
        {
            System.out.println("Entire String is: " + matcher.group(0) );
            System.out.println("The protocol is " + matcher.group(1) );
            System.out.println("The world wide web is = " + matcher.group(2) );
            System.out.println("The domain name is " + matcher.group(3) );
            System.out.println("Found value: " + matcher.group(4) );
        }
    }
}