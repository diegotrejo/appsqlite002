package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class productos_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private db As SQL";
productos._db = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_db",productos._db);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _descripcion,RemoteObject _preciounitario,RemoteObject _iva,RemoteObject _existencia) throws Exception{
try {
		Debug.PushSubsStack("Create (productos) ","productos",3,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "productos","create", __ref, _id, _descripcion, _preciounitario, _iva, _existencia);}
RemoteObject _data = RemoteObject.declareNull("b4a.example.producto");
Debug.locals.put("id", _id);
Debug.locals.put("descripcion", _descripcion);
Debug.locals.put("precioUnitario", _preciounitario);
Debug.locals.put("iva", _iva);
Debug.locals.put("existencia", _existencia);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Create( id As Int, descripcion As Strin";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="db.ExecNonQuery2(\"INSERT INTO productos (id, desc";
Debug.ShouldStop(2048);
__ref.getField(false,"_db" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO productos (id, descripcion, precioUnitario, iva, existencia) VALUES (?,?,?,?,?)")),(Object)(productos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_id),(_descripcion),(_preciounitario),(_iva),(_existencia)})))));
 BA.debugLineNum = 13;BA.debugLine="Dim data As Producto";
Debug.ShouldStop(4096);
_data = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("data", _data);
 BA.debugLineNum = 14;BA.debugLine="data.Initialize";
Debug.ShouldStop(8192);
_data.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 15;BA.debugLine="data.Id = id";
Debug.ShouldStop(16384);
_data.setField ("_id" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 16;BA.debugLine="data.Nombre = descripcion";
Debug.ShouldStop(32768);
_data.setField ("_nombre" /*RemoteObject*/ ,_descripcion);
 BA.debugLineNum = 17;BA.debugLine="data.PrecioUnitario = precioUnitario";
Debug.ShouldStop(65536);
_data.setField ("_preciounitario" /*RemoteObject*/ ,_preciounitario);
 BA.debugLineNum = 18;BA.debugLine="data.IVA = iva";
Debug.ShouldStop(131072);
_data.setField ("_iva" /*RemoteObject*/ ,_iva);
 BA.debugLineNum = 19;BA.debugLine="data.Existencia = existencia";
Debug.ShouldStop(262144);
_data.setField ("_existencia" /*RemoteObject*/ ,_existencia);
 BA.debugLineNum = 20;BA.debugLine="Return data";
Debug.ShouldStop(524288);
if (true) return _data;
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (productos) ","productos",3,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "productos","delete", __ref, _id);}
Debug.locals.put("id", _id);
 BA.debugLineNum = 69;BA.debugLine="Public Sub Delete(id As Int) As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 71;BA.debugLine="db.ExecNonQuery(\"DELETE FROM productos WHERE id";
Debug.ShouldStop(64);
__ref.getField(false,"_db" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM productos WHERE id = "),_id)));
 BA.debugLineNum = 72;BA.debugLine="Return True";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) return productos.__c.getField(true,"True");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 74;BA.debugLine="Return False";
Debug.ShouldStop(512);
if (true) return productos.__c.getField(true,"False");
 };
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Initialize (productos) ","productos",3,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "productos","initialize", __ref, _ba, _filename);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize( fileName As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="db.Initialize( File.DirInternal, fileName , True)";
Debug.ShouldStop(64);
__ref.getField(false,"_db" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(productos.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename),(Object)(productos.__c.getField(true,"True")));
 BA.debugLineNum = 8;BA.debugLine="db.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS produ";
Debug.ShouldStop(128);
__ref.getField(false,"_db" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS productos( id INT PRIMARY KEY, descripcion TEXT(50), precioUnitario NUMBER(10,3), iva NUMBER(10,3), existencia NUMBER(10,3) )")));
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Read_All (productos) ","productos",3,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "productos","read_all", __ref);}
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _datos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _record = RemoteObject.declareNull("b4a.example.producto");
 BA.debugLineNum = 23;BA.debugLine="Public Sub Read_All() As List";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(8388608);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 25;BA.debugLine="Dim datos As List";
Debug.ShouldStop(16777216);
_datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("datos", _datos);
 BA.debugLineNum = 26;BA.debugLine="datos.Initialize";
Debug.ShouldStop(33554432);
_datos.runVoidMethod ("Initialize");
 BA.debugLineNum = 28;BA.debugLine="cursor = db.ExecQuery(\"SELECT * FROM productos OR";
Debug.ShouldStop(134217728);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_db" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM productos ORDER BY descripcion"))));Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 29;BA.debugLine="For i=0 To cursor.RowCount - 1";
Debug.ShouldStop(268435456);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 30;BA.debugLine="cursor.Position = i";
Debug.ShouldStop(536870912);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 31;BA.debugLine="Dim record As Producto";
Debug.ShouldStop(1073741824);
_record = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("record", _record);
 BA.debugLineNum = 32;BA.debugLine="record.Initialize";
Debug.ShouldStop(-2147483648);
_record.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 33;BA.debugLine="record.Id = cursor.GetInt(\"id\")";
Debug.ShouldStop(1);
_record.setField ("_id" /*RemoteObject*/ ,_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 34;BA.debugLine="record.Nombre = cursor.GetString(\"descripcion\")";
Debug.ShouldStop(2);
_record.setField ("_nombre" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("descripcion"))));
 BA.debugLineNum = 35;BA.debugLine="record.PrecioUnitario = cursor.GetDouble(\"precio";
