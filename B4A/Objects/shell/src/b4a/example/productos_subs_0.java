package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class productos_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private jsonParser As JSONParser";
productos._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_jsonparser",productos._jsonparser);
 //BA.debugLineNum = 3;BA.debugLine="Private apiJob As HttpJob";
productos._apijob = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_apijob",productos._apijob);
 //BA.debugLineNum = 4;BA.debugLine="Public apiURL As String";
productos._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",productos._apiurl);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _existencia,RemoteObject _preciounitario,RemoteObject _iva,RemoteObject _clasificacionid) throws Exception{
try {
		Debug.PushSubsStack("Create (productos) ","productos",5,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "productos","create", __ref, _id, _nombre, _existencia, _preciounitario, _iva, _clasificacionid);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_id,_nombre,_existencia,_preciounitario,_iva,_clasificacionid);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.productos parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _existencia,RemoteObject _preciounitario,RemoteObject _iva,RemoteObject _clasificacionid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._existencia = _existencia;
this._preciounitario = _preciounitario;
this._iva = _iva;
this._clasificacionid = _clasificacionid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productos parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _existencia;
RemoteObject _preciounitario;
RemoteObject _iva;
RemoteObject _clasificacionid;
RemoteObject _prod = RemoteObject.declareNull("b4a.example.producto");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (productos) ","productos",5,__ref.getField(false, "ba"),__ref,12);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("existencia", _existencia);
Debug.locals.put("precioUnitario", _preciounitario);
Debug.locals.put("iva", _iva);
Debug.locals.put("clasificacionId", _clasificacionid);
 BA.debugLineNum = 13;BA.debugLine="Dim prod As Producto";
Debug.ShouldStop(4096);
_prod = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("prod", _prod);
 BA.debugLineNum = 14;BA.debugLine="Dim json As String";
Debug.ShouldStop(8192);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 15;BA.debugLine="Dim data As Map";
Debug.ShouldStop(16384);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 17;BA.debugLine="prod.Initialize()";
Debug.ShouldStop(65536);
_prod.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="json = \"{'id': \" & id & \", 'nombre': '\" & nombre";
Debug.ShouldStop(131072);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'id': "),_id,RemoteObject.createImmutable(", 'nombre': '"),_nombre,RemoteObject.createImmutable("', 'existencia': '"),_existencia,RemoteObject.createImmutable("', 'precioUnitario': '"),_preciounitario,RemoteObject.createImmutable("', 'iva': '"),_iva,RemoteObject.createImmutable("', 'clasificacionId': '"),_clasificacionid,RemoteObject.createImmutable("'}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 20;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(524288);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 21;BA.debugLine="apiJob.PostString(apiURL, json)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_json));
 BA.debugLineNum = 22;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(2097152);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 23;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productos", "create"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 24;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 25;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 26;BA.debugLine="data = jsonParser.NextObject";
Debug.ShouldStop(33554432);
_data = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("data", _data);
 BA.debugLineNum = 27;BA.debugLine="prod.Id = data.Get(\"id\")";
Debug.ShouldStop(67108864);
_prod.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 28;BA.debugLine="prod.Nombre = data.Get(\"nombre\")";
Debug.ShouldStop(134217728);
_prod.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 29;BA.debugLine="prod.Existencia = data.Get(\"existencia\")";
Debug.ShouldStop(268435456);
_prod.setField ("_existencia" /*RemoteObject*/ ,BA.numberCast(double.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("existencia"))))));
 BA.debugLineNum = 30;BA.debugLine="prod.PrecioUnitario = data.Get(\"precioUnitario\")";
