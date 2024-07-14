package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xproductos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xproductos");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xproductos.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtexistencia = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpreciounitario = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtiva = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtclasificacionid = null;
public b4a.example.productos _apiclas = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.b4xproductos __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xproductos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.b4xproductos __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xproductos";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="Root.LoadLayout(\"PageProductos\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("PageProductos",ba);
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="apiClas.Initialize(\"https://cloudcomputingapi2.az";
__ref._apiclas /*b4a.example.productos*/ ._initialize /*String*/ (null,ba,"https://cloudcomputingapi2.azurewebsites.net/api/Productos");
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xproductos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xproductos";
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="Private txtExistencia As EditText";
_txtexistencia = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="Private txtPrecioUnitario As EditText";
_txtpreciounitario = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=15400967;
 //BA.debugLineNum = 15400967;BA.debugLine="Private txtIva As EditText";
_txtiva = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=15400968;
 //BA.debugLineNum = 15400968;BA.debugLine="Private txtClasificacionId As EditText";
_txtclasificacionid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=15400969;
 //BA.debugLineNum = 15400969;BA.debugLine="Private apiClas As Productos";
_apiclas = new b4a.example.productos();
RDebugUtils.currentLine=15400970;
 //BA.debugLineNum = 15400970;BA.debugLine="End Sub";
return "";
}
public void  _cmdactualizar_click(b4a.example.b4xproductos __ref) throws Exception{
RDebugUtils.currentModule="b4xproductos";
if (Debug.shouldDelegate(ba, "cmdactualizar_click", false))
	 {Debug.delegate(ba, "cmdactualizar_click", null); return;}
ResumableSub_cmdActualizar_Click rsub = new ResumableSub_cmdActualizar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdActualizar_Click extends BA.ResumableSub {
public ResumableSub_cmdActualizar_Click(b4a.example.b4xproductos parent,b4a.example.b4xproductos __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xproductos __ref;
b4a.example.b4xproductos parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xproductos";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="Wait For (apiClas.Update(txtId.Text, txtNombre.Te";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xproductos", "cmdactualizar_click"), __ref._apiclas /*b4a.example.productos*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),(double)(Double.parseDouble(__ref._txtexistencia /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),(double)(Double.parseDouble(__ref._txtpreciounitario /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),(double)(Double.parseDouble(__ref._txtiva /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),(int)(Double.parseDouble(__ref._txtclasificacionid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="If r = True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_r==parent.__c.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Actualizado"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=15925253;
 //BA.debugLineNum = 15925253;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=15925255;
 //BA.debugLineNum = 15925255;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdbuscar_click(b4a.example.b4xproductos __ref) throws Exception{
RDebugUtils.currentModule="b4xproductos";
if (Debug.shouldDelegate(ba, "cmdbuscar_click", false))
	 {Debug.delegate(ba, "cmdbuscar_click", null); return;}
ResumableSub_cmdBuscar_Click rsub = new ResumableSub_cmdBuscar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdBuscar_Click extends BA.ResumableSub {
public ResumableSub_cmdBuscar_Click(b4a.example.b4xproductos parent,b4a.example.b4xproductos __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xproductos __ref;
b4a.example.b4xproductos parent;
b4a.example.producto _r = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xproductos";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xproductos", "cmdbuscar_click"), __ref._apiclas /*b4a.example.productos*/ ._read_byid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (b4a.example.producto) result[1];
;
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="If r.Id > 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_r._id /*int*/ >0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=19267588;
 //BA.debugLineNum = 19267588;BA.debugLine="txtId.Text = r.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._id /*int*/ ));
RDebugUtils.currentLine=19267589;
 //BA.debugLineNum = 19267589;BA.debugLine="txtNombre.Text= r.Nombre";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._nombre /*String*/ ));
RDebugUtils.currentLine=19267590;
 //BA.debugLineNum = 19267590;BA.debugLine="txtExistencia.Text = r.Existencia";
__ref._txtexistencia /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._existencia /*double*/ ));
RDebugUtils.currentLine=19267591;
 //BA.debugLineNum = 19267591;BA.debugLine="txtPrecioUnitario.Text = r.PrecioUnitario";
__ref._txtpreciounitario /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._preciounitario /*double*/ ));
RDebugUtils.currentLine=19267592;
 //BA.debugLineNum = 19267592;BA.debugLine="txtIva.Text = r.IVA";
