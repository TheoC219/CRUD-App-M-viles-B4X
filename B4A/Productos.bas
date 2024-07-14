B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private jsonParser As JSONParser
	Private apiJob As HttpJob
	Public apiURL As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(url As String)
	apiURL = url
End Sub

Public Sub Create(id As Int, nombre As String, existencia As Double, precioUnitario As Double, iva As Double, clasificacionId As Int) As ResumableSub
	Dim prod As Producto
	Dim json As String
	Dim data As Map
    
	prod.Initialize()
	json = "{'id': " & id & ", 'nombre': '" & nombre & "', 'existencia': '" & existencia & "', 'precioUnitario': '" & precioUnitario & "', 'iva': '" & iva & "', 'clasificacionId': '" & clasificacionId & "'}"
    
	apiJob.Initialize("", Me)
	apiJob.PostString(apiURL, json)
	apiJob.GetRequest.SetContentType("application/json")
	Wait For(apiJob) jobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		data = jsonParser.NextObject
		prod.Id = data.Get("id")
		prod.Nombre = data.Get("nombre")
		prod.Existencia = data.Get("existencia")
		prod.PrecioUnitario = data.Get("precioUnitario")
		prod.IVA = data.Get("iva")
		prod.ClasificacionId = data.Get("clasificacionId")
	End If
	Return prod
End Sub

Public Sub Read_All() As ResumableSub
	Dim p As List
	Dim prod As Producto
	Dim map As Map
	Dim lst As List
    
	p.Initialize
    
	apiJob.Initialize("", Me)
	apiJob.Download(apiURL)
	Wait For(apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		lst = jsonParser.NextArray
		For i = 0 To lst.Size - 1
			map = lst.Get(i)
			prod.Initialize
			prod.Id = map.Get("id")
			prod.Nombre = map.Get("nombre")
			prod.Existencia = map.Get("existencia")
			prod.PrecioUnitario = map.Get("precioUnitario")
			prod.IVA = map.Get("iva")
			prod.ClasificacionId = map.Get("clasificacionId")
            
			p.Add(prod)
		Next
	End If
    
	Return p
End Sub

Public Sub Read_ById(id As Int) As ResumableSub
	Dim prod As Producto
	prod.Initialize
    
	apiJob.Initialize("", Me)
	apiJob.Download(apiURL & "/" & id)
	Wait For (apiJob) jobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		Dim map As Map = jsonParser.NextObject
		prod.Id = map.Get("id")
		prod.Nombre = map.Get("nombre")
		prod.Existencia = map.Get("existencia")
		prod.PrecioUnitario = map.Get("precioUnitario")
		prod.IVA = map.Get("iva")
		prod.ClasificacionId = map.Get("clasificacionId")
	End If
	Return prod
End Sub

Public Sub Update(id As Int, nombre As String, existencia As Double, precioUnitario As Double, iva As Double, clasificacionId As Int) As ResumableSub
	Dim prod As Producto
	Dim json As String
    
	prod.Initialize()
	json = $"{
        "id": ${id},
        "nombre": "${nombre}",
        "existencia": "${existencia}",
        "precioUnitario": "${precioUnitario}",
        "iva": "${iva}",
        "clasificacionId": ${clasificacionId}
    }"$
	
	apiJob.Initialize("", Me)
	apiJob.PutString(apiURL & "/" & id, json)
	apiJob.GetRequest.SetContentType("application/json")
    
	Wait For(apiJob) jobDone(resultado As HttpJob)
	Return resultado.Success
End Sub

Public Sub Delete(id As Int) As ResumableSub
	apiJob.Initialize("", Me)
	apiJob.Delete(apiURL & "/" & id)
    
	Wait For(apiJob) jobDone(resultado As HttpJob)
	Return resultado.Success
End Sub