<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div id="formId">
	<form:form modelAttribute="dusr" class="form-style-7"
		action="changeProfile">
		<form:hidden path="usrid"/>
		<form:label path="usrfn">Your name</form:label>
		<form:input path="usrfn" id="name" />
		<form:label path="usreml">Email</form:label>
		<form:input path="usreml" id="email" />
		<form:label path="usrdob">DOB</form:label>
		<form:input path="usrdob" id="dob" />
		<form:label path="usrphn">Phone No</form:label>
		<form:input path="usrphn" id="phoneNo" />
		<form:label path="usrProfession">Profession</form:label>
		<form:input path="usrProfession" id="Profession" />
		<form:label path="url">URL</form:label>
		<form:input path="url" id="website" />
		<form:label path="hobbies">Hobbies</form:label>
		<form:input path="hobbies" id="Hobbies" />
		<form:label path="aboutme">About me</form:label>
		<form:textarea path="aboutme" id="aboutme"></form:textarea>
		<fieldset>
		<legend>Address:</legend>
		<form:label path="usrAddr1">Addrees Line1</form:label>
		<form:input path="usrAddr1" id="addressline1" />
		<form:label path="usrAddr2">Addrees Line2</form:label>
		<form:input path="usrAddr2" id="addressline2" />
		<form:label path="usrCity">City</form:label>
		<form:input path="usrCity" id="City" />
		<form:select path="usrState" id="State">
			<option selected>Select State</option>
			<option>Delhi</option>
			<option>Uttar Pradesh</option>
			<option>Punjab</option>
		</form:select>
		<form:select path="usrCountry" id="Country">
			<option selected>Select country</option>
			<option>India</option>
			<option>USA</option>
			<option>Japan</option>
		</form:select>
		</fieldset>
	<input type="submit" value="Save" /> <input type="submit" value="Cancel" />

	</form:form>
</div>