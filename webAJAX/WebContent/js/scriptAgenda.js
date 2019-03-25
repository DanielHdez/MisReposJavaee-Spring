onload=llamadaAjax;

function llamadaAjax(fichero) {     
   //Paso 1:_
	var xhr = new XMLHttpRequest();
    var agenda;
    var resultado = "";
    
    //Paso 3:
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4) {
            if (xhr.status == 200) {
            	agenda = JSON.parse(xhr.responseText); //Convierte un texto que te devuelve xhr.responseText a json 
            	resultado = "<table>";
            	for (var i in agenda) {
            		resultado = resultado + "<tr>";
            		resultado = resultado + "<td>" + agenda[i].nombre + "</td>";
            		resultado = resultado + "<td>" + agenda[i].tlf + "</td>";
            		resultado = resultado + "<td>" + agenda[i].domicilio + "</td>";
            		resultado = resultado + "</tr>";
            	}
            	resultado = resultado + "</table>";
            	document.getElementById("agenda").innerHTML = resultado;
            }
            else {
            	resultado = "No se ha podido leer el archivo JSON";
            }
        }
    }
  //Paso 2
    var url = "agenda.json";  //la ruta es relativa al index
    //xhr.open("GET", url);
    xhr.open("post", url);
    xhr.send();
}