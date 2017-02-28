package WS16.Uebungsblatt8;

public class Exercise4 {
    public static void main(String[] args){
        String seite = "<body id=\"www-wikipedia-org\">"
                + "<div class=\"central-textlogo\">"
                + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
                + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\""
                + "</div>"
                + "</body>";

        int test = seite.indexOf("img src");
        int test2 = seite.indexOf(".png");
        String url = seite.substring(test + 9, test2+4);
        System.out.print(url);
    }
}
