public class DailyStatic {
    public static void main(String[] args) {
        int [] serviceTimes = {12, 5, 8, 4};

        int totalStudents = 0;
        int totalServiceTime = 0;
        int highestServiceTime = serviceTimes[0];
        int lowestServiceTime = serviceTimes[0];
        int longerthan10 = 0;

        for (int i = 0; i < serviceTimes.length; i++){
            int time = serviceTimes[i];

            if (time == 0){
                continue;
            }
            totalStudents++;
            totalServiceTime = totalServiceTime + time;

            if (time > highestServiceTime){
                highestServiceTime = time;
            }
            if (time < lowestServiceTime){
                lowestServiceTime = time;
            }
            if (time > 10){
                longerthan10++;
            }
            
        }
        double averageServiceTime = (double) totalServiceTime / totalStudents;

        System.out.println("The total number of students served is: " + totalStudents);
        System.out.println("The total service time is: " + totalServiceTime + " minutes");
        System.out.println("The average service time is: " + averageServiceTime + " minutess");
        System.out.println("The highest service time is: " + highestServiceTime + " minutes");
        System.out.println("The lowest service time is: " + lowestServiceTime + " minutes");
        System.out.println("The number of services longer than 10 minutes is: " + longerthan10 + " minutes");
    }
}
