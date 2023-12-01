// functions for all the events
function start() {
  document.getElementById("one").addEventListener("click", datepicker, false);
  document.getElementById("t20").addEventListener("click", datepicker, false);
  document
    .getElementById("submitalldetails")
    .addEventListener("click", saveMatchSelectionDetails, false);
  document
    .getElementById("onedayDatePicker")
    .addEventListener("change", getTimeSlots, false);
  document
    .getElementById("morning")
    .addEventListener("click", slotSelection, false);
  document
    .getElementById("afternoon")
    .addEventListener("click", slotSelection, false);
  document
    .getElementById("groundSelect")
    .addEventListener("change", getDetailsSection, false);
}

function getDetailsSection() {
  document.getElementById("details").style.visibility = "visible";
}
function slotSelection() {
  document.getElementById("ground-section").style.visibility = "visible";
}
function getTimeSlots() {
  const selectedDate = new Date(
    document.getElementById("onedayDatePicker").value
  );
  const dayOfWeek = selectedDate.getDay();
  console.log(dayOfWeek, "dayOfWeek");
  const disabledWeekdays = [1, 2, 3, 4, 5];

  if (document.getElementById("t20").checked) {
    if (disabledWeekdays.includes(dayOfWeek)) {
      alert("Weekdays are not allowed for T20 matches");
      document.getElementById("onedayDatePicker").value = "";
      document.getElementById("timeslot-section").style.visibility = "hidden";
    } else {
      document.getElementById("timeslot-section").style.visibility = "visible";
    }
  } else if (document.getElementById("one").checked) {
    if (dayOfWeek === 0 || dayOfWeek === 6) {
      alert("Weekends are not allowed for Oneday matches");
      document.getElementById("onedayDatePicker").value = "";
      document.getElementById("ground-section").style.visibility = "hidden";
    } else {
      document.getElementById("ground-section").style.visibility = "visible";
    }
  }
}

window.addEventListener("load", () => {
  dateRangeValidation();
});
function datepicker() {
  if (document.getElementById("one").checked) {
    document.getElementById("datepicker-section").style.visibility = "visible";
    document.getElementById("timeslot-section").style.visibility = "hidden";
    document.getElementById("ground-section").style.visibility = "hidden";
    document.getElementById("details").style.visibility = "hidden";
  } else if (document.getElementById("t20").checked) {
    document.getElementById("datepicker-section").style.visibility = "visible";
    document.getElementById("timeslot-section").style.visibility = "hidden";
    document.getElementById("ground-section").style.visibility = "hidden";
    document.getElementById("details").style.visibility = "hidden";

  } else if (document.getElementById("gettimeslot").checked) {
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

  const dayOfWeek = dtToday.getDay();
  const disabledWeekdays = [1, 2, 3, 4, 5];
  const disabledWeekEnds = [0, 6];
  if (disabledWeekdays.includes(dayOfWeek)) {
    document.getElementById("onedayDatePicker").value = "";
  }
  if (disabledWeekEnds.includes(dayOfWeek)) {
    // alert("Weekends are not allowed for Oneday matches");
    document.getElementById("onedayDatePicker").value = "";
  }
}

function saveMatchSelectionDetails() {
  var matchtype = document.getElementById("one").value;
  var matchtype_1 = document.getElementById("t20").value;
  var date = document.getElementById("onedayDatePicker").value;
  // var timeslot = document.getElementById("morning").value;
  // var timeslot_eve = document.getElementById("afternoon").value;
  var time = document.querySelector(
    'input[name="time"]:checked'
  ).value;
  var groundname = document.getElementById("groundSelect").value;

  var name = document.getElementById("name").value;
  var email = document.getElementById("email").value;
  var gender = document.getElementById("gender").value;
  var phone = document.getElementById("phone").value;
  var city = document.getElementById("city").value;
  var comments = document.getElementById("comments").value;

  localStorage.setItem("matchtype", matchtype || matchtype_1);
  localStorage.setItem("date", date);
  localStorage.setItem("time", time);
  localStorage.setItem("groundname", groundname);

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
    time: time,
    // time:city,
    matchtype: matchtype || matchtype_1,
  };
  console.log(inputValue,'__input')

  // fetch("/savealldetails", {
  //   method: "POST",
  //   headers: {
  //     "Content-Type": "application/json",
  //   },
  //   body: JSON.stringify({ data: inputValue }),
  // })
  //   .then((response) => response.json())
  //   .then((data) => {
  //     console.log("Success:", data);
  //     // Handle the response as needed
  //   })
  //   .catch((error) => {
  //     console.error("Error:", error);
  //     // Handle errors
  //   });
}

// page load event
window.addEventListener("load", start, false);
