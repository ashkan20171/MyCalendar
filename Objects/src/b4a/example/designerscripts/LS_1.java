package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_1{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll 'uncomment to scale all views based on the device physical size."[1/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="Label1.HorizontalCenter = 50%x"[1/General script]
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
//BA.debugLineNum = 4;BA.debugLine="btnPicker.HorizontalCenter = 50%x"[1/General script]
views.get("btnpicker").vw.setLeft((int)((50d / 100 * width) - (views.get("btnpicker").vw.getWidth() / 2)));

}
}