// functions for all the events
function start() {
    console.log('hi1');
    console.log('this is from templates')
    document.getElementById("one").addEventListener("click", datepicker, false);
    // document.getElementById("test").addEventListener("click", datepicker, false);
    document.getElementById("t20").addEventListener("click", datepicker, false);
    // document.getElementById("match-selection").addEventListener("click", saveMatchSelectionDetails, false);
    document.getElementById("gettimeslot").addEventListener("click", datepicker, false);
    
  
  }

window.addEventListener('load', () => {
    dateRangeValidation();
})
function datepicker(){
    if(document.getElementById('one').checked){
        var datePickerInput = document.getElementById('onedayDatePicker');
        // document.getElementById('datepicker-section').innerHTML='visible';
        document.getElementById('datepicker-section').style.visibility='visible'
        enableDisableWeekdays(datePickerInput,true);
        enableDisableWeekdays(datePickerInput, false, [0, 6]); 
        console.log('one checked');
    }
    else if(document.getElementById('test').checked){
        document.getElementById('datepicker-section').style.visibility='visible'
        console.log('one checked');
    }
    else if (document.getElementById('t20').checked){
        document.getElementById('datepicker-section').style.visibility='visible'
        console.log('one checked');
    }else if(document.getElementById('gettimeslot').checked){
        console.log('coming here')
        document.getElementById('timeslot-section').style.visibility='visible'
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
    datePickerInput.datepicker('setDaysOfWeekDisabled', enable ? [] : disabledDays);
}
function enableWeekdays(datePickerInput) {
    // Add your datepicker library's logic here
    datePickerInput.datepicker({
        minDate: 0,
        maxDate: "+1M",
        beforeShowDay: function(date) {
            // Enable weekdays and disable weekends
            var day = date.getDay();
            return [day > 0 && day < 6, ''];
        }
    });
}
function saveMatchSelectionDetails(){
    console.log("hi")
var date= document.getElementById('onedayDatePicker').value;
localStorage.setItem('date',date);
}

  // page load event
  window.addEventListener("load", start, false);