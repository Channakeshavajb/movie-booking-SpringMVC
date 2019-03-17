<html>
<title>Movie tickets booking</title>
<body>
<h2>Book the Movie Tickets</h2>

<form action="onclicking">
<pre>
<label>MovieName</label><input type="text" name="movieName">
<label>No Of Tickets</label><input type="text" name="noOfTickets">
<label>Date</label><input type="date" name="date" value="dd/mm/yyyy">
<label>Theatre Name</label><select id = "theatre" name = "theatreName">
   <option value = "200">PVR</option>
   <option value = "100">INOX</option>
   <option value = "500">GT MALL</option>
   <option value = "75">LocalTheatre</option>
   <option value = "200">cineMax</option>
</select>
<label>Day-care</label><input type="radio" name="dayCare">
<label>Language</label><select id = "lang" name = "language">
   <option value = "kannada">kannada</option>
   <option value = "English">English</option>
   <option value = "Hindi">Hindi</option>
   <option value = "Tulu">Tulu</option>
   <option value = "Malayali">Malayali</option>
</select>
<input type="submit" value="Submit"> <input type="reset" value="Cancel">
</pre>
</form>


</body>
</html>
