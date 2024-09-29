class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] dayOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday" };
        int[] m = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int curYrDays = day;
        for (int i = 0; i < month-1; i++){
           curYrDays += m[i]; 
        }  
        if (isLeapYear(year) && month > 2){
            curYrDays++;
        }  
        year--;
        int noOfLeapYear = (year / 4) - (year / 100) + (year / 400);
        int noOfNormalYear = year - noOfLeapYear;
        int totDaysTillLastYear =  (noOfNormalYear * 365) + (noOfLeapYear * 366);
        curYrDays += totDaysTillLastYear;
        return dayOfWeek[(curYrDays) % 7];
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));
    }

}