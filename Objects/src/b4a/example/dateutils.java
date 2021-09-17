package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dateutils {
private static dateutils mostCurrent = new dateutils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.List _dayslist = null;
public static anywheresoftware.b4a.objects.collections.List _monthslist = null;
public static String _ad = "";
public static String _bc = "";
public b4a.example.main _main = null;
public static class _period{
public boolean IsInitialized;
public int Years;
public int Months;
public int Days;
public int Hours;
public int Minutes;
public int Seconds;
public void Initialize() {
IsInitialized = true;
Years = 0;
Months = 0;
Days = 0;
Hours = 0;
Minutes = 0;
Seconds = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static long  _addperiod(anywheresoftware.b4a.BA _ba,long _ticks,b4a.example.dateutils._period _per) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Public Sub AddPeriod(Ticks As Long, Per As Period) As Long";
 //BA.debugLineNum = 196;BA.debugLine="Ticks = DateTime.Add(Ticks, Per.Years, Per.Months, Per.Days)";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.Add(_ticks,_per.Years,_per.Months,_per.Days);
 //BA.debugLineNum = 197;BA.debugLine="Ticks = Ticks + Per.Hours * DateTime.TicksPerHour + Per.Minutes * DateTime.TicksPerMinute + _ 		Per.Seconds * DateTime.TicksPerSecond";
_ticks = (long) (_ticks+_per.Hours*anywheresoftware.b4a.keywords.Common.DateTime.TicksPerHour+_per.Minutes*anywheresoftware.b4a.keywords.Common.DateTime.TicksPerMinute+_per.Seconds*anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond);
 //BA.debugLineNum = 199;BA.debugLine="Return Ticks";
if (true) return _ticks;
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return 0L;
}
public static String  _format(anywheresoftware.b4a.BA _ba,int _value,int _length) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Private Sub Format(Value As Int, Length As Int) As String";
 //BA.debugLineNum = 183;BA.debugLine="Return NumberFormat2(Value, Length, 0, 0, False)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat2(_value,_length,(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public static String  _getdayofweekname(anywheresoftware.b4a.BA _ba,long _ticks) throws Exception{
String _df = "";
String _res = "";
 //BA.debugLineNum = 21;BA.debugLine="Public Sub GetDayOfWeekName(Ticks As Long) As String";
 //BA.debugLineNum = 22;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
 //BA.debugLineNum = 23;BA.debugLine="DateTime.DateFormat = \"EEEE\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("EEEE");
 //BA.debugLineNum = 24;BA.debugLine="Dim res As String = DateTime.Date(Ticks)";
_res = anywheresoftware.b4a.keywords.Common.DateTime.Date(_ticks);
 //BA.debugLineNum = 25;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
 //BA.debugLineNum = 26;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _getdaysnames(anywheresoftware.b4a.BA _ba) throws Exception{
String _df = "";
long _t = 0L;
int _i = 0;
 //BA.debugLineNum = 30;BA.debugLine="Public Sub GetDaysNames As List";
 //BA.debugLineNum = 31;BA.debugLine="If daysList.IsInitialized Then Return daysList";
if (_dayslist.IsInitialized()) { 
if (true) return _dayslist;};
 //BA.debugLineNum = 32;BA.debugLine="daysList.Initialize";
_dayslist.Initialize();
 //BA.debugLineNum = 33;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
 //BA.debugLineNum = 34;BA.debugLine="DateTime.DateFormat = \"EEEE\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("EEEE");
 //BA.debugLineNum = 35;BA.debugLine="Dim t As Long = DateTime.Now";
_t = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 36;BA.debugLine="t = DateTime.Add(t, 0, 0, - (DateTime.GetDayOfWeek(t) - 1))";
_t = anywheresoftware.b4a.keywords.Common.DateTime.Add(_t,(int) (0),(int) (0),(int) (-(anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfWeek(_t)-1)));
 //BA.debugLineNum = 37;BA.debugLine="For i = 1 To 7";
{
final int step26 = 1;
final int limit26 = (int) (7);
for (_i = (int) (1); (step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26); _i = ((int)(0 + _i + step26))) {
 //BA.debugLineNum = 38;BA.debugLine="daysList.Add(DateTime.Date(t))";
_dayslist.Add((Object)(anywheresoftware.b4a.keywords.Common.DateTime.Date(_t)));
 //BA.debugLineNum = 39;BA.debugLine="t = DateTime.Add(t, 0, 0, 1)";
_t = anywheresoftware.b4a.keywords.Common.DateTime.Add(_t,(int) (0),(int) (0),(int) (1));
 }
};
 //BA.debugLineNum = 41;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
 //BA.debugLineNum = 42;BA.debugLine="Return daysList";
if (true) return _dayslist;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public static String  _getera(anywheresoftware.b4a.BA _ba,boolean _negative) throws Exception{
String _df = "";
 //BA.debugLineNum = 141;BA.debugLine="Private Sub GetEra(Negative As Boolean) As String";
 //BA.debugLineNum = 142;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
 //BA.debugLineNum = 143;BA.debugLine="If Negative Then";
if (_negative) { 
 //BA.debugLineNum = 144;BA.debugLine="If bc <> \"\" Then Return bc";
if ((_bc).equals("") == false) { 
if (true) return _bc;};
 //BA.debugLineNum = 145;BA.debugLine="DateTime.DateFormat = \"GG\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("GG");
 //BA.debugLineNum = 146;BA.debugLine="bc = DateTime.Date(-33762880800000)";
_bc = anywheresoftware.b4a.keywords.Common.DateTime.Date((long) (-33762880800000L));
 //BA.debugLineNum = 147;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
 //BA.debugLineNum = 148;BA.debugLine="Return bc";
if (true) return _bc;
 }else {
 //BA.debugLineNum = 150;BA.debugLine="If ad <> \"\" Then Return ad";
if ((_ad).equals("") == false) { 
if (true) return _ad;};
 //BA.debugLineNum = 151;BA.debugLine="DateTime.DateFormat = \"GG\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("GG");
 //BA.debugLineNum = 152;BA.debugLine="ad = DateTime.Date(0)";
_ad = anywheresoftware.b4a.keywords.Common.DateTime.Date((long) (0));
 //BA.debugLineNum = 153;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
 //BA.debugLineNum = 154;BA.debugLine="Return ad";
if (true) return _ad;
 };
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public static String  _getmonthname(anywheresoftware.b4a.BA _ba,long _ticks) throws Exception{
String _df = "";
String _res = "";
 //BA.debugLineNum = 11;BA.debugLine="Public Sub GetMonthName(Ticks As Long) As String";
 //BA.debugLineNum = 12;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
 //BA.debugLineNum = 13;BA.debugLine="DateTime.DateFormat = \"MMMM\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMMM");
 //BA.debugLineNum = 14;BA.debugLine="Dim res As String = DateTime.Date(Ticks)";
_res = anywheresoftware.b4a.keywords.Common.DateTime.Date(_ticks);
 //BA.debugLineNum = 15;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
 //BA.debugLineNum = 16;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _getmonthsnames(anywheresoftware.b4a.BA _ba) throws Exception{
String _df = "";
long _t = 0L;
int _i = 0;
 //BA.debugLineNum = 46;BA.debugLine="Public Sub GetMonthsNames As List";
 //BA.debugLineNum = 47;BA.debugLine="If monthsList.IsInitialized Then Return monthsList";
if (_monthslist.IsInitialized()) { 
if (true) return _monthslist;};
 //BA.debugLineNum = 48;BA.debugLine="monthsList.Initialize";
_monthslist.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
 //BA.debugLineNum = 50;BA.debugLine="DateTime.DateFormat = \"MMMM\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMMM");
 //BA.debugLineNum = 51;BA.debugLine="Dim t As Long = DateTime.Now";
_t = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 52;BA.debugLine="t = DateTime.Add(t, 0,- (DateTime.GetMonth(t) - 1), 0)";
_t = anywheresoftware.b4a.keywords.Common.DateTime.Add(_t,(int) (0),(int) (-(anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(_t)-1)),(int) (0));
 //BA.debugLineNum = 53;BA.debugLine="For i = 1 To 12";
{
final int step40 = 1;
final int limit40 = (int) (12);
for (_i = (int) (1); (step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40); _i = ((int)(0 + _i + step40))) {
 //BA.debugLineNum = 54;BA.debugLine="monthsList.Add(DateTime.Date(t))";
_monthslist.Add((Object)(anywheresoftware.b4a.keywords.Common.DateTime.Date(_t)));
 //BA.debugLineNum = 55;BA.debugLine="t = DateTime.Add(t, 0, 1, 0)";
_t = anywheresoftware.b4a.keywords.Common.DateTime.Add(_t,(int) (0),(int) (1),(int) (0));
 }
};
 //BA.debugLineNum = 57;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
 //BA.debugLineNum = 58;BA.debugLine="Return monthsList";
if (true) return _monthslist;
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public static boolean  _issameday(anywheresoftware.b4a.BA _ba,long _ticks1,long _ticks2) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Public Sub IsSameDay(Ticks1 As Long, Ticks2 As Long) As Boolean";
 //BA.debugLineNum = 208;BA.debugLine="Return DateTime.GetYear(Ticks1) = DateTime.GetYear(Ticks2) AND DateTime.GetMonth(Ticks1) = DateTime.GetMonth(Ticks2) _ 		AND DateTime.GetDayOfMonth(Ticks1) = DateTime.GetDayOfMonth(Ticks2)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_ticks1)==anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_ticks2) && anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(_ticks1)==anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(_ticks2) && anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(_ticks1)==anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(_ticks2);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return false;
}
public static int  _numberofdaysinmonth(anywheresoftware.b4a.BA _ba,int _month,int _year) throws Exception{
long _ticks = 0L;
long _nextmonth = 0L;
int _res = 0;
 //BA.debugLineNum = 187;BA.debugLine="Public Sub NumberOfDaysInMonth(Month As Int, Year As Int) As Int";
 //BA.debugLineNum = 188;BA.debugLine="Dim Ticks As Long = SetDate(Year, Month, 1)";
_ticks = _setdate(_ba,_year,_month,(int) (1));
 //BA.debugLineNum = 189;BA.debugLine="Dim nextMonth As Long = DateTime.Add(Ticks, 0, 1, 0)";
_nextmonth = anywheresoftware.b4a.keywords.Common.DateTime.Add(_ticks,(int) (0),(int) (1),(int) (0));
 //BA.debugLineNum = 190;BA.debugLine="Dim res As Int =  Round((nextMonth - Ticks) / DateTime.TicksPerDay)";
_res = (int) (anywheresoftware.b4a.keywords.Common.Round((_nextmonth-_ticks)/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerDay));
 //BA.debugLineNum = 191;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return 0;
}
public static b4a.example.dateutils._period  _periodbetween(anywheresoftware.b4a.BA _ba,long _start,long _endtime) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Public Sub PeriodBetween(Start As Long, EndTime As Long) As Period";
 //BA.debugLineNum = 64;BA.debugLine="Return PeriodBetweenHelper(Start, EndTime, False)";
if (true) return _periodbetweenhelper(_ba,_start,_endtime,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public static b4a.example.dateutils._period  _periodbetweenhelper(anywheresoftware.b4a.BA _ba,long _start,long _endtime,boolean _startwithdays) throws Exception{
b4a.example.dateutils._period _td = null;
int _sy = 0;
int _ey = 0;
int _daysoffset = 0;
long _ticks = 0L;
int _i = 0;
long _diff = 0L;
 //BA.debugLineNum = 73;BA.debugLine="Private Sub PeriodBetweenHelper(Start As Long, EndTime As Long, StartWithDays As Boolean) As Period";
 //BA.debugLineNum = 74;BA.debugLine="Dim td As Period";
_td = new b4a.example.dateutils._period();
 //BA.debugLineNum = 75;BA.debugLine="td.Initialize";
_td.Initialize();
 //BA.debugLineNum = 76;BA.debugLine="Dim sy = DateTime.GetYear(Start), ey = DateTime.GetYear(EndTime) As Int";
_sy = anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_start);
_ey = anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_endtime);
 //BA.debugLineNum = 77;BA.debugLine="Dim daysOffset As Int";
_daysoffset = 0;
 //BA.debugLineNum = 78;BA.debugLine="If EndTime > Start Then";
if (_endtime>_start) { 
 //BA.debugLineNum = 79;BA.debugLine="If Not(StartWithDays) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_startwithdays)) { 
 //BA.debugLineNum = 81;BA.debugLine="If DateTime.Add(Start, ey - sy, 0, 0) > EndTime Then td.Years = ey - sy - 1 Else td.Years = ey - sy";
if (anywheresoftware.b4a.keywords.Common.DateTime.Add(_start,(int) (_ey-_sy),(int) (0),(int) (0))>_endtime) { 
_td.Years = (int) (_ey-_sy-1);}
else {
_td.Years = (int) (_ey-_sy);};
 //BA.debugLineNum = 82;BA.debugLine="Dim ticks As Long = DateTime.Add(Start, td.Years, 0, 0)";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.Add(_start,_td.Years,(int) (0),(int) (0));
 //BA.debugLineNum = 84;BA.debugLine="For i = 1 To 13";
{
final int step62 = 1;
final int limit62 = (int) (13);
for (_i = (int) (1); (step62 > 0 && _i <= limit62) || (step62 < 0 && _i >= limit62); _i = ((int)(0 + _i + step62))) {
 //BA.debugLineNum = 85;BA.debugLine="If DateTime.Add(ticks, 0, i, 0) > EndTime Then";
if (anywheresoftware.b4a.keywords.Common.DateTime.Add(_ticks,(int) (0),_i,(int) (0))>_endtime) { 
 //BA.debugLineNum = 86;BA.debugLine="td.Months = i - 1";
_td.Months = (int) (_i-1);
 //BA.debugLineNum = 87;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 90;BA.debugLine="ticks = DateTime.Add(ticks, 0, td.Months, 0)";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.Add(_ticks,(int) (0),_td.Months,(int) (0));
 }else {
 //BA.debugLineNum = 92;BA.debugLine="daysOffset = (EndTime - Start) / DateTime.TicksPerDay - 3";
_daysoffset = (int) ((_endtime-_start)/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerDay-3);
 //BA.debugLineNum = 93;BA.debugLine="Dim ticks As Long = Start";
_ticks = _start;
 };
 //BA.debugLineNum = 96;BA.debugLine="For i = daysOffset + 1 To daysOffset + 32";
{
final int step73 = 1;
final int limit73 = (int) (_daysoffset+32);
for (_i = (int) (_daysoffset+1); (step73 > 0 && _i <= limit73) || (step73 < 0 && _i >= limit73); _i = ((int)(0 + _i + step73))) {
 //BA.debugLineNum = 97;BA.debugLine="If DateTime.Add(ticks, 0, 0, i) > EndTime Then";
if (anywheresoftware.b4a.keywords.Common.DateTime.Add(_ticks,(int) (0),(int) (0),_i)>_endtime) { 
 //BA.debugLineNum = 98;BA.debugLine="td.Days = i - 1";
_td.Days = (int) (_i-1);
 //BA.debugLineNum = 99;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 102;BA.debugLine="ticks = DateTime.Add(ticks, 0, 0, td.Days)";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.Add(_ticks,(int) (0),(int) (0),_td.Days);
 //BA.debugLineNum = 103;BA.debugLine="Dim diff As Long = EndTime - ticks";
_diff = (long) (_endtime-_ticks);
 //BA.debugLineNum = 104;BA.debugLine="td.Hours = diff / DateTime.TicksPerHour";
_td.Hours = (int) (_diff/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerHour);
 //BA.debugLineNum = 105;BA.debugLine="td.Minutes = (diff Mod DateTime.TicksPerHour) / DateTime.TicksPerMinute";
_td.Minutes = (int) ((_diff%anywheresoftware.b4a.keywords.Common.DateTime.TicksPerHour)/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerMinute);
 //BA.debugLineNum = 106;BA.debugLine="td.Seconds = (diff Mod DateTime.TicksPerMinute) / DateTime.TicksPerSecond";
_td.Seconds = (int) ((_diff%anywheresoftware.b4a.keywords.Common.DateTime.TicksPerMinute)/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond);
 //BA.debugLineNum = 107;BA.debugLine="Return td";
if (true) return _td;
 }else {
 //BA.debugLineNum = 109;BA.debugLine="If Not(StartWithDays) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_startwithdays)) { 
 //BA.debugLineNum = 111;BA.debugLine="If DateTime.Add(Start, ey - sy, 0, 0) < EndTime Then td.Years = ey - sy + 1 Else td.Years = ey - sy";
if (anywheresoftware.b4a.keywords.Common.DateTime.Add(_start,(int) (_ey-_sy),(int) (0),(int) (0))<_endtime) { 
_td.Years = (int) (_ey-_sy+1);}
else {
_td.Years = (int) (_ey-_sy);};
 //BA.debugLineNum = 112;BA.debugLine="Dim ticks As Long = DateTime.Add(Start, td.Years, 0, 0)";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.Add(_start,_td.Years,(int) (0),(int) (0));
 //BA.debugLineNum = 114;BA.debugLine="For i = -1 To -13 Step -1";
{
final int step89 = (int) (-1);
final int limit89 = (int) (-13);
for (_i = (int) (-1); (step89 > 0 && _i <= limit89) || (step89 < 0 && _i >= limit89); _i = ((int)(0 + _i + step89))) {
 //BA.debugLineNum = 115;BA.debugLine="If DateTime.Add(ticks, 0, i, 0) < EndTime Then";
if (anywheresoftware.b4a.keywords.Common.DateTime.Add(_ticks,(int) (0),_i,(int) (0))<_endtime) { 
 //BA.debugLineNum = 116;BA.debugLine="td.Months = i + 1";
_td.Months = (int) (_i+1);
 //BA.debugLineNum = 117;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 120;BA.debugLine="ticks = DateTime.Add(ticks, 0, td.Months, 0)";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.Add(_ticks,(int) (0),_td.Months,(int) (0));
 }else {
 //BA.debugLineNum = 122;BA.debugLine="daysOffset = (EndTime - Start) / DateTime.TicksPerDay + 3";
_daysoffset = (int) ((_endtime-_start)/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerDay+3);
 //BA.debugLineNum = 123;BA.debugLine="Dim ticks As Long = Start";
_ticks = _start;
 };
 //BA.debugLineNum = 126;BA.debugLine="For i = daysOffset - 1 To daysOffset - 32 Step -1";
{
final int step100 = (int) (-1);
final int limit100 = (int) (_daysoffset-32);
for (_i = (int) (_daysoffset-1); (step100 > 0 && _i <= limit100) || (step100 < 0 && _i >= limit100); _i = ((int)(0 + _i + step100))) {
 //BA.debugLineNum = 127;BA.debugLine="If DateTime.Add(ticks, 0, 0, i) < EndTime Then";
if (anywheresoftware.b4a.keywords.Common.DateTime.Add(_ticks,(int) (0),(int) (0),_i)<_endtime) { 
 //BA.debugLineNum = 128;BA.debugLine="td.Days = i + 1";
_td.Days = (int) (_i+1);
 //BA.debugLineNum = 129;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 132;BA.debugLine="ticks = DateTime.Add(ticks, 0, 0, td.Days)";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.Add(_ticks,(int) (0),(int) (0),_td.Days);
 //BA.debugLineNum = 133;BA.debugLine="Dim diff As Long = ticks - EndTime";
_diff = (long) (_ticks-_endtime);
 //BA.debugLineNum = 134;BA.debugLine="td.Hours = -diff / DateTime.TicksPerHour";
_td.Hours = (int) (-_diff/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerHour);
 //BA.debugLineNum = 135;BA.debugLine="td.Minutes = -(diff Mod DateTime.TicksPerHour) / DateTime.TicksPerMinute";
_td.Minutes = (int) (-(_diff%anywheresoftware.b4a.keywords.Common.DateTime.TicksPerHour)/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerMinute);
 //BA.debugLineNum = 136;BA.debugLine="td.Seconds = -(diff Mod DateTime.TicksPerMinute) / DateTime.TicksPerSecond";
_td.Seconds = (int) (-(_diff%anywheresoftware.b4a.keywords.Common.DateTime.TicksPerMinute)/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond);
 //BA.debugLineNum = 137;BA.debugLine="Return td";
if (true) return _td;
 };
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public static b4a.example.dateutils._period  _periodbetweenindays(anywheresoftware.b4a.BA _ba,long _start,long _endtime) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Public Sub PeriodBetweenInDays (Start As Long, EndTime As Long) As Period";
 //BA.debugLineNum = 70;BA.debugLine="Return PeriodBetweenHelper(Start, EndTime, True)";
if (true) return _periodbetweenhelper(_ba,_start,_endtime,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Type Period (Years As Int, Months As Int, _ 		Days As Int, Hours As Int, Minutes As Int, Seconds As Int)";
;
 //BA.debugLineNum = 5;BA.debugLine="Private daysList, monthsList As List";
_dayslist = new anywheresoftware.b4a.objects.collections.List();
_monthslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private ad, bc As String";
_ad = "";
_bc = "";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static long  _setdate(anywheresoftware.b4a.BA _ba,int _years,int _months,int _days) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Public Sub SetDate(Years As Int, Months As Int, Days As Int) As Long";
 //BA.debugLineNum = 159;BA.debugLine="Return SetDateAndTime(Years, Months, Days, 0, 0, 0)";
if (true) return _setdateandtime(_ba,_years,_months,_days,(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return 0L;
}
public static long  _setdateandtime(anywheresoftware.b4a.BA _ba,int _years,int _months,int _days,int _hours,int _minutes,int _seconds) throws Exception{
String _df = "";
String _tf = "";
String _d = "";
String _t = "";
long _ticks = 0L;
 //BA.debugLineNum = 162;BA.debugLine="Public Sub SetDateAndTime(Years As Int, Months As Int, Days As Int, Hours As Int, Minutes As Int, Seconds As Int) As Long";
 //BA.debugLineNum = 163;BA.debugLine="Dim df = DateTime.DateFormat, tf = DateTime.TimeFormat As String";
_df = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
_tf = anywheresoftware.b4a.keywords.Common.DateTime.getTimeFormat();
 //BA.debugLineNum = 164;BA.debugLine="DateTime.DateFormat = \"GGyyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("GGyyyyMMdd");
 //BA.debugLineNum = 165;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HHmmss");
 //BA.debugLineNum = 166;BA.debugLine="Dim d As String = Format(Abs(Years), 4) & Format(Months, 2) & Format(Days, 2)";
_d = _format(_ba,(int) (anywheresoftware.b4a.keywords.Common.Abs(_years)),(int) (4))+_format(_ba,_months,(int) (2))+_format(_ba,_days,(int) (2));
 //BA.debugLineNum = 167;BA.debugLine="d = GetEra(Years < 0) & d";
_d = _getera(_ba,_years<0)+_d;
 //BA.debugLineNum = 168;BA.debugLine="Dim t As String = Format(Hours, 2) & Format(Minutes, 2) & Format(Seconds, 2)";
_t = _format(_ba,_hours,(int) (2))+_format(_ba,_minutes,(int) (2))+_format(_ba,_seconds,(int) (2));
 //BA.debugLineNum = 169;BA.debugLine="Try";
try { //BA.debugLineNum = 170;BA.debugLine="Dim ticks As Long = DateTime.DateTimeParse(d, t)";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.DateTimeParse(_d,_t);
 } 
       catch (Exception e143) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e143); //BA.debugLineNum = 172;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
 //BA.debugLineNum = 173;BA.debugLine="DateTime.TimeFormat = tf";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat(_tf);
 //BA.debugLineNum = 174;BA.debugLine="Log(\"Error: Invalid value: \" & d & \" \" & t)";
anywheresoftware.b4a.keywords.Common.Log("Error: Invalid value: "+_d+" "+_t);
 //BA.debugLineNum = 175;BA.debugLine="Return \"invalid date\" + 1 'hack to throw an error";
if (true) return (long) ((double)(Double.parseDouble("invalid date"))+1);
 };
 //BA.debugLineNum = 177;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
 //BA.debugLineNum = 178;BA.debugLine="DateTime.TimeFormat = tf";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat(_tf);
 //BA.debugLineNum = 179;BA.debugLine="Return ticks";
if (true) return _ticks;
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return 0L;
}
public static String  _tickstostring(anywheresoftware.b4a.BA _ba,long _ticks) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Public Sub TicksToString(Ticks As Long) As String";
 //BA.debugLineNum = 203;BA.debugLine="Return DateTime.Date(Ticks) & \" \" & DateTime.Time(Ticks)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_ticks)+" "+anywheresoftware.b4a.keywords.Common.DateTime.Time(_ticks);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public static long  _tickstounixtime(anywheresoftware.b4a.BA _ba,long _ticks) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Public Sub TicksToUnixTime(Ticks As Long) As Long";
 //BA.debugLineNum = 214;BA.debugLine="Return Ticks / DateTime.TicksPerSecond";
if (true) return (long) (_ticks/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return 0L;
}
public static long  _unixtimetoticks(anywheresoftware.b4a.BA _ba,long _unixtime) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Public Sub UnixTimeToTicks(UnixTime As Long) As Long";
 //BA.debugLineNum = 219;BA.debugLine="Return UnixTime * DateTime.TicksPerSecond";
if (true) return (long) (_unixtime*anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return 0L;
}
}
