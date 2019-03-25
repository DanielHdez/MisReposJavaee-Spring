
/*$(document).ready(function () { //cuando el documento este totalmente cargado ejecura esto
    $("#comprobar").click(function () {
        var url = "Triangulo";
        var l1 = document.getElementById("lado1").value;
        var l2 = document.getElementById("lado2").value;
        var l3 = document.getElementById("lado3").value;
        var parametros = "?lado1=" + l1 + "&lado2=" + l2 + "&lado3=" + l3;
        url = url + parametros;
        $("#resultado").load(url);
    });
});

*/
$(document).ready(function () {
    $("#comprobar").click(function () {
    	document.getElementById("resultado").style.display = ""
        var ruta = "Tabla"; //Servlet
        var numero = document.getElementById("numero").value;
        var parametros = "?numero=" + numero;
        ruta = ruta + parametros;
        
        
        $.ajax({
        	url: ruta,
        	success: function(respuesta) {
        		$("#resultado").html(respuesta);
        	},
        	error: function() {
        		$("#resultado").text("Error ajax");
            }
        });
    });
});