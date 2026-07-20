import React, { useState } from "react";
import EmployeeList from "./EmployeeList";
import ThemeContext from "./ThemeContext";

function App() {

    const [theme] = useState("light");

    const employees = [
        {
            id: 101,
            name: "John",
            designation: "Software Engineer"
        },
        {
            id: 102,
            name: "Alice",
            designation: "UI Developer"
        },
        {
            id: 103,
            name: "David",
            designation: "React Developer"
        }
    ];

    return (

        <ThemeContext.Provider value={theme}>

            <div>

                <h1>Employee Management</h1>

                <EmployeeList employees={employees} />

            </div>

        </ThemeContext.Provider>

    );

}

export default App;