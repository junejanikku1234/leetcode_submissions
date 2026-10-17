import java.util.ArrayList;

class Solution {
    public static String convertDateToBinary(String date) {
        // Split the input string into year, month, and day
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        // Convert year, month, and day to their binary representations
        String yearBinary = Integer.toBinaryString(year);
        String monthBinary = Integer.toBinaryString(month);
        String dayBinary = Integer.toBinaryString(day);

        // Concatenate and return the final result in the required format
        return removeZero(yearBinary) + "-" + removeZero(monthBinary) + "-" + removeZero(dayBinary);
            
    }
        
        public static String removeZero(String str) {
            int i = 0;
            while (i < str.length() && str.charAt(i) == '0')
                i++;

            StringBuffer sb = new StringBuffer(str);

            sb.replace(0, i, "");

            return sb.toString();
    }
}