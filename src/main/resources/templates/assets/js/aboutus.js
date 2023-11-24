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
    } else if (teamName == 'teju') {
      document.getElementById("outputDisplay1").innerHTML = "Teju is a key team player and can be contacted at +1 91364674748</br>" +
      "She helped design of web pages and looks after the schedules<br>"+
      "<img th:src='@{/assets/images/teju.jpeg}' height=450 width=650> <br>";
    } else if(teamName == 'raja'){
      document.getElementById("outputDisplay1").innerHTML = "Raja is a key team player and can be contacted at +1 9139383943</br>" +
      "he helped maintenance of grounds and looks after the tems and matches<br>"+
      "<img th:src='@{/assets/images/raja.jpeg}' height=450 width=650> <br>";
    }
  }

window.addEventListener("load", start, false);