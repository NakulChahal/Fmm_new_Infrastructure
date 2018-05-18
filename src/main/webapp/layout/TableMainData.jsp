<html>
<head>
<title>Table Main data Show</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h2>Table Main Show Data </h2>
	<p th:each="post : ${test}">
		<h4>OrgSlNo:</h4>
		<div th:text="${test.orgSlNo}"></div>
		<h4>OrgCode:</h4>
		<div th:text="${test.orgCode}"></div>
		<h4>OrgType:</h4>
		<div th:text="${test.orgType}"></div>
		<h4>OrgDesc:</h4>
		<div th:text="${test.orgDesc}"></div>
		<div>---------------------------------------------------------</div>
	</p>
</body>
</html>