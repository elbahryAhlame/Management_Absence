<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <title>Accueil étudiant</title>
    <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
    <style>
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
        <h1>Accueil étudiant</h1>

        <div class="welcome-message">
            <p>Bienvenue, <strong> ${etudiant.nom}</strong> !</p>
        </div>

        <div class="profile">
           
            <div class="profile-info">
                <h2>Informations personnelles :</h2>
                <br>
                <br>
                <p><strong>Nom (en francais)    :</strong> ${etudiant.nom}</p>
                <br>
                <p><strong>Prénom (en francais) :</strong> ${etudiant.prenom}</p>
                  <br>
                <p><strong>code de massar       :</strong>${etudiant.cne}</p>
                  <br>
                  <p><strong>Email              :</strong>${etudiant.email}</p>
                    <br>
                  <p><strong>telephone          :</strong>${etudiant.telephone}</p>
                    <br>
                  <p><strong>Nom (en arabe)     :</strong>${etudiant.nomArabe}</p>
                    <br>
                  <p><strong>Prenom (en arabe)  :</strong>${etudiant.prenomArabe}</p>
                    <br>
                  <p><strong>Date de Naissance  :</strong>${etudiant.dateNaissance}</p>

            </div>
        </div>

       
    </div>
</body>
</html>
