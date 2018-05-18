<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>annexure_D</title>
<style>

table {
	border-collapse: collapse;
    border: 1px solid black;
    width: 100%;height:100%;
/*     position: relative; */
}

tr {
    padding: 7px;
    text-align: left;
    border: 1px solid black;
    border-collapse: collapse;
    width: 100%; height:100%;
    
   
}

div.a {
    text-align: right;
    }
    
    input.b {
    		height:30%; width:30%;
    		margin: 1;
 padding: .5em 0;
 border: 1px solid black;
    	
    } 
    
    td.c {
    		width: 50%;
    		height:50%;
    		text-align: 1px;
    		border-collapse: collapse;
    		border: 1px;
    }
form {
 margin: 1;
 padding: 1em 0;
 border: 2px solid black;

}
</style>

</head>

<body>
<form>
<div class="a">
<h3><font size="5"><u>ANNEXURE 'D'</u></font></h3></div>
<center><h1>CHECKLIST TO ASSESS THE ADEQUACY OF IMPORTANT INFRASTRUCTURAL FACILITIES IN ROH DEPOTS</h1></center>
<table>
<tr>
<td><p><b>Name of Depot</b></p></td>
<td colspan="4"><input class="b" type="text" name="A"></td>
</tr>

<tr>
<td><b>Div./Rly</b></td>
<td colspan="2"><input class="b" type="text" name="B1"></td>
<td colspan="2"><input class="b" type="text" name="B2"></td>
</tr>

<tr>
<td><b>Type of stock undertaken for ROH</b></td>
<td colspan="4">
<input type="checkbox" value="A/Bk" name="A/Bk">A/Bk
<input type="checkbox" value="UIC" name="UIC">UIC
<input type="checkbox" value="BTPN" name="BTPN">BTPN
<input type="checkbox" value="4WT" name="4WT">4WT
</td>
</tr>


<tr>
<td><p><b>ROH depot Interchange</b></p></td>
<td colspan="4">
<select>
<option value="Gazetted">Gazetted</option>
<option value="Non-Gazetted">Non-Gazetted</option>
</select>
</td>
</tr>

<tr>
<td>1. ROH capacity(VUs per month)</td>
<td colspan="4"><input class="b" type="text" name="1"></td>

</tr>

<tr>
<td>2. Berthing capacity under capacity shed(in meter and VUs)</td>
<td colspan="2"><input class="b" type="text" name="2a"></td>
<td colspan="2" ><input class="b" type="text" name="2b"></td>
</tr>

<tr>
<td>3. Berthing capacity under open (in meter and VUs)</td>
<td colspan="2"><input class="b" type="text" name="3a"></td>
<td colspan="2"><input class="b" type="text" name="3b"></td>
</tr>

<tr>
<td >4. Track center distance between two adjacent line(in meter)</td>
<td colspan="2">
<input type="radio" name="Maximum" value="Maximum" >Maximum
</td>
<td colspan="2">
<input type="radio" name="Minimum" value="Minimum">Minimum
</td>


<tr>
<td >5. Availability of Heavy duty concrete Flooring in the working area</td>
<td colspan="2">
<input type="radio" name="yes" value="yes" >Yes
</td>
<td colspan="2">
<input type="radio" value="no" >No
</td>
</tr>

<tr>
<td >6. Whether night shift working in operation</td>
<td colspan="2">
<input type="radio" name="yes" value="yes" >Yes
</td>
<td colspan="2">
<input type="radio" value="no" >No
</td>
</tr>


<tr>
<td >7. If Yes, availability of sufficient illumination facilities</td>
<td colspan="2">
<input type="radio" name="yes" value="yes">Yes
</td>
<td colspan="2">
<input type="radio" value="no" >No
</td>
</tr>

<tr>
<td rowspan="2">8. Availability of EOT crane</td>
<td colspan="2">
<input type="radio" name="yes" value="yes" >Yes
</td>
<td rowspan="2" colspan="2">
<input type="radio" value="no" >No
</td>
</tr>
<tr>

<td >
<input type="radio" name="Full area covered" value="Full area covered" >Full Area Covered
</td>
<td >
<input type="radio" value="Partially area covered" >Partially Area Covered
</td>

</tr>

<tr>
<td >9. Availability of wheel turning lathe</td>
<td colspan="2">
<input type="radio" name="yes" value="yes">Yes
</td>
<td colspan="2">
<input type="radio" value="no" >No
</td>
</tr>

<tr>
<td >10. Availability of welding facilities</td>
<td colspan="2">
<input type="radio" name="Sufficient" value="Sufficient" >Sufficient
</td>
<td colspan="2">
<input type="radio" value="Insufficient" >Insufficient
</td>
</tr>

<tr>
<td>11. Availability of separate DV repair section</td>
<td colspan="2">
<input type="radio" name="yes" value="yes">Yes
</td>
<td colspan="2">
<input type="radio" value="no" >No
</td>
</tr>

<tr>
<td >12. Availability of SAB repair section</td>
<td colspan="2">
<input type="radio" name="yes" value="yes">Yes
</td>
<td colspan="2">
<input type="radio" value="no" >No
</td>
</tr>

<tr>
<td >13. Availability of UST facilities</td>
<td colspan="2">
<input type="radio" name="yes" value="yes">Yes
</td>
<td colspan="2">
<input type="radio" value="no" >No
</td>
</tr>

<tr>
<td >14. Availability of material handling facilities</td>
<td colspan="2">
<input type="radio" name="sufficinent" value="sufficient">Sufficient
</td>
<td colspan="2">
<input type="radio" value="insufficient" >Insufficient
</td>
</tr>

<tr>
<td>15. Availability of cleaning facilities for depot handling tank wagons</td>
<td >
<input type="radio" name="stream" value="stream">Stream
</td>
<td>
<input type="radio" value="chemical" >Chemical
</td>
<td>
<input type="radio" name="nil" value="nil">Nil
</td>
<td>
<input type="radio" value="na" >NA
</td>
</tr>

<tr>
<td>16. Availability of PC</td>
<td colspan="2">
<input type="radio" name="yes" value="yes">Yes
</td>
<td colspan="2">
<input type="radio" value="no" >No
</td>
</tr>


<tr>
<td >17. Availability of PCs networking facilities</td>
<td colspan="2">
<input type="radio" name="yes" value="yes">Yes
</td>
<td colspan="2">
<input type="radio" value="no" >No
</td>
</tr>



<tr>
<td>18. Availability of tele-Communication facilities</td>
<td colspan="2">
<input type="radio" name="Rly" value="Rly">Rly
</td>
<td colspan="2">
<input type="radio" value="DOT" >DOT
</td>
</tr>

<tr>
<td>19. Availability of space for future extension</td>
<td colspan="2">
<input type="radio" name="yes" value="yes">Yes
</td>
<td colspan="2">
<input type="radio" value="no" >No
</td>
</tr>

<tr>
<td>20. Any other remarks</td>
<td colspan="4"><input class="b" type="text" name="20"></td>

</tr>

</table>

</form>

</body>
</html>