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

        /* Styles CSS pour la mise en page */
      

        

        h1 {
            text-align: center;
        }

        .welcome-message {
            text-align: center;
            margin-bottom: 20px;
        }

        .profile {
            display: flex;
            align-items: center;
            margin-bottom: 20px;
        }

        .profile img {
            width: 100px;
            height: 100px;
            border-radius: 50%;
            margin-right: 20px;
        }

        .profile-info {
            flex-grow: 1;
        }

        .profile-info h2 {
            margin: 0;
        }

        .profile-info p {
            margin: 5px 0;
        }

        .logout-button {
            text-align: center;
        }
  
        /* Styles de base pour la navbar */
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
        
        /*notf*/
        
          .notification {
            background-color: #f8f8f8;
            border: 1px solid #ddd;
            padding: 10px;
            margin-bottom: 10px;
        }

        .success {
            color: #3c763d;
            background-color: #dff0d8;
            border-color: #d6e9c6;
        }

        .error {
            color: #a94442;
            background-color: #f2dede;
            border-color: #ebccd1;
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
			<h3> Demande d'absence  </h3>
		</div>
		<div>

			



			<f:form action="envoyerDemande" method="POST" modelAttribute="demande">

				<div class="row">
					<div class="col">
						
						<f:input path="message" type="text" class="form-control" placeholder="entrez votre demande " />
						<f:input path="reponse" type="hidden"  value="n'est pas encore traite"/>
						
					</div>

					
				</div>
         
				<div style="text-align: right">
					<button type="submit" class="btn btn-primary">envoyer</button>
				</div>
				</f:form>
				</div>
				</body>
				</html>