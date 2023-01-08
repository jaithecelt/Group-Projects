import java.util.Scanner;
class MileConversionsInteractive
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mi = scan.nextInt();
        final double INCHES_IN_MILE = 63360;
        final double FEET_IN_MILE = 5280;
        final double YARDS_IN_MILE = 1760;
        double in, ft, yds;
        in = mi*INCHES_IN_MILE;
        ft = mi*FEET_IN_MILE;
        yds = mi*YARDS_IN_MILE;
        System.out.println(mi+"miles is "+in+" inches, or "+ft+" feet, or "+yds+" yards.");
    }}
