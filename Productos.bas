B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13
@EndOfDesignText@
Sub Class_Globals
	Private db As SQL
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize( fileName As String)
	db.Initialize( File.DirInternal, fileName , True)
	db.ExecNonQuery("CREATE TABLE IF NOT EXISTS productos( id INT PRIMARY KEY, descripcion TEXT(50), precioUnitario NUMBER(10,3), iva NUMBER(10,3), existencia NUMBER(10,3) )")
End Sub

Public Sub Create( id As Int, descripcion As String, precioUnitario As Double, iva As Double, existencia As Double) As Producto
	db.ExecNonQuery2("INSERT INTO productos (id, descripcion, precioUnitario, iva, existencia) VALUES (?,?,?,?,?)", Array As Object(id, descripcion, precioUnitario, iva, existencia) )
	Dim data As Producto
	data.Initialize
	data.Id = id
	data.Nombre = descripcion
	data.PrecioUnitario = precioUnitario
	data.IVA = iva
	data.Existencia = existencia
	Return data
End Sub

Public Sub Read_All() As List
	Dim cursor As Cursor
	Dim datos As List
	datos.Initialize
	
	cursor = db.ExecQuery("SELECT * FROM productos ORDER BY descripcion")
	For i=0 To cursor.RowCount - 1
		cursor.Position = i
		Dim record As Producto
		record.Initialize
		record.Id = cursor.GetInt("id")
		record.Nombre = cursor.GetString("descripcion")
		record.PrecioUnitario = cursor.GetDouble("precioUnitario")
		record.IVA = cursor.GetDouble("iva")
		record.Existencia = cursor.GetDouble("existencia")
		datos.Add(record)
	Next
	Return datos
End Sub

Public Sub Read_ById(id As Int) As Producto
	Dim cursor As Cursor
	Dim datos As Producto
	datos.Initialize
	
	cursor = db.ExecQuery("SELECT * FROM productos WHERE id = " & id)
	If cursor.RowCount > 0 Then
		cursor.Position = 0
		datos.Id = cursor.GetInt("id")
		datos.Nombre = cursor.GetString("descripcion")
		datos.PrecioUnitario = cursor.GetDouble("precioUnitario")
		datos.IVA = cursor.GetDouble("iva")
		datos.Existencia = cursor.GetDouble("existencia")	
	End If
	Return datos
End Sub

Public Sub Update( id As Int, descripcion As String, precioUnitario As Double, iva As Double, existencia As Double) As Boolean
	Try
		db.ExecNonQuery2("UPDATE productos SET descripcion = ?, precioUnitario = ?, iva = ?, existencia =? WHERE id = ?", Array As Object( descripcion, precioUnitario, iva, existencia, id) )
		Return True
	Catch
		Return False
	End Try	
End Sub

Public Sub Delete(id As Int) As Boolean
	Try
		db.ExecNonQuery("DELETE FROM productos WHERE id = " & id )
		Return True
	Catch
		Return False
	End Try
End Sub