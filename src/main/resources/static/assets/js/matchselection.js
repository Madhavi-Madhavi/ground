// functions for all the events
function start() {
    console.log('hi1');
    document.getElementById("one").addEventListener("click", datepicker, false);
    document.getElementById("test").addEventListener("click", datepicker, false);
    document.getElementById("t20").addEventListener("click", datepicker, false);
    document.getElementById("match-selection").addEventListener("click", saveMatchSelectionDetails, false);
  
  }

window.addEventListener('load', () => {
    dateRangeValidation();
})
function datepicker(){
    if(document.getElementById('one').checked){
        // document.getElementById('datepicker-section').innerHTML='visible';
        document.getElementById('datepicker-section').style.visibility='visible'
        console.log('one checked');
    }
    else if(document.getElementById('test').checked){
        document.getElementById('datepicker-section').style.visibility='visible'
        console.log('one checked');
    }
    else if (document.getElementById('t20').checked){
        document.getElementById('datepicker-section').style.visibility='visible'
        console.log('one checked');
    }
}
function dateRangeValidation(){
    var dtToday=new Date();
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
}
function saveMatchSelectionDetails(){
    console.log("hi")
var date= document.getElementById('onedayDatePicker').value;
localStorage.setItem('date',date);
}

  // page load event
  window.addEventListener("load", start, false);