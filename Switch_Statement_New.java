class Switch_Statement_New 
{

    public static void main(String[] args) {
        
        String day = "Monday";
        String result = "";

        result = switch (day) {
            case "Monday" -> "Start of the work week.";
            case "Tuesday" -> "Second day of the work week.";
            case "Wednesday" ->  "Midweek day.";
            case "Thursday" ->  "Almost the weekend.";
            case "Friday" ->  "Last day of the work week.";
            case "Saturday", "Sunday" ->  "It's the weekend!";
            default ->  "Invalid day.";
        };

        // no need of break statement

        System.out.println(result);
    }
}