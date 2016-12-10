<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>

<html>
	<head>
	<link rel="stylesheet" href="<c:url value="./resources/css/animate.css"/>">
	<link rel="stylesheet" href="<c:url value="./resources/css/animate.css"/>">
	<link rel="stylesheet" href="<c:url value="./resources/css/themify-icons.css"/>" >
	<link rel="stylesheet" href="<c:url value="./resources/css/bootstrap.css"/>">
	<link rel="stylesheet" href="<c:url value="./resources/css/magnific-popup.css"/>">
	<link rel="stylesheet" href=" <c:url value="./resources/css/owl.carousel.min.css"/> ">
	<link rel="stylesheet" href=" <c:url value="./resources/css/owl.theme.default.min.css"/>">
	<!-- Theme style  -->
	<link rel="stylesheet" href="<c:url value="./resources/css/style.css"/>">
	<!-- Modernizr JS -->
	<script src="./resources/js/modernizr-2.6.2.min.js"></script>
	<script>
	        
	 function loadXMLDoc()
     {
       var xmlhttp;
   		
       var user=document.getElementById('username').value;
       var pass=document.getElementById('password').value;
       var rpass=document.getElementById('rpassword').value;
       
       if(pass!=rpass)
    	   {
    	   			alert("Password Mismatch");
    	   			return;
    	   }
       var url="http://localhost:8080/BankApp/register/"+user+"/"+pass;
       
       if (window.XMLHttpRequest)
       {
           xmlhttp=new XMLHttpRequest();
       }
       else
       {
           xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
       }
       xmlhttp.onreadystatechange=function()
       {
           if (xmlhttp.readyState==4 && xmlhttp.status==200)
           {
        	   
        	   /*  document.getElementById("myDiv").innerHTML=xmlhttp.responseText;*/ 
           }
       }

       xmlhttp.open("GET", url, true);
       xmlhttp.send();
       alert("registered");
       
}
			
	 </script>
	
	
	</head>
	<body>
	<div class="gtco-loader"></div>
	<div id="page">
	<nav class="gtco-nav" role="navigation">
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 text-right gtco-contact">
					<ul class="">
						
						<!-- <li><a href="#"><i class="ti-twitter-alt"></i> </a></li>
						<li><a href="#"><i class="icon-mail2"></i></a></li>
						<li><a href="#"><i class="ti-facebook"></i></a></li> -->
					</ul>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-4 col-xs-12">
					
				</div>
				<div class="col-xs-8 text-right menu-1">
					<ul>
						<li class="active"><a href="index.html">Home</a></li>
						<li><a href="about.html">About</a></li>
						<li class="has-dropdown">
							<a href="services.html">Services</a>
							<ul class="dropdown">
								      
								<li><a href="#">eCommerce</a></li>
								<li><a href="#">Branding</a></li>
								<li><a href="#">API</a></li>
							</ul>
						</li>
						<li class="has-dropdown">
							<a href="#">Dropdown</a>     	    
							<ul class="dropdown">
								<li><a href="#">HTML5</a></li>
								<li><a href="#">CSS3</a></li>
								<li><a href="#">Sass</a></li>
								<li><a href="#">jQuery</a></li>       
							</ul>    
						</li>
						<li><a href="http://localhost:8080/BankApp/login">Login</a></li>
						<li><a href="contact.html">Contact</a></li>
					</ul>
				</div>
			</div>
			        
		</div>
	</nav>

	<header id="gtco-header" class="gtco-cover" role="banner" style="background-image:url(${cimage});">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-left">
					<div class="display-t">
						<div class="display-tc">
							<h1 class="animate-box" data-animate-effect="fadeInUp">Banking Experience To Next Level</h1>
							
							<p class="animate-box" data-animate-effect="fadeInUp"><a href="#gtco-subscribe" class="btn btn-white btn-lg btn-outline"><b>Apply Here</b></a></p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>

	
	<section id="gtco-subsection">

		<div id="gtco-subscribe">
			<div class="gtco-container">
				<div class="row animate-box">
					<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
					<h2>Register</h2>
					<p>Be the first to get registered</p>
				</div>
			</div>
			<div class="row animate-box">
				<div class="col-md-12">
					<form class="form-inline">
							<div id="reg-id" class="form-group">
								<label for="name" class="sr-only">Name</label>
								<input type="text" class="form-control" id="username" placeholder="User Name">
							<br/><br/>
							
								<label for="name" class="sr-only">Passwaord</label>
								<input type="password" class="form-control" id="password" placeholder="Password">
								
								<br/><br/>
								<label for="name" class="sr-only">Repeat Password</label>
								<input type="password" class="form-control" id="rpassword" placeholder="Repeat Password">
								<br/><br/>
							<button type="submit" class="btn btn-default btn-block" onclick="loadXMLDoc()">Subscribe</button>
							</div>
						
					</form>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!--<div id="gtco-subscribe">
		<div class="gtco-container">
			<div class="row animate-box">
				<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
					<h2>Subscribe</h2>
					<p>Be the first to get subscribe</p>
				</div>
			</div>
			
			<div class="row animate-box col-xs-6">
		 
				<div>
					<form class="form-inline">
					
						<div class="form-group">
									<fieldset>
				<legend><font color="white">Login</font></legend>
								<label for="name" class="sr-only">Email</label>
								<input type="email" class="form-control" id="name" placeholder="Your Email" required>
								<br/><br/>
								<label for="name" class="sr-only">Password</label>
								<input type="password" class="form-control" id="name" placeholder="Your Password" required>
								<br/><br/>
								<button type="submit" class="btn btn-default btn-block">Login</button>
								</fieldset>
						</div>
					</form>
				</div>
			</div>
		</div>
		<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	</div>-->
		</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>
	
	<!-- jQuery -->
	<script src="./resources/js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="./resources/js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="./resources/js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="./resources/js/jquery.waypoints.min.js"></script>
	<!-- Carousel -->
	<script src="./resources/js/owl.carousel.min.js"></script>
	<!-- countTo -->
	<script src="./resources/js/jquery.countTo.js"></script>
	<!-- Magnific Popup -->
	<script src="./resources/js/jquery.magnific-popup.min.js"></script>
	<script src="./resources/js/magnific-popup-options.js"></script>
	<!-- Main -->
	<script src="./resources/js/main.js"></script>

	</body>
</html>

