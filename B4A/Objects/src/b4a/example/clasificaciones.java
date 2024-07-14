package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clasificaciones extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.clasificaciones");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.clasificaciones.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4a.example.clasificaciones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clasificaciones";
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Private apiJob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="Public apiURL As String";
_apiurl = "";
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.clasificaciones __ref,int _id,String _descripcion) throws Exception{
RDebugUtils.currentModule="clasificaciones";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_id,_descripcion}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_id,_descripcion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.clasificaciones parent,b4a.example.clasificaciones __ref,int _id,String _descripcion) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._descripcion = _descripcion;
this.__ref = parent;
}
b4a.example.clasificaciones __ref;
b4a.example.clasificaciones parent;
int _id;
String _descripcion;
b4a.example.clasificacion _clase = null;
String _json = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clasificaciones";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Dim clase As Clasificacion";
_clase = new b4a.example.clasificacion();
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="clase.Initialize()";
_clase._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="json = \"{'id': 0, 'descripcion': '\"& descripcion";
_json = "{'id': 0, 'descripcion': '"+_descripcion+"'}";
RDebugUtils.currentLine=14745608;
 //BA.debugLineNum = 14745608;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14745609;
 //BA.debugLineNum = 14745609;BA.debugLine="apiJob.PostString(apiURL, json)";
__ref._apijob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json);
RDebugUtils.currentLine=14745610;
 //BA.debugLineNum = 14745610;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=14745611;
 //BA.debugLineNum = 14745611;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clasificaciones", "create"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14745612;
 //BA.debugLineNum = 14745612;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=14745613;
 //BA.debugLineNum = 14745613;BA.debugLine="jsonParser.Initialize( resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=14745614;
 //BA.debugLineNum = 14745614;BA.debugLine="data = jsonParser.NextObject";
_data = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=14745615;
 //BA.debugLineNum = 14745615;BA.debugLine="clase.Id = data.Get(\"id\")";
_clase._id /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("id"))));
RDebugUtils.currentLine=14745616;
 //BA.debugLineNum = 14745616;BA.debugLine="clase.Descripcion = data.Get(\"nombreTrabajo\")";
_clase._descripcion /*String*/  = BA.ObjectToString(_data.Get((Object)("nombreTrabajo")));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=14745618;
 //BA.debugLineNum = 14745618;BA.debugLine="Return clase";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_clase));return;};
RDebugUtils.currentLine=14745619;
 //BA.debugLineNum = 14745619;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.clasificaciones __ref,int _id) throws Exception{
RDebugUtils.currentModule="clasificaciones";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.clasificaciones parent,b4a.example.clasificaciones __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.clasificaciones __ref;
b4a.example.clasificaciones parent;
int _id;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clasificaciones";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clasificaciones", "delete"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.clasificaciones __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clasificaciones";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Public Sub Initialize(url As String)";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="apiURL = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_all(b4a.example.clasificaciones __ref) throws Exception{
RDebugUtils.currentModule="clasificaciones";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_all", null));}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.clasificaciones parent,b4a.example.clasificaciones __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.clasificaciones __ref;
b4a.example.clasificaciones parent;
anywheresoftware.b4a.objects.collections.List _c1 = null;
b4a.example.clasificacion _c2 = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _lista = null;
b4a.example.httpjob _resultado = null;
int _i = 0;
int step13;
int limit13;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clasificaciones";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Dim c1 As List";
_c1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="Dim c2 As Clasificacion";
_c2 = new b4a.example.clasificacion();
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="Dim lista As List";
_lista = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="c1.Initialize";
_c1.Initialize();
RDebugUtils.currentLine=14811143;
 //BA.debugLineNum = 14811143;BA.debugLine="c2.Initialize";
_c2._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14811145;
 //BA.debugLineNum = 14811145;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="apiJob.Download(apiURL)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ );
RDebugUtils.currentLine=14811147;
 //BA.debugLineNum = 14811147;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clasificaciones", "read_all"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14811148;
 //BA.debugLineNum = 14811148;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=14811149;
 //BA.debugLineNum = 14811149;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=14811150;
 //BA.debugLineNum = 14811150;BA.debugLine="lista = jsonParser.NextArray";
