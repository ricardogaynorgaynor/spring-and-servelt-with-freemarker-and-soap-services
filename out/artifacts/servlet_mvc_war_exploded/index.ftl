<html>

<head>
    <title>
        First TFL Web Page
    </title>
</head>

<body>

<br><br>
<h3>All Faculties At UTech</h3>
<br><br>

<table border="1">
    <tr>
        <th>Faculty Code</th>
        <th>Faculty Name</th>
    </tr>
    <#list faculties as faculty>
        <tr>
        <td>${faculty.facultyCode?upper_case}</td>
        <td>${faculty.facultyName?cap_first}</td>
        </tr>
    </#list>


</table>

</body>

</html>