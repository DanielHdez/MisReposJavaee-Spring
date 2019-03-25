function llamadaAjax() {     
    var xhr = new XMLHttpRequest(); //objeto necesario para llamar a ajax

    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4) { //Esta en estado finalizado 
            if (xhr.status == 200) //Que esta ok
            	document.getElementById("resultado").innerHTML = xhr.responseText;
            else
            	document.getElementById("resultado").innerHTML = "Error AJAX";
        }
    }

    var url = "Triangulo"; //nombre del servlet
    var l1 = document.getElementById("lado1").value;
    var l2 = document.getElementById("lado2").value;
    var l3 = document.getElementById("lado3").value;
    var parametros = "?lado1=" + l1 + "&lado2=" + l2 + "&lado3=" + l3;
    url = url + parametros;
    
    xhr.open("GET", url);
    xhr.send(); //envia la peticion al servidor 
}