Debug.ShouldStop(536870912);
_prod.setField ("_preciounitario" /*RemoteObject*/ ,BA.numberCast(double.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precioUnitario"))))));
 BA.debugLineNum = 31;BA.debugLine="prod.IVA = data.Get(\"iva\")";
Debug.ShouldStop(1073741824);
_prod.setField ("_iva" /*RemoteObject*/ ,BA.numberCast(double.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iva"))))));
 BA.debugLineNum = 32;BA.debugLine="prod.ClasificacionId = data.Get(\"clasificacionId";
Debug.ShouldStop(-2147483648);
_prod.setField ("_clasificacionid" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("clasificacionId"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 34;BA.debugLine="Return prod";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_prod));return;};
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _resultado) throws Exception{
}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (productos) ","productos",5,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "productos","delete", __ref, _id);}
ResumableSub_Delete rsub = new ResumableSub_Delete(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.productos parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productos parent;
RemoteObject _id;
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (productos) ","productos",5,__ref.getField(false, "ba"),__ref,110);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 111;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(16384);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 112;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
Debug.ShouldStop(32768);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 114;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productos", "delete"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 115;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 116;BA.debugLine="End Sub";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("Initialize (productos) ","productos",5,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "productos","initialize", __ref, _ba, _url);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("url", _url);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(url As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="apiURL = url";
Debug.ShouldStop(256);
__ref.setField ("_apiurl" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_all(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Read_All (productos) ","productos",5,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "productos","read_all", __ref);}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.productos parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productos parent;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _prod = RemoteObject.declareNull("b4a.example.producto");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
int _i = 0;
int step12;
int limit12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_All (productos) ","productos",5,__ref.getField(false, "ba"),__ref,37);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 38;BA.debugLine="Dim p As List";
Debug.ShouldStop(32);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("p", _p);
 BA.debugLineNum = 39;BA.debugLine="Dim prod As Producto";
Debug.ShouldStop(64);
_prod = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("prod", _prod);
 BA.debugLineNum = 40;BA.debugLine="Dim map As Map";
Debug.ShouldStop(128);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 41;BA.debugLine="Dim lst As List";
Debug.ShouldStop(256);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 43;BA.debugLine="p.Initialize";
Debug.ShouldStop(1024);
_p.runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(4096);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 46;BA.debugLine="apiJob.Download(apiURL)";
Debug.ShouldStop(8192);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productos", "read_all"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 48;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 8;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 49;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(65536);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 50;BA.debugLine="lst = jsonParser.NextArray";
Debug.ShouldStop(131072);
_lst = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextArray");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 51;BA.debugLine="For i = 0 To lst.Size - 1";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//for
this.state = 7;
step12 = 1;
limit12 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 52;BA.debugLine="map = lst.Get(i)";
Debug.ShouldStop(524288);
_map = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 53;BA.debugLine="prod.Initialize";
Debug.ShouldStop(1048576);
_prod.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 54;BA.debugLine="prod.Id = map.Get(\"id\")";
Debug.ShouldStop(2097152);
_prod.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 55;BA.debugLine="prod.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(4194304);
_prod.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 56;BA.debugLine="prod.Existencia = map.Get(\"existencia\")";
Debug.ShouldStop(8388608);
_prod.setField ("_existencia" /*RemoteObject*/ ,BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("existencia"))))));
 BA.debugLineNum = 57;BA.debugLine="prod.PrecioUnitario = map.Get(\"precioUnitario\")";
Debug.ShouldStop(16777216);
_prod.setField ("_preciounitario" /*RemoteObject*/ ,BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precioUnitario"))))));
 BA.debugLineNum = 58;BA.debugLine="prod.IVA = map.Get(\"iva\")";
Debug.ShouldStop(33554432);
_prod.setField ("_iva" /*RemoteObject*/ ,BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iva"))))));
 BA.debugLineNum = 59;BA.debugLine="prod.ClasificacionId = map.Get(\"clasificacionId";
Debug.ShouldStop(67108864);
_prod.setField ("_clasificacionid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("clasificacionId"))))));
 BA.debugLineNum = 61;BA.debugLine="p.Add(prod)";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("Add",(Object)((_prod)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("i", _i);
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 65;BA.debugLine="Return p";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_p));return;};
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static RemoteObject  _read_byid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (productos) ","productos",5,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "productos","read_byid", __ref, _id);}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.productos parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productos parent;
RemoteObject _id;
RemoteObject _prod = RemoteObject.declareNull("b4a.example.producto");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (productos) ","productos",5,__ref.getField(false, "ba"),__ref,68);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 69;BA.debugLine="Dim prod As Producto";
Debug.ShouldStop(16);
_prod = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("prod", _prod);
 BA.debugLineNum = 70;BA.debugLine="prod.Initialize";
Debug.ShouldStop(32);
_prod.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 72;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(128);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 73;BA.debugLine="apiJob.Download(apiURL & \"/\" & id)";
Debug.ShouldStop(256);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 74;BA.debugLine="Wait For (apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productos", "read_byid"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 75;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 76;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(2048);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 77;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(4096);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 78;BA.debugLine="prod.Id = map.Get(\"id\")";
Debug.ShouldStop(8192);
_prod.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 79;BA.debugLine="prod.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(16384);
_prod.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 80;BA.debugLine="prod.Existencia = map.Get(\"existencia\")";
Debug.ShouldStop(32768);
_prod.setField ("_existencia" /*RemoteObject*/ ,BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("existencia"))))));
 BA.debugLineNum = 81;BA.debugLine="prod.PrecioUnitario = map.Get(\"precioUnitario\")";
