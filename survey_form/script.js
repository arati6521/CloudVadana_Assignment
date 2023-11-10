function submitForm() {
    // Validate the form
    if (validateForm()) {
        // Display popup with form values
        displayPopup();
    }
}

function validateForm() {
    // Add your custom validation logic here
    // For simplicity, this example assumes all fields are valid
    return true;
}

function displayPopup() {
    // Get form values
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;
    const gender = Array.from(document.querySelectorAll('input[name=gender]:checked')).map(checkbox => checkbox.value);
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    // Create popup content
    const popupResult = document.getElementById('popupResult');
    popupResult.innerHTML = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${gender.join(', ')}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;

    // Display the popup
    const popup = document.getElementById('popup');
    popup.style.display = 'flex';
}

function closePopup() {
    // Hide the popup
    const popup = document.getElementById('popup');
    popup.style.display = 'none';

    // Reset the form
    resetForm();
}

function resetForm() {
    // Clear all form values
    document.getElementById('surveyForm').reset();
}
