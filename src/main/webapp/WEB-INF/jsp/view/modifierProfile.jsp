<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
    <title>Accueil étudiant</title>
    <style>
     
  
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
		
		
		<div>
			<h3>Profile</h3>
		</div>
		<div>

			



			<f:form action="ValiderProfile" method="POST" modelAttribute="etudiant">

				<div class="row">
					<div class="col">
						<label>telephone</label>
						<f:input type="text" class="form-control" path="telephone" />
							<f:input  type="hidden"  path="nom" />
							<f:input type="hidden" path="idUtilisateur"/>
							<f:input type="hidden"  path="prenom" />
							<f:input type="hidden"  path="cin" />
							<f:input type="hidden" path="nomArabe" />
							<f:input type="hidden"  path="prenomArabe" />
							<f:input type="hidden" path="dateNaissance"  />
							<f:input type="hidden"  path="cne" />
							
					</div>

					<div class="col">
						<label>Email</label>
						<f:input path="email" type="text" class="form-control"
							 />
										</div>
				</div>

               <div>
					<button type="submit" class="btn btn-primary">valider</button>
				</div>
				

					
					
				</f:form>
				</div>
				
				</body>
				</html>
				

