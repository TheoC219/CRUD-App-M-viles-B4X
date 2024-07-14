package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class producto extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.producto");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.producto.class).invoke(this, new Object[] {null});
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
public int _id = 0;
public String _nombre = "";
public double _existencia = 0;
public double _preciounitario = 0;
public double _iva = 0;
public int _clasificacionid = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.producto __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="producto";
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="Public Id As Int";
_id = 0;
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Public Nombre As String";
_nombre = "";
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="Public Existencia As Double";
_existencia = 0;
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="Public PrecioUnitario As Double";
_preciounitario = 0;
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="Public IVA As Double";
_iva = 0;
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="Public ClasificacionId As Int";
_clasificacionid = 0;
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.producto __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="producto";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="End Sub";
return "";
}
}