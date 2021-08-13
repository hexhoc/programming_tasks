package javalang.chapter1.task39;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // 1K
        forLocaleStyle(Locale.US, NumberFormat.Style.SHORT, 1_000);
        // 1M
        forLocaleStyle(Locale.US, NumberFormat.Style.SHORT, 1_000_000);
        // 1B
        forLocaleStyle(Locale.US, NumberFormat.Style.SHORT, 1_000_000_000);

    }

    public static String forLocaleStyle(
            Locale locale, NumberFormat.Style style, double number) {
        return format(locale, style, null, number);
    }

    private static String format(
            Locale locale, NumberFormat.Style style, RoundingMode mode, double number) {
        if (locale == null || style == null) {
            return String.valueOf(number); // or use a default format
        }
        NumberFormat nf = NumberFormat.getCompactNumberInstance(locale,
                style);
        if (mode != null) {
            nf.setRoundingMode(mode);
        }
        return nf.format(number);
    }
}
