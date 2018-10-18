package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pattern p = Pattern.compile("^(?:https?:\\/\\/)?(?:[^@\\/\\n]+@)?(?:www\\.)?([^:\\/?\n]+)");
        String url = "https://www.dropbox.com/?cid=d76ce1d7a674fc67714fce4044b33ff2L";
        Matcher m = p.matcher(url);
           if (m.find()) {
        System.out.println(m.group(0)); // whole matched expression -> https://www.dropbox.com
        System.out.println(m.group(1)); // without HTTPS -> dropbox.com
    }

    }
}
