package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xclasificaciones extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xclasificaciones");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xclasificaciones.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtdescripcion = null;
public b4a.example.clasificaciones _apiclas = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.b4xclasificaciones __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xclasificaciones";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.b4xclasificaciones __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xclasificaciones";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="Root.LoadLayout(\"PageClasificacion\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("PageClasificacion",ba);
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="apiClas.Initialize(\"https://cloudcomputingapi2.az";
__ref._apiclas /*b4a.example.clasificaciones*/ ._initialize /*String*/ (null,ba,"https://cloudcomputingapi2.azurewebsites.net/api/Clasificaciones");
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xclasificaciones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xclasificaciones";
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=15597572;
 //BA.debugLineNum = 15597572;BA.debugLine="Private txtDescripcion As EditText";
_txtdescripcion = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="Private apiClas As Clasificaciones";
_apiclas = new b4a.example.clasificaciones();
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="End Sub";
return "";
}
public void  _cmdactualizar_click(b4a.example.b4xclasificaciones __ref) throws Exception{
RDebugUtils.currentModule="b4xclasificaciones";
if (Debug.shouldDelegate(ba, "cmdactualizar_click", false))
	 {Debug.delegate(ba, "cmdactualizar_click", null); return;}
ResumableSub_cmdActualizar_Click rsub = new ResumableSub_cmdActualizar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdActualizar_Click extends BA.ResumableSub {
public ResumableSub_cmdActualizar_Click(b4a.example.b4xclasificaciones parent,b4a.example.b4xclasificaciones __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xclasificaciones __ref;
b4a.example.b4xclasificaciones parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xclasificaciones";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Wait For (apiClas.Update(txtId.Text, txtDescripci";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xclasificaciones", "cmdactualizar_click"), __ref._apiclas /*b4a.example.clasificaciones*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),__ref._txtdescripcion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="If r = True Then";
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
RDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Actualizado"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=18219013;
 //BA.debugLineNum = 18219013;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=18219015;
 //BA.debugLineNum = 18219015;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdbuscar_click(b4a.example.b4xclasificaciones __ref) throws Exception{
RDebugUtils.currentModule="b4xclasificaciones";
if (Debug.shouldDelegate(ba, "cmdbuscar_click", false))
	 {Debug.delegate(ba, "cmdbuscar_click", null); return;}
ResumableSub_cmdBuscar_Click rsub = new ResumableSub_cmdBuscar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdBuscar_Click extends BA.ResumableSub {
public ResumableSub_cmdBuscar_Click(b4a.example.b4xclasificaciones parent,b4a.example.b4xclasificaciones __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xclasificaciones __ref;
b4a.example.b4xclasificaciones parent;
b4a.example.clasificacion _r = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xclasificaciones";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xclasificaciones", "cmdbuscar_click"), __ref._apiclas /*b4a.example.clasificaciones*/ ._read_byid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (b4a.example.clasificacion) result[1];
;
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="If r.Id > 0 Then";
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
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="txtId.Text=r.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._id /*int*/ ));
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="txtDescripcion.Text = r.Descripcion";
__ref._txtdescripcion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._descripcion /*String*/ ));
RDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="Msgbox(\"Registro Encontrado con éxito\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Encontrado con éxito"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=18808841;
 //BA.debugLineNum = 18808841;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdcrear_click(b4a.example.b4xclasificaciones __ref) throws Exception{
RDebugUtils.currentModule="b4xclasificaciones";
if (Debug.shouldDelegate(ba, "cmdcrear_click", false))
	 {Debug.delegate(ba, "cmdcrear_click", null); return;}
ResumableSub_cmdCrear_Click rsub = new ResumableSub_cmdCrear_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdCrear_Click extends BA.ResumableSub {
public ResumableSub_cmdCrear_Click(b4a.example.b4xclasificaciones parent,b4a.example.b4xclasificaciones __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xclasificaciones __ref;
b4a.example.b4xclasificaciones parent;
b4a.example.clasificacion _c = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xclasificaciones";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="Wait For (apiClas.Create(0,txtDescripcion.Text))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xclasificaciones", "cmdcrear_click"), __ref._apiclas /*b4a.example.clasificaciones*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (0),__ref._txtdescripcion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (b4a.example.clasificacion) result[1];
;
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="If c.Id> 0 Then";
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
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="txtId.Text = c.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_c._id /*int*/ ));
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="Msgbox(\"Registro Creado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Creado"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=18153478;
 //BA.debugLineNum = 18153478;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo crear el registro"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=18153480;
 //BA.debugLineNum = 18153480;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdeliminar_click(b4a.example.b4xclasificaciones __ref) throws Exception{
RDebugUtils.currentModule="b4xclasificaciones";
if (Debug.shouldDelegate(ba, "cmdeliminar_click", false))
	 {Debug.delegate(ba, "cmdeliminar_click", null); return;}
ResumableSub_cmdEliminar_Click rsub = new ResumableSub_cmdEliminar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdEliminar_Click extends BA.ResumableSub {
public ResumableSub_cmdEliminar_Click(b4a.example.b4xclasificaciones parent,b4a.example.b4xclasificaciones __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xclasificaciones __ref;
b4a.example.b4xclasificaciones parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xclasificaciones";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Wait For (apiClas.Delete(txtId.Text)) Complete (r";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xclasificaciones", "cmdeliminar_click"), __ref._apiclas /*b4a.example.clasificaciones*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="If r = True Then";
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
RDebugUtils.currentLine=18284547;
 //BA.debugLineNum = 18284547;BA.debugLine="Msgbox(\"Registro Eliminado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Eliminado"),BA.ObjectToCharSequence("OK"),ba);
RDebugUtils.currentLine=18284548;
 //BA.debugLineNum = 18284548;BA.debugLine="txtId.Text = \"\"";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18284549;
 //BA.debugLineNum = 18284549;BA.debugLine="txtDescripcion.Text = \"\"";
__ref._txtdescripcion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=18284551;
 //BA.debugLineNum = 18284551;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=18284553;
 //BA.debugLineNum = 18284553;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _cmdmenu_click(b4a.example.b4xclasificaciones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xclasificaciones";
if (Debug.shouldDelegate(ba, "cmdmenu_click", false))
	 {return ((String) Debug.delegate(ba, "cmdmenu_click", null));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub cmdMenu_Click";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="End Sub";
return "";
}
}