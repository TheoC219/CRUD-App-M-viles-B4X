package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Hello world!"),BA.ObjectToCharSequence("B4X"));
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="End Sub";
return "";
}
public String  _cmdclasificaciones_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cmdclasificaciones_click", false))
	 {return ((String) Debug.delegate(ba, "cmdclasificaciones_click", null));}
b4a.example.b4xclasificaciones _pageclasificacion = null;
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Private Sub cmdClasificaciones_Click";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="Dim PageClasificacion As B4XClasificaciones";
_pageclasificacion = new b4a.example.b4xclasificaciones();
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="PageClasificacion.Initialize";
_pageclasificacion._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="B4XPages.AddPageAndCreate(\"PageClasificacion\", Pa";
_b4xpages._addpageandcreate /*String*/ (ba,"PageClasificacion",(Object)(_pageclasificacion));
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="B4XPages.ShowPage(\"PageClasificacion\")";
_b4xpages._showpage /*String*/ (ba,"PageClasificacion");
RDebugUtils.currentLine=17432583;
 //BA.debugLineNum = 17432583;BA.debugLine="End Sub";
return "";
}
public String  _cmdproductos_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cmdproductos_click", false))
	 {return ((String) Debug.delegate(ba, "cmdproductos_click", null));}
b4a.example.b4xproductos _pageproductos = null;
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub cmdProductos_Click";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Dim PageProductos As B4XProductos";
_pageproductos = new b4a.example.b4xproductos();
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="PageProductos.Initialize";
_pageproductos._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="B4XPages.AddPageAndCreate(\"PageProductos\", PagePr";
_b4xpages._addpageandcreate /*String*/ (ba,"PageProductos",(Object)(_pageproductos));
RDebugUtils.currentLine=18022406;
 //BA.debugLineNum = 18022406;BA.debugLine="B4XPages.ShowPage(\"PageProductos\")";
_b4xpages._showpage /*String*/ (ba,"PageProductos");
RDebugUtils.currentLine=18022407;
 //BA.debugLineNum = 18022407;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
}