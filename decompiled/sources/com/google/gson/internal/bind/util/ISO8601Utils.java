package com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00dc A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004e, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:49:0x00d6, B:51:0x00dc, B:53:0x00e2, B:77:0x018f, B:57:0x00ec, B:58:0x0107, B:59:0x0108, B:63:0x0124, B:65:0x0131, B:68:0x013a, B:70:0x0159, B:73:0x0168, B:74:0x018a, B:76:0x018d, B:62:0x0113, B:79:0x01c0, B:80:0x01c7, B:42:0x00b9, B:43:0x00bc), top: B:91:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004e, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:49:0x00d6, B:51:0x00dc, B:53:0x00e2, B:77:0x018f, B:57:0x00ec, B:58:0x0107, B:59:0x0108, B:63:0x0124, B:65:0x0131, B:68:0x013a, B:70:0x0159, B:73:0x0168, B:74:0x018a, B:76:0x018d, B:62:0x0113, B:79:0x01c0, B:80:0x01c7, B:42:0x00b9, B:43:0x00bc), top: B:91:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004e, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:49:0x00d6, B:51:0x00dc, B:53:0x00e2, B:77:0x018f, B:57:0x00ec, B:58:0x0107, B:59:0x0108, B:63:0x0124, B:65:0x0131, B:68:0x013a, B:70:0x0159, B:73:0x0168, B:74:0x018a, B:76:0x018d, B:62:0x0113, B:79:0x01c0, B:80:0x01c7, B:42:0x00b9, B:43:0x00bc), top: B:91:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x018d A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004e, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:49:0x00d6, B:51:0x00dc, B:53:0x00e2, B:77:0x018f, B:57:0x00ec, B:58:0x0107, B:59:0x0108, B:63:0x0124, B:65:0x0131, B:68:0x013a, B:70:0x0159, B:73:0x0168, B:74:0x018a, B:76:0x018d, B:62:0x0113, B:79:0x01c0, B:80:0x01c7, B:42:0x00b9, B:43:0x00bc), top: B:91:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c0 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004e, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:49:0x00d6, B:51:0x00dc, B:53:0x00e2, B:77:0x018f, B:57:0x00ec, B:58:0x0107, B:59:0x0108, B:63:0x0124, B:65:0x0131, B:68:0x013a, B:70:0x0159, B:73:0x0168, B:74:0x018a, B:76:0x018d, B:62:0x0113, B:79:0x01c0, B:80:0x01c7, B:42:0x00b9, B:43:0x00bc), top: B:91:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0113, please report this as an issue */
    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i10;
        int i11;
        int i12;
        int i13;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i14 = index + 4;
            int i15 = parseInt(str, index, i14);
            if (checkOffset(str, i14, '-')) {
                i14 = index + 5;
            }
            int i16 = i14 + 2;
            int i17 = parseInt(str, i14, i16);
            if (checkOffset(str, i16, '-')) {
                i16 = i14 + 3;
            }
            int i18 = i16 + 2;
            int i19 = parseInt(str, i16, i18);
            boolean zCheckOffset = checkOffset(str, i18, 'T');
            if (!zCheckOffset && str.length() <= i18) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i15, i17 - 1, i19);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i18);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i20 = i16 + 5;
                int i21 = parseInt(str, i16 + 3, i20);
                if (checkOffset(str, i20, ':')) {
                    i20 = i16 + 6;
                }
                int i22 = i20 + 2;
                int i23 = parseInt(str, i20, i22);
                if (checkOffset(str, i22, ':')) {
                    i22 = i20 + 3;
                }
                if (str.length() <= i22 || (cCharAt2 = str.charAt(i22)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i18 = i22;
                    i10 = i21;
                    i11 = i23;
                } else {
                    int i24 = i22 + 2;
                    i13 = parseInt(str, i22, i24);
                    if (i13 > 59 && i13 < 63) {
                        i13 = 59;
                    }
                    if (checkOffset(str, i24, '.')) {
                        int i25 = i22 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i22 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i22 + 6);
                        int i26 = parseInt(str, i25, iMin);
                        int i27 = iMin - i25;
                        if (i27 == 1) {
                            i26 *= 100;
                        } else if (i27 == 2) {
                            i26 *= 10;
                        }
                        i10 = i21;
                        i18 = iIndexOfNonDigit;
                        i11 = i23;
                        i12 = i26;
                    } else {
                        i10 = i21;
                        i18 = i24;
                        i11 = i23;
                        i12 = 0;
                    }
                }
                if (str.length() > i18) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i18);
                if (cCharAt == 'Z') {
                    timeZone = TIMEZONE_UTC;
                    length = i18 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i18);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i18 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = TIMEZONE_UTC;
                    } else {
                        String str3 = "GMT" + strSubstring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                        String id = timeZone2.getID();
                        if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, i15);
                gregorianCalendar2.set(2, i17 - 1);
                gregorianCalendar2.set(5, i19);
                gregorianCalendar2.set(11, i10);
                gregorianCalendar2.set(12, i11);
                gregorianCalendar2.set(13, i13);
                gregorianCalendar2.set(14, i12);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            if (str.length() > i18) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i18);
            if (cCharAt == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i18 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i18);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i18 + strSubstring.length();
                if ("+0000".equals(strSubstring)) {
                    timeZone = TIMEZONE_UTC;
                } else {
                    timeZone = TIMEZONE_UTC;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, i15);
            gregorianCalendar3.set(2, i17 - 1);
            gregorianCalendar3.set(5, i19);
            gregorianCalendar3.set(11, i10);
            gregorianCalendar3.set(12, i11);
            gregorianCalendar3.set(13, i13);
            gregorianCalendar3.set(14, i12);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException e10) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            String message = e10.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e10.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e10);
            throw parseException;
        }
    }

    private static int parseInt(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }

    public static String format(Date date, boolean z9) {
        return format(date, z9, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z9, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z9 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z9) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int iAbs = Math.abs(i10 / 60);
            int iAbs2 = Math.abs(i10 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, iAbs, 2);
            sb.append(':');
            padInt(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}
