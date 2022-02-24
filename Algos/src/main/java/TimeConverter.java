public class TimeConverter {

    public String convertTime(String inputTime) {

        boolean isPostNoonTime = false;
        if (inputTime.contains("PM")) {
            isPostNoonTime = true;
        }

        final int length = inputTime.length();
        final String dateWithoutPostscripts = inputTime.substring(0, length - 2);
        final String[] timeSplit = dateWithoutPostscripts.split(":");
        final StringBuilder stringBuilder = new StringBuilder(length);

        if (!isPostNoonTime) {
            if (Integer.parseInt(timeSplit[0]) == 12) {
                stringBuilder.append("00").append(":").append(timeSplit[1]).append(":").append(timeSplit[2]);
                return stringBuilder.toString();
            }
            return dateWithoutPostscripts;
        }

        int hour = Integer.parseInt(timeSplit[0]);
        int newHour = 0;
        if (hour < 12) {
            newHour = hour + 12;
        } else if (hour == 12) {
            newHour = 12;
        }
        String newHourString = String.valueOf(newHour);
        stringBuilder.append(newHourString).append(":").append(timeSplit[1]).append(":").append(timeSplit[2]);
        return stringBuilder.toString();
    }
}
