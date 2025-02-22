﻿B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private txtId As EditText
	Private txtNombre As EditText
	Private txtExistencia As EditText
	Private txtPrecioUnitario As EditText
	Private txtIva As EditText
	Private txtClasificacionId As EditText
	Private apiClas As Productos
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("PageProductos")
	apiClas.Initialize("https://cloudcomputingapi2.azurewebsites.net/api/Productos")
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub cmdBuscar_Click
	Wait For (apiClas.Read_ById(txtId.Text)) Complete (r As Producto)
	If r.Id > 0 Then
		
		txtId.Text = r.Id
		txtNombre.Text= r.Nombre
		txtExistencia.Text = r.Existencia
		txtPrecioUnitario.Text = r.PrecioUnitario
		txtIva.Text = r.IVA
		txtClasificacionId.Text = r.ClasificacionId
		Msgbox("Registro Encontrado con éxito", "OK")
	Else
		Msgbox("No hay datos","Error")
	End If
End Sub

Private Sub cmdCrear_Click
	Wait For (apiClas.Create(0,txtNombre.Text, txtExistencia.Text, txtPrecioUnitario.Text, txtIva.Text, txtClasificacionId.Text)) Complete (c As Producto)
	If c.Id> 0 Then
		txtId.Text = c.Id
		Msgbox("Registro Creado", "OK")
	Else
		Msgbox("No se pudo insertar el registro","OK")
	End If
End Sub

Private Sub cmdActualizar_Click
	Wait For (apiClas.Update(txtId.Text, txtNombre.Text, txtExistencia.Text, txtPrecioUnitario.Text, txtIva.Text, txtClasificacionId.Text)) Complete (r As Boolean)
	If r = True Then
		Msgbox("Registro Actualizado", "OK")
	Else
		Msgbox("No hay datos","Error")
	End If
End Sub

Private Sub cmdEliminar_Click
	Wait For (apiClas.Delete(txtId.Text)) Complete (r As Boolean)
	If r = True Then
		Msgbox("Registro Eliminado", "OK")
		txtId.Text = ""
		txtNombre.Text = ""
		txtExistencia.Text = ""
		txtPrecioUnitario.Text = ""
		txtIva.Text = ""
		txtClasificacionId.Text = ""
	Else
		Msgbox("No hay datos","Error")
	End If
End Sub

Private Sub cmdMenu_Click
	B4XPages.ShowPage("MainPage")
End Sub