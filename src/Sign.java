public class Sign {
    private String message;
    private int lineWidth;

    /**
     * Note: not from the ap
     */
    private int messageLength;

    /**
     * The Sign class constructor has two parameters. The first parameter is a String that contains the
     * message to be displayed on the sign. The second parameter is an int that contains the width of each line of
     * the sign. The width is the positive maximum number of characters that can be displayed on a single line of the
     * sign.
     */
    public Sign(String message, int lineWidth) {
        this.message = message;
        this.lineWidth = lineWidth;

        this.messageLength = message.length();
    }

    /**
     * The numberOfLines method returns an int representing the number of lines needed to display the
     * text on the sign. In the previous examples, numberOfLines would return 3, 2, and 1, respectively,
     * for the sign widths shown in the table.
     */
    public int numberOfLines() {
        int lines = 0;
        lines += messageLength / lineWidth;
        if (messageLength % lineWidth != 0) {
            lines ++;
        }
        return lines;
    }

    /**
     * The getLines method returns a String containing the message broken into lines separated by
     * semicolons (;) or returns null if the message is the empty string. The constructor parameter that
     * contains the message to be displayed will not include any semicolons. As an example, in the first row of the
     * preceding table, getLines would return "Everything on s;ale, please com;e in" .
     * No semicolon should appear at the end of the String returned by getLines.
     */
    public String getLines() {
    return "";
    }
}
