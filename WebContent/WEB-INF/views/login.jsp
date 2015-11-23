<%@include file="/WEB-INF/templates/include.jsp"%>
<!DOCTYPE html>
<html>
	<head>	
		
		<title>Login/Sign-In</title>
		
		<script src="<%=SpittrConstant.JSROOTURL%>jquery.js"></script>	
		<script src="<%=SpittrConstant.JSROOTURL%>index.js"></script>
		<script type="text/javascript" src="<%=SpittrConstant.JSROOTURL%>jquery-1.10.2.min.js"></script>	
		<script type="text/javascript" src="<%=SpittrConstant.JSROOTURL%>jquery.fancybox.pack.js?v=2.1.5"></script>
		<script type="text/javascript">
			$(document).ready(function() {			
				$('.fancybox').fancybox();
			});
			function validate(){

			}
		</script>
		
		<style type="text/css">
			.fancybox-custom .fancybox-skin {
				box-shadow: 0 0 50px #222;
			}
			body {
				max-width: 700px;
				margin: 0 auto;
			}
		</style>
		<link rel="stylesheet" type="text/css" href="<%=SpittrConstant.CSSROOTURL%>jquery.fancybox.css?v=2.1.5" media="screen" />       
		<link rel="stylesheet" type="text/css" href="<%=SpittrConstant.CSSROOTURL%>normalize.css">
		<link rel="stylesheet" type="text/css" href="<%=SpittrConstant.CSSROOTURL%>style.css">  
		<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'> 
	</head>
<body>	
		
<div class="logmod">
  <div class="logmod__wrapper">    
    <div class="logmod__container">
      <ul class="logmod__tabs">
        <li data-tabtar="lgm-2"><a href="#">Login</a></li>
        <li data-tabtar="lgm-1"><a href="#">Sign Up</a></li>
      </ul>
      <div class="logmod__tab-wrapper">
      <div class="logmod__tab lgm-1">
        
        <div class="logmod__form">
          <form accept-charset="utf-8" action="#" class="simform">
			 <div class="sminputs">
              <div class="input full">
                <label class="string optional" for="user-name">Full Name*</label>
                <input class="string optional" maxlength="255" id="user-fname" placeholder="Enter your full name" type="text" size="50" />
              </div>
            </div>
            <div class="sminputs">
              <div class="input full">
                <label class="string optional" for="user-name">Email*</label>
                <input class="string optional" maxlength="255" id="user-email" required placeholder="Email" type="email" size="50"/>
              </div>
            </div>
            <div class="sminputs">
              <div class="input string optional">
                <label class="string optional" for="user-pw">Password *</label>
                <input class="string optional" maxlength="255" id="user-pw" placeholder="Password" type="text" size="50" />
              </div>
              <div class="input string optional">
                <label class="string optional" for="user-pw-repeat">Repeat password *</label>
                <input class="string optional" maxlength="255" id="user-pw-repeat" placeholder="Repeat password" type="text" size="50" />
              </div>
            </div>
            <div class="simform__actions">
              <input class="sumbit" name="commit" type="sumbit" readonly value="Create Account" />
              <span class="simform__actions-sidetext">By creating an account you agree to our <a class="special" href="#" target="_blank" role="link">Terms & Privacy</a></span>
            </div> 
          </form>
        </div> 
      
      </div>
      <div class="logmod__tab lgm-2">         
        <div class="logmod__form">
          <form accept-charset="utf-8" action="#" class="simform">
            <div class="sminputs">
              <div class="input full">
                <label class="string optional" for="user-name">Email*</label>
                <input class="string optional" maxlength="255" id="user-email" placeholder="Email" type="email" size="50" />
              </div>
            </div>
            <div class="sminputs">
              <div class="input full">
                <label class="string optional" for="user-pw">Password *</label>
                <input class="string optional" maxlength="255" id="user-pw" placeholder="Password" type="password" size="50" />
                						<span class="hide-password">Show</span>
              </div>
            </div>
            <div class="simform__actions">
              <input class="sumbit" name="commit" type="sumbit" readonly value="Log In" onclick="validate();" />
              <span class="simform__actions-sidetext">
			  <a class="fancybox" href="#forgotPwd">Forgot your password?</a></span>
            </div> 
          </form>
        </div> 
          </div>
      </div>
    </div>
  </div>
</div>
<div id="forgotPwd" style="width:400px;display: none;">
	<div class="logmod__form">
          <form action="#" class="simform">
            <div class="sminputs">
              <div class="input full">               
                <input class="string optional" maxlength="255" id="user-email" placeholder="Enter your email" type="email" size="50" />
              </div>
            </div>
            <div class="simform__actions">
              <input class="sumbit" name="commit" type="sumbit" readonly value="Submit" />              
            </div> 
          </form>
     </div>
</div>
</body>
</html>