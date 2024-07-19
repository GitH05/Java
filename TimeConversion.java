/* Time Conversion Problem: 

Time = '12:00:00 PM'
: return 12:00:00

Time = '06:45:32PM'
:return 18:45:32

Time = '12:01:54 AM'
:return 00:01:54

Time = '06:45:32AM'
:return  06:45:32

For PM:
1.check if the Time-format is in 'PM'
2.If in 'PM' :-if hour==12 then return as 12:00:00:
3.if hour != 12
:store only m:s
:12+ hour

For AM:
4.if hour == 12 then return hour =00:
5. if hour != 12 then return h:m:s 
*/
import java.util.Scanner;
public class TimeConversion
{
public static void main(String[] args)
{
String time = "08:23:54PM";
String output = "";

//checking for 'PM' format:
if(time.charAt(8) == 'P')
{
//if hour == 12 then return the time format only: 12:01:54
if(time.charAt(0)=='1' && time.charAt(1)=='2')
{
output = time.substring(0,8);
}
else
{
String remain = time.substring(2,8);	//store only:- m:s
int Mtime = 12 + Integer.parseInt(time.substring(0,2));	//12 + hour
output = Mtime + remain;		//concate hour(Mtime) and minute and second(remain)
}
}
//if the time format is in "AM"
else
{
//if the hour ==12 then return hour as '00'
if(time.charAt(0)=='1' && time.charAt(1)=='2')
{
output = "00" + time.substring(2,8);
}
else
{
//if the hour is not 12
output = time.substring(0,8);
}
}
System.out.println("The Time Conversion of:- "+time+" is: "+ output);

}
}