Debug.ShouldStop(65536);
_prod.setField ("_preciounitario" /*RemoteObject*/ ,BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precioUnitario"))))));
 BA.debugLineNum = 82;BA.debugLine="prod.IVA = map.Get(\"iva\")";
Debug.ShouldStop(131072);
_prod.setField ("_iva" /*RemoteObject*/ ,BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iva"))))));
 BA.debugLineNum = 83;BA.debugLine="prod.ClasificacionId = map.Get(\"clasificacionId\"";
Debug.ShouldStop(262144);
_prod.setField ("_clasificacionid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("clasificacionId"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 85;BA.debugLine="Return prod";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_prod));return;};
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _existencia,RemoteObject _preciounitario,RemoteObject _iva,RemoteObject _clasificacionid) throws Exception{
try {
		Debug.PushSubsStack("Update (productos) ","productos",5,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "productos","update", __ref, _id, _nombre, _existencia, _preciounitario, _iva, _clasificacionid);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_nombre,_existencia,_preciounitario,_iva,_clasificacionid);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.productos parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _existencia,RemoteObject _preciounitario,RemoteObject _iva,RemoteObject _clasificacionid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._existencia = _existencia;
this._preciounitario = _preciounitario;
this._iva = _iva;
this._clasificacionid = _clasificacionid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productos parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _existencia;
RemoteObject _preciounitario;
RemoteObject _iva;
RemoteObject _clasificacionid;
RemoteObject _prod = RemoteObject.declareNull("b4a.example.producto");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (productos) ","productos",5,__ref.getField(false, "ba"),__ref,88);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("existencia", _existencia);
Debug.locals.put("precioUnitario", _preciounitario);
Debug.locals.put("iva", _iva);
Debug.locals.put("clasificacionId", _clasificacionid);
 BA.debugLineNum = 89;BA.debugLine="Dim prod As Producto";
Debug.ShouldStop(16777216);
_prod = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("prod", _prod);
 BA.debugLineNum = 90;BA.debugLine="Dim json As String";
Debug.ShouldStop(33554432);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 92;BA.debugLine="prod.Initialize()";
Debug.ShouldStop(134217728);
_prod.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 93;BA.debugLine="json = $\"{         \"id\": ${id},         \"nombre\":";
Debug.ShouldStop(268435456);
_json = (RemoteObject.concat(RemoteObject.createImmutable("{\n"),RemoteObject.createImmutable("        \"id\": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable(",\n"),RemoteObject.createImmutable("        \"nombre\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombre))),RemoteObject.createImmutable("\",\n"),RemoteObject.createImmutable("        \"existencia\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_existencia))),RemoteObject.createImmutable("\",\n"),RemoteObject.createImmutable("        \"precioUnitario\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_preciounitario))),RemoteObject.createImmutable("\",\n"),RemoteObject.createImmutable("        \"iva\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_iva))),RemoteObject.createImmutable("\",\n"),RemoteObject.createImmutable("        \"clasificacionId\": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clasificacionid))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("    }")));Debug.locals.put("json", _json);
 BA.debugLineNum = 102;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(32);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 103;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
Debug.ShouldStop(64);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json));
 BA.debugLineNum = 104;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(128);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 106;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productos", "update"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 107;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
}