// functions for all the events
function start() {
  document.getElementById("one").addEventListener("click", datepicker, false);
  document.getElementById("t20").addEventListener("click", datepicker, false);
  // document.getElementById("match-selection").addEventListener("click", saveMatchSelectionDetails, false);
  // document.getElementById("gettimeslot").addEventListener("click", datepicker, false);
  document
    .getElementById("submitalldetails")
    .addEventListener("click", saveMatchSelectionDetails, false);
}

window.addEventListener("load", () => {
  dateRangeValidation();
});
function datepicker() {
  if (document.getElementById("one").checked) {
    document.getElementById("datepicker-section").style.visibility = "visible";
    // enableDisableWeekdays(datePickerInput,true);
    // enableDisableWeekdays(datePickerInput, false, [0, 6]);
    console.log("one checked");
  } else if (document.getElementById("t20").checked) {
    document.getElementById("datepicker-section").style.visibility = "visible";
    console.log("t20 checked");
  } else if (document.getElementById("gettimeslot").checked) {
    console.log("coming here");
    document.getElementById("timeslot-section").style.visibility = "visible";
  }
}
function dateRangeValidation() {
  var dtToday = new Date();
  var month = dtToday.getMonth() + 1;
  var maxMonth = dtToday.getMonth() + 2;
  var day = dtToday.getDate();
  var year = dtToday.getFullYear();
  if (month < 10) month = "0" + month.toString();
  if (maxMonth < 10) maxMonth = "0" + maxMonth.toString();
  if (day < 10) day = "0" + day.toString();

  var minDate = year + "-" + month + "-" + day;
  var maxDate = year + "-" + maxMonth + "-" + day;
  document.getElementById("onedayDatePicker").setAttribute("min", minDate);
  document.getElementById("onedayDatePicker").max = maxDate;

  // if (document.getElementById('one').checked) {
  //     // Enable one month for next month and disable for past and future dates
  //     // Add your datepicker library's logic here
  // }  else if (document.getElementById('t20').checked) {
  //     // Enable specific dates for T20 matches
  //     // Add your datepicker library's logic here
  //     enableWeekdays( document.getElementById("onedayDatePicker"))
  // }
}
function enableDisableWeekdays(datePickerInput, enable, disabledDays) {
  // Example using Bootstrap Datepicker (replace with your actual datepicker library's logic)
  datePickerInput.datepicker(
    "setDaysOfWeekDisabled",
    enable ? [] : disabledDays
  );
}
function enableWeekdays(datePickerInput) {
  // Add your datepicker library's logic here
  datePickerInput.datepicker({
    minDate: 0,
    maxDate: "+1M",
    beforeShowDay: function (date) {
      // Enable weekdays and disable weekends
      var day = date.getDay();
      return [day > 0 && day < 6, ""];
    },
  });
}
function saveMatchSelectionDetails() {
  console.log("hi");
  var matchtype = document.getElementById("one").value;
  var matchtype_1 = document.getElementById("t20").value;
  var date = document.getElementById("onedayDatePicker").value;
  var timeslot = document.getElementById("morningslot").value;
  var timeslot_eve = document.getElementById("eveningslot").value;
  var groundname = document.getElementById("groundSelect").value;

  var name = document.getElementById("name").value;
  var email = document.getElementById("email").value;
  var gender = document.getElementById("gender").value;
  var phone = document.getElementById("phone").value;
  var city = document.getElementById("city").value;
  var comments = document.getElementById("comments").value;

  localStorage.setItem("time", timeslot || timeslot_eve);
  localStorage.setItem("date", date);
  localStorage.setItem("ground", groundname);
  localStorage.setItem(
    "details",
    JSON.stringify({
      name,
      email,
      gender,
      phone,
      city,
      comments,
    })
  );
  const inputValue = {
    date,
    groundname,
    name,
    email,
    gender,
    phone,
    comments,
    city,
    timeslot: timeslot || timeslot_eve,
    matchtype: matchtype || matchtype_1,
  };

  console.log(inputValue,'inputValue');
  console.log(  {body: JSON.stringify({ data: inputValue })},'body')
  fetch("/savealldetails", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({ data: inputValue }),
  })
    .then((response) => response.json())
    .then((data) => {
      console.log("Success:", data);
      // Handle the response as needed
    })
    .catch((error) => {
      console.error("Error:", error);
      // Handle errors
    });
}

// page load event
window.addEventListener("load", start, false);
