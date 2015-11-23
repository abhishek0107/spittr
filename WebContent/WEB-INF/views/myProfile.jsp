
<div id="formId" >
	<form class="form-style-7">
     	<input type="text" name="name" placeholder="Your Name" />
		<input type="email" name="email" required placeholder="Email Address" />
		<input type="text" name="dob" placeholder="Birthday" />
		<input type="text" name="phoneNo" placeholder="Your Phone" />
		<input type="text" name="Profession" placeholder="Profession" />	
		<input type="text" name="website" placeholder="url" />	
		<input type="text" name="Hobbies" placeholder="Hobbies" />	
		<textarea name="aboutme" placeholder="Write About yourself."></textarea>	
		<fieldset>
		<legend>Address:</legend>
			<input type="text" id="addressline1" required placeholder="Address line 1">
			<input type="text" id="addressline2" placeholder="Address line 2">
			<input type="text"id="City" placeholder="City">
			
			<select id="State" >
				<option selected>Select State</option>
				<option>Delhi</option>
				<option>Uttar Pradesh</option>
				<option>Punjab</option>
			</select>
			<select id="Country">
				<option selected>Select country</option>
				<option>India</option>
				<option>USA</option>
				<option>Japan</option>
			</select>		
		</fieldset>
		<input type="submit" value="Save" /> <input type="submit" value="Cancel" />
	</form>
</div>