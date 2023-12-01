"use strict";

function start() {
  document.getElementById("team").addEventListener("change", infoDisplay, false);

}

function infoDisplay() {

    let teamName = document.getElementById("team").value;
    console.log(teamName);
    if (teamName == 'kishore') {
      document.getElementById("outputDisplay1").innerHTML = "Kishore is a key team player and can be contacted at +1 470887867</br>" +
      "He is the key player in the building up the grounds<br>"+
      "<img th:src='@{/assets/images/kishore.jpeg}' height=450 width=650> <br>";
    } 
  }

window.addEventListener("load", start, false);