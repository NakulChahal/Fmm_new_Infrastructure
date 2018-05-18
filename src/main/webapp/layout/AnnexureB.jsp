<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ANNEXURE 'B'</title>
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
<h3><font size="5"><u>ANNEXURE 'B'</u></font></h3></div>
<center><h1>CHECKLIST TO ASSESSTHE ADEQUACY OF IMPORTANT INFRASTRUCTURAL FACILITIES IN FREIGHT TRAIN EXAMINATION YARDS</h1></center>
<table>
<tr>
<td><b>Name of the Examination Yard</b></td>
<td><input class="b" type="text" name="A"></td>
</tr>

<tr>
<td><p><b>Divsion Rly</b></p></td>
<td><input class="b" type="text" name="B"></td>
</tr>

<tr>
<td><b>Pattern of Examination</b></td>
<td>
<input type="checkbox" value="CC" name="CC">CC
<input type="checkbox" value="premium" name="premium">Premium
<input type="checkbox" value="intensive" name="intensive">Intensive
<input type="checkbox" value="other" name="other">Other
</td>
</tr>

<tr>
<td>1. No.of FWUs examined per month</td>
<td class="c">
<input type="checkbox" value="CC" name="CC">CC
<input type="checkbox" value="premium" name="premium">Premium
<input type="checkbox" value="intensive" name="intensive">Intensive
<input type="checkbox" value="other" name="other">Other
</td>

<tr>
<td>2. No. of datachment(FWUs per month)</td>
<td>
<input type="checkbox" value="POH" name="POH">POH
<input type="checkbox" value="ROH" name="ROH">ROH
<input type="checkbox" value="Unloadable 'A' cat" name="Unloadable 'A' cat">Unloadable 'A' cat
<input type="checkbox" value="Unloadable 'B' cat" name="Unloadable 'B' cat">Unloadable 'B' cat
<input type="checkbox" value="Unloadable 'C' cat" name="Unloadable 'C' cat">Unloadable 'C' cat
<input type="checkbox" value="other" name="other">other
</td>
</tr>

<tr>
<td>3. No. of lines nominated for Insentive examination(Full Length) </td>
<td ><input class="b" type="text" name="3"></td>
</tr>

<tr>
<td>4. No. of lines nominated for Insentive examination (Other which are not of Full Length)</td>
<td><input class="b" type="text" name="4"></td>
</tr>

<tr>
<td>5. Track center distance between two adjacent lines (in meter)</td>
<td>
<input type="checkbox" value="max" name="max">Max.
<input type="checkbox" value="min" name="min">Min.
</td>
</tr>

<tr>
<td>6. Availability of Pucca pathways between the lines nominated for examination</td>
<td>
<input type="checkbox" value="yes" name="yes">Yes
<input type="checkbox" value="no" name="no">No
</td>
</tr>

<tr>
<td>7. Whether night shift working in operation</td>
<td>
<input type="checkbox" value="yes" name="yes">Yes
<input type="checkbox" value="no" name="no">No
</td>
</tr>

<tr>
<td>8. If Yes, availability of sufficient illumination facilities </td>
<td>
<input type="checkbox" value="yes" name="yes">Yes
<input type="checkbox" value="no" name="no">No
</td>
</tr>

<tr>
<td>9. Availability of welding facilities </td>
<td>
<input type="checkbox" value="yes" name="yes">Yes
<input type="checkbox" value="no" name="no">No
</td>
</tr>

<tr>
<td>10. Availability of compressor </td>
<td>
<input type="checkbox" value="yes" name="yes">Yes
<input type="checkbox" value="no" name="no">No
</td>
</tr>

<tr>
<td>11. Availability of Exhauster </td>
<td>
<input type="checkbox" value="yes" name="yes">Yes
<input type="checkbox" value="no" name="no">No
</td>
</tr>

<tr>
<td>12. Availability of material handling facilities </td>
<td>
<input type="checkbox" value="sufficient" name="sufficient">Sufficient
<input type="checkbox" value="insufficient" name="insufficient">Insufficient
</td>
</tr>

<tr>
<td>13. Availability of tele-communication facilities </td>
<td>
<input type="checkbox" value="rly" name="rly">Rly
<input type="checkbox" value="dot" name="dot">DOT
</td>
</tr>

<tr>
<td>14. Any work proposed for up gradation Details, if Yes</td>
<td><input class="b" type="text" name="14"></td>
</tr>

<tr>
<td>15. Availability of space for further extension </td>
<td>
<input type="checkbox" value="yes" name="yes">Yes
<input type="checkbox" value="no" name="no">No
</td>
</tr>

<tr>
<td>16. Any other Remarks</td>
<td><input class="b" type="text" name="16"></td>
</tr>
</table>


</form>


</body>
</html>