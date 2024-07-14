package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class productos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.productos");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.productos.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
public b4a.example.httpjob _apijob = null;
public String _apiurl = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.productos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Private apiJob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="Public apiURL As String";
_apiurl = "";
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.productos __ref,int _id,String _nombre,double _existencia,double _preciounitario,double _iva,int _clasificacionid) throws Exception{
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_id,_nombre,_existencia,_preciounitario,_iva,_clasificacionid}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_id,_nombre,_existencia,_preciounitario,_iva,_clasificacionid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.productos parent,b4a.example.productos __ref,int _id,String _nombre,double _existencia,double _preciounitario,double _iva,int _clasificacionid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._existencia = _existencia;
this._preciounitario = _preciounitario;
this._iva = _iva;
this._clasificacionid = _clasificacionid;
this.__ref = parent;
}
b4a.example.productos __ref;
b4a.example.productos parent;
int _id;
String _nombre;
double _existencia;
double _preciounitario;
double _iva;
int _clasificacionid;
b4a.example.producto _prod = null;
String _json = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="productos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="Dim prod As Producto";
_prod = new b4a.example.producto();
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="prod.Initialize()";
_prod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="json = \"{'id': \" & id & \", 'nombre': '\" & nombre";
_json = "{'id': "+BA.NumberToString(_id)+", 'nombre': '"+_nombre+"', 'existencia': '"+BA.NumberToString(_existencia)+"', 'precioUnitario': '"+BA.NumberToString(_preciounitario)+"', 'iva': '"+BA.NumberToString(_iva)+"', 'clasificacionId': '"+BA.NumberToString(_clasificacionid)+"'}";
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=15073289;
 //BA.debugLineNum = 15073289;BA.debugLine="apiJob.PostString(apiURL, json)";
__ref._apijob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json);
RDebugUtils.currentLine=15073290;
 //BA.debugLineNum = 15073290;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=15073291;
 //BA.debugLineNum = 15073291;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "productos", "create"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=15073292;
 //BA.debugLineNum = 15073292;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=15073293;
 //BA.debugLineNum = 15073293;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=15073294;
 //BA.debugLineNum = 15073294;BA.debugLine="data = jsonParser.NextObject";
_data = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=15073295;
 //BA.debugLineNum = 15073295;BA.debugLine="prod.Id = data.Get(\"id\")";
_prod._id /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("id"))));
RDebugUtils.currentLine=15073296;
 //BA.debugLineNum = 15073296;BA.debugLine="prod.Nombre = data.Get(\"nombre\")";
_prod._nombre /*String*/  = BA.ObjectToString(_data.Get((Object)("nombre")));
RDebugUtils.currentLine=15073297;
 //BA.debugLineNum = 15073297;BA.debugLine="prod.Existencia = data.Get(\"existencia\")";
_prod._existencia /*double*/  = (double)(BA.ObjectToNumber(_data.Get((Object)("existencia"))));
RDebugUtils.currentLine=15073298;
 //BA.debugLineNum = 15073298;BA.debugLine="prod.PrecioUnitario = data.Get(\"precioUnitario\")";
_prod._preciounitario /*double*/  = (double)(BA.ObjectToNumber(_data.Get((Object)("precioUnitario"))));
RDebugUtils.currentLine=15073299;
 //BA.debugLineNum = 15073299;BA.debugLine="prod.IVA = data.Get(\"iva\")";
_prod._iva /*double*/  = (double)(BA.ObjectToNumber(_data.Get((Object)("iva"))));
RDebugUtils.currentLine=15073300;
 //BA.debugLineNum = 15073300;BA.debugLine="prod.ClasificacionId = data.Get(\"clasificacionId";
_prod._clasificacionid /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("clasificacionId"))));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=15073302;
 //BA.debugLineNum = 15073302;BA.debugLine="Return prod";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prod));return;};
RDebugUtils.currentLine=15073303;
 //BA.debugLineNum = 15073303;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.productos __ref,int _id) throws Exception{
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.productos parent,b4a.example.productos __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.productos __ref;
b4a.example.productos parent;
int _id;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="productos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "productos", "delete"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.productos __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Public Sub Initialize(url As String)";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="apiURL = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_all(b4a.example.productos __ref) throws Exception{
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_all", null));}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.productos parent,b4a.example.productos __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.productos __ref;
b4a.example.productos parent;
anywheresoftware.b4a.objects.collections.List _p = null;
b4a.example.producto _prod = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
b4a.example.httpjob _resultado = null;
int _i = 0;
int step12;
int limit12;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="productos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Dim p As List";
_p = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Dim prod As Producto";
_prod = new b4a.example.producto();
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=15138825;
 //BA.debugLineNum = 15138825;BA.debugLine="apiJob.Download(apiURL)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ );
RDebugUtils.currentLine=15138826;
 //BA.debugLineNum = 15138826;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "productos", "read_all"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=15138827;
 //BA.debugLineNum = 15138827;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=15138829;
 //BA.debugLineNum = 15138829;BA.debugLine="lst = jsonParser.NextArray";
_lst = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=15138830;
 //BA.debugLineNum = 15138830;BA.debugLine="For i = 0 To lst.Size - 1";
if (true) break;

case 4:
//for
this.state = 7;
step12 = 1;
limit12 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step12)) ;
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=15138831;
 //BA.debugLineNum = 15138831;BA.debugLine="map = lst.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lst.Get(_i)));
RDebugUtils.currentLine=15138832;
 //BA.debugLineNum = 15138832;BA.debugLine="prod.Initialize";
_prod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15138833;
 //BA.debugLineNum = 15138833;BA.debugLine="prod.Id = map.Get(\"id\")";
