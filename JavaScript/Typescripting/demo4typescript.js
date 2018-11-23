function disp_details(id, name, email_id) {
    console.log("ID is " + id);
    console.log("Name is " + name);
    if (email_id != undefined) {
        console.log("Email ID is " + email_id);
    }
}
disp_details(23, "Swati");
console.log("**********************");
disp_details(23, "Swati", "abc@gmail.com");
