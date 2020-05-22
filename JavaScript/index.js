
/* ----------Part-1---------- */

var radioButton = document.querySelectorAll("input[type='radio']");



for (let i = 0; i < radioButton.length; i++) {

    radioButton[i].addEventListener("click", calculate.bind(this, radioButton[i].id));

}

function add(num1, num2) {
    return num1 + num2;
}
function subtract(num1, num2) {
    return num1 - num2;
}
function multiply(num1, num2) {
    return num1 * num2;
}
function divide(num1, num2) {
    return num1 / num2;
}

function calculate(operator) {

    var num1 = parseInt(document.querySelector("#num1").value);
    var num2 = parseInt(document.querySelector("#num2").value);
    var result = window[operator](num1, num2);

    document.querySelector(".result").innerHTML = result;

}

/* ----------Part-2---------- */

var countClick = 0;


var tableBody = document.querySelector("tbody");
var empButton = document.querySelector(".emp-btn");
var empNameButton = document.querySelector(".emp-name-btn");
var searchButton = document.querySelector(".search-btn");

empButton.addEventListener("click", function () {

    if (countClick % 2 == 0) {
        empButton.innerHTML = "Hide"
    } else {
        empButton.innerHTML = "Show"
    }
    empButton.innerHTML += " Employee Details";

    countClick++;
    document.querySelector(".emp-table").classList.toggle("appearance");

    tableBody.innerHTML = "";

    addEmployeeDataAll();
});

empNameButton.addEventListener("click", function () {

    if (countClick % 2 == 1) {
        empButton.innerHTML = "Show Employee Details";
        document.querySelector(".emp-table").classList.toggle("appearance");

    }
    countClick = 0;
    document.querySelector(".name-input").classList.remove("appearance");
});

searchButton.addEventListener("click", function () {

    var inputValue = document.querySelector(".name-input input").value;
    var found = false;

    tableBody.innerHTML = "";
    for (employee in employees) {
        if (employee == inputValue) {
            found = true;
            var employeeCount = 0;

            employeeCount++;
            addEmployeeData(employee, employeeCount);

        }

    }
    if (countClick % 2 == 1) {
        empButton.innerHTML = "Show Employee Details";
        document.querySelector(".emp-table").classList.toggle("appearance");

    }
    document.querySelector(".emp-table").classList.toggle("appearance");
    empButton.innerHTML = "Hide Employee Details";
    countClick = 1;

    if (!found) {

        alert("No employee with the name: " + inputValue + " exists!!");
    }

});




function addEmployeeDataAll() {

    var employeeCount = 0;

    for (employee in employees) {

        employeeCount++;
        var rowData = "<tr><th scope='row'>" + employeeCount + "</th>";

        var data = employees[employee];
        for (field in data) {

            rowData += "<td>" + data[field] + "</td>";
        }

        rowData += "</tr>";

        tableBody.innerHTML += rowData;


    }
}
function addEmployeeData(employee, employeeCount) {


    var rowData = "<tr><th scope='row'>" + employeeCount + "</th>";

    var data = employees[employee];
    for (field in data) {

        rowData += "<td>" + data[field] + "</td>";
    }

    rowData += "</tr>";

    tableBody.innerHTML += rowData;

}



