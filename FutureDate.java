import java.util.Scanner;
public class FutureDate 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("DAY NUMBER: ");
        int dayNum = sc.nextInt();
        System.out.print("YEAR: ");
        int year = sc.nextInt();
        System.out.print("DATE AFTER (N DAYS): ");
        int n = sc.nextInt();

        if (dayNum < 1 || dayNum > 366) 
        {
            System.out.println("DAY NUMBER OUT OF RANGE");
            return;
        }

        if (n < 1 || n > 100) 
        {
            System.out.println("DATE AFTER (N DAYS) OUT OF RANGE");
            return;
        }

        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String monthNames[] = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

        boolean leap = false;
        if (year % 400 == 0) leap = true;
        else if (year % 100 == 0) leap = false;
        else if (year % 4 == 0) leap = true;

        if (leap) monthDays[1] = 29;

        int i = 0;
        int daySum = 0;
        for (i = 0; i < monthDays.length; i++) 
        {
            daySum += monthDays[i];
            if (daySum >= dayNum) break;
        }

        int date = dayNum + monthDays[i] - daySum;
        String dateStr = date + "TH " + monthNames[i] + ", " + year;

        int nDays = dayNum + n;
        int nYear = year;

        if (leap && nDays > 366) 
        {
            nYear++;
            nDays -= 366;
        } else if (nDays > 365) 
        {
            nYear++;
            nDays -= 365;
        }

        boolean nextLeap = false;
        if (nYear % 400 == 0) nextLeap = true;
        else if (nYear % 100 == 0) nextLeap = false;
        else if (nYear % 4 == 0) nextLeap = true;

        if (nextLeap) monthDays[1] = 29;
        else monthDays[1] = 28;

        daySum = 0;
        for (i = 0; i < monthDays.length; i++) 
        {
            daySum += monthDays[i];
            if (daySum >= nDays)
                break;
        }

        date = nDays + monthDays[i] - daySum;
        String nDateStr = date + "TH " + monthNames[i] + ", " + nYear;

        System.out.println();
        System.out.println("DATE: " + dateStr);
        System.out.println("DATE AFTER " + n + " DAYS: " + nDateStr);
    }
}