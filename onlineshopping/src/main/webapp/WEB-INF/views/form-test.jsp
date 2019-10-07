<!DOCTYPE html>
<html lang="en">
<head>

<form method="post" action="esegui.php">

  <!-- CASELLE DI TESTO -->
  Nome<br>
  <input type="text" name="nome"><br>
  Cognome<br>
  <input type="text" name="cognome"><br>
  
  <!-- SELECTBOX -->
  Paese<br>
  <select name="paese">
  <option value="I">Italia</option>
  <option value="E">Estero</option>
  </select><br>

  <!-- RADIO -->
  Sesso<br>
  <input type="radio" name="sesso" value="M"> M<br>
  <input type="radio" name="sesso" value="F"> F<br>

  <!-- CHECKBOX -->
  Hobby<br>
  <input type="checkbox" name="hobby" value="S"> Sport<br>
  <input type="checkbox" name="hobby" value="L"> Lettura<br>
  <input type="checkbox" name="hobby" value="C"> Cinema<br>
  <input type="checkbox" name="hobby" value="I"> Internet<br>

  <!-- TEXTAREA -->
  Commento<br>
  <textarea name="commento" rows="5" cols="30"></textarea>
  <br><br>

  <!-- SUBMIT -->
  <input type="submit" name="invia" value="Invia i dati">

</form>
</head>