var firstName = "Soumik"
var lastName = "Mukherjee"
const val age = 40



fun main() {
    firstName = "Soumik1"
    println("Hello world from Kotlin !")
    println("Your firstName is : $firstName, and surname : $lastName and age is $age")

    calculateSalaryBasedOnAgeAndDepartment("HR", 30);

    // Calling the same function with named arguments and hence order is not necessary
    calculateSalaryBasedOnAgeAndDepartment(age=30, department = "IT");

    // Calling the same function without passing the value of default argument
    calculateSalaryBasedOnAgeAndDepartment(department="Admin");

    // object creation using primary constructor but without new keyword
    var emp = Employee("Soumik")
    emp.lastName="Mukherjee"
    emp.department="Admin"

    println("Department of emp object : ${emp.department}")
}

// Example of a function with default arguments, the second argument age has a default value 40
fun calculateSalaryBasedOnAgeAndDepartment(department: String, age: Int = 40) : Double {
    var salary: Double = 1000.0
    if (department == "HR") salary *= age.toDouble();
    if (department == "Admin") salary *= age*1.2;
    if (department == "IT") salary *= age*1.5;
    println("Salary of a $age year person of department $department = $salary")
    return salary;
}