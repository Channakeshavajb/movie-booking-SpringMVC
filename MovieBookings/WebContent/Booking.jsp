<html>
<title>Movie tickets booking</title>
<body>
<h2>Book the Movie Tickets</h2>

<form action="onclicking" method="post">
<pre>
<label>MovieName</label>      <input type="text" name="movieName"><br>
<label>No Of Tickets</label>  <input type="text" name="noOfTickets"><br>
<label>Date</label>           <input type="date" name="dateOfBook" ><br>
<label>Theatre Name</label>   <select id = "theatre" name = "theatreName">
   <option value = "pvr">PVR</option>
   <option value = "inox">INOX</option>
   <option value = "gt">GT MALL</option>
   <option value = "local">LocalTheatre</option>
   <option value = "cinemax">cineMax</option>
</select><br>
<label>Day-care</label>        <input type="radio" name="dayCare"><br>
<label>Language</label>        <select id = "lang" name = "language">
   <option value = "kannada">kannada</option>
   <option value = "English">English</option>
   <option value = "Hindi">Hindi</option>
   <option value = "Tulu">Tulu</option>
   <option value = "Malayali">Malayali</option>
</select><br>
<input type="submit" value="Submit"> <input type="reset" value="Cancel">
</pre>
</form>


</body>
</html>
