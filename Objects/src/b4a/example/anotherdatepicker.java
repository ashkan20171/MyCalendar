package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class anotherdatepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.anotherdatepicker");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.example.anotherdatepicker",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmonth = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblyear = null;
public anywheresoftware.b4a.objects.PanelWrapper _holder = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvsbackground = null;
public anywheresoftware.b4a.objects.PanelWrapper _base = null;
public anywheresoftware.b4a.objects.PanelWrapper _toppanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _dayspanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlbuttons = null;
public int _month = 0;
public int _year = 0;
public anywheresoftware.b4a.objects.SpinnerWrapper _months = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _years = null;
public float _boxw = 0f;
public float _boxh = 0f;
public float _vcorrection = 0f;
public int _action_up = 0;
public int _action_move = 0;
public int _action_down = 0;
public int _tempselectedday = 0;
public anywheresoftware.b4a.objects.PanelWrapper _dayspanelbackground = null;
public int _dayofweekoffset = 0;
public int _daysinmonth = 0;
public int _tempselectedcolor = 0;
public int _selectedcolor = 0;
public int _toppanelcolor = 0;
public int _basepanelcolor = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lblselectedday = null;
public long _selecteddate = 0L;
public anywheresoftware.b4a.objects.LabelWrapper _targetlabel = null;
public int _selectedyear = 0;
public int _selectedmonth = 0;
public int _selectedday = 0;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.LabelWrapper[] _daysnames = null;
public b4a.example.main _main = null;
public b4a.example.dateutils _dateutils = null;
public String  _addtoactivity(anywheresoftware.b4a.objects.ActivityWrapper _act,anywheresoftware.b4a.objects.LabelWrapper _lbl) throws Exception{
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd = null;
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
int _y = 0;
String _m = "";
int _i = 0;
String _d = "";
 //BA.debugLineNum = 43;BA.debugLine="Public Sub AddToActivity(ACT As Activity, Lbl As Label) 'change Lbl to a EditText type if you want the date to target an EditText. Also see Private targetLabel above";
 //BA.debugLineNum = 45;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 46;BA.debugLine="gd.Initialize(\"LEFT_RIGHT\", Array As Int(Colors.White, Colors.Gray, Colors.White))";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"LEFT_RIGHT"),new int[]{__c.Colors.White,__c.Colors.Gray,__c.Colors.White});
 //BA.debugLineNum = 49;BA.debugLine="holder.Initialize(\"holder\")";
_holder.Initialize(ba,"holder");
 //BA.debugLineNum = 50;BA.debugLine="holder.Visible = False";
_holder.setVisible(__c.False);
 //BA.debugLineNum = 51;BA.debugLine="holder.Color = Colors.ARGB(255, 0, 0, 0)";
_holder.setColor(__c.Colors.ARGB((int) (255),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 52;BA.debugLine="ACT.AddView(holder, 0, 0, 100%x, 100%y)";
_act.AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 53;BA.debugLine="holder.LoadLayout(\"DatePicker\")";
_holder.LoadLayout("DatePicker",ba);
 //BA.debugLineNum = 54;BA.debugLine="topPanel.Color = topPanelColor";
_toppanel.setColor(_toppanelcolor);
 //BA.debugLineNum = 55;BA.debugLine="Base.Color = BasePanelColor";
_base.setColor(_basepanelcolor);
 //BA.debugLineNum = 56;BA.debugLine="pnlButtons.Background = gd 'Apply gradient effect";
_pnlbuttons.setBackground((android.graphics.drawable.Drawable)(_gd.getObject()));
 //BA.debugLineNum = 57;BA.debugLine="daysNames = Array As Label(Label1, Label2, Label3, Label4, Label5, Label6, Label7)";
_daysnames = new anywheresoftware.b4a.objects.LabelWrapper[]{_label1,_label2,_label3,_label4,_label5,_label6,_label7};
 //BA.debugLineNum = 58;BA.debugLine="Dim et As EditText";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 59;BA.debugLine="et.Initialize(\"\")";
_et.Initialize(ba,"");
 //BA.debugLineNum = 60;BA.debugLine="Lbl.BACKGROUND = et.BACKGROUND";
_lbl.setBackground(_et.getBackground());
 //BA.debugLineNum = 61;BA.debugLine="cvs.Initialize(DaysPanel)";
_cvs.Initialize((android.view.View)(_dayspanel.getObject()));
 //BA.debugLineNum = 62;BA.debugLine="cvsBackground.Initialize(DaysPanelBackground)";
_cvsbackground.Initialize((android.view.View)(_dayspanelbackground.getObject()));
 //BA.debugLineNum = 63;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
_month = __c.DateTime.GetMonth(__c.DateTime.getNow());
 //BA.debugLineNum = 64;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
_year = __c.DateTime.GetYear(__c.DateTime.getNow());
 //BA.debugLineNum = 65;BA.debugLine="For y = 1900 To 2100";
{
final int step54 = 1;
final int limit54 = (int) (2100);
for (_y = (int) (1900); (step54 > 0 && _y <= limit54) || (step54 < 0 && _y >= limit54); _y = ((int)(0 + _y + step54))) {
 //BA.debugLineNum = 66;BA.debugLine="Years.Add(y)";
_years.Add(BA.NumberToString(_y));
 }
};
 //BA.debugLineNum = 68;BA.debugLine="For Each m As String In DateUtils.GetMonthsNames";
final anywheresoftware.b4a.BA.IterableList group57 = _dateutils._getmonthsnames(ba);
final int groupLen57 = group57.getSize();
for (int index57 = 0;index57 < groupLen57 ;index57++){
_m = BA.ObjectToString(group57.Get(index57));
 //BA.debugLineNum = 69;BA.debugLine="Months.Add(m)";
_months.Add(_m);
 }
;
 //BA.debugLineNum = 71;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 72;BA.debugLine="For Each d As String In DateUtils.GetDaysNames";
final anywheresoftware.b4a.BA.IterableList group61 = _dateutils._getdaysnames(ba);
final int groupLen61 = group61.getSize();
for (int index61 = 0;index61 < groupLen61 ;index61++){
_d = BA.ObjectToString(group61.Get(index61));
 //BA.debugLineNum = 73;BA.debugLine="daysNames(i).Text = d.SubString2(0, 2)";
_daysnames[_i].setText((Object)(_d.substring((int) (0),(int) (2))));
 //BA.debugLineNum = 74;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
 //BA.debugLineNum = 76;BA.debugLine="SetDate(DateTime.Now, False)";
_setdate(__c.DateTime.getNow(),__c.False);
 //BA.debugLineNum = 77;BA.debugLine="vCorrection = cvs.MeasureStringHeight(\"1\", Typeface.DEFAULT_BOLD, Label1.TextSize) / 2";
_vcorrection = (float) (_cvs.MeasureStringHeight("1",__c.Typeface.DEFAULT_BOLD,_label1.getTextSize())/(double)2);
 //BA.debugLineNum = 78;BA.debugLine="boxW = cvs.Bitmap.Width / 7";
_boxw = (float) (_cvs.getBitmap().getWidth()/(double)7);
 //BA.debugLineNum = 79;BA.debugLine="boxH = cvs.Bitmap.Height / 6";
_boxh = (float) (_cvs.getBitmap().getHeight()/(double)6);
 //BA.debugLineNum = 80;BA.debugLine="lblSelectedDay.Visible = False";
_lblselectedday.setVisible(__c.False);
 //BA.debugLineNum = 81;BA.debugLine="DrawDays";
_drawdays();
 //BA.debugLineNum = 82;BA.debugLine="targetLabel = Lbl";
_targetlabel = _lbl;
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _btncancel_click() throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Private Sub btnCancel_Click";
 //BA.debugLineNum = 172;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _btntoday_click() throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Private Sub btnToday_Click";
 //BA.debugLineNum = 167;BA.debugLine="SetDate(DateTime.Now, True)";
_setdate(__c.DateTime.getNow(),__c.True);
 //BA.debugLineNum = 168;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private lblMonth As Label";
_lblmonth = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private lblYear As Label";
_lblyear = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private cvs, cvsBackground As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsbackground = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private Base, topPanel, DaysPanel, pnlButtons As Panel";
_base = new anywheresoftware.b4a.objects.PanelWrapper();
_toppanel = new anywheresoftware.b4a.objects.PanelWrapper();
_dayspanel = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlbuttons = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private month, year As Int";
_month = 0;
_year = 0;
 //BA.debugLineNum = 10;BA.debugLine="Private Months As Spinner";
_months = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private Years As Spinner";
_years = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private boxW, boxH As Float";
_boxw = 0f;
_boxh = 0f;
 //BA.debugLineNum = 13;BA.debugLine="Private vCorrection As Float";
_vcorrection = 0f;
 //BA.debugLineNum = 14;BA.debugLine="Private ACTION_UP = 1, ACTION_MOVE = 2, ACTION_DOWN = 0 As Int";
_action_up = (int) (1);
_action_move = (int) (2);
_action_down = (int) (0);
 //BA.debugLineNum = 15;BA.debugLine="Private tempSelectedDay As Int";
_tempselectedday = 0;
 //BA.debugLineNum = 16;BA.debugLine="Private DaysPanelBackground As Panel";
_dayspanelbackground = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private dayOfWeekOffset As Int";
_dayofweekoffset = 0;
 //BA.debugLineNum = 18;BA.debugLine="Private daysInMonth As Int";
_daysinmonth = 0;
 //BA.debugLineNum = 19;BA.debugLine="Private tempSelectedColor As Int = Colors.Cyan";
_tempselectedcolor = __c.Colors.Cyan;
 //BA.debugLineNum = 20;BA.debugLine="Private selectedColor As Int = Colors.RGB(51, 181, 229)";
_selectedcolor = __c.Colors.RGB((int) (51),(int) (181),(int) (229));
 //BA.debugLineNum = 21;BA.debugLine="Private topPanelColor As Int = Colors.RGB(51, 181, 229)";
_toppanelcolor = __c.Colors.RGB((int) (51),(int) (181),(int) (229));
 //BA.debugLineNum = 22;BA.debugLine="Private BasePanelColor As Int = Colors.RGB(248, 248, 255)";
_basepanelcolor = __c.Colors.RGB((int) (248),(int) (248),(int) (255));
 //BA.debugLineNum = 23;BA.debugLine="Private lblSelectedDay As Label";
_lblselectedday = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private selectedDate As Long";
_selecteddate = 0L;
 //BA.debugLineNum = 25;BA.debugLine="Private targetLabel As Label 'change to EditText if you want the date to target an EditText. Also see sub > AddToActivity";
_targetlabel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private selectedYear, selectedMonth, selectedDay As Int";
_selectedyear = 0;
_selectedmonth = 0;
_selectedday = 0;
 //BA.debugLineNum = 27;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Label5 As Label";
_label5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Label6 As Label";
_label6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private Label7 As Label";
_label7 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private daysNames() As Label";
_daysnames = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _daysnames.length;
for (int i0 = 0;i0 < d0;i0++) {
_daysnames[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _dayspanel_touch(int _action,float _x,float _y) throws Exception{
int _boxx = 0;
int _boxy = 0;
int _newselectedday = 0;
boolean _validday = false;
 //BA.debugLineNum = 135;BA.debugLine="Private Sub DaysPanel_Touch (ACTION As Int, X As Float, Y As Float)";
 //BA.debugLineNum = 136;BA.debugLine="Dim boxX = X / boxW, boxY = Y / boxH As Int";
_boxx = (int) (_x/(double)_boxw);
_boxy = (int) (_y/(double)_boxh);
 //BA.debugLineNum = 137;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 - dayOfWeekOffset";
_newselectedday = (int) (_boxy*7+_boxx+1-_dayofweekoffset);
 //BA.debugLineNum = 138;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 AND newSelectedDay <= daysInMonth";
_validday = _newselectedday>0 && _newselectedday<=_daysinmonth;
 //BA.debugLineNum = 139;BA.debugLine="If ACTION = ACTION_DOWN OR ACTION = ACTION_MOVE Then";
if (_action==_action_down || _action==_action_move) { 
 //BA.debugLineNum = 140;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==_tempselectedday) { 
if (true) return "";};
 //BA.debugLineNum = 141;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent) 'clear background";
_cvsbackground.DrawColor(__c.Colors.Transparent);
 //BA.debugLineNum = 142;BA.debugLine="tempSelectedDay = newSelectedDay";
_tempselectedday = _newselectedday;
 //BA.debugLineNum = 143;BA.debugLine="If validDay Then";
if (_validday) { 
 //BA.debugLineNum = 144;BA.debugLine="DrawBox(cvsBackground, tempSelectedColor, boxX, boxY)";
_drawbox(_cvsbackground,_tempselectedcolor,_boxx,_boxy);
 //BA.debugLineNum = 145;BA.debugLine="lblSelectedDay.Text = newSelectedDay";
_lblselectedday.setText((Object)(_newselectedday));
 //BA.debugLineNum = 146;BA.debugLine="lblSelectedDay.Visible = True";
_lblselectedday.setVisible(__c.True);
 }else {
 //BA.debugLineNum = 148;BA.debugLine="lblSelectedDay.Visible = False";
_lblselectedday.setVisible(__c.False);
 };
 }else if(_action==_action_up) { 
 //BA.debugLineNum = 151;BA.debugLine="lblSelectedDay.Visible = False";
_lblselectedday.setVisible(__c.False);
 //BA.debugLineNum = 152;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
_cvsbackground.DrawColor(__c.Colors.Transparent);
 //BA.debugLineNum = 153;BA.debugLine="If validDay Then";
if (_validday) { 
 //BA.debugLineNum = 154;BA.debugLine="SelectDay(newSelectedDay, True)";
_selectday(_newselectedday,__c.True);
 //BA.debugLineNum = 155;BA.debugLine="Hide";
_hide();
 };
 };
 //BA.debugLineNum = 158;BA.debugLine="DaysPanelBackground.Invalidate";
_dayspanelbackground.Invalidate();
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public String  _drawbox(anywheresoftware.b4a.objects.drawable.CanvasWrapper _c,int _clr,int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _r = null;
 //BA.debugLineNum = 129;BA.debugLine="Private Sub DrawBox(c As Canvas, clr As Int, x As Int, y As Int)";
 //BA.debugLineNum = 130;BA.debugLine="Dim r As Rect";
_r = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
 //BA.debugLineNum = 131;BA.debugLine="r.Initialize(x * boxW, y * boxH, (x + 1) * boxW, (y + 1) * boxH)";
_r.Initialize((int) (_x*_boxw),(int) (_y*_boxh),(int) ((_x+1)*_boxw),(int) ((_y+1)*_boxh));
 //BA.debugLineNum = 132;BA.debugLine="c.DrawRect(r, clr, True, 0)";
_c.DrawRect((android.graphics.Rect)(_r.getObject()),_clr,__c.True,(float) (0));
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _drawdays() throws Exception{
long _firstday = 0L;
int _day = 0;
int _row = 0;
 //BA.debugLineNum = 98;BA.debugLine="Private Sub DrawDays";
 //BA.debugLineNum = 99;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
_cvsbackground.DrawColor(__c.Colors.Transparent);
 //BA.debugLineNum = 100;BA.debugLine="cvs.DrawColor(Colors.Transparent)";
_cvs.DrawColor(__c.Colors.Transparent);
 //BA.debugLineNum = 101;BA.debugLine="Dim firstDay As Long = DateUtils.SetDate(year, month, 1) - 1";
_firstday = (long) (_dateutils._setdate(ba,_year,_month,(int) (1))-1);
 //BA.debugLineNum = 102;BA.debugLine="dayOfWeekOffset = DateTime.GetDayOfWeek(firstDay) Mod 7";
_dayofweekoffset = (int) (__c.DateTime.GetDayOfWeek(_firstday)%7);
 //BA.debugLineNum = 103;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month, year)";
_daysinmonth = _dateutils._numberofdaysinmonth(ba,_month,_year);
 //BA.debugLineNum = 104;BA.debugLine="If year = selectedYear AND month = selectedMonth Then";
if (_year==_selectedyear && _month==_selectedmonth) { 
 //BA.debugLineNum = 106;BA.debugLine="DrawBox(cvs, selectedColor, (selectedDay - 1 + dayOfWeekOffset) Mod 7, _ 			(selectedDay - 1 + dayOfWeekOffset) / 7)";
_drawbox(_cvs,_selectedcolor,(int) ((_selectedday-1+_dayofweekoffset)%7),(int) ((_selectedday-1+_dayofweekoffset)/(double)7));
 };
 //BA.debugLineNum = 109;BA.debugLine="For day = 1 To daysInMonth";
{
final int step92 = 1;
final int limit92 = _daysinmonth;
for (_day = (int) (1); (step92 > 0 && _day <= limit92) || (step92 < 0 && _day >= limit92); _day = ((int)(0 + _day + step92))) {
 //BA.debugLineNum = 110;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+_dayofweekoffset)/(double)7);
 //BA.debugLineNum = 111;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1) Mod 7) + 0.5) * boxW, _ 			(row + 0.5)* boxH + vCorrection, Typeface.DEFAULT_BOLD, Label1.TextSize, Colors.Black, \"CENTER\")";
_cvs.DrawText(ba,BA.NumberToString(_day),(float) ((((_dayofweekoffset+_day-1)%7)+0.5)*_boxw),(float) ((_row+0.5)*_boxh+_vcorrection),__c.Typeface.DEFAULT_BOLD,_label1.getTextSize(),__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
 //BA.debugLineNum = 114;BA.debugLine="DaysPanel.Invalidate";
_dayspanel.Invalidate();
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public long  _getdate() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub GetDate As Long";
 //BA.debugLineNum = 86;BA.debugLine="Return selectedDate";
if (true) return _selecteddate;
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return 0L;
}
public String  _hide() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Public Sub Hide";
 //BA.debugLineNum = 126;BA.debugLine="holder.Visible = False";
_holder.setVisible(__c.False);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _holder_click() throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Private Sub holder_Click";
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 38;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public boolean  _isvisible() throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Public Sub IsVisible As Boolean";
 //BA.debugLineNum = 185;BA.debugLine="Return holder.Visible";
if (true) return _holder.getVisible();
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return false;
}
public String  _months_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Private Sub Months_ItemClick (Position As Int, Value As Object)";
 //BA.debugLineNum = 176;BA.debugLine="month = Position + 1";
_month = (int) (_position+1);
 //BA.debugLineNum = 177;BA.debugLine="DrawDays";
_drawdays();
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _selectday(int _day,boolean _updatelabel) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Private Sub SelectDay(day As Int, UpdateLabel As Boolean)";
 //BA.debugLineNum = 118;BA.debugLine="selectedDate = DateUtils.SetDate(year, month, day)";
_selecteddate = _dateutils._setdate(ba,_year,_month,_day);
 //BA.debugLineNum = 119;BA.debugLine="selectedDay = day";
_selectedday = _day;
 //BA.debugLineNum = 120;BA.debugLine="selectedMonth = month";
_selectedmonth = _month;
 //BA.debugLineNum = 121;BA.debugLine="selectedYear = year";
_selectedyear = _year;
 //BA.debugLineNum = 122;BA.debugLine="If UpdateLabel Then targetLabel.Text = DateTime.Date(selectedDate)";
if (_updatelabel) { 
_targetlabel.setText((Object)(__c.DateTime.Date(_selecteddate)));};
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public String  _setdate(long _date,boolean _updatelabel) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub SetDate(date As Long, UpdateLabel As Boolean)";
 //BA.debugLineNum = 91;BA.debugLine="year = DateTime.GetYear(date)";
_year = __c.DateTime.GetYear(_date);
 //BA.debugLineNum = 92;BA.debugLine="month = DateTime.GetMonth(date)";
_month = __c.DateTime.GetMonth(_date);
 //BA.debugLineNum = 93;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date), UpdateLabel)";
_selectday(__c.DateTime.GetDayOfMonth(_date),_updatelabel);
 //BA.debugLineNum = 94;BA.debugLine="Years.SelectedIndex = year - 1900";
_years.setSelectedIndex((int) (_year-1900));
 //BA.debugLineNum = 95;BA.debugLine="Months.SelectedIndex = month - 1";
_months.setSelectedIndex((int) (_month-1));
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 162;BA.debugLine="holder.Visible = True";
_holder.setVisible(__c.True);
 //BA.debugLineNum = 163;BA.debugLine="DrawDays";
_drawdays();
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public String  _years_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Private Sub Years_ItemClick (Position As Int, Value As Object)";
 //BA.debugLineNum = 181;BA.debugLine="year = Value";
_year = (int)(BA.ObjectToNumber(_value));
 //BA.debugLineNum = 182;BA.debugLine="DrawDays";
_drawdays();
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
