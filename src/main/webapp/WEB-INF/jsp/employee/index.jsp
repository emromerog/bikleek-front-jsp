<%@ include file="../common/header.jsp"%>
<%@ include file="../common/navigation.jsp"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/employees/create">Agregar Empleado</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>Listado de Empleados</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped" style="width: 100%">
				<thead>
					<tr>
						<th>Id</th>
						<th>Primer Nombre</th>
						<th>Apellidos</th>
						<th>Email</th>
						<th>Identificación</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="employee" items="${employees}">
						<tr>
							<td>${employee.id}</td>
							<td>${employee.firstName}</td>
							<td>${employee.lastName}</td>
							<td>${employee.email}</td>
							<td>${employee.identification}</td>
							<td><a type="button" class="btn btn-success"
								href="/employees/edit/${employee.id}">Editar</a></td>
							<td><a type="button" class="btn btn-warning" 
								href="/employees/delete/${employee.id}">Eliminar</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="../common/footer.jsp"%>