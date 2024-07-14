package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private Button1 As Button";
b4xmainpage._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button1",b4xmainpage._button1);
 //BA.debugLineNum = 12;BA.debugLine="Private Button2 As Button";
b4xmainpage._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button2",b4xmainpage._button2);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cmdclasificaciones_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdClasificaciones_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("cmdclasificaciones_click")) { return __ref.runUserSub(false, "b4xmainpage","cmdclasificaciones_click", __ref);}
RemoteObject _pageclasificacion = RemoteObject.declareNull("b4a.example.b4xclasificaciones");
 BA.debugLineNum = 31;BA.debugLine="Private Sub cmdClasificaciones_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Dim PageClasificacion As B4XClasificaciones";
Debug.ShouldStop(-2147483648);
_pageclasificacion = RemoteObject.createNew ("b4a.example.b4xclasificaciones");Debug.locals.put("PageClasificacion", _pageclasificacion);
 BA.debugLineNum = 33;BA.debugLine="PageClasificacion.Initialize";
Debug.ShouldStop(1);
_pageclasificacion.runClassMethod (b4a.example.b4xclasificaciones.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 35;BA.debugLine="B4XPages.AddPageAndCreate(\"PageClasificacion\", Pa";
Debug.ShouldStop(4);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("PageClasificacion")),(Object)((_pageclasificacion)));
 BA.debugLineNum = 37;BA.debugLine="B4XPages.ShowPage(\"PageClasificacion\")";
Debug.ShouldStop(16);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("PageClasificacion")));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmdproductos_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdProductos_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("cmdproductos_click")) { return __ref.runUserSub(false, "b4xmainpage","cmdproductos_click", __ref);}
RemoteObject _pageproductos = RemoteObject.declareNull("b4a.example.b4xproductos");
 BA.debugLineNum = 40;BA.debugLine="Private Sub cmdProductos_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Dim PageProductos As B4XProductos";
Debug.ShouldStop(256);
_pageproductos = RemoteObject.createNew ("b4a.example.b4xproductos");Debug.locals.put("PageProductos", _pageproductos);
 BA.debugLineNum = 42;BA.debugLine="PageProductos.Initialize";
Debug.ShouldStop(512);
_pageproductos.runClassMethod (b4a.example.b4xproductos.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 44;BA.debugLine="B4XPages.AddPageAndCreate(\"PageProductos\", PagePr";
Debug.ShouldStop(2048);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("PageProductos")),(Object)((_pageproductos)));
 BA.debugLineNum = 46;BA.debugLine="B4XPages.ShowPage(\"PageProductos\")";
Debug.ShouldStop(8192);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("PageProductos")));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}