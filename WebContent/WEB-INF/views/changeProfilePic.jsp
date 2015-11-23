<%@include file="/WEB-INF/templates/include.jsp"%>
<style type="text/css">
    	.uploadFile{
    		visibility : hidden;
    	}
	</style>
	<script src="<%=SpittrConstant.JSROOTURL%>jquery.js"></script>
    <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
    <script src="<%=SpittrConstant.JSROOTURL%>script.js"></script>
    <script>
	  	$( document ).ready(function() {
	  		$("#uploadIcon2").click(function(){
	  			
	  			$(this).next().trigger('click');
	  		});
	  	 });
   </script>
<div>
	<font size="2px;">Click on image to change</font><br>
	
	<a href="javascript:void(0)" id="uploadIcon2" class="img_profile">
		<img src="images/profile_default.png"  width="200px" height="200px" alt="upload photo"/>
	</a>
	<input type="file" value="upload" id="uploadFile" class="uploadFile" />
</div>