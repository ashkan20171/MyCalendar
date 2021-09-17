Type=Class
Version=4
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'AnotherDatePicker - v1.00
'Class module
Sub Class_Globals
	Private lblMonth As Label
	Private lblYear As Label
	Private holder As Panel
	Private cvs, cvsBackground As Canvas
	Private Base, topPanel, DaysPanel, pnlButtons As Panel
	Private month, year As Int
	Private Months As Spinner
	Private Years As Spinner
	Private boxW, boxH As Float
	Private vCorrection As Float
	Private ACTION_UP = 1, ACTION_MOVE = 2, ACTION_DOWN = 0 As Int
	Private tempSelectedDay As Int
	Private DaysPanelBackground As Panel
	Private dayOfWeekOffset As Int
	Private daysInMonth As Int
	Private tempSelectedColor As Int = Colors.Cyan
	Private selectedColor As Int = Colors.RGB(51, 181, 229)
	Private topPanelColor As Int = Colors.RGB(51, 181, 229)
	Private BasePanelColor As Int = Colors.RGB(248, 248, 255)
	Private lblSelectedDay As Label
	Private selectedDate As Long
	Private targetLabel As Label 'change to EditText if you want the date to target an EditText. Also see sub > AddToActivity
	Private selectedYear, selectedMonth, selectedDay As Int
	Private Label1 As Label
	Private Label2 As Label
	Private Label3 As Label
	Private Label4 As Label
	Private Label5 As Label
	Private Label6 As Label
	Private Label7 As Label
	Private daysNames() As Label
End Sub

'Initializes the picker
Public Sub Initialize

End Sub
'Adds the picker to its parent. ACT can be either an activity or a panel.
'Lbl is an existing label.
Public Sub AddToActivity(ACT As Activity, Lbl As Label) 'change Lbl to a EditText type if you want the date to target an EditText. Also see Private targetLabel above
	'a gradient effect for the buttons at bottom of datepicker-----------------------
	Dim gd As GradientDrawable
	gd.Initialize("LEFT_RIGHT", Array As Int(Colors.White, Colors.Gray, Colors.White))
	'---------------------------------------------------------------------------------
	
	holder.Initialize("holder")
	holder.Visible = False
	holder.Color = Colors.ARGB(255, 0, 0, 0)
	ACT.AddView(holder, 0, 0, 100%x, 100%y)
	holder.LoadLayout("DatePicker")
	topPanel.Color = topPanelColor
	Base.Color = BasePanelColor
	pnlButtons.Background = gd 'Apply gradient effect
	daysNames = Array As Label(Label1, Label2, Label3, Label4, Label5, Label6, Label7)
	Dim et As EditText
	et.Initialize("")
	Lbl.BACKGROUND = et.BACKGROUND
	cvs.Initialize(DaysPanel)
	cvsBackground.Initialize(DaysPanelBackground)
	month = DateTime.GetMonth(DateTime.Now)
	year = DateTime.GetYear(DateTime.Now)
	For y = 1900 To 2100
		Years.Add(y)
	Next
	For Each m As String In DateUtils.GetMonthsNames
		Months.Add(m)
	Next
	Dim i As Int
	For Each d As String In DateUtils.GetDaysNames
		daysNames(i).Text = d.SubString2(0, 2)
		i = i + 1
	Next
	SetDate(DateTime.Now, False)
	vCorrection = cvs.MeasureStringHeight("1", Typeface.DEFAULT_BOLD, Label1.TextSize) / 2
	boxW = cvs.Bitmap.Width / 7
	boxH = cvs.Bitmap.Height / 6
	lblSelectedDay.Visible = False
	DrawDays
	targetLabel = Lbl
End Sub
'Returns the selected date.
Public Sub GetDate As Long
	Return selectedDate
