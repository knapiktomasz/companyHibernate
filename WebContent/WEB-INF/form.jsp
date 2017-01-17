<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Dodawanie / edycja uzytkownika</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Obsługa pracownika</h1>
		<form
			<c:if test = "${empty employeeForm.id}">action="<c:url value="/employee-create"/>"</c:if>
			<c:if test = "${not empty employeeForm.id}"><c:url value="/employee-edit"/>"</c:if>
			method="post" class="form-horizontal">
			<input type="hidden" name="id" value="${employeeForm.id}" />

			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Imie:</label>
				<div class="col-sm-10">
					<input
						<c:if test = "${not empty employeeForm.name}">value="${employeeForm.name}" readonly</c:if>
						id="name" type="text" class="form-control" name="name" required
						placeholder="Wpisz imie" />
				</div>
			</div>
			<div class="form-group">
				<label for="surname" class="col-sm-2 control-label">Nazwisko:</label>
				<div class="col-sm-10">
					<input
						<c:if test = "${not empty employeeForm.surname}">value="${employeeForm.surname}"</c:if>
						<c:if test = "${employeeForm.sex=='M'}">readonly</c:if>
						id="surname" type="text" class="form-control" name="surname"
						required placeholder="Wpisz nazwisko" />
				</div>
			</div>
			<div class="form-group">
				<label for="sex" class="col-sm-2 control-label">Płeć:</label>
				<div class="col-sm-2">
					<select class="form-control" required name="sex">
						<option>Wybierz płeć</option>
						<option value="K" ${employeeForm.sex=='K' ? 'selected': ''}>K</option>
						<option value="M" ${employeeForm.sex=='M' ? 'selected': ''}>M</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label for="deptNo" class="col-sm-2 control-label">Nr
					działu:</label>
				<div class="col-sm-10">
					<input
						<c:if test = "${not empty employeeForm.deptNo}">value="${employeeForm.deptNo}"</c:if>
						id="deptNo" type="text" class="form-control" name="deptNo"
						required placeholder="Wpisz numer działu" />
				</div>
			</div>
			<div class="form-group">
				<label for="sallary" class="col-sm-2 control-label">Wynagrodzenie:</label>
				<div class="col-sm-10">
					<input
						<c:if test = "${not empty employeeForm.sallary}">value="${employeeForm.sallary}"</c:if>
						id="sallary" type="text" class="form-control" name="sallary"
						required placeholder="Wpisz wynagrodzenie" />
				</div>
			</div>
			<div class="form-group">
				<label for="age" class="col-sm-2 control-label">Wiek:</label>
				<div class="col-sm-10">
					<input
						<c:if test = "${not empty employeeForm.age}">value="${employeeForm.age}"</c:if>
						id="age" type="text" class="form-control" name="age" required
						placeholder="Wpisz wiek" />
				</div>
			</div>
			<div class="form-group">
				<label for="position" class="col-sm-2 control-label">Stanowisko:</label>
				<div class="col-sm-10">
					<input
						<c:if test = "${not empty employeeForm.position}">value="${employeeForm.position}"</c:if>
						id="position" type="text" class="form-control" name="position"
						required placeholder="Podaj stanowisko" />
				</div>
			</div>
			<div class="form-group">
				<label for="childrenQuantity" class="col-sm-2 control-label">Ilosc
					dzieci:</label>
				<div class="col-sm-10">
					<input
						<c:if test = "${not empty employeeForm.childrenQuantity}">value="${employeeForm.childrenQuantity}"</c:if>
						id="childrenQuantity" type="text" class="form-control"
						name="childrenQuantity" required placeholder="Podaj ilośc dzieci" />
				</div>
			</div>
			<div class="form-group">
				<label for="pesel" class="col-sm-2 control-label">Pesel:</label>
				<div class="col-sm-10">
					<input
						<c:if test = "${not empty employeeForm.pesel}">value="${employeeForm.pesel}" readonly</c:if>
						id="pesel" type="text" class="form-control" name="pesel" required
						placeholder="Podaj pesel" maxlength="11" />
				</div>
			</div>
			<div class="form-group">
				<label for="maritalStatus" class="col-sm-2 control-label">Stan
					cywilny:</label>
				<div class="col-sm-2">
					<select class="form-control" required name="maritalStatus">
						<option>Wybierz stan cywilny</option>
						<option value="false"
							${employeeForm.maritalStatus==false ? 'selected': ''}>Kawaler/Panna</option>
						<option value="true"
							${employeeForm.maritalStatus==true ? 'selected': ''}>Żonaty/Zamężna</option>
					</select>
				</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-1">
						<input type="submit" value="Zapisz" class="btn btn-primary" />
					</div>
					<div class="col-sm-offset-0 col-sm-1">
						<a class="btn btn-primary" href="javascript: history.back()">Powrót</a>

					</div>
				</div>
				
		</form>

	</div>



</body>
</html>