package L2;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static String a(Integer num) {
        if (num == null) {
            throw new IllegalArgumentException("Invalid style value: null");
        }
        switch (num.intValue()) {
            case 0:
                return "SPRITZ";
            case 1:
                return "TONAL_SPOT";
            case 2:
                return "VIBRANT";
            case 3:
                return "EXPRESSIVE";
            case 4:
                return "RAINBOW";
            case 5:
                return "FRUIT_SALAD";
            case 6:
                return "CONTENT";
            case 7:
                return "MONOCHROMATIC";
            case 8:
                return "CLOCK";
            case 9:
                return "CLOCK_VIBRANT";
            default:
                throw new IllegalArgumentException("Invalid style value: " + num);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    public static int b(String str) {
        byte b10;
        if (str == null) {
            throw new IllegalArgumentException("Invalid style value: null");
        }
        switch (str.hashCode()) {
            case -2057695229:
                if (!str.equals("TONAL_SPOT")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case -1842350374:
                if (!str.equals("SPRITZ")) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case -1310359704:
                if (!str.equals("EXPRESSIVE")) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -766121898:
                if (!str.equals("FRUIT_SALAD")) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case -652100269:
                if (!str.equals("CLOCK_VIBRANT")) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case 64218094:
                if (!str.equals("CLOCK")) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case 1169293476:
                if (!str.equals("VIBRANT")) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 1606074037:
                if (!str.equals("MONOCHROMATIC")) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 1669513305:
                if (!str.equals("CONTENT")) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 1691559318:
                if (!str.equals("RAINBOW")) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            default:
                throw new IllegalArgumentException("Invalid style name: " + str);
        }
    }

    public static int[] c() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }
}