End Sub
'Sets the selected date.
'UpdateLabel - Whether to update the label text.
Public Sub SetDate(date As Long, UpdateLabel As Boolean)
	year = DateTime.GetYear(date)
	month = DateTime.GetMonth(date)
	SelectDay(DateTime.GetDayOfMonth(date), UpdateLabel)
	Years.SelectedIndex = year - 1900
	Months.SelectedIndex = month - 1
End Sub

Private Sub DrawDays
	cvsBackground.DrawColor(Colors.Transparent)
	cvs.DrawColor(Colors.Transparent)
	Dim firstDay As Long = DateUtils.SetDate(year, month, 1) - 1
	dayOfWeekOffset = DateTime.GetDayOfWeek(firstDay) Mod 7
	daysInMonth = DateUtils.NumberOfDaysInMonth(month, year)
	If year = selectedYear AND month = selectedMonth Then
		'draw the selected box
		DrawBox(cvs, selectedColor, (selectedDay - 1 + dayOfWeekOffset) Mod 7, _
			(selectedDay - 1 + dayOfWeekOffset) / 7)
	End If
	For day = 1 To daysInMonth
		Dim row As Int = (day - 1 + dayOfWeekOffset) / 7
		cvs.DrawText(day, (((dayOfWeekOffset + day - 1) Mod 7) + 0.5) * boxW, _
			(row + 0.5)* boxH + vCorrection, Typeface.DEFAULT_BOLD, Label1.TextSize, Colors.Black, "CENTER")
	Next
	DaysPanel.Invalidate
End Sub

Private Sub SelectDay(day As Int, UpdateLabel As Boolean)
	selectedDate = DateUtils.SetDate(year, month, day)
	selectedDay = day
	selectedMonth = month
	selectedYear = year
	If UpdateLabel Then targetLabel.Text = DateTime.Date(selectedDate)
End Sub
'Hides the picker.
Public Sub Hide
	holder.Visible = False
End Sub

Private Sub DrawBox(c As Canvas, clr As Int, x As Int, y As Int)
	Dim r As Rect
	r.Initialize(x * boxW, y * boxH, (x + 1) * boxW, (y + 1) * boxH)
	c.DrawRect(r, clr, True, 0)
End Sub

Private Sub DaysPanel_Touch (ACTION As Int, X As Float, Y As Float)
	Dim boxX = X / boxW, boxY = Y / boxH As Int
	Dim newSelectedDay As Int = boxY * 7 + boxX + 1 - dayOfWeekOffset
	Dim validDay As Boolean = newSelectedDay > 0 AND newSelectedDay <= daysInMonth
	If ACTION = ACTION_DOWN OR ACTION = ACTION_MOVE Then
		If newSelectedDay = tempSelectedDay Then Return
		cvsBackground.DrawColor(Colors.Transparent) 'clear background
		tempSelectedDay = newSelectedDay
		If validDay Then
			DrawBox(cvsBackground, tempSelectedColor, boxX, boxY)
			lblSelectedDay.Text = newSelectedDay
			lblSelectedDay.Visible = True
		Else
			lblSelectedDay.Visible = False
		End If
	Else If ACTION = ACTION_UP Then
		lblSelectedDay.Visible = False
		cvsBackground.DrawColor(Colors.Transparent)
		If validDay Then
			SelectDay(newSelectedDay, True)
			Hide
		End If
	End If
	DaysPanelBackground.Invalidate
End Sub
'Shows the picker.
Public Sub Show
	holder.Visible = True
	DrawDays
End Sub

Private Sub btnToday_Click
	SetDate(DateTime.Now, True)
	Hide
End Sub

Private Sub btnCancel_Click
	Hide
End Sub

Private Sub Months_ItemClick (Position As Int, Value As Object)
	month = Position + 1
	DrawDays
End Sub

Private Sub Years_ItemClick (Position As Int, Value As Object)
	year = Value
	DrawDays
End Sub
Public Sub IsVisible As Boolean
	Return holder.Visible
End Sub
Private Sub holder_Click
	'Uncomment the line below to allow hiding of the datepicker when the background is tapped
	'Hide
End Sub