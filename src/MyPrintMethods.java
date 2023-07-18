public class MyPrintMethods {

    public static String showAsFormattedList(String header, Object[] list) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(header).append("\n");
        int count = 0;
        for (Object item : list)
            stringBuilder.append(++count)
                    .append(": ")
                    .append(item)
                    .append("\n");
        return stringBuilder.toString();
    }
}
