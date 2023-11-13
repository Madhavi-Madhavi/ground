
window.addEventListener('load',()=>{
    getPreviewDetails();
    
});
function getPreviewDetails(){
var date= localStorage.getItem('date');
var ground= localStorage.getItem('ground');
var captFirName= localStorage.getItem('name');
var email= localStorage.getItem('email');
var phone =localStorage.getItem('phone');
var city =localStorage.getItem('city');
var comments =localStorage.getItem('comments');

document.getElementById('dateVal').value=date;
document.getElementById('groundVal').value=ground;
document.getElementById('captFirName').value=captFirName;
document.getElementById('captlasName').value=email;
document.getElementById('phone').value=phone;
document.getElementById('city').value=city;
document.getElementById('comments').value=comments;

}

function submitDetails(){
    var date= localStorage.getItem('date');
    var time= localStorage.getItem('timeslots');
    var ground= localStorage.getItem('ground');
    var captFirName= localStorage.getItem('captFirName');
    var captlasName= localStorage.getItem('captlasName');
    var phone =localStorage.getItem('phone');

    // include .php code to store these details in database
   // console.log('final submit',document.getElementById('dateVal').innerHTML);
}