_lista = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=14811151;
 //BA.debugLineNum = 14811151;BA.debugLine="For i = 0 To lista.Size - 1";
if (true) break;

case 4:
//for
this.state = 7;
step13 = 1;
limit13 = (int) (_lista.getSize()-1);
_i = (int) (0) ;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step13)) ;
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=14811152;
 //BA.debugLineNum = 14811152;BA.debugLine="map = lista.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lista.Get(_i)));
RDebugUtils.currentLine=14811153;
 //BA.debugLineNum = 14811153;BA.debugLine="Dim c2 As Clasificacion";
_c2 = new b4a.example.clasificacion();
RDebugUtils.currentLine=14811154;
 //BA.debugLineNum = 14811154;BA.debugLine="c2.Initialize";
_c2._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14811155;
 //BA.debugLineNum = 14811155;BA.debugLine="c2.Id = map.Get(\"id\")";
_c2._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=14811156;
 //BA.debugLineNum = 14811156;BA.debugLine="c2.Descripcion = map.Get(\"descripcion\")";
_c2._descripcion /*String*/  = BA.ObjectToString(_map.Get((Object)("descripcion")));
RDebugUtils.currentLine=14811157;
 //BA.debugLineNum = 14811157;BA.debugLine="c1.Add(c2)";
_c1.Add((Object)(_c2));
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
RDebugUtils.currentLine=14811161;
 //BA.debugLineNum = 14811161;BA.debugLine="Return c1";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_c1));return;};
RDebugUtils.currentLine=14811162;
 //BA.debugLineNum = 14811162;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_byid(b4a.example.clasificaciones __ref,int _id) throws Exception{
RDebugUtils.currentModule="clasificaciones";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.clasificaciones parent,b4a.example.clasificaciones __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.clasificaciones __ref;
b4a.example.clasificaciones parent;
int _id;
b4a.example.clasificacion _clase = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clasificaciones";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Dim clase As Clasificacion";
_clase = new b4a.example.clasificacion();
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="clase.Initialize";
_clase._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="apiJob.Download(apiURL &\"/\"& id)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="Wait For (apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clasificaciones", "read_byid"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=14876680;
 //BA.debugLineNum = 14876680;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=14876681;
 //BA.debugLineNum = 14876681;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=14876682;
 //BA.debugLineNum = 14876682;BA.debugLine="clase.Id = map.Get(\"id\")";
_clase._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=14876683;
 //BA.debugLineNum = 14876683;BA.debugLine="clase.Descripcion = map.Get(\"descripcion\")";
_clase._descripcion /*String*/  = BA.ObjectToString(_map.Get((Object)("descripcion")));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=14876685;
 //BA.debugLineNum = 14876685;BA.debugLine="Return clase";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_clase));return;};
RDebugUtils.currentLine=14876686;
 //BA.debugLineNum = 14876686;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.clasificaciones __ref,int _id,String _descripcion) throws Exception{
RDebugUtils.currentModule="clasificaciones";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_descripcion}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_descripcion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.clasificaciones parent,b4a.example.clasificaciones __ref,int _id,String _descripcion) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._descripcion = _descripcion;
this.__ref = parent;
}
b4a.example.clasificaciones __ref;
b4a.example.clasificaciones parent;
int _id;
String _descripcion;
b4a.example.clasificacion _clase = null;
String _json = "";
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clasificaciones";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Dim clase As Clasificacion";
_clase = new b4a.example.clasificacion();
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="clase.Initialize()";
_clase._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="json = \"{'id': '\"& id &\"', 'descripcion': '\"& des";
_json = "{'id': '"+BA.NumberToString(_id)+"', 'descripcion': '"+_descripcion+"'}";
RDebugUtils.currentLine=14942215;
 //BA.debugLineNum = 14942215;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14942216;
 //BA.debugLineNum = 14942216;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
__ref._apijob /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json);
RDebugUtils.currentLine=14942217;
 //BA.debugLineNum = 14942217;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=14942219;
 //BA.debugLineNum = 14942219;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clasificaciones", "update"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14942220;
 //BA.debugLineNum = 14942220;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=14942221;
 //BA.debugLineNum = 14942221;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}