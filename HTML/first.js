const form = document.getElementById('healthForm');
const summaryBox = document.getElementById('summaryBox');

// when user clicks button OR presses Enter, this runs
form.addEventListener('submit', (e) => {
  e.preventDefault(); // stop page reload

  const hr = document.getElementById('hr').value.trim();
  const temp = document.getElementById('temp').value.trim();
  const mood = document.getElementById('mood').value.trim();

  if (!hr || !temp || !mood) {
    alert('Please fill all the fields.');
    return;
  }

  // simple interpretation, like a student project
  let hrComment = '';
  const hrValue = Number(hr);

  if (hrValue < 60) {
    hrComment = 'Heart rate is on the lower side. Maybe you are relaxed or an athlete.';
  } else if (hrValue <= 100) {
    hrComment = 'Heart rate is in the normal resting range.';
  } else {
    hrComment = 'Heart rate is high. Maybe you are stressed, active, or need rest.';
  }

  let tempComment = '';
  const tempValue = Number(temp);

  if (tempValue < 36) {
    tempComment = 'Temperature is a bit low.';
  } else if (tempValue <= 37.5) {
    tempComment = 'Temperature looks normal.';
  } else {
    tempComment = 'Temperature is high. It may indicate fever.';
  }

  summaryBox.innerHTML = `
    <p><strong>Heart rate:</strong> ${hr} bpm</p>
    <p><strong>Temperature:</strong> ${temp} °C</p>
    <p><strong>Mood:</strong> ${mood}</p>
    <p><strong>Comment (student level):</strong></p>
    <p>${hrComment}</p>
    <p>${tempComment}</p>
    <p style="font-size: 11px; color:#555;">
      Note: This is only a mini project for learning, not a medical diagnosis.
    </p>
  `;

  // clear inputs for next entry
  form.reset();
});
