<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js">
	
</script>

<title>Lista uzytkowników</title>
</head>
<body>
	<h1>Wyszukaj w tabeli</h1>
	<div class="form-group">
		<input type="text" class="form-control" id="search"
			placeholder="Wyszukaj">
				</div>

	<table id="table"
		class="table table-bordered table-striped table-hover">

		<thead>

			<tr>
				<th>Id</th>
				<th>Imie</th>
				<th>Nazwisko</th>
				<th>Płeć</th>
				<th>Numer działu</th>
				<th>Wynagrodzenie</th>
				<th>Wiek</th>
				<th>Stanowisko</th>
				<th>Ilość dzieci</th>
				<th>Pesel</th>
				<th>Stan cywilny</th>
				<th>Edytuj</th>
				<th>Usuń</th>

			</tr>

		</thead>
		<tbody>

			<c:forEach items="${employeeList}" var="employeeVar">
				<tr>
					<td>${employeeVar.id}</td>
					<td>${employeeVar.name}</td>
					<td>${employeeVar.surname}</td>
					<td>${employeeVar.sex}</td>
					<td>${employeeVar.deptNo}</td>
					<td>${employeeVar.sallary}</td>
					<td>${employeeVar.age}</td>
					<td>${employeeVar.position}</td>
					<td>${employeeVar.childrenQuantity}</td>
					<td>${employeeVar.pesel}</td>
					<td><c:if
							test="${(employeeVar.maritalStatus==true) && (fn:contains(employeeVar.sex, 'M'))}">Żonaty</c:if>
						<c:if
							test="${(employeeVar.maritalStatus==true) && (fn:contains(employeeVar.sex, 'K'))}">Zamężna</c:if>
						<c:if
							test="${(employeeVar.maritalStatus==false) && (fn:contains(employeeVar.sex, 'M'))}">Kawaler</c:if>
						<c:if
							test="${(employeeVar.maritalStatus==false) && (fn:contains(employeeVar.sex, 'K'))}">Panna</c:if>
					</td>



					<td><c:url value="/employee-edit" var="editEmployeeUrl">
							<c:param name="id" value="${employeeVar.id}" />
						</c:url> <a class="btn btn-primary" href="${editEmployeeUrl}">Edytuj</a></td>
					<td>
						<form action="<c:url value="/employee-delete"/>" method="post">
							<input type="hidden" name="id" value="${employeeVar.id}" /> <input
								type="submit" class="btn btn-danger" value="Usun" />
						</form>

					</td>
				</tr>
			</c:forEach>
		</tbody>



	</table>
	<div>
		<a class="btn btn-primary" href="${pageContext.request.contextPath}/">Strona
			główna</a>

	</div>
<script type="text/javascript">
		
	var $rows = $('#table tbody tr');
		$('#search').keyup(
				function() {
					var val = '^(?=.*\\b'
							+ $.trim($(this).val()).split(/\s+/).join(
									'\\b)(?=.*\\b') + ').*$', reg = RegExp(val,
							'i'), text;
					$rows.show().filter(function() {
						text = $(this).text().replace(/\s+/g, ' ');
						return !reg.test(text);
					}).hide();
				});
	
	</script>


</body>
</html>