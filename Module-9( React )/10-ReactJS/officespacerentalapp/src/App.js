import officeImage from "./office.jpg";

function App() {

  const offices = [

    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: officeImage
    },

    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore",
      Image: officeImage
    },

    {
      Name: "WeWork",
      Rent: 45000,
      Address: "Hyderabad",
      Image: officeImage
    }

  ];

  return (

    <div style={{ marginLeft: "40px" }}>

      <h1>Office Space, at Affordable Range</h1>

      {

        offices.map((office, index) => (

          <div key={index} style={{ marginBottom: "40px" }}>

            <img
              src={office.Image}
              alt="Office Space"
              width="250"
              height="250"
            />

            <h2>Name: {office.Name}</h2>

            <h3
              style={{
                color: office.Rent < 60000 ? "red" : "green"
              }}
            >
              Rent: Rs. {office.Rent}
            </h3>

            <h3>
              Address: {office.Address}
            </h3>

          </div>

        ))

      }

    </div>

  );

}

export default App;