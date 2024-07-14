package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xclasificaciones_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xclasificaciones) ","b4xclasificaciones",8,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xclasificaciones","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Root = Root1";
Debug.ShouldStop(32768);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 18;BA.debugLine="Root.LoadLayout(\"PageClasificacion\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("PageClasificacion")),__ref.getField(false, "ba"));
 BA.debugLineNum = 19;BA.debugLine="apiClas.Initialize(\"https://cloudcomputingapi2.az";
Debug.ShouldStop(262144);
__ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.clasificaciones.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://cloudcomputingapi2.azurewebsites.net/api/Clasificaciones")));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xclasificaciones._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xclasificaciones._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xclasificaciones._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xclasificaciones._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtId As EditText";
b4xclasificaciones._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",b4xclasificaciones._txtid);
 //BA.debugLineNum = 5;BA.debugLine="Private txtDescripcion As EditText";
b4xclasificaciones._txtdescripcion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtdescripcion",b4xclasificaciones._txtdescripcion);
 //BA.debugLineNum = 6;BA.debugLine="Private apiClas As Clasificaciones";
b4xclasificaciones._apiclas = RemoteObject.createNew ("b4a.example.clasificaciones");__ref.setField("_apiclas",b4xclasificaciones._apiclas);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _cmdactualizar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdActualizar_Click (b4xclasificaciones) ","b4xclasificaciones",8,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("cmdactualizar_click")) { __ref.runUserSub(false, "b4xclasificaciones","cmdactualizar_click", __ref); return;}
ResumableSub_cmdActualizar_Click rsub = new ResumableSub_cmdActualizar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdActualizar_Click extends BA.ResumableSub {
public ResumableSub_cmdActualizar_Click(b4a.example.b4xclasificaciones parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xclasificaciones parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdActualizar_Click (b4xclasificaciones) ","b4xclasificaciones",8,__ref.getField(false, "ba"),__ref,45);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 46;BA.debugLine="Wait For (apiClas.Update(txtId.Text, txtDescripci";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xclasificaciones", "cmdactualizar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.clasificaciones.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtdescripcion" /*RemoteObject*/ ).runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 47;BA.debugLine="If r = True Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_r,parent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 48;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
Debug.ShouldStop(32768);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 50;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(131072);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _r) throws Exception{
}
public static void  _cmdbuscar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdBuscar_Click (b4xclasificaciones) ","b4xclasificaciones",8,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("cmdbuscar_click")) { __ref.runUserSub(false, "b4xclasificaciones","cmdbuscar_click", __ref); return;}
ResumableSub_cmdBuscar_Click rsub = new ResumableSub_cmdBuscar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdBuscar_Click extends BA.ResumableSub {
public ResumableSub_cmdBuscar_Click(b4a.example.b4xclasificaciones parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xclasificaciones parent;
RemoteObject _r = RemoteObject.declareNull("b4a.example.clasificacion");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdBuscar_Click (b4xclasificaciones) ","b4xclasificaciones",8,__ref.getField(false, "ba"),__ref,24);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 25;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xclasificaciones", "cmdbuscar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.clasificaciones.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 26;BA.debugLine="If r.Id > 0 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_r.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 27;BA.debugLine="txtId.Text=r.Id";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 28;BA.debugLine="txtDescripcion.Text = r.Descripcion";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtdescripcion" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_descripcion" /*RemoteObject*/ )));
 BA.debugLineNum = 29;BA.debugLine="Msgbox(\"Registro Encontrado con éxito\", \"OK\")";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Encontrado con éxito")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 31;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _cmdcrear_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdCrear_Click (b4xclasificaciones) ","b4xclasificaciones",8,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("cmdcrear_click")) { __ref.runUserSub(false, "b4xclasificaciones","cmdcrear_click", __ref); return;}
ResumableSub_cmdCrear_Click rsub = new ResumableSub_cmdCrear_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdCrear_Click extends BA.ResumableSub {
public ResumableSub_cmdCrear_Click(b4a.example.b4xclasificaciones parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xclasificaciones parent;
RemoteObject _c = RemoteObject.declareNull("b4a.example.clasificacion");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdCrear_Click (b4xclasificaciones) ","b4xclasificaciones",8,__ref.getField(false, "ba"),__ref,35);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 36;BA.debugLine="Wait For (apiClas.Create(0,txtDescripcion.Text))";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xclasificaciones", "cmdcrear_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.clasificaciones.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_txtdescripcion" /*RemoteObject*/ ).runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("c", _c);
;
 BA.debugLineNum = 37;BA.debugLine="If c.Id> 0 Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_c.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 38;BA.debugLine="txtId.Text = c.Id";
Debug.ShouldStop(32);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_c.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 39;BA.debugLine="Msgbox(\"Registro Creado\", \"OK\")";
Debug.ShouldStop(64);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Creado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 41;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"OK\")";
Debug.ShouldStop(256);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo crear el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _cmdeliminar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdEliminar_Click (b4xclasificaciones) ","b4xclasificaciones",8,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("cmdeliminar_click")) { __ref.runUserSub(false, "b4xclasificaciones","cmdeliminar_click", __ref); return;}
ResumableSub_cmdEliminar_Click rsub = new ResumableSub_cmdEliminar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdEliminar_Click extends BA.ResumableSub {
public ResumableSub_cmdEliminar_Click(b4a.example.b4xclasificaciones parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xclasificaciones parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdEliminar_Click (b4xclasificaciones) ","b4xclasificaciones",8,__ref.getField(false, "ba"),__ref,54);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 55;BA.debugLine="Wait For (apiClas.Delete(txtId.Text)) Complete (r";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xclasificaciones", "cmdeliminar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.clasificaciones.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 56;BA.debugLine="If r = True Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_r,parent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 57;BA.debugLine="Msgbox(\"Registro Eliminado\", \"OK\")";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Eliminado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 58;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 59;BA.debugLine="txtDescripcion.Text = \"\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtdescripcion" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 61;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _cmdmenu_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdMenu_Click (b4xclasificaciones) ","b4xclasificaciones",8,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("cmdmenu_click")) { return __ref.runUserSub(false, "b4xclasificaciones","cmdmenu_click", __ref);}
 BA.debugLineNum = 65;BA.debugLine="Private Sub cmdMenu_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
Debug.ShouldStop(2);
b4xclasificaciones._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPage")));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Initialize (b4xclasificaciones) ","b4xclasificaciones",8,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xclasificaciones","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Return Me";
Debug.ShouldStop(1024);
if (true) return __ref;
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}