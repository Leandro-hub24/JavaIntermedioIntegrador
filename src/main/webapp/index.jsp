<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.util.List" %>   
 <%@page import="org.hibernate.*" %> 
 <%@page import="models.Cliente" %> 
 <%@page import="controller.ClienteController" %> 


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IntegradorJava</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<% ClienteController ClienteCont = new ClienteController();
	
	List<Cliente> clienteLista = ClienteCont.ListadoClientes(); 
	
	
	%>
	<div class="d-flex justify-content-center">
		<h1 class="fw-bolder">LISTA DE CLIENTES</h1>
	</div>

	<div class="container d-flex flex-column" >
	
	<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">NOMBRE</th>
      <th scope="col">APELLIDO</th>
      <th scope="col">CUIT</th>
      <th scope="col">RAZÓN SOCIAL</th>
      <th scope="col">ACCIONES</th>
    </tr>
  </thead>
  <tbody>
  
  				<%
  				int i;
  				for( i=0; i < clienteLista.size(); i++) { %>

				<tr>
					<th scope="row"><%=clienteLista.get(i).getId()%></th>
					<td><%=clienteLista.get(i).getNombre() %></td>
					<td><%=clienteLista.get(i).getApellido() %></td>
					<td><%=clienteLista.get(i).getCuit()%></td>
					<td><%=clienteLista.get(i).getRazonSocial() %></td>
					<td><a id="btn-eliminar" href="EliminarCliente?id=<%=clienteLista.get(i).getId()%>"
						class="btn btn-danger">ELIMINAR</a>
				</tr>


				<%
}
%>
  
  </tbody>
</table>

		<div class="d-flex justify-content-end mb-3">
			<button id="nuevo" class="btn btn-warning" onclick="abrirNuevo()">
				NUEVO</button>
		</div>
		</div>
		<div id="" class="container mb-3">

		<div id="form-nuevo" class="row d-none">
			<div class="col-lg-2"></div>
			<div class="col-lg-8">






				<div class="modal fade" id="exampleModal" tabindex="-1"
					aria-labelledby="exampleModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title" id="exampleModalLabel">....</h5>
								<button type="button" class="btn-close" data-bs-dismiss="modal"
									aria-label="Close"></button>
							</div>
							<div id="modal-body"
								class="modal-body text-center pb-0 mb-0 fw-bold text-danger">

								<form id="form-action" method="post" action="AddCliente">
									<div
										class="mb-3 d-flex flex-column gap-3 justify-content-spacebetween">
	
										<input type="text" class="form-control" name="id"
											id="id" placeholder="id" readonly>
										<input type="text" class="form-control" name="nombre"
											id="nombre" placeholder="Nombre">
										<input type="text" class="form-control" name="apellido"
											id="apellido" placeholder="Apellido">
										<input type="text" class="form-control" name="cuit"
											id="cuit" placeholder="Cuit">
										<input type="text" class="form-control" name="razon"
											id="razon" placeholder="Razón Social">
								
									
										
											<button id="btn-enviar" type="submit" class="btn btn-success w-100">Enviar</button>
									</div>
										
							

								</form>



							</div>

							
						</div>
					</div>
				</div>
			</div>

			<div class="col-lg-2"></div>



		</div>

	</div>

	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	<script type="text/javascript" src="js/index.js"></script>
</body>
</html>