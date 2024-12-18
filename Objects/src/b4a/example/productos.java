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
public anywheresoftware.b4a.sql.SQL _db = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.productos __ref,anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_filename}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Initialize( fileName As String)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="db.Initialize( File.DirInternal, fileName , True)";
__ref._db /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__c.File.getDirInternal(),_filename,__c.True);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="db.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS produ";
__ref._db /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE IF NOT EXISTS productos( id INT PRIMARY KEY, descripcion TEXT(50), precioUnitario NUMBER(10,3), iva NUMBER(10,3), existencia NUMBER(10,3) )");
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="End Sub";
return "";
}
public b4a.example.producto  _create(b4a.example.productos __ref,int _id,String _descripcion,double _preciounitario,double _iva,double _existencia) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "create", new Object[] {_id,_descripcion,_preciounitario,_iva,_existencia}));}
b4a.example.producto _data = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub Create( id As Int, descripcion As Strin";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="db.ExecNonQuery2(\"INSERT INTO productos (id, desc";
__ref._db /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO productos (id, descripcion, precioUnitario, iva, existencia) VALUES (?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id),(Object)(_descripcion),(Object)(_preciounitario),(Object)(_iva),(Object)(_existencia)}));
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Dim data As Producto";
_data = new b4a.example.producto();
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="data.Initialize";
_data._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="data.Id = id";
_data._id /*int*/  = _id;
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="data.Nombre = descripcion";
_data._nombre /*String*/  = _descripcion;
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="data.PrecioUnitario = precioUnitario";
_data._preciounitario /*double*/  = _preciounitario;
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="data.IVA = iva";
_data._iva /*double*/  = _iva;
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="data.Existencia = existencia";
_data._existencia /*double*/  = _existencia;
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="End Sub";
return null;
}
public boolean  _delete(b4a.example.productos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((Boolean) Debug.delegate(ba, "delete", new Object[] {_id}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub Delete(id As Int) As Boolean";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Try";
try {RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="db.ExecNonQuery(\"DELETE FROM productos WHERE id";
__ref._db /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM productos WHERE id = "+BA.NumberToString(_id));
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="End Sub";
return false;
}
public b4a.example.producto  _read_byid(b4a.example.productos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
b4a.example.producto _datos = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub Read_ById(id As Int) As Producto";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Dim datos As Producto";
_datos = new b4a.example.producto();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="datos.Initialize";
_datos._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="cursor = db.ExecQuery(\"SELECT * FROM productos WH";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._db /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM productos WHERE id = "+BA.NumberToString(_id))));
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="If cursor.RowCount > 0 Then";
if (_cursor.getRowCount()>0) { 
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="cursor.Position = 0";
_cursor.setPosition((int) (0));
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="datos.Id = cursor.GetInt(\"id\")";
_datos._id /*int*/  = _cursor.GetInt("id");
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="datos.Nombre = cursor.GetString(\"descripcion\")";
_datos._nombre /*String*/  = _cursor.GetString("descripcion");
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="datos.PrecioUnitario = cursor.GetDouble(\"precioU";
_datos._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="datos.IVA = cursor.GetDouble(\"iva\")";
_datos._iva /*double*/  = _cursor.GetDouble("iva");
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="datos.Existencia = cursor.GetDouble(\"existencia\"";
_datos._existencia /*double*/  = _cursor.GetDouble("existencia");
 };
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="Return datos";
if (true) return _datos;
RDebugUtils.currentLine=2228239;
 //BA.debugLineNum = 2228239;BA.debugLine="End Sub";
return null;
}
public boolean  _update(b4a.example.productos __ref,int _id,String _descripcion,double _preciounitario,double _iva,double _existencia) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((Boolean) Debug.delegate(ba, "update", new Object[] {_id,_descripcion,_preciounitario,_iva,_existencia}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub Update( id As Int, descripcion As Strin";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Try";
try {RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="db.ExecNonQuery2(\"UPDATE productos SET descripci";
__ref._db /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("UPDATE productos SET descripcion = ?, precioUnitario = ?, iva = ?, existencia =? WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_descripcion),(Object)(_preciounitario),(Object)(_iva),(Object)(_existencia),(Object)(_id)}));
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.example.productos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Private db As SQL";
_db = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _read_all(b4a.example.productos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "read_all", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
anywheresoftware.b4a.objects.collections.List _datos = null;
int _i = 0;
b4a.example.producto _record = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub Read_All() As List";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Dim datos As List";
_datos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="datos.Initialize";
_datos.Initialize();
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="cursor = db.ExecQuery(\"SELECT * FROM productos OR";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._db /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM productos ORDER BY descripcion")));
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="For i=0 To cursor.RowCount - 1";
{
final int step5 = 1;
final int limit5 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="Dim record As Producto";
_record = new b4a.example.producto();
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="record.Initialize";
_record._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="record.Id = cursor.GetInt(\"id\")";
_record._id /*int*/  = _cursor.GetInt("id");
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="record.Nombre = cursor.GetString(\"descripcion\")";
_record._nombre /*String*/  = _cursor.GetString("descripcion");
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="record.PrecioUnitario = cursor.GetDouble(\"precio";
_record._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="record.IVA = cursor.GetDouble(\"iva\")";
_record._iva /*double*/  = _cursor.GetDouble("iva");
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="record.Existencia = cursor.GetDouble(\"existencia";
_record._existencia /*double*/  = _cursor.GetDouble("existencia");
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="datos.Add(record)";
_datos.Add((Object)(_record));
 }
};
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="Return datos";
if (true) return _datos;
RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="End Sub";
return null;
}
}