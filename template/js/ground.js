// functions for all the events
function start() {
  document.getElementById("groundButton").addEventListener("click", saveGroundDetails, false);

}

function saveGroundDetails(){
    console.log('coming to ground comp')
   var ground= document.getElementById('groundSelect').value;
    localStorage.setItem('ground',ground);
}

  // page load event
  window.addEventListener("load", start, false);