/**
 * 
 */
function llamadaAjax() {     
    var xhr = new XMLHttpRequest(); //objeto necesario para llamar a ajax

    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4) {
            if (xhr.status == 200)
            	document.getElementById("precio").innerHTML = xhr.responseText;
            else
            	document.getElementById("precio").innerHTML = "Error AJAX";
        }
    }

    var url = "index2"; //nombre del servlet
    var ciudad = document.getElementsByName("ciudad").value;
    var calefa= document.getElementsByName("calefaccion").value;
    var piscina = document.getElementsByName("piscina").value;
    var ac = document.getElementsByName("ac").value;
    var empleado = document.getElementsByName("empleado").value;
    var parametros = "?ciudad=" +ciudad + "&calefaccion=" + calefa + "&piscina=" + piscina + "&ac="+ac+ "&empleado="+empleado;
    url = url + parametros;
    
    xhr.open("GET", url);
    xhr.send(); //envia la peticion al servidor 
}