_prod._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=15138834;
 //BA.debugLineNum = 15138834;BA.debugLine="prod.Nombre = map.Get(\"nombre\")";
_prod._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=15138835;
 //BA.debugLineNum = 15138835;BA.debugLine="prod.Existencia = map.Get(\"existencia\")";
_prod._existencia /*double*/  = (double)(BA.ObjectToNumber(_map.Get((Object)("existencia"))));
RDebugUtils.currentLine=15138836;
 //BA.debugLineNum = 15138836;BA.debugLine="prod.PrecioUnitario = map.Get(\"precioUnitario\")";
_prod._preciounitario /*double*/  = (double)(BA.ObjectToNumber(_map.Get((Object)("precioUnitario"))));
RDebugUtils.currentLine=15138837;
 //BA.debugLineNum = 15138837;BA.debugLine="prod.IVA = map.Get(\"iva\")";
_prod._iva /*double*/  = (double)(BA.ObjectToNumber(_map.Get((Object)("iva"))));
RDebugUtils.currentLine=15138838;
 //BA.debugLineNum = 15138838;BA.debugLine="prod.ClasificacionId = map.Get(\"clasificacionId";
_prod._clasificacionid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("clasificacionId"))));
RDebugUtils.currentLine=15138840;
 //BA.debugLineNum = 15138840;BA.debugLine="p.Add(prod)";
_p.Add((Object)(_prod));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=15138844;
 //BA.debugLineNum = 15138844;BA.debugLine="Return p";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_p));return;};
RDebugUtils.currentLine=15138845;
 //BA.debugLineNum = 15138845;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_byid(b4a.example.productos __ref,int _id) throws Exception{
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.productos parent,b4a.example.productos __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.productos __ref;
b4a.example.productos parent;
int _id;
b4a.example.producto _prod = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="productos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Dim prod As Producto";
_prod = new b4a.example.producto();
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="prod.Initialize";
_prod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="apiJob.Download(apiURL & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="Wait For (apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "productos", "read_byid"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="prod.Id = map.Get(\"id\")";
_prod._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="prod.Nombre = map.Get(\"nombre\")";
_prod._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="prod.Existencia = map.Get(\"existencia\")";
_prod._existencia /*double*/  = (double)(BA.ObjectToNumber(_map.Get((Object)("existencia"))));
RDebugUtils.currentLine=15204365;
 //BA.debugLineNum = 15204365;BA.debugLine="prod.PrecioUnitario = map.Get(\"precioUnitario\")";
_prod._preciounitario /*double*/  = (double)(BA.ObjectToNumber(_map.Get((Object)("precioUnitario"))));
RDebugUtils.currentLine=15204366;
 //BA.debugLineNum = 15204366;BA.debugLine="prod.IVA = map.Get(\"iva\")";
_prod._iva /*double*/  = (double)(BA.ObjectToNumber(_map.Get((Object)("iva"))));
RDebugUtils.currentLine=15204367;
 //BA.debugLineNum = 15204367;BA.debugLine="prod.ClasificacionId = map.Get(\"clasificacionId\"";
_prod._clasificacionid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("clasificacionId"))));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=15204369;
 //BA.debugLineNum = 15204369;BA.debugLine="Return prod";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prod));return;};
RDebugUtils.currentLine=15204370;
 //BA.debugLineNum = 15204370;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.productos __ref,int _id,String _nombre,double _existencia,double _preciounitario,double _iva,int _clasificacionid) throws Exception{
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_nombre,_existencia,_preciounitario,_iva,_clasificacionid}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_nombre,_existencia,_preciounitario,_iva,_clasificacionid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.productos parent,b4a.example.productos __ref,int _id,String _nombre,double _existencia,double _preciounitario,double _iva,int _clasificacionid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._existencia = _existencia;
this._preciounitario = _preciounitario;
this._iva = _iva;
this._clasificacionid = _clasificacionid;
this.__ref = parent;
}
b4a.example.productos __ref;
b4a.example.productos parent;
int _id;
String _nombre;
double _existencia;
double _preciounitario;
double _iva;
int _clasificacionid;
b4a.example.producto _prod = null;
String _json = "";
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="productos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Dim prod As Producto";
_prod = new b4a.example.producto();
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="prod.Initialize()";
_prod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="json = $\"{         \"id\": ${id},         \"nombre\":";
_json = ("{\n"+"        \"id\": "+parent.__c.SmartStringFormatter("",(Object)(_id))+",\n"+"        \"nombre\": \""+parent.__c.SmartStringFormatter("",(Object)(_nombre))+"\",\n"+"        \"existencia\": \""+parent.__c.SmartStringFormatter("",(Object)(_existencia))+"\",\n"+"        \"precioUnitario\": \""+parent.__c.SmartStringFormatter("",(Object)(_preciounitario))+"\",\n"+"        \"iva\": \""+parent.__c.SmartStringFormatter("",(Object)(_iva))+"\",\n"+"        \"clasificacionId\": "+parent.__c.SmartStringFormatter("",(Object)(_clasificacionid))+"\n"+"    }");
RDebugUtils.currentLine=15269902;
 //BA.debugLineNum = 15269902;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=15269903;
 //BA.debugLineNum = 15269903;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
__ref._apijob /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json);
RDebugUtils.currentLine=15269904;
 //BA.debugLineNum = 15269904;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=15269906;
 //BA.debugLineNum = 15269906;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "productos", "update"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=15269907;
 //BA.debugLineNum = 15269907;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=15269908;
 //BA.debugLineNum = 15269908;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}