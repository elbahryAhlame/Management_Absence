<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>registration form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">

<style>
form {
	margin-bottom: 60px;
	margin-top: 10px;
	padding: 10px;
}

h3 {
	margin-top: 20px;
}
table {
  width: 100%;
  border-collapse: collapse;
}

table th,
table td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}

table th {
  background-color: #f2f2f2;
}

table tr:hover {
  background-color: #f5f5f5;
}

    .navbar {
            background-color: #f8f9fa;
            padding: 10px;
            display: flex;
            justify-content: center;
        }
        
        .navbar ul {
            list-style-type: none;
            display: flex;
            margin: 0;
            padding: 0;
        }
        
        .navbar li {
            margin: 0 10px;
        }
        
        .navbar a {
            text-decoration: none;
            color: #333;
            padding: 5px;
        }
        
        /* Styles spécifiques pour les liens actifs */
        .navbar a.active {
            color: #fff;
            background-color: #007bff;
            border-radius: 3px;
        }
    </style>
</head>
<body>
 <div class="navbar">
        <ul>
            <li><a href="${pageContext.request.contextPath}/">Accueil</a></li>
            <li><a href="${pageContext.request.contextPath}/modifierProfile">Profil</a></li>
            <li><a  href="${pageContext.request.contextPath}/reclamation">Reclamation</a></li>
            <li><a href="${pageContext.request.contextPath}/consulterReclamation">Absences</a></li>
            <li><a href="${pageContext.request.contextPath}/demandes">Demandes</a></li>
            <li><a href="${pageContext.request.contextPath}/consulterDemandes">  Consulter demandes</a></li>
            <li><a href="${pageContext.request.contextPath}/avertissement">  Notifications</a></li>
        
        </ul>
    </div>

	<div class="container">
<div>
			<h3>Reclamation </h3>
		</div>
		<div>

			



			<f:form action="envoyerReclamation" method="POST" modelAttribute="absences">

				<div class="row">
					<div class="col">
						
						<input name="reclamation" type="text" class="form-control" placeholder="entrez votre reclmation " />
						
					</div>

					
				</div>
         </div>
				<div style="text-align: right">
					<button type="submit" class="btn btn-primary">envoyer</button>
				</div>
				<table>
  <thead>
    <tr>
      <th>debut de science</th>
      <th>fin de science </th>
      <th>matiere</th>
     
     
      <th>Envoyer</th>
      
    </tr>
  </thead>
  <tbody>
  
      <c:forEach  items="${absences}" var="absence">
      <tr>
        <td><c:out value="${absence.dateHeureDebutAbsence}" /></td>
        <td><c:out value="${absence.dateHeureFinAbsence}" /></td>
        <td><c:out value="${absence.matiere.nom}" /></td>
       
      
               
                  <td>
                        <input type="checkbox" name="selectedContacts" value="${absence.idAbsence}">
           
      
  </td>

        
      </tr>
    </c:forEach>

    <!-- Ajoutez ici plus de lignes avec les données -->
  </tbody>
</table>

			</f:form>
		</div>


	</div>
	
	
</body>
</html>