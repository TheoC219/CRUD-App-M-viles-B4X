package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xproductos_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xproductos) ","b4xproductos",7,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xproductos","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"PageProductos\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("PageProductos")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="apiClas.Initialize(\"https://cloudcomputingapi2.az";
Debug.ShouldStop(4194304);
__ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.productos.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://cloudcomputingapi2.azurewebsites.net/api/Productos")));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
b4xproductos._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xproductos._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xproductos._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xproductos._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtId As EditText";
b4xproductos._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",b4xproductos._txtid);
 //BA.debugLineNum = 5;BA.debugLine="Private txtNombre As EditText";
b4xproductos._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",b4xproductos._txtnombre);
 //BA.debugLineNum = 6;BA.debugLine="Private txtExistencia As EditText";
b4xproductos._txtexistencia = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtexistencia",b4xproductos._txtexistencia);
 //BA.debugLineNum = 7;BA.debugLine="Private txtPrecioUnitario As EditText";
b4xproductos._txtpreciounitario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtpreciounitario",b4xproductos._txtpreciounitario);
 //BA.debugLineNum = 8;BA.debugLine="Private txtIva As EditText";
b4xproductos._txtiva = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtiva",b4xproductos._txtiva);
 //BA.debugLineNum = 9;BA.debugLine="Private txtClasificacionId As EditText";
b4xproductos._txtclasificacionid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtclasificacionid",b4xproductos._txtclasificacionid);
 //BA.debugLineNum = 10;BA.debugLine="Private apiClas As Productos";
b4xproductos._apiclas = RemoteObject.createNew ("b4a.example.productos");__ref.setField("_apiclas",b4xproductos._apiclas);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _cmdactualizar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdActualizar_Click (b4xproductos) ","b4xproductos",7,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("cmdactualizar_click")) { __ref.runUserSub(false, "b4xproductos","cmdactualizar_click", __ref); return;}
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
public ResumableSub_cmdActualizar_Click(b4a.example.b4xproductos parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xproductos parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdActualizar_Click (b4xproductos) ","b4xproductos",7,__ref.getField(false, "ba"),__ref,55);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 56;BA.debugLine="Wait For (apiClas.Update(txtId.Text, txtNombre.Te";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xproductos", "cmdactualizar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.productos.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(double.class, __ref.getField(false,"_txtexistencia" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_txtpreciounitario" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_txtiva" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtclasificacionid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 57;BA.debugLine="If r = True Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 58;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 60;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("cmdBuscar_Click (b4xproductos) ","b4xproductos",7,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("cmdbuscar_click")) { __ref.runUserSub(false, "b4xproductos","cmdbuscar_click", __ref); return;}
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
public ResumableSub_cmdBuscar_Click(b4a.example.b4xproductos parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xproductos parent;
RemoteObject _r = RemoteObject.declareNull("b4a.example.producto");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdBuscar_Click (b4xproductos) ","b4xproductos",7,__ref.getField(false, "ba"),__ref,29);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 30;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xproductos", "cmdbuscar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.productos.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 31;BA.debugLine="If r.Id > 0 Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 33;BA.debugLine="txtId.Text = r.Id";
Debug.ShouldStop(1);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="txtNombre.Text= r.Nombre";
Debug.ShouldStop(2);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 35;BA.debugLine="txtExistencia.Text = r.Existencia";
Debug.ShouldStop(4);
__ref.getField(false,"_txtexistencia" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_existencia" /*RemoteObject*/ )));
 BA.debugLineNum = 36;BA.debugLine="txtPrecioUnitario.Text = r.PrecioUnitario";
Debug.ShouldStop(8);
__ref.getField(false,"_txtpreciounitario" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_preciounitario" /*RemoteObject*/ )));
 BA.debugLineNum = 37;BA.debugLine="txtIva.Text = r.IVA";
Debug.ShouldStop(16);
__ref.getField(false,"_txtiva" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_iva" /*RemoteObject*/ )));
 BA.debugLineNum = 38;BA.debugLine="txtClasificacionId.Text = r.ClasificacionId";
Debug.ShouldStop(32);
__ref.getField(false,"_txtclasificacionid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_clasificacionid" /*RemoteObject*/ )));
 BA.debugLineNum = 39;BA.debugLine="Msgbox(\"Registro Encontrado con éxito\", \"OK\")";
Debug.ShouldStop(64);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Encontrado con éxito")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 41;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(256);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
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
public static void  _cmdcrear_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdCrear_Click (b4xproductos) ","b4xproductos",7,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("cmdcrear_click")) { __ref.runUserSub(false, "b4xproductos","cmdcrear_click", __ref); return;}
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
public ResumableSub_cmdCrear_Click(b4a.example.b4xproductos parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xproductos parent;
RemoteObject _c = RemoteObject.declareNull("b4a.example.producto");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdCrear_Click (b4xproductos) ","b4xproductos",7,__ref.getField(false, "ba"),__ref,45);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 46;BA.debugLine="Wait For (apiClas.Create(0,txtNombre.Text, txtExi";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xproductos", "cmdcrear_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.productos.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(double.class, __ref.getField(false,"_txtexistencia" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_txtpreciounitario" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_txtiva" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtclasificacionid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("c", _c);
;
 BA.debugLineNum = 47;BA.debugLine="If c.Id> 0 Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 48;BA.debugLine="txtId.Text = c.Id";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_c.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="Msgbox(\"Registro Creado\", \"OK\")";
Debug.ShouldStop(65536);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Creado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 51;BA.debugLine="Msgbox(\"No se pudo insertar el registro\",\"OK\")";
Debug.ShouldStop(262144);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo insertar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("cmdEliminar_Click (b4xproductos) ","b4xproductos",7,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("cmdeliminar_click")) { __ref.runUserSub(false, "b4xproductos","cmdeliminar_click", __ref); return;}
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
public ResumableSub_cmdEliminar_Click(b4a.example.b4xproductos parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xproductos parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdEliminar_Click (b4xproductos) ","b4xproductos",7,__ref.getField(false, "ba"),__ref,64);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 65;BA.debugLine="Wait For (apiClas.Delete(txtId.Text)) Complete (r";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xproductos", "cmdeliminar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.productos.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 66;BA.debugLine="If r = True Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 67;BA.debugLine="Msgbox(\"Registro Eliminado\", \"OK\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Eliminado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 68;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(8);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 69;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(16);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 70;BA.debugLine="txtExistencia.Text = \"\"";
Debug.ShouldStop(32);
__ref.getField(false,"_txtexistencia" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 71;BA.debugLine="txtPrecioUnitario.Text = \"\"";
Debug.ShouldStop(64);
__ref.getField(false,"_txtpreciounitario" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 72;BA.debugLine="txtIva.Text = \"\"";
Debug.ShouldStop(128);
__ref.getField(false,"_txtiva" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 73;BA.debugLine="txtClasificacionId.Text = \"\"";
Debug.ShouldStop(256);
__ref.getField(false,"_txtclasificacionid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 75;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(1024);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("cmdMenu_Click (b4xproductos) ","b4xproductos",7,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("cmdmenu_click")) { return __ref.runUserSub(false, "b4xproductos","cmdmenu_click", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Private Sub cmdMenu_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
Debug.ShouldStop(32768);
b4xproductos._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPage")));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Initialize (b4xproductos) ","b4xproductos",7,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xproductos","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Return Me";
Debug.ShouldStop(16384);
if (true) return __ref;
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}