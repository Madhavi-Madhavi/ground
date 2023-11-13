"use strict";

// functions for all the events
function start() {
  document.getElementById("captaindata").addEventListener("click", saveCaptainDetails, false);

}

function saveCaptainDetails(){
    console.log('coming saveCaptainDetails ')
 var name=document.getElementById('name').value;
 var email=document.getElementById('email').value;
 var password=document.getElementById('password').value;
 var city=document.getElementById('city').value;
 var comments=document.getElementById('comments').value;
 var phone=document.getElementById('phone').value;
 localStorage.setItem('name',name);
 localStorage.setItem('email',email);
localStorage.setItem('password',password);

localStorage.setItem('city',city);
localStorage.setItem('comments',comments);
localStorage.setItem('phone',phone);


}


  // page load event
  window.addEventListener("load", start, false);