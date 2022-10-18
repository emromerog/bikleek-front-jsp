<%@ include file="../common/header.jsp"%>
<%@ include file="../common/navigation.jsp"%>

<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3>Agregar Empleado</h3>
				</div>
				<div class="panel-body">
					<form:form method="POST" modelAttribute="employee" action="/employees/create">
						<form:hidden path="identification" />
						<fieldset class="form-group">
							<form:label path="firstName">Primer Nombre: </form:label>
							<form:input path="firstName" type="text" class="form-control"
								required="required" />
							<form:errors path="firstName" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="lastName">Apellidos: </form:label>
							<form:input path="lastName" type="text" class="form-control"
								required="required" />
							<form:errors path="lastName" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="email">Correo Electrónico: </form:label>
							<form:input path="email" type="text" class="form-control"
								required="required" />
							<form:errors path="email" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="identification">Número de Identificación: </form:label>
							<form:input path="identification" type="text" class="form-control"
								required="required" />
							<form:errors path="identification" cssClass="text-warning" />
						</fieldset>

						<button type="submit" class="btn btn-success">Guardar</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="../common/footer.jsp"%>