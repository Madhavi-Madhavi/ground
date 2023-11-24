// functions for all the events
function start() {
  document
    .getElementById("groundButton")
    .addEventListener("click", saveGroundDetails, false);
}

function saveGroundDetails() {
  console.log("coming to ground comp");
  var ground = document.getElementById("groundSelect").value;
  localStorage.setItem("ground", ground);
  fetch("/saveSelectedGroundDetails", {
    method: "POST", // or 'POST' or any other HTTP method
    headers: {
      "Content-Type": "application/json", // adjust based on your API requirements
    },
  }).then((response) => {
    console.log(response)
  });
}

// page load event
window.addEventListener("load", start, false);

