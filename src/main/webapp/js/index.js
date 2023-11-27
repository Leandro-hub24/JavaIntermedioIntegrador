/**
 * 
 */
function abrirNuevo(){

	  document.getElementById("form-nuevo").className = "row" ;
	  document.getElementById("form-action").setAttribute('action', 'AddCliente')
	  document.getElementById("id").className = "d-none"
	  document.getElementById("exampleModalLabel").innerHTML = "NUEVO REGISTRO"
	  var myModal = new bootstrap.Modal(document.getElementById('exampleModal'), {
            keyboard: false
        })
        
        myModal.show()
	  
	  
	  limpiarForm();

	}

	
function limpiarForm(){
	 document.getElementById("nombre").value = ""
	 document.getElementById("apellido").value = ""
	 document.getElementById("cuit").value = ""
	 document.getElementById("id").value = "d-none"
	 document.getElementById("id").value = ""
	 document.getElementById("razon").value = ""
}