__ref._txtiva /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._iva /*double*/ ));
RDebugUtils.currentLine=19267593;
 //BA.debugLineNum = 19267593;BA.debugLine="txtClasificacionId.Text = r.ClasificacionId";
__ref._txtclasificacionid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._clasificacionid /*int*/ ));
RDebugUtils.currentLine=19267594;
 //BA.debugLineNum = 19267594;BA.debugLine="Msgbox(\"Registro Encontrado con éxito\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Encontrado con éxito"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=19267596;
 //BA.debugLineNum = 19267596;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=19267598;
 //BA.debugLineNum = 19267598;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdcrear_click(b4a.example.b4xproductos __ref) throws Exception{
RDebugUtils.currentModule="b4xproductos";
if (Debug.shouldDelegate(ba, "cmdcrear_click", false))
	 {Debug.delegate(ba, "cmdcrear_click", null); return;}
ResumableSub_cmdCrear_Click rsub = new ResumableSub_cmdCrear_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdCrear_Click extends BA.ResumableSub {
public ResumableSub_cmdCrear_Click(b4a.example.b4xproductos parent,b4a.example.b4xproductos __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xproductos __ref;
b4a.example.b4xproductos parent;
b4a.example.producto _c = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xproductos";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="Wait For (apiClas.Create(0,txtNombre.Text, txtExi";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xproductos", "cmdcrear_click"), __ref._apiclas /*b4a.example.productos*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (0),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),(double)(Double.parseDouble(__ref._txtexistencia /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),(double)(Double.parseDouble(__ref._txtpreciounitario /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),(double)(Double.parseDouble(__ref._txtiva /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),(int)(Double.parseDouble(__ref._txtclasificacionid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (b4a.example.producto) result[1];
;
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="If c.Id> 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_c._id /*int*/ >0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="txtId.Text = c.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_c._id /*int*/ ));
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="Msgbox(\"Registro Creado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Creado"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=15859718;
 //BA.debugLineNum = 15859718;BA.debugLine="Msgbox(\"No se pudo insertar el registro\",\"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo insertar el registro"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=15859720;
 //BA.debugLineNum = 15859720;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdeliminar_click(b4a.example.b4xproductos __ref) throws Exception{
RDebugUtils.currentModule="b4xproductos";
if (Debug.shouldDelegate(ba, "cmdeliminar_click", false))
	 {Debug.delegate(ba, "cmdeliminar_click", null); return;}
ResumableSub_cmdEliminar_Click rsub = new ResumableSub_cmdEliminar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdEliminar_Click extends BA.ResumableSub {
public ResumableSub_cmdEliminar_Click(b4a.example.b4xproductos parent,b4a.example.b4xproductos __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xproductos __ref;
b4a.example.b4xproductos parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xproductos";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="Wait For (apiClas.Delete(txtId.Text)) Complete (r";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xproductos", "cmdeliminar_click"), __ref._apiclas /*b4a.example.productos*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="If r = True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_r==parent.__c.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=15990787;
 //BA.debugLineNum = 15990787;BA.debugLine="Msgbox(\"Registro Eliminado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Eliminado"),BA.ObjectToCharSequence("OK"),ba);
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="txtId.Text = \"\"";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15990789;
 //BA.debugLineNum = 15990789;BA.debugLine="txtNombre.Text = \"\"";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15990790;
 //BA.debugLineNum = 15990790;BA.debugLine="txtExistencia.Text = \"\"";
__ref._txtexistencia /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15990791;
 //BA.debugLineNum = 15990791;BA.debugLine="txtPrecioUnitario.Text = \"\"";
__ref._txtpreciounitario /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15990792;
 //BA.debugLineNum = 15990792;BA.debugLine="txtIva.Text = \"\"";
__ref._txtiva /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15990793;
 //BA.debugLineNum = 15990793;BA.debugLine="txtClasificacionId.Text = \"\"";
__ref._txtclasificacionid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=15990795;
 //BA.debugLineNum = 15990795;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=15990797;
 //BA.debugLineNum = 15990797;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _cmdmenu_click(b4a.example.b4xproductos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xproductos";
if (Debug.shouldDelegate(ba, "cmdmenu_click", false))
	 {return ((String) Debug.delegate(ba, "cmdmenu_click", null));}
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Private Sub cmdMenu_Click";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="End Sub";
return "";
}
}