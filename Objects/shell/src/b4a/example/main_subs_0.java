package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="p.Initialize(\"tienda.db\")";
Debug.ShouldStop(1);
main.mostCurrent._p.runClassMethod (b4a.example.productos.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(RemoteObject.createImmutable("tienda.db")));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,77);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 77;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,73);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 73;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmdcrear_click() throws Exception{
try {
		Debug.PushSubsStack("cmdCrear_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,116);
if (RapidSub.canDelegate("cmdcrear_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmdcrear_click");}
RemoteObject _r = RemoteObject.declareNull("b4a.example.producto");
 BA.debugLineNum = 116;BA.debugLine="Private Sub cmdCrear_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Dim r As Producto = p.Create( txtID.Text, txtDesc";
Debug.ShouldStop(1048576);
_r = main.mostCurrent._p.runClassMethod (b4a.example.productos.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(main.mostCurrent._txtdescripcion.runMethod(true,"getText")),(Object)(BA.numberCast(double.class, main.mostCurrent._txtpreciounitario.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtiva.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtexistencia.runMethod(true,"getText"))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 118;BA.debugLine="If r.Id > 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_r.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 119;BA.debugLine="xui.MsgboxAsync(\"registro creado !!\", \"OK\")";
Debug.ShouldStop(4194304);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("registro creado !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))));
 }else {
 BA.debugLineNum = 121;BA.debugLine="xui.MsgboxAsync(\"registro NO creado\", \"ERROR \")";
Debug.ShouldStop(16777216);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("registro NO creado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR "))));
 };
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmddelete_click() throws Exception{
try {
		Debug.PushSubsStack("cmdDelete_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,81);
if (RapidSub.canDelegate("cmddelete_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmddelete_click");}
RemoteObject _r = RemoteObject.createImmutable(false);
 BA.debugLineNum = 81;BA.debugLine="Private Sub cmdDelete_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Dim r As Boolean = p.Delete( txtID.Text )";
Debug.ShouldStop(131072);
_r = main.mostCurrent._p.runClassMethod (b4a.example.productos.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 83;BA.debugLine="If r Then";
Debug.ShouldStop(262144);
if (_r.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 84;BA.debugLine="xui.MsgboxAsync(\"registro borrado\", \"OK\")";
Debug.ShouldStop(524288);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("registro borrado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))));
 BA.debugLineNum = 85;BA.debugLine="txtID.Text = \"\"";
Debug.ShouldStop(1048576);
main.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 86;BA.debugLine="txtDescripcion.Text = \"\"";
Debug.ShouldStop(2097152);
main.mostCurrent._txtdescripcion.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 87;BA.debugLine="txtPrecioUnitario.Text = \"\"";
Debug.ShouldStop(4194304);
main.mostCurrent._txtpreciounitario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 88;BA.debugLine="txtIVA.Text = \"\"";
Debug.ShouldStop(8388608);
main.mostCurrent._txtiva.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 89;BA.debugLine="txtExistencia.Text = \"\"";
Debug.ShouldStop(16777216);
main.mostCurrent._txtexistencia.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }else {
 BA.debugLineNum = 91;BA.debugLine="xui.MsgboxAsync(\"registro NO borrado\", \"ERROR \")";
Debug.ShouldStop(67108864);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("registro NO borrado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR "))));
 };
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmdread_click() throws Exception{
try {
		Debug.PushSubsStack("cmdRead_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,104);
if (RapidSub.canDelegate("cmdread_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmdread_click");}
RemoteObject _r = RemoteObject.declareNull("b4a.example.producto");
 BA.debugLineNum = 104;BA.debugLine="Private Sub cmdRead_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="Dim r As Producto = p.Read_ById( txtID.Text )";
Debug.ShouldStop(256);
_r = main.mostCurrent._p.runClassMethod (b4a.example.productos.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 106;BA.debugLine="If r.Id > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_r.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 107;BA.debugLine="txtDescripcion.Text = r.Nombre";
Debug.ShouldStop(1024);
main.mostCurrent._txtdescripcion.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 108;BA.debugLine="txtPrecioUnitario.Text = r.PrecioUnitario";
Debug.ShouldStop(2048);
main.mostCurrent._txtpreciounitario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_preciounitario" /*RemoteObject*/ )));
 BA.debugLineNum = 109;BA.debugLine="txtIVA.Text = r.IVA";
Debug.ShouldStop(4096);
main.mostCurrent._txtiva.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_iva" /*RemoteObject*/ )));
 BA.debugLineNum = 110;BA.debugLine="txtExistencia.Text = r.Existencia";
Debug.ShouldStop(8192);
main.mostCurrent._txtexistencia.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_existencia" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 112;BA.debugLine="xui.MsgboxAsync(\"registro NO encontrado\", \"ERROR";
Debug.ShouldStop(32768);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("registro NO encontrado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR "))));
 };
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmdupdate_click() throws Exception{
try {
		Debug.PushSubsStack("cmdUpdate_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,95);
if (RapidSub.canDelegate("cmdupdate_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmdupdate_click");}
RemoteObject _r = RemoteObject.createImmutable(false);
 BA.debugLineNum = 95;BA.debugLine="Private Sub cmdUpdate_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Dim r As Boolean = p.Update( txtID.Text, txtDescr";
Debug.ShouldStop(-2147483648);
_r = main.mostCurrent._p.runClassMethod (b4a.example.productos.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(main.mostCurrent._txtdescripcion.runMethod(true,"getText")),(Object)(BA.numberCast(double.class, main.mostCurrent._txtpreciounitario.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtiva.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtexistencia.runMethod(true,"getText"))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 97;BA.debugLine="If r Then";
Debug.ShouldStop(1);
if (_r.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 98;BA.debugLine="xui.MsgboxAsync(\"registro actualizado\", \"OK\")";
Debug.ShouldStop(2);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("registro actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))));
 }else {
 BA.debugLineNum = 100;BA.debugLine="xui.MsgboxAsync(\"registro NO actualizado\", \"ERRO";
Debug.ShouldStop(8);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("registro NO actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR "))));
 };
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private txtID As EditText";
main.mostCurrent._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private txtDescripcion As EditText";
main.mostCurrent._txtdescripcion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txtPrecioUnitario As EditText";
main.mostCurrent._txtpreciounitario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txtIVA As EditText";
main.mostCurrent._txtiva = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private txtExistencia As EditText";
main.mostCurrent._txtexistencia = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private p As Productos";
main.mostCurrent._p = RemoteObject.createNew ("b4a.example.productos");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
producto.myClass = BA.getDeviceClass ("b4a.example.producto");
productos.myClass = BA.getDeviceClass ("b4a.example.productos");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}