<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@
taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="wrap shadow-bottom" style="text-align: center;">
		<div class="panel-heading"><h3>Random Text Task History</h3></div>

		<!-- Table -->
		<table class="table">
			<tr>
				<td><strong>Most Frequent Word</strong></td>
				<td><strong>Average Paragraph Size (words)</strong></td>
				<td><strong>Average Paragraph Processing Time (seconds)</strong></td>
				<td><strong>Total Processing Time (seconds)</strong></td>
			</tr>
			<c:forEach var="task" items="${list}">
				<tr>
					<td>${task.freq_word}</td>
					<td>${task.avg_paragraph_size}</td>
					<td>${task.avg_paragraph_processing_time}</td>
					<td>${task.total_processing_time}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>