Debug.ShouldStop(4);
_record.setField ("_preciounitario" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("precioUnitario"))));
 BA.debugLineNum = 36;BA.debugLine="record.IVA = cursor.GetDouble(\"iva\")";
Debug.ShouldStop(8);
_record.setField ("_iva" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("iva"))));
 BA.debugLineNum = 37;BA.debugLine="record.Existencia = cursor.GetDouble(\"existencia";
Debug.ShouldStop(16);
_record.setField ("_existencia" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("existencia"))));
 BA.debugLineNum = 38;BA.debugLine="datos.Add(record)";
Debug.ShouldStop(32);
_datos.runVoidMethod ("Add",(Object)((_record)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 40;BA.debugLine="Return datos";
Debug.ShouldStop(128);
if (true) return _datos;
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_byid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (productos) ","productos",3,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "productos","read_byid", __ref, _id);}
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _datos = RemoteObject.declareNull("b4a.example.producto");
Debug.locals.put("id", _id);
 BA.debugLineNum = 43;BA.debugLine="Public Sub Read_ById(id As Int) As Producto";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(2048);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 45;BA.debugLine="Dim datos As Producto";
Debug.ShouldStop(4096);
_datos = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("datos", _datos);
 BA.debugLineNum = 46;BA.debugLine="datos.Initialize";
Debug.ShouldStop(8192);
_datos.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 48;BA.debugLine="cursor = db.ExecQuery(\"SELECT * FROM productos WH";
Debug.ShouldStop(32768);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_db" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM productos WHERE id = "),_id))));Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 49;BA.debugLine="If cursor.RowCount > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_cursor.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 50;BA.debugLine="cursor.Position = 0";
Debug.ShouldStop(131072);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 51;BA.debugLine="datos.Id = cursor.GetInt(\"id\")";
Debug.ShouldStop(262144);
_datos.setField ("_id" /*RemoteObject*/ ,_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 52;BA.debugLine="datos.Nombre = cursor.GetString(\"descripcion\")";
Debug.ShouldStop(524288);
_datos.setField ("_nombre" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("descripcion"))));
 BA.debugLineNum = 53;BA.debugLine="datos.PrecioUnitario = cursor.GetDouble(\"precioU";
Debug.ShouldStop(1048576);
_datos.setField ("_preciounitario" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("precioUnitario"))));
 BA.debugLineNum = 54;BA.debugLine="datos.IVA = cursor.GetDouble(\"iva\")";
Debug.ShouldStop(2097152);
_datos.setField ("_iva" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("iva"))));
 BA.debugLineNum = 55;BA.debugLine="datos.Existencia = cursor.GetDouble(\"existencia\"";
Debug.ShouldStop(4194304);
_datos.setField ("_existencia" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("existencia"))));
 };
 BA.debugLineNum = 57;BA.debugLine="Return datos";
Debug.ShouldStop(16777216);
if (true) return _datos;
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _descripcion,RemoteObject _preciounitario,RemoteObject _iva,RemoteObject _existencia) throws Exception{
try {
		Debug.PushSubsStack("Update (productos) ","productos",3,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "productos","update", __ref, _id, _descripcion, _preciounitario, _iva, _existencia);}
Debug.locals.put("id", _id);
Debug.locals.put("descripcion", _descripcion);
Debug.locals.put("precioUnitario", _preciounitario);
Debug.locals.put("iva", _iva);
Debug.locals.put("existencia", _existencia);
 BA.debugLineNum = 60;BA.debugLine="Public Sub Update( id As Int, descripcion As Strin";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 62;BA.debugLine="db.ExecNonQuery2(\"UPDATE productos SET descripci";
Debug.ShouldStop(536870912);
__ref.getField(false,"_db" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE productos SET descripcion = ?, precioUnitario = ?, iva = ?, existencia =? WHERE id = ?")),(Object)(productos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_descripcion),(_preciounitario),(_iva),(_existencia),(_id)})))));
 BA.debugLineNum = 63;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return productos.__c.getField(true,"True");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 65;BA.debugLine="Return False";
Debug.ShouldStop(1);
if (true) return productos.__c.getField(true,"False");
 };
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}